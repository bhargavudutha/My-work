package com.model;

public class Cart {
	private Integer ProductId;
	private String productName;
	private User user;
	public Integer getProductId() {
		return ProductId;
	}
	public void setProductId(Integer productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Cart(Integer productId, String productName, User user) {
		super();
		ProductId = productId;
		this.productName = productName;
		this.user = user;
	}
	public Cart() {
		super();
	}
	

}
