package com.ustglobal.springrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.springrest.dto.EmployeBean;

@Repository
public class EmployeDaoImpl  implements EmployeeDAO{
	
	@PersistenceUnit
	private EntityManagerFactory factory;
	

	@Override
	public boolean addEmployee(EmployeBean bean) {
    
		EntityManager manger =  factory.createEntityManager();
		EntityTransaction transaction = manger.getTransaction();
		try{
			transaction.begin();
			manger.persist(bean);
			transaction.commit();
			return true;
			
         }catch(Exception e){
        	 e.printStackTrace();
        	 return false;
         }
         
		
	}

	@Override
	public boolean mdifyEmployee(EmployeBean bean) {

		EntityManager manger =  factory.createEntityManager();
		EntityTransaction transaction = manger.getTransaction();
		
			transaction.begin();
			EmployeBean employebean = manger.find(EmployeBean.class, bean.getId());
			employebean.setName(bean.getName());
			employebean.setGender(bean.getGender());
			employebean.setPassword(bean.getPassword());
			employebean.setDoj(bean.getDoj());
			transaction.commit();
		return true;
	}

	@Override
	public boolean deleteEmployee(int id) {
		EntityManager manger =  factory.createEntityManager();
		EntityTransaction transaction = manger.getTransaction();
		transaction.begin();
		EmployeBean employebean = manger.find(EmployeBean.class, id);
		if(employebean!=null){
		manger.remove(employebean);		 
		transaction.commit();
		return true;
		}else{
			return false;
		}
		
	}

	@Override
	public EmployeBean getEmployee(int id) {
		EntityManager manger = factory.createEntityManager();
		EmployeBean bean = manger.find(EmployeBean.class, id);
		return bean;
	}

	@Override
	public List<EmployeBean> getAllEmploye(){
		
		String jpql ="from EmployeBean";
		EntityManager manger = factory.createEntityManager();
		TypedQuery<EmployeBean> query = manger.createQuery(jpql,EmployeBean.class);
		List<EmployeBean> employeBeans = query.getResultList();
		return employeBeans;

	
	}
	

}
