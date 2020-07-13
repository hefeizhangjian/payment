package com.zj.enums;
/**
 * @author 张建 119855181@qq.com
 * @date 2020/7/13 10:11
 * @version V1.0
 * @Copyright © 国网安徽省分公司
 * @description: 是否 枚举
 */

public enum YesOrNo {
    YES(1, "是"),
    NO(0, "否");

    public final Integer type;
    public final String value;

    YesOrNo(Integer type, String value) {
        this.type = type;
        this.value = value;
    }
}
