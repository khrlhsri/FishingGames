package Assignment2;

import java.util.*;

public class ConsoleApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		StartNewGame startnewgame = new StartNewGame();
		ContinueLastGame continuelastgame = new ContinueLastGame();
		ScoreBoardClass scoreboardclass = new ScoreBoardClass();
		BuyFishingRodClass buyfishingrodclass = new BuyFishingRodClass();
		
		StartNewGame playername;
		
		int select, selectgame;
		System.out.println();
		System.out.println(" 🐟🐟🐟 Welcome to Fishing Mania Game! 🐟🐟🐟" );
		while (startnewgame.playername == null) {
			System.out.println("\n (1) New Game \n "
							 	+ "(2) ScoreBoard \n "
							 	+ "(3) Buy Fishing Rod \n "
							 	+ "(4) Quit game"); 
				
			System.out.print("\nEnter 1, 2, 3 or 4: "); select = input.nextInt();
				
			switch (select) {
				case 1: startnewgame.startnewgame(); break;
				case 2: scoreboardclass.scoreboard();break;						
				case 3: System.out.println("\n	You have insufficient money to buy item. Start fishing to get money."); break;
				case 4: System.out.println("\n	May the fish be with you!");System.exit(0);
			}
		}	
		while (startnewgame.playername != null){
				System.out.println("\n (1) Continue \n "
							 		+ "(2) New Game \n "
							 		+ "(3) ScoreBoard \n "
							 		+ "(4) Buy Fishing Rod \n "
							 		+ "(5) Quit game"); 
				
				System.out.print("\nEnter 1, 2, 3, 4 or 5: "); selectgame = input.nextInt();
				
				switch (selectgame) {
				case 1: continuelastgame.continuegame();
						break;
						
				case 2: startnewgame.startnewgame(); 
						continuelastgame.playername = startnewgame;
						scoreboardclass.playername = startnewgame;
						scoreboardclass.MoneyEarned = startnewgame;
						scoreboardclass.TotalMoney = startnewgame;
						scoreboardclass.newgame = startnewgame;
						scoreboardclass.Score = startnewgame;
						buyfishingrodclass.TotalMoney = startnewgame;
						break;
				
				case 3: scoreboardclass.scoreboard();break;
				
				case 4: buyfishingrodclass.buyingfishingrod();
						continuelastgame.PurchasedFishingRod1 =  buyfishingrodclass;
						break;
						
				case 5: System.out.println("\n	Thank you for playing!");;System.exit(0);
				}
			}
		}		
}


