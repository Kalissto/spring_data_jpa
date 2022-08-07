package com.example.spring_data_jpa.dao;




import com.example.spring_data_jpa.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeRepository extends JpaRepository<Employe,Integer> {
public List<Employe>findAllByName(String name);
}
