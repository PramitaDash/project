package infinite.Employrealtime;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployDeleteMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Employ No...");
		empno = sc.nextInt();
		EmployDAO dao = new EmployDAOImpl();
		try {
			System.out.println(dao.deleteEmploy(empno));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
}
}
