//--------------------- Aufgabe 4 ---------------------

import java.util.concurrent.ThreadLocalRandom;

public class Airplane extends Vehicle implements Airworthy, Driveable
{
	public void fly() {
		
	}

	@Override
	public void move() {
		
	}


	public void drive() {
		
	}
	public int getNumberOfWheels() {
		int min = 3;
		int max = 42;
		return (int)(Math.random()* ((max-min)+1 )) + min;
	}
}