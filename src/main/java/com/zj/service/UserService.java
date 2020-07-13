package com.zj.service;

import com.zj.pojo.Orders;
import com.zj.pojo.Users;
import com.zj.pojo.bo.MerchantOrdersBO;

public interface UserService {

	/**
	 * @Description: 查询用户信息
	 */
	 Users queryUserInfo(String userId, String pwd);

}

