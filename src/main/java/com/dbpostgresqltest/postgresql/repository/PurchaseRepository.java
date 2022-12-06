package com.dbpostgresqltest.postgresql.repository;

import com.dbpostgresqltest.postgresql.model.PurchaseDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<PurchaseDto, Long> {
}
