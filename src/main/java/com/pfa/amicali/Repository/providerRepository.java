package com.pfa.amicali.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfa.amicali.entity.provider;


@Repository
public interface providerRepository extends JpaRepository<provider, Long> {

}
