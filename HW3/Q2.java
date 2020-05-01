import java.util.ArrayList;


public class Test {
	
	
		
	public static void main(String[] args) {
		int meal = 5;
		int tip = 2;
		int total = meal + (meal>6 ? ++tip : --tip);
		System.out.println(tip);
	}
	
	

}

