package ProductTaskServices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;



import ProductTaskEntity.Customer;
import ProductTaskEntity.Products;
import ProductTaskEntity.Seller;
import ProductTaskRepository.productRepository;

@Service
public class ProductsServiceImpl implements ProductsServices {

	@Override
	public int addProduct(Products product) {
		Products products = new Products();
		products.setProductName(products.getProductName());
		products.setProductType(products.getProductType());
		products.setProductCategory(products.getProductCategory());
		productRepository.save(products);
		return products.getProductId();

	}

	@Override
	public void updateProduct(Products productUpdate) {
		Products product=productRepository.getProductByProductId(productUpdate.getProductId());
			
		product.setProductName(productUpdate.getProductName());
		product.setProductType(productUpdate.getProductType());
		product.setProductCategory(product.getProductCategory());
		productRepository.save(product);
	}

	@Override
	public void deleteProduct(int productId) {
		Products product = productRepository.getProductByProductId(productId);
		productRepository.deleteById(productId);
	}

	@Override
	public List<Products> viewAllProductsByType(String productType) {
		List<Products> productList=new ArrayList<Products>();
		for (Products product : productList) {
			Products productsView=new Products();
			product.setProductName(product.getProductName());
			product.setProductType(product.getProductType());
			product.setProductCategory(product.getProductCategory());
			
			productList.add(product);
			
	}
		return productList;
}

	@Override
	public Products getProductById(int productid) {
		Products product = productRepository.getProductByProductId(productid);
		if (product == null) 
		{
			System.out.println("Invalid Id....");
		}
			Products productView=new Products();
			product.setProductName(product.getProductName());
			product.setProductType(product.getProductType());
			product.setProductCategory(product.getProductCategory());			
			return productView;
		
		
	}
}
