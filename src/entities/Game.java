package entities;

public class Game {

	Player player1;
	Player player2;
	
	
	public Game(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}


	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}
	
	//lançamento da moeda e escolha do vencedor
	public void lancamento(String res, Player player1, Player player2) {
		System.out.println();
		int lancar = (int) (Math.random() * 2) + 1;
		
		if(lancar == 1 && player1.getEscolha().equals("a")) {
			System.out.println("O resultado do lançamento foi CARA.");
			System.out.println("--------------------------");
			System.out.println("VENCEDOR(a): " + player1.getName());
		} 
		else if(lancar == 1 && player2.getEscolha().equals("a")) {
			System.out.println("O resultado do lançamento foi CARA.");
			System.out.println("--------------------------");
			System.out.println("VENCEDOR(a): " + player2.getName());
		}
		else if(lancar == 2 && player1.getEscolha().equals("b")) {
			System.out.println("O resultado do lançamento foi COROA.");
			System.out.println("--------------------------");
			System.out.println("VENCEDOR(a): " + player1.getName());
		}
		else if(lancar == 2 && player2.getEscolha().equals("b")) {
			System.out.println("O resultado do lançamento foi COROA.");
			System.out.println("--------------------------");
			System.out.println("VENCEDOR(a): " + player2.getName());
		}
		
	}
	
	
	
	
	
	
}
