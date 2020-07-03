package fr.doranco.disign.pattern.visitor;

public class Roue implements ElementVoiture{
	
	private String name;
	
	

	public Roue(String name) {
		
		this.name = name;
	}

	


	public String getName() {
		return name;
	}




	@Override
	public void accept(ElementVoitureVisitor visitor) {
      visitor.visit(this);	
	}

}
