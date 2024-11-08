package com.cifop.tn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cifop.tn.entity.Departement;
import com.cifop.tn.repository.DepartementRepository;

@Service
public class DepartemenrService {
	@Autowired
	DepartementRepository departementRepositroy;
	

	public Departement saveDepartement(Departement d) {
		return departementRepositroy.save(d);
	}
	
	public void DeleteDepartement(long depId) {
		departementRepositroy.deleteById(depId);
	}
	
	public Departement addDepartement(Departement d) {
		return departementRepositroy.save(d);
	}
	
	public  List<Departement> findDepartement(){
		return  (List<Departement>) departementRepositroy.findAll();
	}
	
	public Departement findDepartmentById(long id) {
		return departementRepositroy.findById(id).get();
	}	
}