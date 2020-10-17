package com.saline.naton.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.saline.naton.entity.Purchase;

@Repository
public interface PurchaseRepository extends CrudRepository<Purchase, Long> {
	@Override
	@Query("select purchase from Purchase purchase left join fetch purchase.itemsPurchase")
	Iterable<Purchase> findAll();

}
