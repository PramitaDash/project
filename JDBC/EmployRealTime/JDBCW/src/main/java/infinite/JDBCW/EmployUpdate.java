package infinite.JDBCW;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployUpdate {
	
	public static void main(String[] args) {
		int empno;
		String name, gender, dept, desig;
		double basic;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employ number: ");
		empno = sc.nextInt();
		System.out.println("Enter employ name: ");
		name = sc.next();
		System.out.println("Enter gender(MALE/FEMALE)");
		gender=sc.next();
		System.out.println("Enter department: ");
		dept=sc.next();
		System.out.println("Enter designation: ");
		desig= sc.next();
		System.out.println("Enter basic: ");
		basic= sc.nextDouble();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/infinite_august23","root","root");
			String cmd = "Update Employc set name=? , gender=?, dept=?, desig=?,"+ "basic=? where empno=?";
			PreparedStatement pst = connection.prepareStatement(cmd);
			pst.setInt(1,  empno);
			pst.setString(2,  name);
			pst.setString(3, gender);
			pst.setString(4,dept);
			pst.setString(5,  desig);
			pst.setDouble(6, basic);
			pst.executeUpdate();
			System.out.println("***Record Updated***");


		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}