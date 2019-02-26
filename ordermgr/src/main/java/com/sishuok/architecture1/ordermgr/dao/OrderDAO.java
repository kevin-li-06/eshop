package com.sishuok.architecture1.ordermgr.dao;

import com.sishuok.architecture1.common.dao.BaseDAO;
import com.sishuok.architecture1.ordermgr.vo.OrderModel;
import com.sishuok.architecture1.ordermgr.vo.OrderQueryModel;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDAO extends BaseDAO<OrderModel,OrderQueryModel>{
	
}
