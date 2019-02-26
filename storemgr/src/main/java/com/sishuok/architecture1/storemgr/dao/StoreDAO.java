package com.sishuok.architecture1.storemgr.dao;

import com.sishuok.architecture1.common.dao.BaseDAO;
import com.sishuok.architecture1.storemgr.vo.StoreModel;
import com.sishuok.architecture1.storemgr.vo.StoreQueryModel;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreDAO extends BaseDAO<StoreModel,StoreQueryModel>{
	public StoreModel getByGoodsUuid(int goodsUuid);
}
