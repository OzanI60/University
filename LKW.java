//--------------------- Aufgabe 6 ---------------------
public class LKW extends Car implements Loadable
{
	public String getLoadTyp() {
		return "Kaffee";
	}
	public int getCapacity() {
		return 50;
	}
	//gibt an, wie viel Ladung tatsaechlich geladen ist.
	public int getLoad() {
		return 20;
	}
}