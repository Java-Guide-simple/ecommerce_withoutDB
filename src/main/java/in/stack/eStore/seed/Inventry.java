package in.stack.eStore.seed;

import java.util.ArrayList;
import java.util.List;

import in.stack.eStore.model.Customer;
import in.stack.eStore.model.Product;

public class Inventry {

	public List<Product> setProducts() {

		List<Product> product = new ArrayList<>();
		product.add(new Product(1, "T-Shirt", 1209.23, "Mens"));
		product.add(new Product(10, "Jeans", 1500.90, "Mens"));
		product.add(new Product(10001, "T-Watch", 7899.00, "Mens"));
		product.add(new Product(112, "School Bag", 2878.23, "New"));
		product.add(new Product(1111, "Mobile", 68798.00, "Electronics"));
		product.add(new Product(190, "Camera HD", 78987.50, "Electronics"));
		product.add(new Product(1123, "Face Wash", 230.00, "Cosmetic"));
		product.add(new Product(18, "TV", 12000.00, "Electronics"));
		return product;
	}

	public List<Customer> setCustomer() {
		List<Customer> customer = new ArrayList<Customer>();
		customer.add(new Customer(1, "Ram", "Babu", "ram@gmail.com", "787677689", "ram123@"));
		customer.add(new Customer(6, "Shyam", "Babu", "shy@gmail.com", "879877689", "ram123@"));
		customer.add(new Customer(12, "Ramesh", "Babu", "ramesh@gmail.com", "908777689", "ram123@"));
		customer.add(new Customer(15, "Nitin", "Sahu", "nitin@gmail.com", "98877689", "ram123@"));
		customer.add(new Customer(23, "Rita", "Sita", "rita@gmail.com", "787678987", "ram123@"));

		return customer;
	}

}
