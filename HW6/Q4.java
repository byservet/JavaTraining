package figures;

public class Dolls {

	public void nested() { nested(2, true);}//g1
	public int nested(int level, boolean height) {return nested(level);}
	public int nested(int level) { return level + 1;} //g2
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Dolls().nested());
	}

}
