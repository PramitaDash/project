package com.java.lms;

import java.sql.SQLException;
import java.util.List;

public interface LeaveDetailsDAO {
	
	String applyLeave(LeaveDetails leaveDeatails) throws ClassNotFoundException, SQLException;

	List<LeaveDetails> showLeaveDetailsDao() throws ClassNotFoundException, SQLException;

	LeaveDetails searchLeaveDao(int leaveId) throws ClassNotFoundException, SQLException;

	String ApproveDeny(int leaveid, int managerid, String status, String mgcmt)
			throws ClassNotFoundException, SQLException;
	
	
	
	
	
	

}
