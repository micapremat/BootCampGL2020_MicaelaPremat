package ar.com.gl.shop.product.model;

public class Category {
	private String description;
	private String name;
	private long id;
	
	public Category(long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
