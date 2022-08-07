package com.example.spring_data_jpa.service;

import com.example.spring_data_jpa.entity.Employe;

import java.util.List;

public interface EmployeService {
    public List<Employe> getAllEmployes();
    public void saveEmploye(Employe employe);
    public Employe getEmploye(int id);
    public void deleteEmploye(int id);
    public List<Employe>findAllByName(String name);
}
