package in.stack.eStore.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import in.stack.eStore.model.Product;
import in.stack.eStore.seed.Inventry;

public class ProductRepository {
	Inventry in= new Inventry();
	List<Product> products = in.setProducts();
	
	// Showing all products
	public List<Product> showAllProducts() {
		
		products.forEach(s->System.out.println(s.toString()));
		
		return products;
	}
	
	// adding new product
	public void addProduct(Product p) {
		products.add(p);
	}
	
	
	// deleteding product
	public void deleteProduct(int id) {
		Stream<Product> stream = products.stream().filter(s->s.getPid().equals(id)).sorted();
		List<Product> collect = stream.collect(Collectors.toList());
		if(!collect.isEmpty())
			products.removeAll(collect);
	}
}
