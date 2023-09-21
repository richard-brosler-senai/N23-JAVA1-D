package br.com.senaisp.bauru.richard.secao05;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * 
		 * Base de Cálculo (R$)					Alíquota Parcela a Deduzir do IR (R$)
				0,00			Até 2.112,00	isento	isento
			De 2.112,01 		até 2.826,65	7,50%	158,4
			De 2.826,66 		até 3.751,05	15%		370,4
			De 3.751,06 		até 4.664,68	22,50%	651,73
			Acima de 4.664,68					27,50%	884,96
			
			Dedução por dependente: 189,59
			Exemplo para calculo:
			Salario = R$ 10.000,00
			INSS = R$ 876,97
			Dep = 2
			
			IR = 1.519,60
		 */
		String xSalario = JOptionPane.
				showInputDialog("Digite seu salário bruto:");
		String xInss = JOptionPane.
				showInputDialog("Digite o desconto do INSS:");
		String xDep = JOptionPane.
			showInputDialog("Digite o número de dependentes:");
		//Convertendo os valores
		double salario = Double.parseDouble(xSalario);
		double inss = Double.parseDouble(xInss);
		int nDep = Integer.parseInt(xDep);
		//calculando a base de calculo
		double baseCalculo = salario - inss - nDep * 189.59;
		double ali = 0, ded = 0;
		//testando agora as faixas
			//2.112,01 		até 2.826,65	7,50%	158,4
		if (baseCalculo > 2112 && baseCalculo <= 2826.65) {
			ali = 0.075;
			ded = 158.40;
			//De 2.826,66 		até 3.751,05	15%		370,4
		} else if (baseCalculo > 2826.65 && baseCalculo <= 3751.05) {
			ali = 0.15;
			ded = 370.40;
			//3.751,06 		até 4.664,68	22,50%	651,73
		} else if (baseCalculo > 3751.05 && baseCalculo <= 4664.68) {
			ali = 0.225;
			ded = 651.73;
		//Acima de 4.664,68					27,50%	884,96
		} else if (baseCalculo > 4664.68) {
			ali = 0.275;
			ded = 884.96;
		}
		//calculando o valor do IR
		double ir = baseCalculo * ali - ded;
		//Mostrando o imposto a pagar
		JOptionPane.showMessageDialog(null, 
				"Você pagará R$ " + ir + " de Imposto");
	}

}
