package fr.doranco.disign.pattern.visitor;

public class Voiture {
	ElementVoiture []elements;




	public ElementVoiture[] getElements() {
		return elements.clone();
	}




	public Voiture() {
		
		this.elements = new ElementVoiture[] {
				new Roue("avant gauche"),
				new Roue("avant droite"),
				new Roue("arriere gauche"),
				new Roue("arriere droite"),
				new Carrosserie(),
				new Moteur()
				
				
		};
	}
	
	
	
	

}
