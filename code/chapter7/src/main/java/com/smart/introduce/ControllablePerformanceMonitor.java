package com.smart.introduce;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * Created by zhiqin.li on 2019/2/1.
 */
public class ControllablePerformanceMonitor
            extends DelegatingIntroductionInterceptor
            implements Monitorable {

    private ThreadLocal<Boolean> MonitorStatusMap = new ThreadLocal<Boolean>();

    @Override
    public void setMonitorActive(boolean active) {
        MonitorStatusMap.set(active);
    }


    public Object invoke(MethodInvocation mi) throws Throwable {
        Object obj = null;
        if(MonitorStatusMap.get() != null && MonitorStatusMap.get()) {
            System.out.println("begin monitor ...");
            obj = super.invoke(mi);
            System.out.println("end monitor ...");
        } else {
            obj = super.invoke(mi);
        }
        return obj;
    }
}
