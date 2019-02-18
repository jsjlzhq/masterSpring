package com.smart.advice;

import java.sql.SQLException;

/**
 * Created by zhiqin.li on 2019/1/31.
 */
public class ForumService {
    public void removeForum(int forumId){
        //do something
        throw new RuntimeException("运行异常。");
    }

    public void updateForum(Forum forum) throws Exception {
        throw new SQLException("数据更新操作异常。");
    }
}
