package ConcreteDecorator;

import Component.Acai;
import Decorator.Complemento;

public class Nutella extends Complemento{
	
	public Nutella(Acai acai){
		this.acai = acai;
	}
	
	@Override
	public double preco() {
		return acai.preco() + 1.00;
	}

	@Override
	public String getDescricao() {
		return acai.getDescricao() + " com nutela";
	}

	
}
