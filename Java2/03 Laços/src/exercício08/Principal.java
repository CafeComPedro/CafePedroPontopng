package exercício08;
import javax.swing.JOptionPane;
public class Principal {
	public static void main(String[] args) {
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
		double numer = numero - 1;
			do {
			System.out.println(numero*numer);
			numer--;
		}while ((numer > 0));
			}}