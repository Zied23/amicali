package com.pfa.amicali.Service.Category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.amicali.Entity.Category;



@Service
public class CategoryServiceImpl {
	

    @Autowired
    public CategoryServiceImpl categoryServiceImpl ;

    public List<Category> getAllCategory() {
        return categoryServiceImpl.getAllCategory();
    }

	
}
