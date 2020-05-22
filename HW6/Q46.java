
public class ChooseWisely {
	
	public ChooseWisely() {super();}
	public int choose(int choose){ return 5;}
	public int choose(short choose){ return 2;}
	public int choose(long choose){ return 11;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ChooseWisely().choose((byte) 2+1));
	}

}
