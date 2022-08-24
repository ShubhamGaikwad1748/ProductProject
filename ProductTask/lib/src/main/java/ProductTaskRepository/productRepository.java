package ProductTaskRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.eauction.entities.Product;

import ProductTaskEntity.Products;


public interface productRepository extends JpaRepository<Products, Integer>{

	@Query(value = "select product from Product product where product.productType=?1")
	List<Products> getProductsByProductType(String productType);
	
	@Query(value = "select product from Products product where product.productId=?1")
	static
	Products getProductByProductId(int productid) {
		// TODO Auto-generated method stub
		return null;
	}
}
