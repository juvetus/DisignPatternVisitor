package fr.doranco.disign.pattern.visitor;

public class Carrosserie implements ElementVoiture{

	@Override
	public void accept(ElementVoitureVisitor visitor) {
       visitor.visit(this);		
	}

}
