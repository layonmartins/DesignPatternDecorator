package Decorator;

import Component.Acai;

public abstract class Complemento extends Acai {
	
	public Acai acai;
	public abstract String getDescricao();	
	public abstract double preco();
	
}
