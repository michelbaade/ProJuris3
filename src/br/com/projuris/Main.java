package br.com.projuris;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		// entrada dos valores
		Funcionario funcionario1 = new Funcionario("Assistente", "Administrativo", new BigDecimal(1000.0));
		Funcionario funcionario2 = new Funcionario("Gerente", "Administrativo", new BigDecimal(7000.70));
		Funcionario funcionario3 = new Funcionario("Diretor", "Administrativo", new BigDecimal(10000.45));
		Funcionario funcionario4 = new Funcionario("Assistente", "Financeiro", new BigDecimal(1300.9));
		Funcionario funcionario5 = new Funcionario("Gerente", "Financeiro", new BigDecimal(7500));
		Funcionario funcionario6 = new Funcionario("Diretor", "Financeiro", new BigDecimal(11000.0));
		Funcionario funcionario7 = new Funcionario("Estagiário", "Jurídico", new BigDecimal(700.4));
		Funcionario funcionario8 = new Funcionario("Assistente", "Jurídico", new BigDecimal(1800.90));
		Funcionario funcionario9 = new Funcionario("Gerente", "Jurídico", new BigDecimal(9500.50));
		Funcionario funcionario10 = new Funcionario("Diretor", "Jurídico", new BigDecimal(13000.0));
		List<Funcionario> listaFuncionario = new ArrayList<>();
		listaFuncionario.add(funcionario1);
		listaFuncionario.add(funcionario2);
		listaFuncionario.add(funcionario3);
		listaFuncionario.add(funcionario4);
		listaFuncionario.add(funcionario5);
		listaFuncionario.add(funcionario6);
		listaFuncionario.add(funcionario7);
		listaFuncionario.add(funcionario8);
		listaFuncionario.add(funcionario9);
		listaFuncionario.add(funcionario10);
		
		
		// chamada classe que vai verificar e retornar os custos
		MyCalculo mycal = new MyCalculo();
		
		System.out.println("Custos por Departamentos: ");
		
		//lista que retorna o custo por departamento
		List<CustoDepartamento> custoPorDepartamento = mycal.custoPorDepartamento(listaFuncionario);
		
		//for que vai receber e mostrar o nome e o custo de cada departamento com 2 casas decimais
		for (CustoDepartamento custoDepartamento : custoPorDepartamento) {
			
			System.out.printf(custoDepartamento.getDepartamento()+ ": %.2f",custoDepartamento.getCusto());
			System.out.println(" ");
			
		}
		System.out.println(" ");
		
		System.out.println("Custos por Cargos: ");
		
		//lista que retorna o custo por cargo
		List<CustoCargo> custoPorCargo = mycal.custoPorCargo(listaFuncionario);
		
		//for que vai receber e mostrar o nome e o custo de cada cargo com 2 casas decimais
		for (CustoCargo custoCargo : custoPorCargo) {
			
			
			System.out.printf(custoCargo.getCargo()+ ": %.2f",custoCargo.getCusto());
			System.out.println(" ");											
			
		}
		
		
	}

}
