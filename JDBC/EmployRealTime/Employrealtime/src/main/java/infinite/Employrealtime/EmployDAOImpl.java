package infinite.Employrealtime;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployDAOImpl implements EmployDAO {
	
	Connection connection;
	PreparedStatement pst;
	@Override
	public List<Employ> showEmployDao() throws ClassNotFoundException, SQLException {
		connection = connectionHelper.getConnection();
		String cmd = "select * from Employ";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Employ> employList = new ArrayList<Employ>();
		Employ employ = null;
		while(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("dept"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
			employList.add(employ);
		}
		// TODO Auto-generated method stub
		return employList;
	}
	@Override
	public Employ searchEmployDao(int empno) throws ClassNotFoundException, SQLException {
		connection = connectionHelper.getConnection();
		String cmd = "select * from Employ where empno=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1,empno);
		ResultSet rs = pst.executeQuery();
		Employ employ = null;
		if(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
		}
		// TODO Auto-generated method stub
		return employ;
	}
	@Override
	public String addEmployDao(Employ employ) throws ClassNotFoundException, SQLException {
		connection = connectionHelper.getConnection();
		String cmd = "Insert into Employ(Empno,name,gender,dept,desig,basic)"+"values(?,?,?,?,?,?)";
		PreparedStatement pst = connection.prepareStatement(cmd);
		pst.setInt(1,  employ.getEmpno());
		pst.setString(2,   employ.getName());
		pst.setString(3,  employ.getGender().toString());
		pst.setString(4, employ.getDept());
		pst.setString(5,   employ.getDesig());
		pst.setDouble(6,  employ.getBasic());
		pst.executeUpdate();
		System.out.println("***Record Insert***");
		// TODO Auto-generated method stub
		return "Employ record /inserted";
	}
	@Override
	public String deleteEmployDao(int empno) throws ClassNotFoundException, SQLException {
		Employ employ = searchEmployDao(empno);
		if(employ!=null) {
			connection = connectionHelper.getConnection();
			String cmd = "Delete from Employ where empno=?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, empno);
			pst.executeUpdate();
			return "Employ Record Deleted....";
		}
		return "record not found";
	}
	@Override
	public String updateEmployDao(Employ employNew) throws ClassNotFoundException, SQLException {
		Employ employFound= searchEmployDao(employNew.getEmpno());
		if(employFound!=null) {
			connection = connectionHelper.getConnection();
			String cmd = "update Employ set Name=?, Gender=?, Dept=?, Basic=? where"+"employ=?";
			 pst = connection.prepareStatement(cmd);
				pst.setString(2,   employFound.getName());
				pst.setString(3,  employFound.getGender().toString());
				pst.setString(4, employFound.getDept());
				pst.setString(5,  employFound.getDesig());
				pst.setDouble(6, employFound.getBasic());
				pst.setInt(1, employFound.getEmpno());
				pst.executeUpdate();
				return("***Employ Record Updatedt***");


		}
		
		return "Employ Record Not Found";
	}
}

	



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

