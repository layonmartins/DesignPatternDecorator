package ConcreteComponent;

import Component.Acai;

public class acai350 extends Acai{
	
	@Override
	public double preco() {
		return 2.00;
	}

	@Override
	public String getDescricao() {
		return descricao + " de 350";
	}
	
}
