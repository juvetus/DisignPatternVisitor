package fr.doranco.disign.pattern.visitor;

public class Moteur implements ElementVoiture{
	

	@Override
	public void accept(ElementVoitureVisitor visitor) {
		visitor.visit(this);
		
	}

}
