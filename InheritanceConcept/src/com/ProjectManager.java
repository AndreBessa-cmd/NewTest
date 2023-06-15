package com;

public class ProjectManager extends Manager {
	private String client;
	
	void setProjectManager(String client) {
		this.client = client;
	}
	
	void disProjM () {
		System.out.println("Client is "+this.client);
	}

}
