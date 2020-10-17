package com.saline.naton.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "PURCHASE", schema = "purchase_service")
public class Purchase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date datePurchase;
	private Long customer;
	@OneToMany(mappedBy = "purchase", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	@JsonManagedReference
	private List<ItemPurchase> itemsPurchase = new ArrayList<>();

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

	public List<ItemPurchase> getItemsPurchase() {
		return itemsPurchase;
	}

	public void setItemsPurchase(List<ItemPurchase> itemsPurchase) {
		this.itemsPurchase = itemsPurchase;
	}

	public Long getCustomer() {
		return customer;
	}

	public void setCustomer(Long customer) {
		this.customer = customer;
	}
}