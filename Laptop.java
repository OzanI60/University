//--------------------- Aufgabe 3 ---------------------
public class Laptop extends Computer implements Battery, Display
{
	//Variable, die den Batteriestand symbolisiert.
	//Verwende sie im Zusammenhang mit den Methoden aus Battery.
	private int battery = 0;
	
	public int restBattery() {
		return battery;
	}
	
	public void charge() {
		battery += 5;
	}
	
	public String showThis (String string) {
		return string;
	}
	
	public String showThat() {
		return "Ich bin ein Laptop";
	}
	
	public int multiply(int number1, int number2) {
		if (battery < 5) return 0;
		battery -= 5;
		return number1 * number2;
	}
	
	public int divide(int number1, int number2) {
		if (battery < 10) return 0;
		battery -= 10;
		return number1 / number2;
	}
	
	public int add(int number1, int number2) {
		if (battery < 2) return 0;
		battery -= 2;
		return number1 + number2;
	}
	
	public int subtract(int number1, int number2) {
		if (battery < 3) return 0;
		battery -= 3;
		return number1 - number2;
	}
}