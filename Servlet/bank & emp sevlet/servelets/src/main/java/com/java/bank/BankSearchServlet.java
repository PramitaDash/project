package com.java.bank;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class BankSearchServlet
 */
public class BankSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BankSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int accountNo = Integer.parseInt(request.getParameter("accountNo"));
		PrintWriter out = response.getWriter();
		BankDAO dao = new BankDAOImpl();
		
	try {
		Bank bank = dao.searchAccountDao(accountNo);
		if(bank!=null) {
			out.println("Account No   " +bank.getAccountNo() + "<br/>");
			out.println("first Name   " +bank.getFirstName() + "<br/>");
			out.println("last Name   " +bank.getFirstName() + "<br/>");
			out.println("City   " +bank.getCity() + "<br/>");
			out.println("State   " +bank.getState() + "<br/>");
			out.println("Amount   " +bank.getAmount() + "<br/>");
			out.println("CheqFacil   " +bank.getCheqFacil() + "<br/>");
			out.println("accountType   " +bank.getAccountType() + "<br/>");
			out.println("dateOfOpen   " +bank.getDateOfOpen() + "<br/>");
			
		}else {
			out.println("Account Record not found");
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
