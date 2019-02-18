package com.smart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhiqin.li on 2019/1/17.
 */

@RestController
public class WebController {

    @RequestMapping(value = "/")
    public ModelAndView main(HttpServletRequest request) {
        return new ModelAndView("resource");
    }
}
