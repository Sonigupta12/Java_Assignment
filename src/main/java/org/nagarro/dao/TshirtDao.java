package org.nagarro.dao;

import java.util.List;

import org.nagarro.model.Tshirt;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TshirtDao extends CrudRepository<Tshirt, String> {

	@Query(value = "select * from tshirt where color=?1 and size=?2 and gender=?3 order by ?4 ASC", nativeQuery = true)

	List<Tshirt> searchTshirts(String colour, String size, String gender_recommendation, String sortingType);

}
