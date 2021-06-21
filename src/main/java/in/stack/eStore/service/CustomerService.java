package in.stack.eStore.service;

import java.util.List;

import in.stack.eStore.model.Customer;
import in.stack.eStore.repository.CustomerRepository;

public class CustomerService {

	private CustomerRepository repo = new CustomerRepository();

	public void saveCustomer(Customer customer) {
		repo.saveCustomer(customer);
	}
	
	
	public List<Customer> showAllCustomer() {
		List<Customer> showAllCustomers = repo.showAllCustomers();
		return showAllCustomers;
	}
	
	public void deleteCustomer(String mobile) {
		repo.deleteCustomer(mobile);
	}
}
