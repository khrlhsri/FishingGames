package Assignment2;

import java.util.*;

public class ScoreBoardClass {
	
	StartNewGame startnewgame = new StartNewGame();
	
	StartNewGame playername, TotalMoney, newgame, MoneyEarned, Score;
	
	public void scoreboard() {
		
		if (playername.playername == null) {
			System.out.println("\n> Scoreboard");
			System.out.println("\n	Player Name		Total Money Earned		Scored");
			System.out.println("      ----------------------------------------------------------------------");
			System.out.println("");
			System.out.println("				     No record\n");
		}
		else if (playername.playername != null) {
			System.out.println("\n> Scoreboard");
			System.out.println("\n	Player Name		Total Money Earned		Score");
			System.out.println("      ----------------------------------------------------------------------");
			System.out.println("	  " + playername.playername + "			      $" + TotalMoney.TotalMoney + "			 " + Score.Score);
		}
		
	}
	
}