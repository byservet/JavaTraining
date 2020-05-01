package yoyo;

public class TestGame {

	public String runTest (boolean spinner, boolean roller) {
		if (spinner = roller) return "up";
		else return roller ? "down" : "middle";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int characters = 5;
		int story = 3;
		double movieRating = characters <= 4? 3 :story > 1 ? 2 : 1;
		System.out.println(movieRating);
	}

}
