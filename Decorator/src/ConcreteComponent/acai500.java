package ConcreteComponent;

import Component.Acai;

public class acai500 extends Acai{
	
	@Override
	public double preco() {
		return 4.00;
	}

	@Override
	public String getDescricao() {
		return descricao + " de 500";
	}
	
}
