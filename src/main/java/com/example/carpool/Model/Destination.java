package com.example.carpool.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name= "Destination")
public class Destination {
	@Id
	private String Des_ID  ;
    @Column(name = "Des_name")
	private String desName;
	/**
	 * @param des_ID
	 * @param desName
	 */
	public Destination(String des_ID, String desName) {
		super();
		Des_ID = des_ID;
		this.desName = desName;
	}
	public String getDes_ID() {
		return Des_ID;
	}
	public void setDes_ID(String des_ID) {
		Des_ID = des_ID;
	}
	public String getDesName() {
		return desName;
	}
	public void setDesName(String desName) {
		this.desName = desName;
	}
	@Override
	public String toString() {
		return "Destination [Des_ID=" + Des_ID + ", desName=" + desName + "]";
	}
    
    
}
