import java.util.Arrays;


public class Test1 {
	
	public void printStormName(String... names) {
		System.out.println(Arrays.toString(names));
		int a = names.length;
		
	}
	int [][] blue = new int [2][2];
	
	public void printStormNames(String[] names) {
		System.out.println(Arrays.toString(names));
		
	}
	
	public static void main (String args[]) {
		char[][] ticTacToe = new char[3][3];
		ticTacToe[1][3] = 'x';
		ticTacToe[2][2] = 'X';
		ticTacToe[3][1] = 'X';
		System.out.println(ticTacToe.length + "asdf ");
		
	}
	
}
