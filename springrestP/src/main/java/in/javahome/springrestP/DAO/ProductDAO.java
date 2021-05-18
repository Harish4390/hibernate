package in.javahome.springrestP.DAO;

import java.util.List;

import in.javahome.springrestP.model.Product;

public interface ProductDAO {
	
	public Product addProduct(Product p);
	public Product getProduct(Integer id);
	public List<Product> getallproducts();
	public void deleteProduct(Integer id);
	public void updateProduct(Product p);
	

}
