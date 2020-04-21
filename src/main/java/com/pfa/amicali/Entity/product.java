package com.pfa.amicali.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name = "product")
public class product  implements Serializable{
	
	
	
	
	public product() {
	
	}

	
	

	public product(String product_name, float product_price, String discription_price, String pictureUrl,
			Date createdAt, Date updatedAt) {
		super();
		this.product_name = product_name;
		this.product_price = product_price;
		this.discription_price = discription_price;
		this.pictureUrl = pictureUrl;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	


	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	@Column(name = "product_name", nullable = false)
    private String product_name;
	
	@Column(name = "product_price", nullable = false)
    private float product_price;
	
	@Column(name = "discription_price", nullable = false)
    private String discription_price;
	
	





	@ManyToOne
    @JoinColumn(name = "providers", nullable = false)
    private provider providers;
   
	
	
	public provider getProviders() {
		return providers;
	}




	public void setProviders(provider providers) {
		this.providers = providers;
	}
	
	
	
	
	
	@OneToMany(mappedBy = "product", fetch = FetchType.LAZY) private
	  List<feedBack> feedback;
	  
	  @Column(name="rating", columnDefinition = "int default 0") 
	  private int rating;
	 
	
	
	
	public long getId() {
		return id;
	}




	
	public void setId(long id) {
		this.id = id;
	}




	
	public String getProduct_name() {
		return product_name;
	}




	
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}




	public float getProduct_price() {
		return product_price;
	}




	public void setProduct_price(float product_price) {
		this.product_price = product_price;
	}





	public String getDiscription_price() {
		return discription_price;
	}




	
	public void setDiscription_price(String discription_price) {
		this.discription_price = discription_price;
	}





	public String getPictureUrl() {
		return pictureUrl;
	}




	
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}





	public Date getCreatedAt() {
		return createdAt;
	}




	
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}




	public Date getUpdatedAt() {
		return updatedAt;
	}




	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}




	private String pictureUrl;

	
	
	@Column(name = "created_at", nullable = false)
    @CreatedDate
    private Date createdAt;
    
    
    @Column(name = "updated_at", nullable = false)
    @LastModifiedDate
    private Date updatedAt;
    
    
    
    

    
    
    
    
    
    
    
	
	public List<feedBack> getFeedback() {
		return feedback;
	}





	public void setFeedback(List<feedBack> feedback) {
		this.feedback = feedback;
	}




	
	public int getRating() {
		return rating;
	}





	public void setRating(int rating) {
		this.rating = rating;
	}




	@Override
	public String toString() {
		return "product [id=" + id + ", product_name=" + product_name + ", product_price=" + product_price
				+ ", discription_price=" + discription_price + ", pictureUrl=" + pictureUrl + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + "]";
	}
    
    
    
	
	

}
