package com.sishuok.architecture1.cartmgr.dao;

import com.sishuok.architecture1.cartmgr.vo.CartModel;
import com.sishuok.architecture1.cartmgr.vo.CartQueryModel;
import com.sishuok.architecture1.common.dao.BaseDAO;
import org.springframework.stereotype.Repository;

@Repository
public interface CartDAO extends BaseDAO<CartModel,CartQueryModel>{
	
}
