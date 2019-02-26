package com.sishuok.architecture1.ordermgr.dao;

import com.sishuok.architecture1.common.dao.BaseDAO;
import com.sishuok.architecture1.ordermgr.vo.OrderDetailModel;
import com.sishuok.architecture1.ordermgr.vo.OrderDetailQueryModel;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailDAO extends BaseDAO<OrderDetailModel,OrderDetailQueryModel>{
	
}
