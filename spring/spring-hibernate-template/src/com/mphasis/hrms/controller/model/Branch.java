package com.mphasis.hrms.controller.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Branch {
	@Id
	private String bid;
	private String bname, bcity;
	public Branch() {}
	public Branch(String bid, String bname, String bcity) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bcity = bcity;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBcity() {
		return bcity;
	}
	public void setBcity(String bcity) {
		this.bcity = bcity;
	}
	@Override
	public String toString() {
		return "Branch [bid=" + bid + ", bname=" + bname + ", bcity=" + bcity + "]";
	}
	
}
