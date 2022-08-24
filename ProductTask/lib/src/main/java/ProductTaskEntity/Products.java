package ProductTaskEntity;

import javax.persistence.Column;
import javax.persistence.Id;

public class Products {
	@Id
	private int productId;
	@Column(name = "name", length = 30,nullable = false)
	private String productName;
	@Column(name = "name", length = 30,nullable = false)
	private String productType;
	@Column(name = "name", length = 30,nullable = false)
	private String productCategory;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
}
