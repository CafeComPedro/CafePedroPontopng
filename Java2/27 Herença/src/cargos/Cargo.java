package cargos;

public class Cargo {

	//Atributos
	protected String cargo;
	protected double salario;
	
	
	
	//Vale Transporte
	
	public void valeTransporte() {
		System.out.println("O cargo "+cargo+", terá um desconte do Vale Tranporte no valor de R$"+salario*0.06);
	}
	
}
