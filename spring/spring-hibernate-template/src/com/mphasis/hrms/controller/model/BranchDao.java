package com.mphasis.hrms.controller.model;


import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class BranchDao 
{
	private HibernateTemplate ht;

	public BranchDao() {}
	
	public BranchDao(HibernateTemplate ht) {
		super();
		this.ht = ht;
	}
	public HibernateTemplate getHt() {
		return ht;
	}
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Transactional
	public Serializable create(Branch branch) {
		return ht.save(branch);
	}
	public List<Branch> read() {
		return ht.loadAll(Branch.class);
	}
	public Branch read(String bid) {
		return ht.get(Branch.class, bid);
	}
	@Transactional
	public void update(Branch branch) {
		ht.update(branch);
	}
	@Transactional
	public void delete(String bid) {
		ht.delete(read(bid));
	}
	
	
}
