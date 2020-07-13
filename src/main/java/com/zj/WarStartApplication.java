package com.zj;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
 * @author 张建 119855181@qq.com
 * @date 2020/7/13 10:03
 * @version V1.0
 * @Copyright © 国网安徽省分公司
 * @description: 打包war [4] 增加启动类
 */

public class WarStartApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    	// 指向Application这个spingboot的启动类
        return builder.sources(Application.class);
    }
}