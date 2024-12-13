package com.saline.naton.serviceimp;

import com.saline.naton.entity.ItemPurchase;
import com.saline.naton.entity.Purchase;
import com.saline.naton.repository.ItemPurchaseRepository;
import com.saline.naton.repository.PurchaseRepository;
import com.saline.naton.service.PurchaseService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class PurchaseServiceImpl implements PurchaseService {
	private final PurchaseRepository purchaseRepository;
	private final ItemPurchaseRepository itemPurchaseRepo;

    public PurchaseServiceImpl(PurchaseRepository purchaseRepository, ItemPurchaseRepository itemPurchaseRepo) {
        this.purchaseRepository = purchaseRepository;
        this.itemPurchaseRepo = itemPurchaseRepo;
    }

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
