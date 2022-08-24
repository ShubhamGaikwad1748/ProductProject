package ProductTaskEntity;

import javax.persistence.Column;
import javax.persistence.Id;

public class Seller {
	@Id
	private int sellerId;
	@Column(name = "name", length = 30,nullable = false)
	private String sellerName;
	@Column(name = "userName", length = 20,nullable = false,unique = true)
	private String userName;
	@Column(name = "userType", length = 15,nullable = false)
	private String userType;
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
}
