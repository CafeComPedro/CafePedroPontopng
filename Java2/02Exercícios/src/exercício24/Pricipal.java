package exercício24;

import javax.swing.JOptionPane;

public class Pricipal {
	public static void main(String[] args) {
		 int val1 = Integer.parseInt(JOptionPane.showInputDialog("valor 1"));
		 int val2 = Integer.parseInt(JOptionPane.showInputDialog("valor 2"));
		 int val3 = Integer.parseInt(JOptionPane.showInputDialog("valor 3"));
		 
		 if((val1 > val2) && (val2 > val3)) {
			 System.out.println(val1);
			 System.out.println(val2);
			 System.out.println(val3);
		 }if((val1 >val3) && (val3 > val2)) {
			 System.out.println(val1);
			 System.out.println(val3);
			 System.out.println(val2);
		 }if((val2 > val1) && (val1 > val3)) {
			 System.out.println(val2);
			 System.out.println(val1);
			 System.out.println(val3);
		 }if((val2 > val3) && (val3 > val1)) {
			 System.out.println(val2);
			 System.out.println(val3);
			 System.out.println(val1);
		 }if((val3 > val1) && (val1 > val2)) {
			 System.out.println(val3);
			 System.out.println(val1);
			 System.out.println(val2);
		 }if((val3 > val2) && (val2 > val1)) {
			 System.out.println(val3);
			 System.out.println(val2);
			 System.out.println(val1);
		 }
	}

}
