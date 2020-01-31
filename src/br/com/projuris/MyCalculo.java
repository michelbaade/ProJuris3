package br.com.projuris;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MyCalculo implements Calculo {

	public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios) {

		BigDecimal assistente = BigDecimal.ZERO;
		BigDecimal gerente = BigDecimal.ZERO;
		BigDecimal diretor = BigDecimal.ZERO;

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

		List<CustoCargo> listaCustoCargo = new ArrayList<>();
		listaCustoCargo.add(custoAssistente);
		listaCustoCargo.add(custoGerente);
		listaCustoCargo.add(custoDiretor);

		
		return listaCustoCargo;

	}

	public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios) {

		BigDecimal administrativo = BigDecimal.ZERO;
		BigDecimal financeiro = BigDecimal.ZERO;
		BigDecimal juridico = BigDecimal.ZERO;

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

		List<CustoDepartamento> listaCustoDepartamento = new ArrayList<>();
		listaCustoDepartamento.add(custoAdministrativo);
		listaCustoDepartamento.add(custoFinanceiro);
		listaCustoDepartamento.add(custoJuridico);

		return listaCustoDepartamento;
	}
}