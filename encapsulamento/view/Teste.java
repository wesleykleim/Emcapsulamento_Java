package br.com.fiap.encapsulamento.view;

import br.com.fiap.encapsulamento.model.Pastel;

//CTRL + SHIFT + o (import)
//CTRL + espaço lá na declaração da classe
public class Teste {

	public static void main(String[] args) {
		
		//Instanciar um pastel
		Pastel pastel = new Pastel();
		
		//Atribuindo valores para o objeto
		pastel.setSabor("Especial");
		pastel.setValor(10);
		pastel.setPronto(true);
		
		//Recuperar o valor e exibir
		System.out.println(pastel.getSabor());
		System.out.println(pastel.getValor());
		System.out.println(pastel.isPronto());
		
	}	
}