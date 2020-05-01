package recreation;

public class Dancing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int leaders = 10 * (2 + (1 + 2 / 5));
		System.out.println(leaders);
		int followers = leaders * 2;
		System.out.println(leaders + followers > 10 ? "Too few" : "Too many");
	}

}
