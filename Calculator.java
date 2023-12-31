//--------------------- Aufgabe 2 ---------------------
public class Calculator implements Battery, Display
{
	//Variable, die den Batteriestand symbolisiert.
	//Verwende sie im Zusammenhang mit den Methoden aus Battery.
	private int battery = 0;
	
	public int add(int number1, int number2)
	{
		if (battery == 0) return 0;
		battery -= 1;
		
		return number1 + number2;
	}
	
	public int subtract(int number1, int number2)
	{
		if (battery == 0 || battery == 1) return 0;
		battery -= 2;
		return number1 - number2;
	}
	
	public String showThis (String string) {
		return string;
	}
	
	public String showThat() {
		return "Ich bin ein Taschenrechner";
	}
	
	public int restBattery() {
		return battery;
	}
	
	public void charge() {
		battery += 10;
	}
}