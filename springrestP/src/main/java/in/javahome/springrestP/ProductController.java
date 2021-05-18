package in.javahome.springrestP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import in.javahome.springrestP.model.Product;
import in.javahome.springrestP.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	 private ProductService productService;
	
	@RequestMapping(value="/addproduct", method=RequestMethod.POST)
	public Product addProduct(@RequestBody Product p) {
		return productService.addProduct(p);
		
	}
	
	@RequestMapping(value="/getproduct/{id}",method=RequestMethod.GET)
	public Product getProduct(@PathVariable Integer id) {
		return productService.getProduct(id);
	}
	
	@RequestMapping(value="/products", method=RequestMethod.GET)
	public List<Product> getallProducts(){
		return productService.getallproducts();
		
	}
	
	@RequestMapping(value="/updateproduct", method=RequestMethod.PUT)
	public void updateProduct(@RequestBody Product p) {
		productService.updateProduct(p);
	}
	
	@RequestMapping(value="/deletproduct/{id}", method=RequestMethod.DELETE)
	public void deleteProduct(@PathVariable Integer id) {
		productService.deleteProduct(id);
	}
	
	

}
