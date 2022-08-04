package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteInteger {
	public static void main(String[] args) {

		Integer idadeRef = Integer.valueOf(29); // autoboxing
		System.out.println(idadeRef.intValue()); // unboxing

		Double dRef = Double.valueOf(3.2);// autoboxing
		System.out.println(dRef.doubleValue());// unboxing

		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());

		Number refNumero = Integer.valueOf(29);
		

		List<Number> lista = new ArrayList<>();
		lista.add(10); //int
		lista.add(32.6); //double
		lista.add(25.6f); //float
	}

}
