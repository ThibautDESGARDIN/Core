package fr.formation.inti.utils;

public class Constantes {
	
	public static final String INSERT_EMPLOYEE ="Insert into employee (First_Name, Last_Name, START_DATE) values (?, ?, ?)";
	
	public static final String DELETE_EMPLOYEE ="delete from employee where emp_id = ?";
	
	public static final String UPDATE_EMPLOYEE ="update employee set First_Name = ?, Last_Name = ? where emp_id = ?";
	
	public static final String SELECT_EMPLOYEE ="Select * from employee where emp_id = ?";
	
	public static final String SELECT2_EMPLOYEE ="Select emp_id, First_Name, Last_Name, START_DATE from employee";
	
	

}
