package com.pruebatecnica.spring.jpa.h2.repository;

/************************************************************/
/************************************************************/
/************************************************************/
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.pruebatecnica.spring.jpa.h2.model.Prices;

/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
@Repository
@Transactional(readOnly = true)
public interface PricesRepository extends JpaRepository<Prices, Integer> {
    @Query(value = "SELECT * FROM Prices u WHERE u.start_date = ?1 AND u.brand_id = ?2 AND u.product_id = ?3", nativeQuery = true)
    Prices findByStarDateAndbrandIdAndproductId(java.sql.Timestamp startDate, int brandId, int productId);
}
/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
