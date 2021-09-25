package com.example.carpool.Model;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name= "member")
public class Member {
	@Id
	private String Memb_ID ;
	
    @Column(name = "Phone_no")
	private String phoneNo;

	@Column(name = "Regd_date")
	private String regdDate;
	
	@Column(name = "is_driver")
	private String isDriver;
	
	
	
	/**
	 * @param memb_ID
	 * @param phoneNo
	 * @param regdDate
	 * @param isDriver
	 */
	public Member(String memb_ID, String phoneNo, String regdDate,String isDriver) {
		super();
		Memb_ID = memb_ID;
		this.phoneNo = phoneNo;
		this.regdDate = regdDate;
		this.isDriver = isDriver;
	}

	public String getMemb_ID() {
		return Memb_ID;
	}

	public void setMemb_ID(String memb_ID) {
		Memb_ID = memb_ID;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getRegdDate() {
		return regdDate;
	}

	public void setRegdDate(String regdDate) {
		this.regdDate = regdDate;
	}

	public String getIsDriver() {
		return isDriver;
	}

	public void setIsDriver(String isDriver) {
		this.isDriver = isDriver;
	}

	@Override
	public String toString() {
		return "Member [Memb_ID=" + Memb_ID + ", phoneNo=" + phoneNo + ", regdDate=" + regdDate + ", isDriver="
				+ isDriver + "]";
	}

	
	

	

}
