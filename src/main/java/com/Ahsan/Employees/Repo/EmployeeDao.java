package com.Ahsan.Employees.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ahsan.Employees.Model.Employees;


@Repository
public interface EmployeeDao extends JpaRepository<Employees, Integer> {


}
