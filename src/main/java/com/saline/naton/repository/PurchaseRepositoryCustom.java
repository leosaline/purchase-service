package com.saline.naton.repository;

import com.saline.naton.entity.Purchase;

public interface PurchaseRepositoryCustom {
	public Iterable<Purchase> findAll();
}
