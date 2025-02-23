package demo_dao_jdbc.model.dao;

import java.util.List;

import demo_dao_jdbc.model.entities.Department;
import demo_dao_jdbc.model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj);

	void update(Seller obj);

	void deleteById(Integer id);

	Seller findById(Integer id);

	List<Seller> findAll();
	
	List<Seller> findByDepartment(Department dep);
}
