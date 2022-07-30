// Metodo para estudo, usamos ArrayList (ver em "teste util")

package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorObject {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(3, 2);
		
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(3, 2);
		
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = ((Conta) guardador.getReferencia(0)); //cast para referencia generica para especifica
		System.out.println(ref.getNumero());
	}
}



