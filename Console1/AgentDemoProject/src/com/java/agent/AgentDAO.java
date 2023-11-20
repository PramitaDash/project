package com.java.agent;

import java.io.IOException;
import java.util.List;

public interface AgentDAO {
	
	List<Agent> showAgentDao();
	String addAgentDao(Agent agent);
	Agent searchAgentDao(int empno);
	String deleteAgentDao(int empno);
	String updateAgentDao(Agent agent);
	
	
	
}
