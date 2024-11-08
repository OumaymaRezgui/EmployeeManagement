package com.cifop.tn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cifop.tn.entity.Departement;
import com.cifop.tn.entity.Employee;

public interface DepartementRepository extends CrudRepository<Departement,Long> {
    List<Departement> findByName(String name);

}