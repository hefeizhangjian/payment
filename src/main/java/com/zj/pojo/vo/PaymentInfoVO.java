package com.zj.pojo.vo;

import lombok.Data;

/**
 * @author 张建 119855181@qq.com
 * @date 2020/7/13 10:16
 * @version V1.0
 * @Copyright © 国网安徽省分公司
 * @description: 返回全段的订单信息
 */
@Data
public class PaymentInfoVO {
    /**
     * 商户订单号
     */
    private String merchantOrderId;
    /**
     *商户方的发起用户的用户主键id
     */
    private String merchantUserId;
    /**
     * 实际支付总金额（包含商户所支付的订单费邮费总额）
     */
    private Integer amount;
    /**
     * 二维码扫码地址
     */
    private String qrCodeUrl;


}