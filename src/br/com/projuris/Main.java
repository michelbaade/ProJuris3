package br.com.projuris;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
		BigDecimal administrativo = BigDecimal.ZERO;
		BigDecimal financeiro = BigDecimal.ZERO;
		BigDecimal juridico = BigDecimal.ZERO;
		
		BigDecimal  assistente = BigDecimal.ZERO;
		BigDecimal	gerente = BigDecimal.ZERO;
		BigDecimal	diretor = BigDecimal.ZERO;
		
		
		for (Funcionario funcionario : listaFuncionario) {
			
			String depart = funcionario.getDepartamento();
			if(depart == "Administrativo") {
				
				administrativo = administrativo.add(funcionario.getSalario());
				
			}else if(depart == "Financeiro") {
				
				financeiro = financeiro.add(funcionario.getSalario());
				
				
			}else {
				juridico = juridico.add(funcionario.getSalario());
			
				
			}
			
			String cargo = funcionario.getCargo(); 
			
			if(cargo == "Assistente") {
				
				assistente = assistente.add(funcionario.getSalario());
				
			}else if(cargo == "Gerente") {
				
				gerente = gerente.add(funcionario.getSalario());
				
				
			}else {
				diretor = diretor.add(funcionario.getSalario());
			
				
			}
			
			
				
		}
		
		
		
		System.out.println("Custo total por departamento :");
		System.out.println(" Administrativo " + administrativo);
		System.out.println(" Gerente " + financeiro);
		System.out.println(" Jurídico " + juridico);
		
		System.out.println("------------------------------------------------------------------------");
		
		System.out.println("Custo total por cargo :");
		System.out.println(" Assistente " + assistente);
		System.out.println(" Gerente " + gerente);
		System.out.println(" Diretor " + diretor);
		
		
		
	}

}
