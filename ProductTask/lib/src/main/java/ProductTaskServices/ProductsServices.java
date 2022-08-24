package ProductTaskServices;


import java.util.List;

import com.cg.eauction.dto.ProductDto;

import ProductTaskEntity.Products;

public interface ProductsServices {
	int addProduct(Products p);
	void updateProduct(Products productUpdate);
	void deleteProduct(int productId);
	
	List<Products> viewAllProductsByType(String productType);
	Products getProductById(int productid);
}
