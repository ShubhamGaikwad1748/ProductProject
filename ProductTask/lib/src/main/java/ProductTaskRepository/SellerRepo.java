package ProductTaskRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ProductTaskEntity.Customer;
import ProductTaskEntity.Seller;

public interface SellerRepo extends JpaRepository<Seller, Integer> {
	@Query(value = "select seller from Seller seller where seller.sellerId=?1")
	Customer getSellerBySellerId(int sellerId);
}
