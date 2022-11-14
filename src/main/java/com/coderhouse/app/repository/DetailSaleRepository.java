package com.coderhouse.app.repository;

import com.coderhouse.app.entity.DetailSale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailSaleRepository extends JpaRepository<DetailSale, Long> {
}
