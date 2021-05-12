package com.example.POC2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.POC2.model.Product;
import com.example.POC2.model.User_order;
import com.example.POC2.service.ProductService;

@RestController
@RequestMapping(value = "/rest")
public class Controller {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/create")
	public Product create(@RequestBody Product product) {
    return service.create(product);
    

	}

	@GetMapping("/product/list")
	
	public Iterable<Product> getInfo() {
		return service.list();
 	}
	
	@GetMapping("getid/{id}")
	public String getid(@PathVariable("id") Integer id){
		
		return service.getid(id);
	}
	
	
	@PostMapping("/createuser")
	
	public User_order create(@RequestBody User_order userorder){
		
		return service.create(userorder);
	}
		
	@GetMapping("/userorder/list")
	
		public Iterable<User_order> getuser() {
			return service.list1();
		}
		
		
	@GetMapping("/userorder/getid/{code}")
	
	public Optional<User_order> getuserid(@PathVariable("code") Integer code){
		
		return service.getuserid(code);
	}
	
	@PutMapping("/userorder/updateid/{id}/{quantity}")
	
	public String update(@PathVariable("id") Integer id, @PathVariable ("quantity") Integer quantity){
		
		return service.updateByid(id,quantity);
	}
	
	
	
	
	}


