package yoyo;

public class TestGame {

	public String runTest (boolean spinner, boolean roller) {
		if (spinner = roller) return "up";
		else return roller ? "down" : "middle";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final TestGame tester = new TestGame();
		System.out.println(tester.runTest(false, true));
	}

}
