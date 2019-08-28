package fr.formation.inti.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import JDBC.ConnectionUtils;
import fr.formation.inti.entities.Employee;
import fr.formation.inti.utils.Constantes;

/**
 * CRUD
 * 
 * @author IN-LL-037
 *
 */
public class EmployeeDaoImpl implements IEmployeeDao {
	
	
	//on veut afficher la liste de tous les employés
	public List<Employee> getAll() {
		List<Employee> list = new ArrayList<Employee>();
		Employee e;
		Connection conn = null;
		try {
			conn = ConnectionUtils.getMySQLConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(Constantes.SELECT2_EMPLOYEE);
			while (rs.next()) {
				e = new Employee();
				e.setEmp_id(rs.getInt(1));
				e.setFirst_name(rs.getString("First_Name"));
				e.setLast_name(rs.getString("Last_Name"));
				e.setStart_date(rs.getDate("Start_Date"));
				list.add(e);
			}

		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}

		return list;
	}

	public Integer saveEmployee(Employee e) {
		Integer idEmp=0;
		Connection conn = null;
		try {
			conn = ConnectionUtils.getMySQLConnection();
			PreparedStatement pstm = conn.prepareStatement(Constantes.INSERT_EMPLOYEE, Statement.RETURN_GENERATED_KEYS);
			
			
			pstm.setString(1, e.getFirst_name());
			pstm.setString(2, e.getLast_name());
			pstm.setDate(3, new Date(e.getStart_date().getTime()));
			
			pstm.executeUpdate();
			ResultSet rs = pstm.getGeneratedKeys();
			
			if (rs.next()) {
				idEmp = rs.getInt(1);
			}

		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return idEmp;
	}

	public void updateEmployee(Employee e) {
		Connection conn = null;
		try {
			conn = ConnectionUtils.getMySQLConnection();
			PreparedStatement pstm = conn.prepareStatement(Constantes.UPDATE_EMPLOYEE);
			pstm.setString(1, e.getFirst_name());
			pstm.setString(2, e.getLast_name());
			pstm.setInt(3, e.getEmp_id());

		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}

	}

	public void delete(Employee e) {
		Connection conn = null;
		try {
			conn = ConnectionUtils.getMySQLConnection();
			PreparedStatement pstm = conn.prepareStatement(Constantes.DELETE_EMPLOYEE);
			pstm.setInt(1, e.getEmp_id());

		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}

	}

	public Employee getByID(Integer id) {
		Connection conn = null;
		try {
			conn = ConnectionUtils.getMySQLConnection();
			PreparedStatement pstm = conn.prepareStatement(Constantes.SELECT_EMPLOYEE);
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			Employee e = new Employee();
			e.setEmp_id(rs.getInt(1));
			e.setFirst_name(rs.getString("First_Name"));
			e.setLast_name(rs.getString("Last_Name"));
			e.setStart_date(rs.getDate("Start_Date"));
			return e;

		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return null;
	}

	
}
