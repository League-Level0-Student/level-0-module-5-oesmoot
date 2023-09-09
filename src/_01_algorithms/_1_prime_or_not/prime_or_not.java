package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class prime_or_not {
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("thou shalt giveth thy computer thy greatest of all numbers");
		int inti = Integer.parseInt(number);
		for (int i = 2; i< inti; i++) {
			if (inti % i == 0) {
				JOptionPane.showMessageDialog(null, "not prime");
				System.exit(0);
			}
			
		}
		JOptionPane.showMessageDialog(null, "prime");
	}
}
