package com.pfa.amicali.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfa.amicali.entity.product;


@Repository
public interface productRepository extends JpaRepository<product, Long> {

}
