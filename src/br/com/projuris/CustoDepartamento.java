package br.com.projuris;
import java.math.BigDecimal;
public class CustoDepartamento { 
	private String departamento;
	private BigDecimal custo;
	
	public CustoDepartamento(String departamento,BigDecimal custo) {
		this.departamento = departamento;
		this.custo = custo;
	}
	
	
// getters e setters

public String getDepartamento() {
	return departamento;
}
public void setDepartamento(String departamento) {
	this.departamento = departamento;
}
public BigDecimal getCusto() {
	return custo;
}
public void setCusto(BigDecimal custo) {
	this.custo = custo;
}

} 