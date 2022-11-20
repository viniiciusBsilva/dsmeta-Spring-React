package com.dev.dsmeta.repositories;

import com.dev.dsmeta.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.time.LocalDate;

public interface SalesRepository extends JpaRepository<Sale, Long> {
    //utilizou a linguagem jpql(parecida com sql)
    @Query("SELECT obj FROM Sale obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC")
    Page<Sale> findSales(LocalDate min, LocalDate max, Pageable pageable);
}
