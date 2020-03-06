package com.saline.naton.serviceimp;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saline.naton.entity.Purchase;
import com.saline.naton.repository.PurchaseRepository;
import com.saline.naton.service.PurchaseService;

@Service
public class PurchaseServiceimp implements PurchaseService{
	@Autowired
	PurchaseRepository purchaseRepository;

	@Override
	public Collection<Purchase> listPurchase() {
		return (Collection<Purchase>) purchaseRepository.findAll();
	}

	@Override
	public Purchase save(Purchase purchase) {
		return purchaseRepository.save(purchase);
	}

	@Override
	public Purchase getPurchaseById(Long id) {
		return purchaseRepository.findById(id).get();
	}

}
