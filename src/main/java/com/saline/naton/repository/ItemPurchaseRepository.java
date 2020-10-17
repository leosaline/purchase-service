package com.saline.naton.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.saline.naton.entity.ItemPurchase;

@Repository
public interface ItemPurchaseRepository extends CrudRepository<ItemPurchase, Long> {

}
