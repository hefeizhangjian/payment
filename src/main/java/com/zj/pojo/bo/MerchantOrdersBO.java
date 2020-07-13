package com.zj.pojo.bo;

import lombok.Data;

/**
 * @author 张建 119855181@qq.com
 * @date 2020/7/13 10:14
 * @version V1.0
 * @Copyright © 国网安徽省分公司
 * @description: 前端传来的订单信息
 */
@Data
public class MerchantOrdersBO {
    /**
     * 商户订单号
     */
    private String merchantOrderId;
    /**
     * 商户方的发起用户的用户主键id
     */
    private String merchantUserId;
    /**
     * 实际支付总金额（包含商户所支付的订单费邮费总额）
     */
    private Integer amount;
    /**
     * 支付方式 1:微信   2:支付宝
     */
    private Integer payMethod;
    /**
     * 支付成功后的回调地址（自定义）
     */
    private String returnUrl;


}