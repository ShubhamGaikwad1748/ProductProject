package ProductTaskController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import ProductTaskEntity.Products;
import ProductTaskServices.ProductsServiceImpl;


@RestController
public class CustomerController {
	@Autowired
	ProductsServiceImpl productService;

	@GetMapping("/product/{productType}")
	public ResponseEntity<List<Products>> viewProductByProductType(@PathVariable String productType){
		List<Products> productList = productService.viewAllProductsByType(productType);
			return new ResponseEntity<List<Products>>(productList,HttpStatus.OK);
	}
	@GetMapping("/product/id/{productId}")
	public ResponseEntity<Products> viewProductByProductId(@PathVariable int productId){
		Products product = productService.getProductById(productId);
			return new ResponseEntity<Products>(product,HttpStatus.OK);
	}
}
