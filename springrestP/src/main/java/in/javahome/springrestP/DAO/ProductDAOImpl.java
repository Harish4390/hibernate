package in.javahome.springrestP.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.javahome.springrestP.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	

	public Product addProduct(Product p) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.save(p);
		s.getTransaction().commit();
		s.close();
		return p;
	}


	public Product getProduct(Integer id) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.get(Product.class, id);
		return s.get(Product.class, id);

	}


	public List<Product> getallproducts() {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		List<Product> products = s.createQuery("from Product").list();
		
		return products;
	}
	
	public void updateProduct(Product p) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.update(p);
		s.getTransaction().commit();
		s.close();
	}


	
//	public void deleteCountry(int id) {
//        Session session = this.sessionFactory.getCurrentSession();
//        Country p = (Country) session.load(Country.class, new Integer(id));
//        if (null != p) {
//            session.delete(p);
//        }
        
	public void deleteProduct(Integer id) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		Product p = (Product)s.load(Product.class, id);
		s.delete(p);
		s.getTransaction().commit();
		s.close();
	}


	
	

}
