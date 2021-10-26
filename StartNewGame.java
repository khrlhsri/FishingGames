package Assignment2;

import java.util.*;
import java.lang.Math;

public class StartNewGame {
	
	Scanner input = new Scanner(System.in);
	
	public static String playername, currentplayer;
	public static int TotalMoney = 50, MoneyEarned, Score = 0;
	
	int startingmoney = 0, selectedPrice, selectedPriceBasic, selectedPriceHard;
	public String selectedFish = "", startgame, startnewgame, newgame;
	
	public String[] Easyfish = {"Common Carp", "Mackerel", "Blue Fish", "Catfish", "Pike", "Cod" , "Haddock", "None"},
					Basicfish = {"Common Carp", "Mackerel", "Blue Fish", "Catfish", "Pike", "Cod" , "Haddock", "Salmon", "Rainbow Trout", "Herring", "Largemouth Bass", "None"},
					Hardfish = {"Common Carp", "Mackerel", "Blue Fish", "Catfish", "Pike", "None" , "Haddock", "Salmon", "Rainbow Trout", "Herring", "Largemouth Bass", "None", "Arowana", "Blue fin Tuna", "Tilapia", "Swordfish"};
	
	public int[] PricelvlEasy = {4,5,6,7,8}, 
				 PricelvlBasic = {20,25,30},
				 PricelvlHard = {38,42,45};
	
	boolean loop = true;
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
// Main constructor for this class
	public void startnewgame() {
		//if user wants to start new game
		if (playername != null) {
			System.out.println("\n	Are you sure you want to start new game?");
			System.out.print("\nStart new game?(y/n): "); startnewgame = input.next(); 
			
			switch(startnewgame) {
			case "y": playername = null;
					  TotalMoney = 50;
					  Score = 0;
					  System.out.println("\n	Restarting new game...");
					  System.out.println("\n	Resetting scoreboard...");
					  System.out.println("\n> Fishing World\n");
					  System.out.print("Enter your username: "); playername = input.next();
					  
					  System.out.println("\n	Welcome " + playername + "! Ready to catch some fish?");
					  
					  System.out.print("\nStart fishing? (y/n): "); startgame = input.next();
					  loop = true;
						while (loop) {
							switch (startgame) {
								case "y":firstgame(); 
										 System.out.print("\nContinue fishing? (y/n): "); startgame = input.next();
										 break;
								case "n": loop = false;
							}
						}
				break;
			
			case "n": break;
			}
			
		}
		//if user start the game
		else {
			System.out.println("\n> Fishing World\n");
			System.out.print("Enter your username: "); playername = input.nextLine();
			System.out.println("\n	Welcome " + playername + "! Ready to catch some fish?");
			
			System.out.print("\nStart fishing? (y/n): "); startgame = input.next();
			loop = true;
			while (loop) {
				switch (startgame) {
					case "y":firstgame(); 
							 System.out.print("\nContinue fishing? (y/n): "); startgame = input.next();
							 break;
					case "n": loop = false;
				}
			}
		}
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// This constructor will run 
	public void firstgame() {
		selectedFish = Easyfish[(int)(Math.random()*Easyfish.length)];
		selectedPrice = PricelvlEasy[(int)(Math.random() * PricelvlEasy.length)];
		
		if (selectedFish == Easyfish[7]) {
			System.out.println("\n	The fish has escaped. Attempt unsuccessful.");
			System.out.println("	Your current money: $" + (TotalMoney = TotalMoney + 0));
			System.out.println("	Your Score: " + (Score = Score + 0));
		}
		else {
			System.out.println("\n	You have caught a fish! ");
			System.out.println("\n	You got: " + selectedFish);
			System.out.println("	Price: $" + selectedPrice);
			System.out.println("	Your current money: $" + (TotalMoney = TotalMoney + selectedPrice));
			if(selectedPrice >=  6) {
				System.out.println("	Your Score: " + (Score = Score + 3));
			}
			else {
				System.out.println("	Your Score: " + (Score = Score + 1));
			}
		}
	}
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	
	public void gamecontinue() {
		System.out.print("\nStart fishing? (y/n): "); startgame = input.next();
		loop = true;
		while (loop) {
			switch (startgame) {
				case "y":	selectedFish = Easyfish[(int)(Math.random()*Easyfish.length)];
							selectedPrice = PricelvlEasy[(int)(Math.random() * PricelvlEasy.length)];
					
							if (selectedFish == Easyfish[7]) {
								System.out.println("\n	The fish has escaped. Attempt unsuccessful.");
								System.out.println("	Your current money: $" + (TotalMoney = TotalMoney + 0));
								System.out.println("	Your Score: " + (Score = Score + 0));
							}
							else {
								System.out.println("\n	You have caught a fish! ");
								System.out.println("\n	You got: " + selectedFish);
								System.out.println("	Price: $" + selectedPrice);
								System.out.println("	Your current money: $" + (TotalMoney = TotalMoney + selectedPrice));
								if(selectedPrice >=  6) {
									System.out.println("	Your Score: " + (Score = Score + 3));
								}
								else {
									System.out.println("	Your Score: " + (Score = Score + 1));
								}
							}
							System.out.print("\nContinue fishing? (y/n): "); startgame = input.next();
							break;
					case "n": loop = false;
			}
		}
	}
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	public void usingbasicrod() {

		System.out.print("\nStart fishing? (y/n): "); startgame = input.next();
		loop = true;
		while (loop) {
			switch (startgame) {
			case "y":	selectedFish = Basicfish[(int)(Math.random()*Basicfish.length)];
						selectedPrice = PricelvlEasy[(int)(Math.random() * PricelvlEasy.length)];
						selectedPriceBasic = PricelvlBasic[(int)(Math.random() * PricelvlBasic.length)];
						
						// If random fish == "none" 
						if (selectedFish == Basicfish[11]) {
							System.out.println("\n	The fish has escaped. Attempt unsuccessful.");
							System.out.println("	Your current money: $" + (TotalMoney = TotalMoney + 0));
							System.out.println("	Your Score: " + (Score = Score + 0));
						}
						// If random fish == [Salmon] or [Rainbow Trout] or [Herring] or [Largemouth Bass]
						// price == PricelvlBasic
						else if (selectedFish == Basicfish[7] || selectedFish == Basicfish[8] || selectedFish == Basicfish[9] || selectedFish == Basicfish[10]){
							System.out.println("\n	You're so lucky " + playername + "! A fish has took your bait");
							System.out.println("\n	You got: " + selectedFish);
							System.out.println("	Price: $" + selectedPriceBasic);
							System.out.println("	Your current money: $" + (TotalMoney = TotalMoney + selectedPriceBasic));
							if(selectedPriceBasic >  25) {
								System.out.println("	Your Score: " + (Score = Score + 10));
							}
							else if (selectedPriceBasic <=  25){
								System.out.println("	Your Score: " + (Score = Score + 5));
							}
						}
						// Other than above
						else {
							System.out.println("\n	Well done " + playername + "! You have caught a fish");
							System.out.println("\n	You got: " + selectedFish);
							System.out.println("	Price: $" + selectedPrice);
							System.out.println("	Your current money: $" + (TotalMoney = TotalMoney + selectedPrice));
							if(selectedPrice >=  6) {
								System.out.println("	Your Score: " + (Score = Score + 3));
							}
							else {
								System.out.println("	Your Score: " + (Score = Score + 1));
							}
						}
						System.out.print("\nContinue fishing? (y/n): "); startgame = input.next();
						break;
			case "n": loop = false;
			}
		}		
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	public void usinghardrod() {
		
		System.out.print("\nStart fishing? (y/n): "); startgame = input.next();
		loop = true;
		while (loop) {
			switch (startgame) {
			case "y":	selectedFish = Hardfish[(int)(Math.random()*Hardfish.length)];
						selectedPrice = PricelvlEasy[(int)(Math.random() * PricelvlEasy.length)];
						selectedPriceBasic = PricelvlBasic[(int)(Math.random() * PricelvlBasic.length)];
						selectedPriceHard = PricelvlHard[(int)(Math.random() * PricelvlHard.length)];
						
						//if selectedFish == "none"
						if (selectedFish == Hardfish[11] || selectedFish == Hardfish[5]) {
							System.out.println("\n	The fish has escaped. Attempt unsuccessful.");
							System.out.println("	Your current money: $" + (TotalMoney = TotalMoney + 0));
							System.out.println("	Your Score: " + (Score = Score + 0));
						}
						// if selectedFish == [Arowana] or [Blue fin Tuna] or [Tilapia] or [Swordfish]
						// Price == PricelvlHard
						else if(selectedFish == Hardfish[12] || selectedFish == Hardfish[13] || selectedFish == Hardfish[14] || selectedFish == Hardfish[15]) {
							System.out.println("\n	What a beautiful fish " + playername + ". You've caught a rare fish! ");
							System.out.println("\n	You got: " + selectedFish);
							System.out.println("	Price: $" + selectedPriceHard);
							System.out.println("	Your current money: $" + (TotalMoney = TotalMoney + selectedPriceHard));
							if(selectedPriceHard >  42) {
								System.out.println("	Your Score: " + (Score = Score + 20));
							}
							else if (selectedPriceHard <=  42){
								System.out.println("	Your Score: " + (Score = Score + 12));
							}
						}
						// If random fish == [Salmon] or [Rainbow Trout] or [Herring] or [Largemouth Bass]
						// price == PricelvlBasic
						else if (selectedFish == Hardfish[7] || selectedFish == Hardfish[8] || selectedFish == Hardfish[9] || selectedFish == Hardfish[10]){
							System.out.println("\n	You're so lucky " + playername + "! A fish has took your bait");
							System.out.println("\n	You got: " + selectedFish);
							System.out.println("	Price: $" + selectedPriceBasic);
							System.out.println("	Your current money: $" + (TotalMoney = TotalMoney + selectedPriceBasic));
							if(selectedPriceBasic >  25) {
								System.out.println("	Your Score: " + (Score = Score + 10));
							}
							else if (selectedPriceBasic <=  25){
								System.out.println("	Your Score: " + (Score = Score + 5));
							}
						}
						// Other than above
						else {
							System.out.println("\n	Well done " + playername + "! You have caught a fish");
							System.out.println("\n	You got: " + selectedFish);
							System.out.println("	Price: $" + selectedPrice);
							System.out.println("	Your current money: $" + (TotalMoney = TotalMoney + selectedPrice));
							if(selectedPrice >=  6) {
								System.out.println("	Your Score: " + (Score = Score + 3));
							}
							else {
								System.out.println("	Your Score: " + (Score = Score + 1));
							}
						}
						System.out.print("\nContinue fishing? (y/n): "); startgame = input.next();
						break;
			case "n": loop = false;
			}
		}
	}
}
