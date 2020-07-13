package com.zj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author 张建 119855181@qq.com
 * @date 2020/7/13 10:08
 * @version V1.0
 * @Copyright © 国网安徽省分公司
 * @description: 无用
 */
@Controller
@ApiIgnore
public class TempResultController {

	@GetMapping("/alipayResult")
	public String alipayResult(HttpServletRequest request, HttpServletResponse response) {

		return "alipayResult";
	}
}
