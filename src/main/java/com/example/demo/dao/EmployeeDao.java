package com.example.demo.dao;


import com.example.demo.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class EmployeeDao {

    @Autowired
    private DepartmentDao departmentDao;

    public void save(Employee employee){

    }

    public Collection<Employee> getAll(){
        return null;
    }

    public Employee getEmployeeById(Integer id){
        return null;
    }

    public void delete(Integer id){

    }
}
