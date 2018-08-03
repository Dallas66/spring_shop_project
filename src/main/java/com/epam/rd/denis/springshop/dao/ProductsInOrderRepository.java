package com.epam.rd.denis.springshop.dao;

import com.epam.rd.denis.springshop.entity.ProductsInOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsInOrderRepository extends JpaRepository<ProductsInOrder, Long> {
}
