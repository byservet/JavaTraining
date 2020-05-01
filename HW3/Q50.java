package yoyo;

public class Baby {

	public static String play(int toy, int age) {
		final String game;
		if (toy < 2)
			game = age > 1 ? 1 : 10;
			else 
				game = age > 3 ? "Ball" : "Swim";
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

}
