package com.sishuok.architecture1.goodsmgr.service;


import com.sishuok.architecture1.common.service.BaseService;
import com.sishuok.architecture1.goodsmgr.dao.GoodsDAO;
import com.sishuok.architecture1.goodsmgr.vo.GoodsModel;
import com.sishuok.architecture1.goodsmgr.vo.GoodsQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GoodsService extends BaseService<GoodsModel,GoodsQueryModel> implements IGoodsService{
	private GoodsDAO dao = null;
	@Autowired
	private void setDao(GoodsDAO dao){
		this.dao = dao;
		super.setDao(dao);
	}
//	@Override
//	public Page<GoodsModel> getByConditionPage(GoodsQueryModel qm){
//		return dao.getByConditionPage(qm);
//	}
}