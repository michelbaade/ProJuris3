package br.com.projuris;
import java.math.BigDecimal;
public class CustoDepartamento extends Funcionario { 
	public CustoDepartamento(String cargo, String depargamento, BigDecimal salario) {
		super(cargo, depargamento, salario);
		// TODO Auto-generated constructor stub
	}
	private String departamento;
	private BigDecimal custo;
	
	
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