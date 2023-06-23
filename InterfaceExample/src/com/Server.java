package com;

public class Server implements Team1,Team2{

	@Override
	public int sub(int x, int y) {
		
		return x-y;
	}

	@Override
	public int add(int x, int y) {
		
		return x+y;
	}
	public void ownMethod() {
		System.out.println("own Method");
	}
}
