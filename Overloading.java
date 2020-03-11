package org.edu;

public class Overloading {
	public void clientName(int id) {
    	System.out.println(id);
}
public void clientName(int id, String name) {
    	 System.out.println(id);
    	 System.out.println(name);
    }

    public void clientName(String name,int id) {
    	System.out.println(name);
    	System.out.println(id);
    }

    public void clientName( float u, int i) {
   		System.out.println(u);
   	System.out.println(i);
    } 
    public static void main(String[] args) {
		Overloading o=new Overloading();
		o.clientName(12);
		o.clientName(123.354f, 555);
		o.clientName(996,"anbu");
		o.clientName("arasu",666);
	}
}
