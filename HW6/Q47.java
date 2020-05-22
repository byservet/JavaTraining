package sports;

public class Football {
	public static Long getScore(Long timeRemaining) {
		return 2*timeRemaining; // m1
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int startTime = 4;
		System.out.println(getScore(startTime)); //m2 
	}

}
