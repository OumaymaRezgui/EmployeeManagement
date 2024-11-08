package com.cifop.tn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cifop.tn.entity.Departement;
import com.cifop.tn.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
	//Query method
    List<Employee> findByNameAndPosition(String name,String position);

    
    //JPQL
    @Query("SELECT e FROM Employee e where e.name=:name and e.position=:position")
    List<Employee> findByNameAndPositionJPQL(String name,String position);
    
    //Native query
    @Query(value="SELECT * FROM employee e where e.name= :name and e.position= :position",nativeQuery=true)
    List<Employee> findByNameAndPositionNativequery(String name,String position);
}