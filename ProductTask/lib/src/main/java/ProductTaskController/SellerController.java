package ProductTaskController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import ProductTaskEntity.Products;
import ProductTaskServices.ProductsServiceImpl;


@RestController
public class SellerController {
	@Autowired
	ProductsServiceImpl productService;
	@GetMapping("/product/id/{productId}")
	public ResponseEntity<Products> viewProductByProductId(@PathVariable int productId){
		Products productDto = productService.getProductById(productId);
			return new ResponseEntity<Products>(productDto,HttpStatus.OK);
	}
	@GetMapping("/product/{productType}")
	public ResponseEntity<List<Products>> viewProductByProductType(@PathVariable String productType){
		List<Products> productList = productService.viewAllProductsByType(productType);
			return new ResponseEntity<List<Products>>(productList,HttpStatus.OK);
	}
	
	@PostMapping("/product")
	public ResponseEntity<String> addProduct(@RequestBody Products productAdd) {
		int productId = productService.addProduct(productAdd);
		return new ResponseEntity<String>("Product added successfully, productId  : " + productId, HttpStatus.OK);
	}
	@PutMapping("/product")
	public ResponseEntity<String> updateProduct(@RequestBody Products productUpdate) {
		productService.updateProduct(productUpdate);
		return new ResponseEntity<String>("Product Updated", HttpStatus.OK);
	}
	@DeleteMapping("/product/{productId}")
	public ResponseEntity<String> deleteProduct(@PathVariable int productId) {
		productService.deleteProduct(productId);
		return new ResponseEntity<String>("Product Deleted..", HttpStatus.OK);
	}

}
