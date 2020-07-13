package com.zj.enums;
/**
 * @author 张建 119855181@qq.com
 * @date 2020/7/13 10:11
 * @version V1.0
 * @Copyright © 国网安徽省分公司
 * @description: 支付方式 枚举
 */

public enum PayMethod {
    WEIXIN(1, "微信"),
    ALIPAY(2, "支付宝");

    public final Integer type;
    public final String value;

    PayMethod(Integer type, String value) {
        this.type = type;
        this.value = value;
    }
}
