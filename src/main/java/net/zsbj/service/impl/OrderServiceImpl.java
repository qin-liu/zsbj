package net.zsbj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import net.zsbj.config.datasource.DynamicDataSourceContextHolder;
import net.zsbj.dao.OrdersMapper;
import net.zsbj.model.Orders;


public class OrderServiceImpl {
	@Autowired
	private OrdersMapper ordersMapper;

	public Orders getOrderList(Integer id) {
		return ordersMapper.getOrderListById(id);
	}

	public JSONObject getCountByMerchantIdOrderSn(Integer platformId,Integer merchantId, String orderSn) {
		//使用另一台服务器的数据库
		DynamicDataSourceContextHolder.setDataSourceType("demodb2");
		DynamicDataSourceContextHolder.clearDataSourceType();
		
		Integer count = ordersMapper.getCountByMerchantIdOrderSn(platformId, merchantId, orderSn);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("count", count);
		return jsonObject;
	}
	
	
}
