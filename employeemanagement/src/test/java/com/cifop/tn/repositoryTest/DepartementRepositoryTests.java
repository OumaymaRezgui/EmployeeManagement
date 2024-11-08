package com.cifop.tn.repositoryTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.cifop.tn.entity.Departement;
import com.cifop.tn.repository.DepartementRepository;

@DataJpaTest
public class DepartementRepositoryTests {
	@Autowired
	DepartementRepository  departmentRepository;
	
	// PATTERN AAA
	@Test
	void shouldReturnListOfDepartements_WhenDepartmentsIsAvailable()
	{
		
		//ARRANGE
		departmentRepository.save(new Departement("RH"));
		departmentRepository.save(new Departement("IT"));
		departmentRepository.save(new Departement("IT"));
		
		//ACT
		List<Departement> actualDepartments=departmentRepository.findByName("IT");
		
		//ASSERT
		assertEquals(1, actualDepartments.size());
		
	  
	}
}