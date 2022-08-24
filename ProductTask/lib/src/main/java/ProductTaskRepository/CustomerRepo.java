package ProductTaskRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import ProductTaskEntity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
	@Query(value = "select customer from Customer customer where customer.custId=?1")
	Customer getcustomerByCustomerId(int custId);
}
