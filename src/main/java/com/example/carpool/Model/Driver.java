package com.example.carpool.Model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Driver")
public class Driver {
	@Id
	private String Driver_ID ;
	
    @Column(name = "Memb_ID")
	private String membId;

	@Column(name = "Time")
	private LocalDateTime time;
	
	@Column(name = "Driver_name")
	private String driverName;
	 
	@Column(name = "Des_ID")
	private String desId;

	/**
	 * @param driver_ID
	 * @param membId
	 * @param time
	 * @param driverName
	 * @param desId
	 */
	public Driver(String driver_ID, String membId, LocalDateTime time, String driverName, String desId) {
		super();
		Driver_ID = driver_ID;
		this.membId = membId;
		this.time = time;
		this.driverName = driverName;
		this.desId = desId;
	}

	public String getDriver_ID() {
		return Driver_ID;
	}

	public void setDriver_ID(String driver_ID) {
		Driver_ID = driver_ID;
	}

	public String getMembId() {
		return membId;
	}

	public void setMembId(String membId) {
		this.membId = membId;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDesId() {
		return desId;
	}

	public void setDesId(String desId) {
		this.desId = desId;
	}

	@Override
	public String toString() {
		return "Driver [Driver_ID=" + Driver_ID + ", membId=" + membId + ", time=" + time + ", driverName=" + driverName
				+ ", desId=" + desId + "]";
	}
	
	
	 
	
	
}
