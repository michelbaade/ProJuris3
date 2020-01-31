package br.com.projuris;
import java.math.BigDecimal;

public class CustoCargo   { 
	
	public CustoCargo(String cargo, BigDecimal custo) {
		super();
		this.cargo = cargo;
		this.custo = custo;
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