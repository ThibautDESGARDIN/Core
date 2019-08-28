package fr.formation.inti.core;

import java.util.Date;

import fr.formation.inti.entities.Departement;
import fr.formation.inti.entities.Employee;

public class AppFile {

	public static void main(String[] args) {
//1		Michael	Smith	2001-06-22	President	1	3	
//14		Cindy	Mason	2002-08-09	Teller	3	1	13
//		Employee def = new Employee;
		Departement d = new Departement();
		d.setDept_id(3);
		Departement d2 = new Departement();
		d.setDept_id(1);
		Employee e1 = new Employee(1,null,"Michael", "Smith", new Date(), "President", 1,d,null);
		Employee e13 = new Employee();
		Employee e14 = new Employee(14,null,"Cindy", "Mason", new Date(), "Teller", 3,d2,e13);
	}

}
