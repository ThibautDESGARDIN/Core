package fr.formation.inti.core;

import java.util.List;

import fr.formation.inti.dao.EmployeeDaoImpl;
import fr.formation.inti.entities.Employee;

public class AppDao {
	
	public static void main(String[] args) {
		System.out.println("================ save =====================");
		Employee e1 = new Employee();
		e1.setFirst_name("");
		e1.setLast_name("");
		
		EmployeeDaoImpl dao = new EmployeeDaoImpl();
		List<Employee> list = dao.getAll();
		for (Employee e : list) {System.out.println(e);}
		
		
		int id = dao.saveEmployee(e1);
		
		e1.setEmp_id(id);
		
		
		System.out.println("=============== update ===================");
		
		e1.setFirst_name("");
		dao.updateEmployee(e1);
		System.out.println("=============== getAll ===================");
		
		
		System.out.println("=============== delete ===================");
		dao.delete(e1);
		
		
		
	}

}
