package abc;

public class MethodExample {

	static void display() {
		
		System.out.println("Display method");
	}
	
	static void add(int x,int y) {
		
		int sum =x+y;
		System.out.println("sum is "+sum);
	}
	
	static int findLargest(int x, int y) {
		if(x>y) {
			return x;
		}else {
				return y;
			}
	}
	
	
	public static void main(String[] args) {
		display();
		add(100,200);
		add(3,5);
		int result = findLargest(10,50);
		System.out.println(result);

	}

	
	
	
}
