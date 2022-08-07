package com.example.spring_data_jpa.service;

import com.example.spring_data_jpa.dao.EmployeRepository;

import com.example.spring_data_jpa.entity.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeServiceImpl implements EmployeService{
    @Autowired
    private EmployeRepository employeRepository;
    @Override

    public List<Employe> getAllEmployes() {

        return employeRepository.findAll();
    }

    @Override

    public void saveEmploye(Employe employe) {
        employeRepository.save(employe);
    }

    @Override

    public Employe getEmploye(int id) {
        Employe emp=null;
        Optional<Employe>employe=employeRepository.findById(id);
        if (employe.isPresent()){//проверяем есть ли  работник в оптионал
           emp=employe.get();
        }
        return emp;
    }

    @Override

    public void deleteEmploye(int id) {
        employeRepository.deleteById(id);
    }

    @Override
    public List<Employe> findAllByName(String name) {
        List<Employe>employes=employeRepository.findAllByName(name);
        return employes;
    }


}
