package fun;

public class Sudoku {
	static int[][] game;
	public static void main(String target[]) {
		// TODO Auto-generated method stub
		game[3][3] = 6;
		Object[] obj = game;
		game[3][3] = "X";
		System.out.println(game[3][3]);

	}

}
