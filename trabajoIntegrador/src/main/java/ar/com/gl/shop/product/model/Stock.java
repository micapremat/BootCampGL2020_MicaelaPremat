package ar.com.gl.shop.product.model;

public class Stock {
	private long id;
	private int quantity;
	private String locationCode;
	
	public Stock(long id, int quantity, String locationCode) {
		this.id = id;
		this.quantity = quantity;
		this.locationCode = locationCode;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getLocationCode() {
		return locationCode;
	}
	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}
}
