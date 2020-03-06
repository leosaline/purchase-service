package com.saline.naton.service;

import java.util.Collection;

import com.saline.naton.entity.Purchase;

public interface PurchaseService {
	public Collection<Purchase> listPurchase();
	public Purchase save(Purchase purchase);
	public Purchase getPurchaseById(Long id);
}
