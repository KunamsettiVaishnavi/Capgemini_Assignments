package com.capg.basic.SpringMVCapp1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

// Manage Database

@Component
public class ProductDAOImpl {

	List<Product> list = new ArrayList<>();

	public ProductDAOImpl() {
		
		/*
		 * Product p1 = new Product(101, "HP-101",45000); Product p2 = new Product(102,
		 * "HP-102",15000); Product p3 = new Product(103, "HP-103",25000); Product p4 =
		 * new Product(104, "HP-104",20000); Product p5 = new Product(105,
		 * "HP-105",145000);
		 */
		Product p1 = new Product(101, "HP-101",45000, 5);
		Product p2 = new Product(102, "HP-102",15000, 4);
		Product p3 = new Product(103, "HP-103",25000, 2);
		Product p4 = new Product(104, "HP-104",20000, 1);
		Product p5 = new Product(105, "HP-105",145000, 5);
		
		//list = Arrays.asList(p1,p2,p3,p4,p5);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
	
	}
	
	public List<Product> getAllProducts()
	{
		return list;
	}
	
	public List<Product> getProductsByRange(int r1,int r2)
	{
		
		Comparator<Product> comp = (p1,p2)->p1.getProductCost() - p2.getProductCost();
		
		List<Product> productList = list.stream().
		filter((product)->product.getProductCost()>=r1&&product.getProductCost()<=r2).
		collect(Collectors.toList());
		
		return productList;
	}
	
	public Product getProductById(int searchid)
	{
		boolean isIdFound = false;
		Product searchedProduct = null;
		for (Product product : list) {
			if(product.getProductId() == searchid)
			{
				isIdFound = true;
				searchedProduct = product;
				break;
			}
		}
		return searchedProduct;
	}
	
	public List<Product> getProductByRating(int starRating)
	{
		List<Product> productList = new ArrayList<Product>();
		for (Product product : list) {
			if(product.getRating() == starRating)
			{
				productList.add(product);
			}
		}
		return productList;
	}
	
	public boolean deleteProductById(int searchid)
	{
		boolean isDel = false;
		Product searchedProduct = null;
		for (Product product : list) {
			if(product.getProductId() == searchid){
				searchedProduct = product;
				break;
			}
		}
		isDel = list.remove(searchedProduct);
		
		return isDel;
	}

	public boolean doAdd(Product product) {
		// TODO Auto-generated method stub
		return list.add(product);
	}

	public Product doUpdate(Product updatedProduct, int productId) {
		// TODO Auto-generated method stub
		Product p = getProductById(productId);
		if(p != null) {
			p.setProductCost(updatedProduct.getProductCost());
			p.setProductId(updatedProduct.getProductId());
			p.setProductName(updatedProduct.getProductName());
			p.setRating(updatedProduct.getRating());
		}
		return p;
	}
	
}//end class
