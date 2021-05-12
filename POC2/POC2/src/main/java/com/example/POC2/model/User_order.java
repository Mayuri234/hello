package com.example.POC2.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table(name="user")
public class User_order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int oid;
	private int quantity;
	
	@CreationTimestamp
	private LocalDateTime ordertime;
	@UpdateTimestamp
	private LocalDateTime lastmodified;
	
	@ManyToOne
	private Product product;

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LocalDateTime getOrdertime() {
		return ordertime;
	}

	public void setOrdertime(LocalDateTime ordertime) {
		this.ordertime = ordertime;
	}

	public LocalDateTime getLastmodified() {
		return lastmodified;
	}

	public void setLastmodified(LocalDateTime lastmodified) {
		this.lastmodified = lastmodified;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}


	

	
	
	
	
	
}
