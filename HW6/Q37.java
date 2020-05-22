package pet;

public class Puppy {
	public static int wag = 5;
	public void Puppy(int wag) {
		this.wag = wag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(new Puppy(2).wag);
	}

}
