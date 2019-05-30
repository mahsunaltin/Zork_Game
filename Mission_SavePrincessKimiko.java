import java.util.ArrayList;
import java.util.Scanner;

public class Mission_SavePrincessKimiko {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String user = "";
		String question = "1A";
		ArrayList<String> inventory = new ArrayList<String>();
		
		System.out.println("Mahsun went to America thanks to a scholarship he got from his school in a beautiful summer. He stayed\n"
				+ "there with a very good Filipino family, and he went to school every day on the ELS program. And he met\n"
				+ "very nice people in his school  and one of them was Kimiko, who is very nice Japanese princess. Mahsun\n"
				+ "had stayed there for only one month and returned to Turkey. When the time came, Mahsun saw that Kimiko\n"
				+ "was hijacked by bad people, on his instagram.\n\n"
				+ "Now you should help him to save Kimiko. However, Mahsun has no money and his grandmother said to him that he\n"
				+ "should find grandmother's money if he needed it.\n\n"
				+ "There are a very old radio, a red-colored vase, a carpet, an old-laptop and  canary in canary cage of his\n"
				+ "grandmother in her home, please give to him commands help to find his grandmother's money.\n\n"
				+ "*** You can use these commands.\n"
				+ "- Open\n- Close\n- Examine\n- Take\n- Use\n- Move\n- Go\n- Put Back\n- Book\n\n"
				+ "*** Note: Write inventory whenever you want to look at your inventory.\n");
		
		while (!user.equalsIgnoreCase("exit")) {
			
			user = input.nextLine().replace(" ", "").toLowerCase();
			
			if (user.equals("inventory")){
				
				if (inventory.size() > 0){
					System.out.println("You are carrying these: " + inventory);	
				}else{
					System.out.println("You are not carrying anything.");
				}
			}

			else {
				switch (question) {
					case "1A":
						switch (user) {
							case "examineroom":
								System.out.println("There are a very old radio, a red-colored vase, a carpet, an old-laptop and canary cage.");
								question = "1A";			
								break;
							case "openradio":
								System.out.println("Come on, just be quickly.");
								question = "1A";			
								break;
							case "examineradio":
								System.out.println("There is nothing. Write again.");
								question = "1A";			
								break;
							case "examinevase":
								System.out.println("There is nothing. Write again.");
								question = "1A";			
								break;
							case "examinecarpet":
								System.out.println("There is a key on the carpet. He thinks that it is for canary cage. "
										+ "What do you want to do with this key???");
								question = "2";			
								break;
							case "opencanarycage":
								System.out.println("You can't open canary cage because you have no key. Firstly, find the key.");
								question = "1A";
								break;
							case "uselaptop":
								question = "5";
								System.out.println("Probably, there is a problem on computer because of old. Write again sama commands. :D :D :D");
								break;	
							default:
								System.out.println("I couldn't understand your command. Please write again your command :)");
								question = "1A";
								break;

						}
						
						break;
	
						
						
					case "2":
						switch (user){
							case "examineroom":
								System.out.println("There are a very old radio, a red-colored vase, a carpet, an old-laptop and canary cage.");
								question = "1A";			
								break;
							case "takekey":
								System.out.println("Okey, now you have key in your inventory, maybe you can open the canary cage.");
								inventory.add("Key");
								question = "3";
								break;
							
							case "examinekey":
								System.out.println("There is nothing on key. Write different commands for key.");
								question = "2";
								break;
								
							default: 
								System.out.println("I couldn't understand your command. Please write again your command :)");
								question = "2";
								break;
						}
						break;
	
					case "3":
						switch (user) {
							case "examineroom":
								System.out.println("There are a very old radio, a red-colored vase, a carpet, an old-laptop and canary cage.\n"
										+ "But you have also key. You can use it.");
								question = "3";			
								break;
							case "opencanarycage":
								System.out.println("Heyy, please be careful!!! There is a canary. Don't scare it.\n"
										+ "Ohhh, maybe there can be something bird's nest in the cage.");
								question = "4";
								break;
							default:
								System.out.println("I couldn't understand your command. Please write again your command :)");
								question = "3";
								break;
	
						}
	
						break;
					
					case "4":
						switch (user) {
							case "examinebird'snest":
								System.out.println("OMG, You found the money, you have money to go to Kimiko. "
										+ "Congratulations!!! By the way, don't forget to close canary cage...");
								inventory.add("Money");
								question = "4A";
								break;
							
							default:
								System.out.println("I couldn't understand your command. Please write again your command :)");
								question = "4";
								break;
	
						}
	
						break;
						
					case "4A":
						switch (user) {
							case "closecanarycage":
								System.out.println("Okay nice and now, put back the key!!!");
								question = "4B";
								break;
							
							default:
								System.out.println("Don't forget to close canary cage. Also, there is a problem on your command. Please write again your command :)");
								question = "4A";
								break;
						}
						break;
						
					case "4B":
						switch (user) {
							case "putbackkey":
								System.out.println("Very nice and now, you can buy ticket online...\n "
										+ "Well, what do you want to do with this money?");
								question = "5";
								inventory.remove("Key");
								break;
							default:
								System.out.println("Don't forget to put back key. Also, there is a problem on your command. Please write again your command :)");
								question = "4B";
								break;
						}
						break;
						
					case "5":
						switch (user) {
							case "examineroom":
								System.out.println("There are a very old radio, a red-colored vase, a carpet, an old-laptop and canary cage.");
								question = "5";			
								break;
							case "uselaptop":
								System.out.println("It is opening. You can open browser and book online or you can surf on the net or play game.");
									switch (user = input.nextLine().replace(" ", "").toLowerCase()) {
										case "playgame":
											System.out.println("Ohh come on.... Time is passing. Ohhh fuck, computer shut down.\n "
													+ "Again open and write different commands immediately!!!");
											question = "5";
											break;
										case "openbrowser":
											System.out.println("Browser is opened... You can surf of the net or book plane ticket :D.");
												
												switch (user = input.nextLine().replace(" ", "").toLowerCase()) {
												
													case "bookplaneticket":
														if(inventory.contains("Money")){
															System.out.println("Everything is okey now, you are going to go one hour later. Immediately, go to plane.");
															inventory.add("Plane Ticket");
															inventory.remove("Money");
															question = "6";
															break;
														}else{
															System.out.println("You can not book because you have no money...");
															question = "1A";
															break;
														}
													
													case "surfonthenet":
														System.out.println("Ohh come on.... Time is passing. Ohhh fuck, computer shut down.\n "
													+ "Again open and write different commands immediately!!!");
														question = "5";
														break;
														
													default:
														System.out.println("If you write wrong commands, computer shut down.\n "
																+ "This part is soo diffucult. So, just write true commands.:D :D");
														question = "5";
														break;
						
												}
												
											break;
										default:
											System.out.println("If you write wrong commands, computer will shut down as like now.\n "
																+ "This part is soo diffucult. So, just write true commands. :D :D");
											question = "5";
											break;
									}
									break;	
								
							default:
								System.out.println("I couldn't understand your command. Please write again your command :)");
								question = "5";
								break;
	
						}
	
						break;
				
					case "6":
						switch(user){
							case "gotoplane":
								System.out.println("Okey... Now, you are in plane. You are gonna save the princess Kimiko. <3 :) <3 \n \n");
								inventory.remove("Plane Ticket");
								try {
									Thread.sleep(3000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								System.out.println("Ohh wait :o :o probably there is a problem on the business-class. Yeah, Mahsun saw him. There is a\n"
												 + "bomber on the plane.He is gonna bomb the plane. He think that there are 3 part of this plane which\n"
												 + "are business-class, middle-class and economy-class in order.Now, you are in economy-class. So, you\n"
												 + "should command to pass business-class. By the don't forget that maybe in the future, you should go\n"
												 + "back other class. Therefore, you have chance to stroll among between different classes.\n\n"
												 + "There are: \n -Knife\n -Sticky Tape\n -Nokia 3310\nin this class. You can take these items "
												 + "and at the end of taking part, write pass taking or directly you can write pass taking.");
								question = "6A";
								break;
							default:
								System.out.println("I couldn't understand your command. Please write again your command :)");
								question = "6";
								break;
						}
						break;
						
					case "6A":
						switch (user) {
							case "examineroom":
								System.out.println("There are: \n -Knife\n -Sticky Tape\n -Nokia 3310\nin this class.");
								question = "6A";			
								break;
							case "takeknife":
								if(inventory.contains("Knife")){
									System.out.println("You already have a gun.");
									question = "6A";
									break;
								}else{
									System.out.println("You took the knife.");
									inventory.add("Knife");
									question = "6A";
									break;
								}
							case "takestickytape":
								if(inventory.contains("Sticky Tape")){
									System.out.println("You already have a sticky tape.");
									question = "6A";
									break;
								}else{
									System.out.println("You took the sticky tape.");
									inventory.add("Sticky Tape");
									question = "6A";
									break;
								}
							case "takenokia3310":
								if(inventory.contains("Nokia 3310")){
									System.out.println("You already have a Nokia 3310.");
									question = "6A";
									break;
								}else{
									System.out.println("You took the Nokia 3310.");
									inventory.add("Nokia 3310");
									question = "6A";
									break;
								}
							case "passtaking":
								System.out.println("You passed this taking part.");
								question = "7";
								break;
							default:
								System.out.println("I couldn't understand your command. Please write again your command :)");
								question = "6A";
								break;
						}
						break;
							
					case "7":
						switch(user){
							case "movemiddle-class":
								System.out.println("Now, you are in middle-class, immediately move bussiness-class part. \n\n"
										+ "There are: \n -Xioami Mi6\n -Gun\n -Water Bottle\nin this class. You can take these items "
										+ "and at the end of taking part, write pass taking or directly you can write pass taking.");
								question = "7A";
								break;
							case "movebusiness-class":
								System.out.println(" You can't move, becuase there is middle-class before this part. Write again.");
								question = "7";
								break;
							default:
								System.out.println("I couldn't understand your command. Please write again your command :)");
								question = "7";
								break;
						}
						break;
						
					case "7A":
						switch (user) {
							case "examineroom":
								System.out.println("There are: \n -Xioami Mi6\n -Gun\n -Water Bottle\nin this class.");
								question = "7A";			
								break;
							case "takexioamimi6":
								if(inventory.contains("Xioami Mi6")){
									System.out.println("You already have a Xioami Mi 6.");
									question = "7A";
									break;
								}else{
									System.out.println("You took the Xioami Mi6.");
									inventory.add("Xioami Mi6");
									question = "7A";
									break;
								}
							case "takegun":
								if(inventory.contains("Gun")){
									System.out.println("You already have a Gun.");
									question = "7A";
									break;
								}else{
									System.out.println("You took the Gun.");
									inventory.add("Gun");
									question = "7A";
									break;
								}
							case "takewaterbottle":
								if(inventory.contains("Water Bottle")){
									System.out.println("You already have a water bottle.");
									question = "7A";
									break;
								}else{
									System.out.println("You took the water bottle.");
									inventory.add("Water Bottle");
									question = "7A";
									break;
								}
							case "passtaking":
								System.out.println("You passed this taking part.");
								question = "8";
								break;
							default:
								System.out.println("I couldn't understand your command. Please write again your command :)");
								question = "7A";
								break;
						}
						break;
						
					case "8":
						switch(user){
							case "movebusiness-class":
								System.out.println("Now, he is in business-class and he see the bomber. You must command to defuse bomber. \n\n"
										+ "There are: \n -Macbook Pro\n -Powerbank\n -Beats Audio Headphone \nin business-class. You can take these items "
										+ "and at the end of taking part, write pass taking or directly you can write pass taking.");
								question = "8A";
								break;
							case "moveeconomy-class":
								System.out.println(" You are in economy-class. There are: \n -Knife\n -Sticky Tape\n -Nokia 3310\nin this class. You can take these items "
												 + "and at the end of taking part, write pass taking or you can write pass taking directly.");
								question = "6A";
								break;
							default:
								System.out.println("I couldn't understand your command. Please write again your command :)");
								question = "8";
								break;
						}
						break;
						
					case "8A":
						switch (user) {
							case "examineroom":
								System.out.println("There are: \n -Macbook Pro\n -Powerbank\n -Beats Audio Headphone \nin business-class.");
								question = "8A";			
								break;
							case "takemacbookpro":
								if(inventory.contains("Macbook Pro")){
									System.out.println("You already have a Macbook Pro.");
									question = "8A";
									break;
								}else{
									System.out.println("You took the Macbook Pro.");
									inventory.add("Macbook Pro");
									question = "8A";
									break;
								}
							case "takepowerbank":
								if(inventory.contains("Powerbank")){
									System.out.println("You already have a Powerbank.");
									question = "8A";
									break;
								}else{
									System.out.println("You took the Powerbank.");
									inventory.add("Powerbank");
									question = "8A";
									break;
								}
							case "takebeatsaudioheadphone":
								if(inventory.contains("Beats Audio Headphone")){
									System.out.println("You already have a Beats Audio Headphone.");
									question = "8A";
									break;
								}else{
									System.out.println("You took the Beats Audio Headphone.");
									inventory.add("Beats Audio Headphone");
									question = "8A";
									break;
								}
							case "passtaking":
								System.out.println("You passed this taking part. If you are ready to defuse the bomber.\n"
										+ "You can use something such as gun, knife or sticky tape.");
								question = "9";
								break;
							default:
								System.out.println("I couldn't understand your command. Please write again your command :)");
								question = "8A";
								break;
						}
						break;
					
					case "9":
						switch(user){
							case "movemiddle-class":
								System.out.println("Now, you are in middle-class, immediately move and defuse the bomber. \n\n"
										+ "There are: \n -Xioami Mi6\n -Gun\n -Water Bottle\nin this class. You can take these items "
										+ "and at the end of taking part, write pass taking or directly you can write pass taking.");
								question = "7A";
								break;
							case "moveeconomy-class":
								System.out.println("You can't move economy-class because there is middle-class between here and economy-class. ");
								question = "9";
								break;
							case "usestickytape":
								if(inventory.contains("Sticky Tape")){
									System.out.println("Bomber can kill Mahsun, if you use the sticky tape. Be careful!!! Write different commands. ");
									question = "9";
									break;
								}else{
									System.out.println("You can not use sticky tape because you have no sticky tape...");
									question = "9";
									break;
								}
							case "useknife":
								if(inventory.contains("Knife")){
									System.out.println("Bomber can kill Mahsun, if you use the knife. Because, there is a big distance.\n"
											+ "Be careful!!! Write different commands. ");
									question = "9";
									break;
								}else{
									System.out.println("You can not use knife because you have no knife...");
									question = "9";
									break;
								}
							case "usegun":
								if(inventory.contains("Gun")){
									System.out.println("Very nice. Bomber can't kill you because he has just knife. Now, you can stick to him with sticky tape.");
									question = "10";
									break;
								}else{
									System.out.println("You can not use gun because you have no gun...");
									question = "9";
									break;
								}
							default:
								System.out.println("I couldn't understand your command. Please write again your command :)");
								question = "9";
								break;
						}
						break;
						
					case "10":
						switch(user){
							case "usestickytape":
								System.out.println("Everything is going very-well. It is all under control. However, there is another problem.\n"
										+ "Pilot can't fly too much. Because, he started to have asthma because of bomber. Now, move pilot-room. ");
								question = "11";
								break;
							default:
								System.out.println("I couldn't understand your command. Please write again your command :)");
								question = "10";
								break;
						}
						break;
						
					case "11":
						switch(user){
							case "movepilot-room":
								System.out.println("Mahsun went to study for pilot for one month in Turkey. So, he can fly to plane.\n"
										+ "Also, there is auto-pilot system. Please, open it. Because if there is a problem on the plane, plane can solve itself.");
								question = "12";
								break;
							default:
								System.out.println("I couldn't understand your command. Please write again your command :)");
								question = "11";
								break;
						}
						break;
					
					case "12":
						switch(user){
							case "openauto-pilotsystem":
								System.out.println("Auto-pilot is activated. Now, you can wait a little bit. Plane is gonna come to Kimiko's house.");
								try {
									Thread.sleep(5000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								question = "13";
								System.out.println("Mahsun came to Kimiko's house. There is hijacker in house. You have gun. So, you can save Kimiko. ");
								break;
							default:
								System.out.println("I couldn't understand your command. Please write again your command :)");
								question = "12";
								break;
						}
						break;
				
					case "13":
						switch(user){
							case "usegun":
								System.out.println("Very nice. Hijacker can't kill you because he has just nothing. :D Now, you can stick to him with sticky tape.");
								question = "14";
								break;
							case "usestickytape":
								System.out.println("Hijacker can kill Mahsun, if you use the sticky tape. Be careful!!! Write different commands. ");
								question = "13";
								break;
							case "useknife":
								if(inventory.contains("Knife")){
									System.out.println("Hijacker can kill Mahsun, if you use the knife. Because, there is a big distance.\n"
											+ "Be careful!!! Write different commands. ");
									question = "13";
									break;
								}else{
									System.out.println("You can not use knife because you have no knife...");
									question = "13";
									break;
								}
							default:
								System.out.println("I couldn't understand your command. Please write again your command :)");
								question = "13";
								break;
						}
						break;
						
					case "14":
						switch(user){
							case "usestickytape":
								System.out.println("Okay very nice... You did good job. Let's look this love. <3 :D <3 ");
								try {
									Thread.sleep(1500);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								question = "15";
								System.out.println("_________▓▓▓▓____█████████\n"
										+ "__ Ƹ̵̡Ӝ̵̨̄Ʒ▓▓▓▓▓=▓____▓=▓▓▓▓▓\n"
										+ "__ ▓▓▓_▓▓▓▓░●____●░░▓▓▓▓\n"
										+ "_▓▓▓▓_▓▓▓▓▓░░__░░░░▓▓▓▓\n"
										+ "_ ▓▓▓▓_▓▓▓▓░░♥__♥░░░▓▓▓\n"
										+ "__ ▓▓▓___▓▓░░_____░░░▓▓\n"
										+ "▓▓▓▓▓____▓░░_____░░▓\n"
										+ "_ ▓▓____ ▒▓▒▓▒___ ████\n"
										+ "_______ ▒▓▒▓▒▓▒_ ██████\n"
										+ "____ ___ ▒▓▒▓▒▓▒ ████████\n"
										+ "___ __   ▒▓▒▓▒▓▒_██████ ███\n"
										+ "_  _  __▒▓▒▓▒▓▒__██████ _███\n"
										+ "_     ▓▓▓▓▓▓▓▓▓__██████_ ███\n"
										+ "     ▓▓██████▓▓__██████_ ███\n"
										+ "     ▓███████▓▓__██████_ ███\n"
										+ "_    ████████▓▓__██████ _███\n"
										+ "     ████████▓▓__▓▓▓▓▓▓_▒▒\n"
										+ "     ████████▓▓__▓▓▓▓▓▓\n"
										+ "_    ████████▓▓__▓▓▓▓▓▓\n"
										+ "_    ████████▓___▓▓▓▓▓▓\n"
										+ "_ __ __▒▒▒▒▒__ __▓▓▓▓▓▓\n"
										+ "_____ _▒▒▒▒▒ _____▓▓▓▓▓\n"
										+ "_______▒▒▒▒▒_____ ▓▓▓▓▓\n"
										+ "_______▒▒▒▒▒ _____▓▓▓▓▓\n"
										+ "________▒▒▒▒______▓▓▓▓▓\n"
										+ "________█████____█████\n"
										+ "_'▀█║────────────▄▄───────────​─▄──▄_\n"
										+ "──█║───────▄─▄─█▄▄█║──────▄▄──​█║─█║\n"
										+ "──█║───▄▄──█║█║█║─▄║▄──▄║█║─█║​█║▄█║\n"
										+ "──█║──█║─█║█║█║─▀▀──█║─█║█║─█║​─▀─▀\n"
										+ "──█║▄║█║─█║─▀───────█║▄█║─▀▀\n"
										+ "──▀▀▀──▀▀────────────▀─█║\n"
										+ "───────▄▄─▄▄▀▀▄▀▀▄──▀▄▄▀\n"
										+ "──────███████───▄▀\n"
										+ "──────▀█████▀▀▄▀\n"
										+ "────────▀█▀");
								break;
							default:
								System.out.println("I couldn't understand your command. Please write again your command :)");
								question = "14";
								break;
						}
						break;
				}
			}
		}
	}
}