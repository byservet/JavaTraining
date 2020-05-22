package stocks;


public class Bond {
	public static int price = 5;
	
	public boolean sell() {
		if (price < 10) {
			price ++;
			return true;
		} else if (price >= 10) 
			return false;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Bond().sell();
		new Bond().sell();
		new Bond().sell();
		System.out.println(price);
	}

}
