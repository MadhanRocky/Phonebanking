package Today;

public class traffic {
private  boolean isOn;
public void turnOn() 
		 {
 isOn = true;
System.out.println("Traffic Light on? " + isOn );

		 }
public void turnOff() {
	isOn = false;
	System.out.println("Traffic Light on? " + isOn);
	}
public static void main(String[] args)
{
traffic m = new traffic ();
traffic n = new traffic();
 m.turnOn();
 n.turnOff();
 }
}

