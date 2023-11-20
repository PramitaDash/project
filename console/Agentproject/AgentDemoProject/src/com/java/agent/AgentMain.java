package com.java.agent;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class AgentMain {
	
	static AgentBAL bal;
	static Scanner sc;
	
	static {
		bal = new AgentBAL();
		sc = new Scanner(System.in);
	}
	public static void main(String[] args)  {
		int choice;
		do {
			System.out.println("O P T I O N S");
			System.out.println("-------------");
			System.out.println("1. Add Agent");
			System.out.println("2. Show Agent");
			System.out.println("3. Search Agent");
			System.out.println("4. Delete Agent");
			System.out.println("5. Update Agent");
			System.out.println("6. Exit");
			System.out.print("Enter Your Choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:{
				try {
					addAgentMain();
				} catch (AgentException e) {
					System.err.println(e.getMessage());
					/*  e.printStackTrace(); this is used to tell all the line where it is error taking place
						e.printStackTrace();  */
				}
				break;
			}
			case 2:{
				showAgentMain();
				break;
			}
			case 3:{
				searchAgentMain();
				break;
			}
			case 4:{
				deleteAgentMain();
				break;
			}
			case 5:{
				try {
					updateAgentMain();
				} catch (AgentException e) {
					System.err.println(e.getMessage());
//					e.printStackTrace();
				}
				break;
			}
		
			
			
			case 6:{
				return;
			}
			
		}
	}while(choice!=6);
	}

	public static void showAgentMain() {
		List<Agent> agentList= bal.showAgentBal();
		for (Agent agent : agentList) {
			System.out.println(agent);
		}
	}
	
	public static void deleteAgentMain() {
		int empno;
		System.out.print("Enter Agent Number   ");
		empno = sc.nextInt();
		System.out.println(bal.deleteAgentBal(empno));
	}
	
	
	public static void searchAgentMain() {
		int empno;
		System.out.print("Enter AgentId  : ");
		empno = sc.nextInt();
		Agent agent = bal.searchAgentBal(empno);
		if (agent!=null) {
			System.out.println(agent);
		} else {
			System.err.println("Record Not Found...");
		}
	}
	
	
	public static void addAgentMain() throws AgentException {
		Agent agent = new Agent();
		System.out.print("Enter Your First Name :");
		agent.setFirstName(sc.next());
		System.out.print("Enter Your Last Name :");
		agent.setLastName(sc.next());
		System.out.print("Enter Your City : ");
		agent.setCity(sc.next());
		System.out.print("Enter Your PayMode : ");
		agent.setPayMode(PayMode.valueOf(sc.next()));
		System.out.print("Enter Your Preminum : ");
		agent.setPremium(sc.nextDouble());
		System.out.println(bal.addAgentBal(agent));
	}
	
	public static void updateAgentMain() throws AgentException {
		Agent agentUpdated = new Agent();
		System.out.print("Enter AgentId : ");
		agentUpdated.setAgentId(sc.nextInt());
		System.out.print("Enter Your First Name :");
		agentUpdated.setFirstName(sc.next());
		System.out.print("Enter Your Last Name :");
		agentUpdated.setLastName(sc.next());
		System.out.print("Enter Your City : ");
		agentUpdated.setCity(sc.next());
		System.out.print("Enter Your PayMode : ");
		agentUpdated.setPayMode(PayMode.valueOf(sc.next()));
		System.out.print("Enter Your Preminum : ");
		agentUpdated.setPremium(sc.nextDouble());
		System.out.println(bal.updateAgentBal(agentUpdated));
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
