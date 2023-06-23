package com;

public class ServerTest {

	public static void main(String[] args) {
		
		Server ss = new Server(); //gives access to all methods
		Team1 team1 = new Server();   // creating object and assigning in interface reference
		Team2 team2 = new Server();   // only access to team2 interface
		
		ss.ownMethod();
		
		System.out.println("team 1 "+team1.add(100, 200));
//		System.out.println("team 1 "+team1.sub(200,400));
		
		System.out.println("team 2 "+team2.sub(300, 150));
	}

}
