package Assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class BuyFishingRodClass {

	Scanner input = new Scanner(System.in);
	
	StartNewGame TotalMoney, playername;
	
	public static String basic = "Basic Fishing Rod", hard = "Heavy Duty Fishing Rod (Hard)";
	String select, selectrod;
	public static String PurchasedFishingRod1, PurchasedFishingRod2;

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// Main Constructor for this class
	public void buyingfishingrod() {
		
		System.out.println("\n> Buy Fishing Rod\n");	// Title	
		
		System.out.println("welcome message\n");	// Welcome wording
		
		System.out.println("	Your current money: $" + TotalMoney.TotalMoney);	// Show current money
		
		System.out.print("\nDo you want to buy new fishing rod? (y/n): "); select = input.next();	
		
		if (select.equals("y")) {
			if (TotalMoney.TotalMoney >= 120 && TotalMoney.TotalMoney < 500 ) {
				
				getFishingRodTable();
				
				System.out.print("\nPlease Select 1 or 2 to buy item: ");
				while (true) {
					selectrod = input.next();
					
					if (selectrod.equals("1")) {
						
						System.out.print("\nBuy " + basic + " for $120? (y/n): "); selectrod = input.next();
						
						if (selectrod.equals("y")) {
							
							System.out.println("\n	You have bought " + basic + " for $120. Enjoy Fishing!");
							TotalMoney.TotalMoney = (TotalMoney.TotalMoney - 120);
							
							if (PurchasedFishingRod1 == null) {
								PurchasedFishingRod1 = basic;
							}
							else if (PurchasedFishingRod1 != null){
								PurchasedFishingRod2 = basic;
							}
							break;
						}
						else {break;}
					}
					else if (selectrod.equals("2")) {
						System.out.println("\n	You have insufficient money to buy this item.");
						break;
					}
					System.out.print("Please enter 1 or 2 to purchase item: ");
				}
			}
			else if (TotalMoney.TotalMoney >= 500){
				
				getFishingRodTable();
				
				System.out.print("\nPlease Select 1 or 2 to buy item: ");
				
				while (true) {
					selectrod = input.next();
					
					if (selectrod.equals("1")) {
						
						System.out.print("\nBuy " + basic + " for $120? (y/n): "); selectrod = input.next();
						
						if (selectrod.equals("y")) {
							System.out.println("\n	You have bought " + basic + " for $120. Enjoy Fishing!");
							TotalMoney.TotalMoney = (TotalMoney.TotalMoney - 120);
							if (PurchasedFishingRod1 == null) {
								PurchasedFishingRod1 = hard;
							}
							else if (PurchasedFishingRod1 != null) {
								PurchasedFishingRod2 = hard;
							}
							break;
						}
						else {break;}
					}
					else if (selectrod.equals("2")) {
						
						System.out.print("\nBuy " + hard + " for $500? (y/n): "); selectrod = input.next();
						
						if (selectrod.equals("y")) {
							System.out.println("\n	You have bought " + hard + " for $500. Happy Fishing " + playername.playername + "!");
							TotalMoney.TotalMoney = (TotalMoney.TotalMoney - 500);
							if (PurchasedFishingRod1 == null) {
								PurchasedFishingRod1 = hard;
							}
							else {
								PurchasedFishingRod2 = hard;
							}
							break;
						}
						else {break;}
					}
					System.out.print("Please enter 1 or 2 to purchase item: ");
				}
			}
			else {
				System.out.println("\n	You have insufficient money to buy new fishing rod. Start fishing to get some money.");
			}
		}
	}
	
	public void getFishingRodTable() {
		System.out.println("\n    ________________________________________________________________________________________________________________ ");
		System.out.println("   |              Item                 |                        Description              	    |     Price     |");
		System.out.println("   |___________________________________|____________________________________________________________|_______________|");
		System.out.println("   |				       | Slender poles  that  are  made  of  flexible  but  durable |               |");
		System.out.println("   | (1) " + basic + "	       | material. Typically fiberglass or graphite—to allow you to |     $120      |");
		System.out.println("   |				       | cast your fishing line further and deeper into the water.  |               |");
		System.out.println("   |___________________________________|____________________________________________________________|_______________|");
		System.out.println("   |				       | This rod holder can bear your weight. It  is  suitable for |               |");
		System.out.println("   | (2) " + hard + " | of  most  the  spinning   rods  in  sea, rock  fishing rod |     $500      |");
		System.out.println("   |				       | and  other  freshwater  and  saltwater  application.       |               |"); 
		System.out.println("   |___________________________________|____________________________________________________________|_______________|");
	}
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

}
