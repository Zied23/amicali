package com.pfa.amicali.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.amicali.Entity.Category;



public interface CategoryRepository extends JpaRepository<Category, Integer> {

    Category findByCategoryName(String name);
}
