package Assignment2;

import java.util.*;

public class ContinueLastGame {
	
	Scanner input = new Scanner(System.in);
	
	StartNewGame startnewgame = new StartNewGame();
	BuyFishingRodClass buyfishingrodclass = new BuyFishingRodClass();
	
	StartNewGame playername, TotalMoney, Easyfish, Basicfish, Hardfish,
				 PricelvlEasy, PricelvlBasic, PricelvlHard;
	
	BuyFishingRodClass PurchasedFishingRod1, PurchasedFishingRod2, basic, hard, purchasedboth;
	
	String yesno;

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	// Main Constructor for this class
	public void continuegame() {
		
		System.out.println("\n> Continue game");
		
		// if user start the game but not buying any fishing rod
		if (playername.playername != null && PurchasedFishingRod1.PurchasedFishingRod1 == null && PurchasedFishingRod2.PurchasedFishingRod2 == null){getwithoutnewrod();}
		
		// if user start the game and have bought basic fishing rod only
		else if (playername.playername != null && ((PurchasedFishingRod1.PurchasedFishingRod1.equals(basic.basic) && PurchasedFishingRod2.PurchasedFishingRod2 == null) || 
		(PurchasedFishingRod1.PurchasedFishingRod1.equals(hard.hard) && PurchasedFishingRod2.PurchasedFishingRod2 == null))) { gethaveonerod();}
		
		// if user start the game and first bought basic and second bought hard
		else if (playername.playername != null && PurchasedFishingRod1.PurchasedFishingRod1.equals(basic.basic) && PurchasedFishingRod2.PurchasedFishingRod2.equals(hard.hard)) {gethavetworods();}
	}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	
	// Continue game. This constructor run when without using or does not have new fishing rod
	public void getwithoutnewrod() {
		System.out.println("\n	Welcome back, " + playername.playername + "! Today is a good day to fish.");
		
		startnewgame.gamecontinue();
	}
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	// continue game. This constructor run when user have bought either basic or hard fishing rod
	public void gethaveonerod() {
		System.out.println("\n	Welcome back " + playername.playername + "! It's time to catch some fish.");
		
		if (PurchasedFishingRod1.PurchasedFishingRod1.equals(basic.basic)) {
			System.out.println("\n	It seems that you have bought " + basic.basic + ".");
			System.out.println("	Do you want to use it?"); 
			
			System.out.print("\nUse " + basic.basic + "?(y/n): ");yesno = input.next();
			
			if (yesno.equals("y")) {
				startnewgame.usingbasicrod();
			}
			else if (yesno.equals("n")) {
				startnewgame.gamecontinue();
			}
		}
		else if (PurchasedFishingRod1.PurchasedFishingRod1.equals(hard.hard)) {
			System.out.println("\n	It seems that you have bought " + hard.hard + "."); 
			System.out.println("	Do you want to use it?");
			
			System.out.print("\nUse " + hard.hard + "?(y/n): ");yesno = input.next();
			
			if (yesno.equals("y")) {
				startnewgame.usinghardrod();
			}
			else if (yesno.equals("n")) {
				startnewgame.gamecontinue();
			}
		}
	}
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	// continue game. This constructor run when user have bought both fishing rod
	public void gethavetworods() {
		System.out.println("\n	Welcome back " + playername.playername + "! The weather is perfect for you to go fishing.");
		
//		if	PurchasedFishingRod1 = Basic Fishing Rod
//		    PurchasedFishingRod2 = Heavy Duty Fishing Rod
		
//		If user bought Basic Fishing Rod first	& bought Heavy Duty Fishing Rod second		
		
		if (PurchasedFishingRod1.PurchasedFishingRod1.equals(basic.basic) && PurchasedFishingRod2.PurchasedFishingRod2.equals(hard.hard)) {
			
			System.out.println("\n	It seems that you have bought another fishing rod. ");
			System.out.println("	Do you want to change your fishing rod?");
			
			System.out.print("\nChange fishing rod?(y/n): ");yesno = input.next();
			
			if (yesno.equalsIgnoreCase("y")) {
				System.out.println("\n	(1) " + basic.basic + 
						   			"\n	(2) " + hard.hard);
		
				System.out.print("\nEnter 1 or 2 to select fishing rod: "); yesno = input.next();
				
				switch (yesno) {
				case "1":	startnewgame.usingbasicrod();
					break;
				case "2":	startnewgame.usinghardrod();
					break;
				}
			}
			else if (yesno.equalsIgnoreCase("n")) { 
				startnewgame.gamecontinue();
			}
		}
		
//		else if	PurchasedFishingRod1 = Heavy Duty Fishing Rod
//	    		PurchasedFishingRod2 = Basic Fishing Rod
		
//		If user bought Heavy Duty Fishing Rod first	& bought Basic Fishing Rod second	
		
		else if (PurchasedFishingRod1.PurchasedFishingRod1.equals(hard.hard) && PurchasedFishingRod2.PurchasedFishingRod2.equals(basic.basic)) {
			
			System.out.println("\n	It seems that you have bought another fishing rod. ");
			System.out.println("	Do you want to change your fishing rod?"); 
			
			System.out.print("\nChange fishing rod?(y/n): ");yesno = input.next();
			
			if (yesno.equalsIgnoreCase("y")) {
				System.out.println("\n	(1) " + basic.basic + 
						   			"\n	(2) " + hard.hard);
		
				System.out.print("\nEnter 1 or 2 to select fishing rod: "); yesno = input.next();
				
				switch (yesno) {
				case "1":	startnewgame.usingbasicrod();
					break;
				case "2":	startnewgame.usinghardrod();
					break;
				}
			}
			else if (yesno.equalsIgnoreCase("n")) { 
				startnewgame.gamecontinue();
			}
		}
	}
}
