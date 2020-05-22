package games;

public class Jump {
	
	private int rope = 1;
	protected boolean outside;
	
	public Jump(){
		this(4);
		outside = true;
		
	}
	
	public Jump(int rope) {
		this.rope = outside ? rope: rope + 1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Jump().rope);
	}

}
