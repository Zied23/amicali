package com.pfa.amicali.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "category")
public class Category {

	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;

	    @Column(nullable = false, name = "category_name")
	    private String categoryName;

	    @Column(nullable = false)
	    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	    private Set<Product> productSet;

	   
	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }
	   
	    public String getCategoryName() {
	        return categoryName;
	    }

	    public void setCategoryName(String categoryName) {
	        this.categoryName = categoryName;
	    }
	    @JsonIgnore
	    public Set<Product> getProduct() {
	        return productSet;
	    }
	   
	    public void setProduct(Product product) {
	        if (productSet.size() == 0) {
	            productSet = new HashSet<>();
	        }
	        productSet.add(product);
	    }
	
}
