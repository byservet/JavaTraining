package mode;

public class Transportation {
	public static String travel (int distance) {
		return distance<100? "train" : 10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(travel(500));
	}

}
