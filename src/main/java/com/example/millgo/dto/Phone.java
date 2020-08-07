package com.example.millgo.dto;

public class Phone {
	String model;
	int price;
	int volume;
	int quantity;
	public Phone(String model, int price, int volume) {
		super();
		this.model = model;
		this.price = price;
		this.volume = volume;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(((Phone)obj).getModel().equals(model)) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Phone [model=" + model + ", price=" + price + ", volume=" + volume + ", quantity=" + quantity + "]";
	}
	
	
	
	
}