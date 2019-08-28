package fr.formation.inti.entities;

import java.io.Serializable;
import java.util.Set;

public class Departement implements Serializable {
	
	private String name;
	private int dept_id;
	private Set<Employee> employees;
	
	

	public Departement() {
	}
	
	public Set<Employee> getEmployees() {return employees;}

	public void setEmployees(Set<Employee> employees) {this.employees = employees;}
	
	public String getName() {return name;}
	
	public void setName(String name) {this.name = name;}
	
	public int getDept_id() {return dept_id;}
	
	public void setDept_id(int dept_id) {this.dept_id = dept_id;}
	
}
