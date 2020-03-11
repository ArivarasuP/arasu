package org.edu;

public class Ktm implements Bike,Re {
	@Override
	public void maintainence() {
		System.out.println("55");
	}

	@Override
	public void cost() {
		System.out.println("23");
	
	}

	@Override
	public void speed() {
		System.out.println("80");
	}
	public static void main(String[] args) {
		Re k=new Ktm();
		k.cost();
		
	}
	

}
