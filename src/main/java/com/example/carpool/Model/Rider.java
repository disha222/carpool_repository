package com.example.carpool.Model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name= "Rider")
public class Rider {
	@Id
	private String Rider_ID ;
	
    @Column(name = "Rider_name")
	private String riderName;

	@Column(name = "Memb_ID")
	private String membId ;
	
	@Column(name = "Driver_ID")
	private String driverID ;

	/**
	 * @param rider_ID
	 * @param riderName
	 * @param membId
	 * @param driverID
	 */
	public Rider(String rider_ID, String riderName, String membId, String driverID) {
		super();
		Rider_ID = rider_ID;
		this.riderName = riderName;
		this.membId = membId;
		this.driverID = driverID;
	}

	public String getRider_ID() {
		return Rider_ID;
	}

	public void setRider_ID(String rider_ID) {
		Rider_ID = rider_ID;
	}

	public String getRiderName() {
		return riderName;
	}

	public void setRiderName(String riderName) {
		this.riderName = riderName;
	}

	public String getMembId() {
		return membId;
	}

	public void setMembId(String membId) {
		this.membId = membId;
	}

	public String getDriverID() {
		return driverID;
	}

	public void setDriverID(String driverID) {
		this.driverID = driverID;
	}

	@Override
	public String toString() {
		return "Rider [Rider_ID=" + Rider_ID + ", riderName=" + riderName + ", membId=" + membId + ", driverID="
				+ driverID + "]";
	}
	
	
	
}
