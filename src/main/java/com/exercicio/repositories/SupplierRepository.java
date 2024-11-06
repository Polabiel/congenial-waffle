package com.exercicio.repositories;

import com.exercicio.models.SupplierModels;
import org.springframework.data.jpa.repository.*;

public interface SupplierRepository extends JpaRepository<SupplierModels, Integer> {}