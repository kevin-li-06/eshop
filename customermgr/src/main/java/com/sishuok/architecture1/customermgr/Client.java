package com.sishuok.architecture1.customermgr;


import com.sishuok.architecture1.customermgr.service.ICustomerService;
import com.sishuok.architecture1.customermgr.vo.CustomerModel;
import com.sishuok.architecture1.customermgr.vo.CustomerQueryModel;
import com.sishuok.pageutil.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
@Service
//@Transactional
public class Client {
	@Autowired
	private ICustomerService s = null;
	
//	public ICustomerService getS() {
//		return s;
//	}
	
	public static void main(String[] args) {
		ApplicationContext ctx =  new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Client t = (Client)ctx.getBean("client");
		
//		CustomerModel cm = new CustomerModel();
//		cm.setCustomerId("c1");
//		cm.setPwd("c1");
//		cm.setRegisterTime("");
//		cm.setShowName("c1");
//		cm.setTrueName("王五");
//		
//		t.dao.create(cm);
		
		CustomerQueryModel cqm = new CustomerQueryModel();
		cqm.getPage().setNowPage(1);
		
		
//		Page<CustomerModel> p = t.s.getByConditionPage(cqm);
		
		Page<CustomerModel> p = t.s.getByConditionPage(cqm);
		
		System.out.println("p=="+p);
		
		Page<CustomerModel> p2 = t.s.getByConditionPage(cqm);
		
		System.out.println("p2=="+p);
		
	}

}
