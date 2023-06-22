package abc;

public class MethodOverridingExample {

	public static void main(String[] args) {
		Honda hh = new Honda();
		Pulsar pu = new Pulsar();
		
		hh.color();
		hh.speed();
		
		pu.color();
		pu.speed();
		
	}

}
