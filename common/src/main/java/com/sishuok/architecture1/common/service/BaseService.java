package com.sishuok.architecture1.common.service;


import com.sishuok.architecture1.common.dao.BaseDAO;
import com.sishuok.architecture1.common.vo.BaseModel;
import com.sishuok.pageutil.Page;

import java.util.List;

public class BaseService<M,QM extends BaseModel> implements IBaseService<M, QM> {

	private BaseDAO dao = null;
	
	public void setDao(BaseDAO dao) {
		this.dao = dao;
	}

	public void create(M m) {
		dao.create(m);
	}

	public void update(M m) {
		dao.update(m);
	} 

	public void delete(int uuid) {
		dao.delete(uuid);
	}

	public M getByUuid(int uuid) {
		return (M)dao.getByUuid(uuid);
	}

	public M getByCustomerId(String customerId) {
		return (M)dao.getByCustomerId(customerId);
	}

	public Page<M> getByConditionPage(QM qm) {
		List<M> list = dao.getByConditionPage(qm);
		qm.getPage().setResult(list);
		return qm.getPage();
	}

}
