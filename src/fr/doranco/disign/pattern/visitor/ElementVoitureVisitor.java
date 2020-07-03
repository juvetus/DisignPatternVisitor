package fr.doranco.disign.pattern.visitor;

public interface ElementVoitureVisitor {

	public void visit(Roue roue);

	public void visit(Moteur moteur);

	public void visit(Carrosserie carrosserie);
	
	public void visitVoiture(Voiture voiture);

}
