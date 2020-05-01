package dessert;

public class IceCream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flavors = 30;
		int eaten = 0;
		switch(flavors) {
		case 30: eaten ++;
		case 40: eaten+=2;
		default: eaten--;
		}
		System.out.println(eaten);
	}

}
