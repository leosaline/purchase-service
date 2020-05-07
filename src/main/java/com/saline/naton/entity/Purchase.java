package com.saline.naton.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PURCHASE")
public class Purchase {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date datePurchase;
	private Long user;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDatePurchase() {
		return datePurchase;
	}
	public void setDatePurchase(Date datePurchase) {
		this.datePurchase = datePurchase;
	}
	public Long getUser() {
		return user;
	}
	public void setUser(Long user) {
		this.user = user;
	}
}
