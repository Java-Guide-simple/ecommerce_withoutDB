package in.stack.eStore.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.stack.eStore.model.Product;
import in.stack.eStore.service.ProductService;

@Controller
public class ProductController {
	ProductService ps = new ProductService();

	// form for adding new product
	@RequestMapping("/add-product-form")
	public String productAddForm() {

		return "add-product-form";
	}

	// adding new product
	@PostMapping("/addpro")
	public String addProduct(@ModelAttribute("product") Product p, Model map) {
		ps.addProduct(p);
		map.addAttribute("msg", "Product Added Successfully");
		return "product-add-success";
	}

	// Showing all Products
	@GetMapping("/show")
	public String getProducts(Model map) {
		List<Product> AllProducts = ps.showAllProducts();
		 map.addAttribute("products", AllProducts);
		return "displayProduct";
	}

	// form for deleting existing product
	@RequestMapping("/delete-product-form")
	public String deleteProductForm() {
		return "delete-product-form";
	}

	// deleting product
	@RequestMapping("/delete-product")
	public String deleteProduct(@RequestParam("pid") String id, Model map) {
		int pid = Integer.parseInt(id);
		System.out.println(pid);
		ps.deleteProduct(pid);
		map.addAttribute("msg", "Product Deleted");
		return "product-delete-success";
	}

}
