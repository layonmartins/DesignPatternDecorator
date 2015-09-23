package ConcreteComponent;

import Component.Acai;

public class acai700 extends Acai{
	
	@Override
	public double preco() {
		return 6.00;
	}

	@Override
	public String getDescricao() {
		return descricao + " de 700";
	}
	
}

