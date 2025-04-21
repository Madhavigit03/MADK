package org.bike;

public class Ktm implements Bike{

@Override
public void cost() {
	System.out.println("Bike Cost is: 2L");
	
}
@Override
	public void speed() {
	System.out.println("Bike Speed is: 45kmph");
		
	}
 public static void main(String[] args) {
	 Ktm k = new Ktm();
	 k.cost();
	 k.speed();
	
}
}
