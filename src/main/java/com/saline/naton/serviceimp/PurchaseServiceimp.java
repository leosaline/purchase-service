package com.saline.naton.serviceimp;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saline.naton.entity.ItemPurchase;
import com.saline.naton.entity.Purchase;
import com.saline.naton.repository.ItemPurchaseRepository;
import com.saline.naton.repository.PurchaseRepository;
import com.saline.naton.service.PurchaseService;

@Service
public class PurchaseServiceimp implements PurchaseService {
	@Autowired
	PurchaseRepository purchaseRepository;

	@Autowired
	ItemPurchaseRepository itemPurchaseRepo;

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
		Optional<Purchase> optPurchase = purchaseRepository.findById(id);
		if (optPurchase.isPresent())
			return optPurchase.get();
		else
			return new Purchase();
	}

	@Override
	public Collection<ItemPurchase> listItemPurchase() {
		return (Collection<ItemPurchase>) itemPurchaseRepo.findAll();
	}

}
