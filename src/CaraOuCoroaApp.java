import java.util.Scanner;

import entities.Game;
import entities.Player;

public class CaraOuCoroaApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("---- CARA OU COROA ----");
		System.out.println();
		
		System.out.print("Nome do(a) primeiro(a) jogador(a): ");
		String player1 = sc.next();
		System.out.print("Nome do(a) segundo(a) jogador(a): ");
		String player2 = sc.next();
		System.out.println();
		
		Player p1 = new Player(player1);
		Player p2 = new Player(player2);
		
		
		System.out.print(player1 + ", você escolhe CARA ou COROA? [a/b]: ");
		String res = sc.next();
		System.out.println();
		if(res.equals("a")) {
			System.out.println(player1 + ", você ficará com CARA.");
			System.out.println(player2 + " ficará com COROA.");
			p1.setEscolha(res);
			p2.setEscolha("b");
		} else if(res.equals("b")) {
			System.out.println(player1 + ", você ficará com COROA.");
			System.out.println(player2 + " ficará com CARA.");
			p1.setEscolha(res);
			p2.setEscolha("a");
		}
		
		
		Game game = new Game(p1, p2);
	
		System.out.println();
		System.out.println("Lançando moeda...");
		
		game.lancamento(res, p1, p2);
		

		
		
		sc.close();
	}

}
