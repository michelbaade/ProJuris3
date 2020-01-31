package br.com.projuris;
import java.math.BigDecimal;

public class CustoCargo extends Funcionario  { 
	public CustoCargo(String cargo, String depargamento, BigDecimal salario) {
		super(cargo, depargamento, salario);
		// TODO Auto-generated constructor stub
	}
	private String cargo;
	private BigDecimal custo;
	
// getters e setters;

public String getCargo() {
	return cargo;
}
public void setCargo(String cargo) {
	this.cargo = cargo;
}
public BigDecimal getCusto() {
	return custo;
}
public void setCusto(BigDecimal custo) {
	this.custo = custo;
}






} 