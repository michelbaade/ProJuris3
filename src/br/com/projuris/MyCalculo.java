package br.com.projuris;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MyCalculo implements Calculo {

	public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios) {
		//iniciando as variaveis que vão armazenar os custos por cada cargo.
		BigDecimal assistente = BigDecimal.ZERO;
		BigDecimal gerente = BigDecimal.ZERO;
		BigDecimal diretor = BigDecimal.ZERO;

		
		//for para percorrer cada funcionario verificando se corresponde ao nome do cargo
		for (Funcionario funcionario : funcionarios) {

			String cargo = funcionario.getCargo();

			if (cargo == "Assistente") {

				assistente = assistente.add(funcionario.getSalario());

			} else if (cargo == "Gerente") {

				gerente = gerente.add(funcionario.getSalario());

			} else {
				diretor = diretor.add(funcionario.getSalario());

			}

		}
		
		CustoCargo custoAssistente = new CustoCargo("Assistente", assistente);
		CustoCargo custoGerente = new CustoCargo("Gerente", gerente);
		CustoCargo custoDiretor = new CustoCargo("Diretor", diretor);

		//transformando os custos para a lista de custos por cargo
		List<CustoCargo> listaCustoCargo = new ArrayList<>();
		listaCustoCargo.add(custoAssistente);
		listaCustoCargo.add(custoGerente);
		listaCustoCargo.add(custoDiretor);

		//retorno do custo por cargo
		return listaCustoCargo;

	}

	public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios) {
		
		//iniciando as variaveis que vão armazenar os custos por cada departamento.
		
		BigDecimal administrativo = BigDecimal.ZERO;
		BigDecimal financeiro = BigDecimal.ZERO;
		BigDecimal juridico = BigDecimal.ZERO;

		//for para percorrer cada funcionario verificando se corresponde ao nome do departamento
		for (Funcionario funcionario : funcionarios) {

			String depart = funcionario.getDepartamento();
			if (depart == "Administrativo") {

				administrativo = administrativo.add(funcionario.getSalario());

			} else if (depart == "Financeiro") {

				financeiro = financeiro.add(funcionario.getSalario());

			} else {
				juridico = juridico.add(funcionario.getSalario());

			}

		}

		CustoDepartamento custoAdministrativo = new CustoDepartamento("Administrativo", administrativo);
		CustoDepartamento custoFinanceiro = new CustoDepartamento("Financeiro", financeiro);
		CustoDepartamento custoJuridico = new CustoDepartamento("Jurídico", juridico);


		//transformando os custos para a lista de departamentos por cargo
		
		List<CustoDepartamento> listaCustoDepartamento = new ArrayList<>();
		listaCustoDepartamento.add(custoAdministrativo);
		listaCustoDepartamento.add(custoFinanceiro);
		listaCustoDepartamento.add(custoJuridico);
		//retorno do custo por departamento
		return listaCustoDepartamento;
	}
}