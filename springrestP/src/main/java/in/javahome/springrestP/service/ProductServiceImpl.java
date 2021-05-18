package in.javahome.springrestP.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.javahome.springrestP.DAO.ProductDAO;
import in.javahome.springrestP.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDAO productDAO;

	public Product addProduct(Product p) {
		
		return productDAO.addProduct(p);
	}

	public Product getProduct(Integer id) {
		return productDAO.getProduct(id);
	}

	public List<Product> getallproducts() {
		return productDAO.getallproducts();
	}

	public void deleteProduct(Integer id) {
		productDAO.deleteProduct(id);
	}

	public void updateProduct(Product p) {
		productDAO.updateProduct(p);
	}

}
