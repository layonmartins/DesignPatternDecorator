package Teste;

import Component.Acai;
import ConcreteComponent.*;
import ConcreteDecorator.*;

public class testeDecorator {
	public static void main(String[] args) {
		
		//Vendas de açaí
		System.out.println("Vendas de açaí:");
		
		//Açaí simples de 350
		Acai acai1 = new acai350();
		System.out.println(acai1.getDescricao() + " R$ " + acai1.preco());
		
		//Açaí de 350ml com morango
		Acai acai2 = new acai350();
		acai2 = new Morango(acai2);
		System.out.println(acai2.getDescricao() + " R$ " + acai2.preco());
		
		//Açaí de 350ml com nutella
		Acai acai3 = new acai350();
		acai3 = new Nutella(acai3);
		System.out.println(acai3.getDescricao() + " R$ " + acai3.preco());
		
		//Açaí de 350ml com nutella e morango
		Acai acai4 = new acai350();
		acai4 = new Nutella(acai4);
		acai4 = new Morango(acai4);
		System.out.println(acai4.getDescricao() + " R$ " + acai4.preco());
		
		//Açaí de 700ml com 2x Morango e 3xNutela
		Acai acai5 = new acai700();
		acai5 = new Morango(acai5);
		acai5 = new Morango(acai5);
		acai5 = new Nutella(acai5);
		acai5 = new Nutella(acai5);
		acai5 = new Nutella(acai5);
		System.out.println(acai5.getDescricao() + " R$ " + acai5.preco());
	}
}
