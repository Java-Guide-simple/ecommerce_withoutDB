package in.stack.eStore.service;

import java.util.List;

import in.stack.eStore.model.Product;
import in.stack.eStore.repository.ProductRepository;

public class ProductService {

	ProductRepository ps = new ProductRepository();

	public List<Product>  showAllProducts() {
		List<Product> AllProducts = ps.showAllProducts();
		return AllProducts;
	}
	
	public void deleteProduct(int pid) {
		ps.deleteProduct(pid);
	}
	
	public void addProduct(Product p) {
		ps.addProduct(p);
	}
}
