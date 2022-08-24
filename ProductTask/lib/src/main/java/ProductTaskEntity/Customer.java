package ProductTaskEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "customer")
public class Customer {
	@Id
	private int custId;
	@Column(name = "name", length = 30,nullable = false)
	private String name;
	@Column(name = "userName", length = 20,nullable = false,unique = true)
	private String userName;
	@Column(name = "userType", length = 15,nullable = false)
	private String userType;
	public int getUserId() {
		return custId;
	}
	public void setUserId(int userId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
