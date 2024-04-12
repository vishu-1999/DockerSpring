package com.ia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ia.entity.Employee;
import com.ia.service.EmployeeService;

@SpringBootTest
class SpringBootDemoAtcApplicationTests {
	@Autowired
	EmployeeService service;
//	@Test
//	void testAddEmployee() {
//		Employee employee = new Employee(111,"mehul",1654,"delhi");
//		
//		Employee emp = service.addEmployee(employee);
//		
//		assertEquals(emp.getEmpName(), "mehul");
//	}
	@Test
	void testUpdateEmployee() {
		Employee employee = new Employee(111,"raghu",1654,"delhi");
		
		Employee emp = service.updateEmployee(employee);
		
		assertEquals(emp.getEmpName(), "raghu");
	}
//	@Test
//	void testDeleteEmployee() {
//		
//		assertEquals(emp.getEmpName(), "mehul");
//	}

}
