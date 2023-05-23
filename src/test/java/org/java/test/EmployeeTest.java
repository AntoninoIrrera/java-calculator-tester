package org.java.test;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.java.Employee;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

	@Test
	public void employeeTest() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		
		LocalDate data = LocalDate.parse("11/05/1990",formatter);
		
		Employee e = new Employee("pippo", "bauldo", data, "employee");
		
	}
	

	@Test
	public void bossTest() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		
		LocalDate data = LocalDate.parse("11/05/1990",formatter);
		
		Employee e = new Employee("pippo", "bauldo", data, "boss");
		
	}
	
	
	@Test
	public void employeeExcTest() throws Exception{
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		
		LocalDate data = LocalDate.parse("11/05/2024",formatter);
		
		Employee e = new Employee("", "", data, "prova");
		
		assertThrows(Exception.class,
				e,
				"Deve sollevare eccezione");
	}


	private void assertThrows(Class<Exception> class1, Employee e, String message) {
		// TODO Auto-generated method stub
		
	}
	
	
}
