package in.stack.eStore.model;

public class Product {

	private Integer pid;
	private String name;
	private Double price;
	private String category;
	
	public Product() {
		
	}

	public Product(Integer pid, String name, Double price, String category) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	
	

}
