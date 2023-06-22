package abc;

public class Honda extends Bike{

	void color() {
		System.out.println("Gray");
	}
	
	@Override   //This is a annotation
	void speed() {
		System.out.println("50Km/hr");
	}
}
