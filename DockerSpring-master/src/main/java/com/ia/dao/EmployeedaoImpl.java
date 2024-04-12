package com.ia.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ia.entity.Employee;

@Repository
public class EmployeedaoImpl implements Employeedao{
	@PersistenceContext
	EntityManager entity;

	@Override
	public Employee addEmployee(Employee employee) {
		entity.persist(employee);
		return entity.find(Employee.class, employee.getEmpId());
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return entity.merge(employee);
	}

	@Override
	public String deleteEmployee(int empId) {
	Employee emp = entity.find(Employee.class, entity);
		
	if(emp!=null)
	{
		entity.persist(emp);
		return "Employee Deleted";
	}
	else {
		return "no employee found";
	}
	}

	@Override
	public Employee getEmployee(int empId) {
		return entity.find(Employee.class,empId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		TypedQuery<Employee> result = entity.createQuery("select e from Employee e",Employee.class);
		
		return result.getResultList();
	}

}
