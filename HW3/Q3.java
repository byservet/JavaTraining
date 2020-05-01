package registration;

import javax.swing.JOptionPane;

public class NameCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String john = "john";
		String jon = new String(john);
		System.out.println((john==jon)+" "+(john.equals(jon)));
	}

}