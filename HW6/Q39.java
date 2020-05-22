package ship;

public class Phone {
	private int size;
	public Phone(int size) {this.size = size;}
	
	public static void sendHome(Phone p, int newSize) {
		p = new Phone(newSize);
		p.size = 4;
	}
	public static void main(String... params) {
		// TODO Auto-generated method stub
		final Phone phone = new Phone(3);
		sendHome(phone, 7);
		System.out.println(phone.size);

	}

}
