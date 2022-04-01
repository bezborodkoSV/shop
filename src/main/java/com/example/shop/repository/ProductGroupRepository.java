package com.example.shop.repository;

import com.example.shop.model.ProductGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductGroupRepository extends JpaRepository<ProductGroup, Long> {
    ProductGroup findById(long id);

    ProductGroup findByGroupTitle(String groupTittle);



}