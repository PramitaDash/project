package infinite.Employrealtime;

import java.sql.SQLException;
import java.util.Scanner;

public class EmploySearchMain {
	
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ number  ");
		empno = sc.nextInt();
		EmployDAO dao = new EmployDAOImpl();
		
		try {
			Employ employ = dao.searchEmployDao(empno);
			if(employ!=null) {
				System.out.println(employ);
			}else {
				System.out.println("***Record not found***");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
