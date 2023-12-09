//--------------------- Aufgabe 1 ---------------------
public class PC extends Computer implements Display
{
	public String showThis (String string) {
		return "Dieser Computer zeigt an" + " " + string;
	}
	
	public String showThat() {
		return "Dies ist ein Computer";
	}
	
	public int multiply(int number1, int number2) {
		return number1 * number2;
	}
	
	public int divide(int number1, int number2) {
		return number1 / number2;
	}
	
	public int add(int number1, int number2) {
		return number1 + number2;
	}
	
	public int subtract(int number1, int number2) {
		return number1 - number2;
	}
}