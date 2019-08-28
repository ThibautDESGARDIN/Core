package fr.formation.inti.entities;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
	private int emp_id, assigned_branch_id;
	private Employee manager;
	private String first_name, last_name, title;
	private Date start_date, end_date;
	private Departement dept;

	public Employee() {
		//constructor
	}
	
	
	public Employee(int emp_id, Date end_date, String first_name, String last_name, Date start_date,String title, int assigned_branch_id, Departement dept, Employee manager) {
		super();
		this.emp_id = emp_id;
		this.assigned_branch_id = assigned_branch_id;
		this.manager = manager;
		this.first_name = first_name;
		this.last_name = last_name;
		this.title = title;
		this.start_date = start_date;
		this.end_date = end_date;
		this.dept = dept;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public int getAssigned_branch_id() {
		return assigned_branch_id;
	}

	public void setAssigned_branch_id(int assigned_branch_id) {
		this.assigned_branch_id = assigned_branch_id;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public Departement getDept() {
		return dept;
	}

	public void setDept(Departement dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", first_name="
				+ first_name + ", last_name=" + last_name + ", start_date=" + start_date + "]";
	}





}