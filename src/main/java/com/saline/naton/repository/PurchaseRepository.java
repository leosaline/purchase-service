package com.saline.naton.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.saline.naton.entity.Purchase;

@Repository
public interface PurchaseRepository extends CrudRepository<Purchase, Long>{

}
