package org.edu;

public class Arts extends Education {
	@Override
	public void ug() {
		System.out.println("8");
	}

	@Override
	public void pg() {
		System.out.println("9");
	}
	public void bSc() {
		System.out.println("9");
	}
	public static void main(String[] args) {
		Arts a=new Arts();
		a.bSc();
		a.pg();
		a.ug();
	}
}
