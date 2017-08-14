package com.itheima.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.itheima.dao.CustomerDao;
import com.itheima.domain.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@Override
	public List<Customer> findAll() {
		return (List<Customer>) getHibernateTemplate().find("from Customer");
	}

}
