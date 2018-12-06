package com.bdm.gmall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdm.gmall.bean.UserAddress;
import com.bdm.gmall.service.OrderService;
import com.bdm.gmall.service.UserService;

@Service//��spring��@Serviceע�����dubbo��
public class OrderServiceImpl implements OrderService {

	@Autowired
	UserService userService;

	/**
	 * ��ʼ������
	 */
	public List<UserAddress> initOrder(String userId) {
		// ��ѯ�û����ջ���ַ,��Ҫ�����û�����
		return userService.getUserAddressList(userId);
	}

}
