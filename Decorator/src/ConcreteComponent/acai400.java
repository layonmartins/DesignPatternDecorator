package ConcreteComponent;

import Component.Acai;

public class acai400 extends Acai{
	
	@Override
	public double preco() {
		return 3.00;
	}

	@Override
	public String getDescricao() {
		return descricao + " de 400";
	}
	
}
