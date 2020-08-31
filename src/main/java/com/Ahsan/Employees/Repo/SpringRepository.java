package com.Ahsan.Employees.Repo;



import com.Ahsan.Employees.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;






@Repository
public interface SpringRepository extends JpaRepository <User, Integer>{

	
	
	User findByUsername(String Username);
	
	
}
