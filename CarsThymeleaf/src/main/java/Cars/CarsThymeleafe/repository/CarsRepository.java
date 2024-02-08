package Cars.CarsThymeleafe.repository;

import Cars.CarsThymeleafe.entity.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarsRepository extends JpaRepository<Cars, Integer> {

    @Query("SELECT c FROM Cars c WHERE c.name LIKE %:name%")
    List<Cars> findByNameContaining(String name);

//    @Query("SELECT c FROM Joke c WHERE " +
//            "LOWER(c.fabricationYear) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
//            "LOWER(c.name) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
//            "LOWER(c.series) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
//            "LOWER(c.motorType) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
//            "LOWER(c.price) LIKE LOWER(CONCAT('%', :keyword, '%'))"
//    )
//    List<Cars> findByKeyword(@Param("keyword") String searchQuery);


}

