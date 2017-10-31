package model;

import java.io.Serializable;

public class Item implements Serializable {

	private static final long serialVersionUID = 1L;

	private String itemId;
	private String itemName;
	private int price;
	private int quantity;


	public Item() {
		this.itemId = "";
		this.setItemName("");
		this.setPrice(0);
		this.setQuantity(0);
	}

	public Item(String itemId,String itemName,int price,int quantity) {
		this.itemId = itemId;
		this.setItemName(itemName);
		this.setPrice(price);
		this.setQuantity(quantity);
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


}
