package com.cg.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cg.entity.Product;





@RestController
public class ProductController
{
	
List<Product> productRepo=new ArrayList<>();
public ProductController()
{
	productRepo.add(new Product("Laptop",101,45678));
	productRepo.add(new Product("Ipad",102,65678.84));
	productRepo.add(new Product("Iphone",103,84678.34));
	productRepo.add(new Product("Ipod",104,1200.99));
	productRepo.add(new Product("HardDisk",105,5000.0));
	productRepo.add(new Product("Data cables",106,2000.15));
	productRepo.add(new Product("Fit Bit Wrist Band",107,5000.78));
	productRepo.add(new Product("Arm Sleeves",108,500.12));
	productRepo.add(new Product("Adapter",109,4000.26));
	productRepo.add(new Product("Samsung Tab",110,75768.34));
	productRepo.add(new Product("DVD",234,345323.0));
}

@RequestMapping(value="/products", method=RequestMethod.GET)
public List<Product> index()
{
	return productRepo ;
}
@PostMapping("/add")
public ResponseEntity<Object> saveProduct(@RequestBody Product product) {
    productRepo.add(product);
	return new ResponseEntity<>(HttpStatus.OK);
}
}
