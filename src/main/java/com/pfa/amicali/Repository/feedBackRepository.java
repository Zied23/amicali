package com.pfa.amicali.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfa.amicali.entity.feedBack;


@Repository
public interface feedBackRepository extends JpaRepository<feedBack, Long> {

}
