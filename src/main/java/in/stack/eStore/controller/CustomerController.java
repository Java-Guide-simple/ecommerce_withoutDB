package in.stack.eStore.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.stack.eStore.model.Customer;
import in.stack.eStore.service.CustomerService;

@Controller
public class CustomerController {

	CustomerService cs = new CustomerService();

	@ModelAttribute("customer")
	public Customer setCustomerForm() {
		return new Customer();

	}

	// New Customer Registration form
	@GetMapping("/registration")
	public String showSignUpPage() {
		return "registration-form";
	}

	// New Customer adding
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer, Model map) {
		cs.saveCustomer(customer);
		System.out.println(customer.getMobile());
		map.addAttribute("customer", customer);
		map.addAttribute("msg", "Registration Success!");
		return "registration-success";
	}

	// Show All customer
	@GetMapping("/showCustomer")
	public String showAllCustomer(Model map) {
		List<Customer> showAllCustomer = cs.showAllCustomer();
		map.addAttribute("customers", showAllCustomer);
		return "display-Customers";
	}

	// form for customer Deletion
	@RequestMapping("/deleteForm")
	public String deleteForm() {
		return "delete-form";
	}

	// Customer deleting using mobile number
	@RequestMapping("/delete")
	public String deleteCustomer(@RequestParam("mobile") String mobile, Model map) {
		cs.deleteCustomer(mobile);
		map.addAttribute("mobile", mobile);
		map.addAttribute("msg", "Customer Deleted!");
		return "delete-success";
	}

}
