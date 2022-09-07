package br.com.fiap.encapsulamento.model;

public class Pastel {

	//Atributos
	private String sabor;
	
	private double valor;
	
	private boolean pronto;
	
	//Métodos
	public void vender() {
		prepararPastel();
		entregar();
	}
	
	public void entregar() {
		prepararPastel();
		System.out.println("Entregando o pastel");
	}
	
	private void prepararPastel() {
		if (!pronto) {
			System.out.println("Fritando o pastel..");
			pronto = true;
		}
	}
	
	//Getters e Setters (métodos para ler e escrever os valores dos atributos)
	//Método de leitura
	public String getSabor() {
		return sabor; //retorna o valor do atributo sabor
	}
	
	public double getValor() {
		return valor;
	}
	
	//Para boolean -> get ou is
	public boolean isPronto() {
		return pronto;
	}
	
	//Método de escrita
	public void setSabor(String sabor) {
		this.sabor = sabor; //atribui o valor do parâmetro do método no atributo da classe
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void setPronto(boolean pronto) {
		this.pronto = pronto;
	}
	
}