package com.example.POC2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.POC2.dao.ProductDao;
import com.example.POC2.dao.User_OrderDao;
import com.example.POC2.model.Product;
import com.example.POC2.model.User_order;


@Service
public class ProductService {
	
	@Autowired
	private ProductDao dao;

	public Product create(Product product){
		
		return dao.save(product);
	}
	
	public Iterable<Product> list(){
		
		return dao.findAll();
			
	}
	
	public String getid(Integer productId){
		
		String msg = "";
		
		Optional<Product> list = dao.findById(productId);
		
		if(list.isPresent() == true){
			msg = "Success";
		}
		else {
			msg = "Product Id not Exist";
		}
		
		
		
		return msg+"\r"+list.toString();
	}
	

	
	@Autowired
	
	private User_OrderDao userdao;
	
    public User_order create(User_order userorder){
		
		return userdao.save(userorder);
		
		
	}
    
    public Iterable<User_order> list1(){
    	
    	return userdao.findAll();
    	
    }
    
    public Optional<User_order> getuserid(Integer code){
    	
    	return userdao.findById(code);
    	
    }

	public String updateByid(Integer id, Integer quantity) {
    
   
		        String msg = "";
		      
		       
		        
		        User_order order = userdao.findById(id).orElse(new User_order());
		        if(order != null){
		        order.setQuantity(quantity);
		        userdao.save(order);
		         msg = "Success";
		        }
		        else {
		            msg = "Order Id Doesn't  Exist";
		        }
		       
		        return msg+ "\r" + msg;
		    }
    	
    	
    	
    }
    

		
	
	

