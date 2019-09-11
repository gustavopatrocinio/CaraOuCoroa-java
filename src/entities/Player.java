package entities;

public class Player {
	
	String name;
	String escolha = null;

	public String getEscolha() {
		return escolha;
	}

	public void setEscolha(String escolha) {
		this.escolha = escolha;
	}

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	
	

}
