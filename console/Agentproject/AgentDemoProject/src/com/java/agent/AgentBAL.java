package com.java.agent;

import java.io.IOException;
import java.util.List;

public class AgentBAL {
	
	static StringBuilder sb;
	static AgentDAO dao;
	static {
		sb = new StringBuilder();
		dao = new AgentDaoImpl();
	}
	
	
	
	public String addAgentBal(Agent agent)throws AgentException {
		if (validateAgent(agent)==true) {
			return dao.addAgentDao(agent);
		}
		throw new AgentException(sb.toString());
	}
	
	public boolean validateAgent(Agent agent) {
		boolean flag = true;
		if(agent.getFirstName().length()<4) {
			flag = false;
			sb.append("Agent First Name must contains 4 characters...\r\n");
		}
		if(agent.getLastName().length()<4) {
			flag= false;
			sb.append("Agent Last Name must contains 4 characters...\r\n");
		}
		
		if(agent.getCity().equalsIgnoreCase(("Delhi")))
			

		{
			flag= false;
			sb.append("Agent City Cannot be Delhi...\r\n");
		}
		if(agent.getPremium()<5000 || agent.getPremium()>99000) {
			flag = false;
			sb.append("Agent Premium must be in between 5000 to 99000...\r\n");
		}
		return flag;
	}
	
	
	public String updateAgentBal(Agent agentUpdated) throws AgentException {
		if (validateAgent(agentUpdated)==true) {
			return dao.updateAgentDao(agentUpdated);
		}
		throw new AgentException(sb.toString());
	}
	 
	public String deleteAgentBal(int empno) {
		return dao.deleteAgentDao(empno);
	}
	
	public Agent searchAgentBal(int empno) {
		return dao.searchAgentDao(empno);
	}
	
	public List<Agent> showAgentBal() {
		return dao.showAgentDao();
	}
}
