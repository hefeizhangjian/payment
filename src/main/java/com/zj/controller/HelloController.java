package com.zj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 张建 119855181@qq.com
 * @version V1.0
 * @date 2020/7/13 10:04
 * @Copyright © 国网安徽省分公司
 * @description: 测试
 */

@Controller
@ApiIgnore
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public Object hello(HttpServletRequest request, HttpServletResponse response) {

        return "Hello Payment Center~~";
    }

}
