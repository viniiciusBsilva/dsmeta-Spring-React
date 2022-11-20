package com.dev.dsmeta.repositories;

import com.dev.dsmeta.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sale, Long> {

}
