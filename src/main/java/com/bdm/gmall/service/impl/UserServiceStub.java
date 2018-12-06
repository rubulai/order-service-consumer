package com.bdm.gmall.service.impl;

import java.util.List;

import org.springframework.util.StringUtils;

import com.bdm.gmall.bean.UserAddress;
import com.bdm.gmall.service.UserService;

public class UserServiceStub implements UserService {

	private final UserService userService;

	// �вι�����:�����dubbo����
	public UserServiceStub(UserService userService) {
		super();
		this.userService = userService;
	}

	public List<UserAddress> getUserAddressList(String userId) {
		// ���ýӿ�ǰ���ж�
		if (!StringUtils.isEmpty(userId))
			return userService.getUserAddressList(userId);
		return null;
	}
}
