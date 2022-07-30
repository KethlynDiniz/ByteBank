package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Conta[] contas = new ContaCorrente[5];
		
		ContaCorrente cc1 = new ContaCorrente(11, 11);
		contas[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(11, 22);
		contas[1] = cc2;
		
		//System.out.println(cc2.getNumero());
		System.out.println(contas[1].getNumero());
		
		ContaPoupanca ref = ((ContaPoupanca) contas[1]); //type cast
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
		

	}

}
