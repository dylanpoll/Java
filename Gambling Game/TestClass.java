import java.util.*;
public class TestClass {
//declared static so they don't run as multiple instances
//-----------loads initial variables
public static void firstRun(){
	ArrayList<SlotMachine> machineArray = new ArrayList<SlotMachine>();
	ArrayList<Player> playerArray = new ArrayList<Player>();
	int jackpotOdds = 1,payoutOdds = 1, totalAmountOfMachines = 0,totalAmountOfPlayers = 0;
	System.out.println("Please put in todays date :");
	Date todaysDate = new Date();
	double payout = 1,jackpotPayout = 1,cost = 1.00,funds = 1;
	String machineName = "blank";
	//imports and creates data
//---------Machines initialized
		totalAmountOfMachines = 3;jackpotPayout= 5000;machineName = "Crazy 8";
		funds = 5000.00; jackpotOdds = 1000; payoutOdds = 10; payout = 5.00;
		SlotMachine Crazy8 = new SlotMachine(false, funds,jackpotOdds,payoutOdds,payout,
																jackpotPayout, cost, machineName);	
machineArray.add(Crazy8);
			System.out.println("Core machine Crazy 8 loaded..");
		funds = 55000.00; jackpotOdds = 100000; payoutOdds = 50;
		payout = 25.00; jackpotPayout= 75000.00; machineName = "Lucky Loser";
		SlotMachine luckyLoser = new SlotMachine(false, funds,jackpotOdds,payoutOdds,payout,
																jackpotPayout, cost, machineName);
machineArray.add(luckyLoser);
			System.out.println("Core machine Lucky Loser loaded..");
		funds = 1100.00; jackpotOdds = 55; payoutOdds = 5;
		payout = 1.75; jackpotPayout= 45.00; machineName = "Green Machine";
		SlotMachine greenMachine = new SlotMachine(false, funds,jackpotOdds,payoutOdds,payout,
																jackpotPayout, cost, machineName);
machineArray.add(greenMachine);
			System.out.println("Core machine Green Machine loaded..");
			System.out.println("All core machines loaded... Loading Players");
//---------players initialized.
			totalAmountOfPlayers = 1;
			Date dob = new Date(1953,02,10);
			String firstName = "Charlie";
			String lastName = "Brown";
			char initial = 'C';
				Player charlie = new Player(false,firstName,initial , lastName,false,dob,true,5000);
playerArray.add(charlie);//charlie is added
				System.out.println("Core player Charlie loaded...");
				System.out.println("All core players have been loaded...");
						//updates runtime data, runtime data is static so it can't be duplicated
						System.out.println("Assembling runtime data...");
						System.out.println("Core system fully loaded...");
						System.out.println("Sending user to main menu.");
	//------end of first run initializing runtime environment data
	RunTimeData RunTime = new RunTimeData(totalAmountOfPlayers,totalAmountOfMachines,machineArray,playerArray,false ,false,todaysDate,greenMachine, false, RunTimeData.getRunTime()); 
	RunTimeData.setRunTime(RunTime);
}//end of method
//-----------slot machines	
public static void buildingSlotMachine(){
	RunTimeData RunTime = RunTimeData.getRunTime();
		ArrayList<SlotMachine> machineArray =  RunTime.getMachineArray();
		int totalAmountOfMachines = RunTime.getTotalAmountOfMachines();
		double funds = 0,payout=0,jackpotPayout=0,cost=0;int jackpotOdds=0, payoutOdds=0;
		String machineName = "blank";boolean build = true;
		//imported data
		System.out.println("sending user to the slot machine builder");
		try {
			SlotMachine newSlotmachine = new SlotMachine(build, funds,jackpotOdds,payoutOdds, payout, 
					jackpotPayout,cost,machineName);//initializes the slot machine
					machineArray.add(newSlotmachine);
					RunTime.setMachineArray(machineArray);//updates array list
					totalAmountOfMachines = totalAmountOfMachines + 1;
					RunTime.setTotalAmountOfMachines(totalAmountOfMachines);//updates
					System.out.println("new slot machine has been entered, returning to main menu.");
					}
					catch(Exception e){
							System.out.println("something didn't work out it seems... sending you back to the main menu.");
							}
}//end of method
//-----------new players
public static void buildingPlayer(){
	RunTimeData RunTime = RunTimeData.getRunTime();
		ArrayList<Player> playerArray = RunTime.getPlayerArray();
		int totalAmountOfPlayers = RunTime.getTotalAmountOfPlayers();
		Date dob = null; 
		boolean legalAge = false;
		String firstName= "";
		char initial = 'x';
		String lastName= "";
		//imported and created Data for injection.
		System.out.println("loaded into building new player");
	try {
		Player playerObject = new Player(true,firstName,initial , lastName, true, dob, legalAge, totalAmountOfPlayers);
		legalAge = playerObject.getLegalAge();//checks if they can be a player, if not they get kicked
				if(legalAge==true){
					playerArray.add(playerObject);
					System.out.println("loading new data into runtime....");
					RunTime.setPlayerArray(playerArray);
					totalAmountOfPlayers = totalAmountOfPlayers + 1;
					RunTime.setTotalAmountOfPlayers(totalAmountOfPlayers);
		System.out.println("new player has been entered, returning to main menu.");
		}
		if(legalAge==false) {
			System.out.println();
			System.out.println("you are too young to gamble so we called the police and had your mom pick you up..");
			System.out.println("Player was not added to list. returning to main menu.");
			System.out.println();
			}
			}
			catch(Exception e){
				System.out.println("something didn't work out it seems... sending you back to the main menu.");
				}
}//end building player method
//-----------Game Script
public static void oddsCheck(){//runs RNG slot game round
	RunTimeData RunTime = RunTimeData.getRunTime();
	//need to import scope
	SlotMachine selectedSlot = RunTime.getSelectedSlot();
	System.out.println("you decided to play the machine : " + selectedSlot.getMachineName());
	System.out.println("slots are going......");
	int jackPotScope = selectedSlot.getJackpotOdds();
	int payoutScope = selectedSlot.getJackpotOdds();
			Random rand = new Random();	
		    RunTime.setPayoutWon(false);//if they win they change else 
		    RunTime.setJackpotWon(false);//they stay false
			   	int jackpotRandom = rand.nextInt(jackPotScope); 
			   		jackPotScope =	RunTime.getSelectedSlot().getPayoutOdds();
				   		int jackpotRandomTwo = rand.nextInt(jackPotScope);
				   			if(jackpotRandom == jackpotRandomTwo) { 	
				   				RunTime.setJackpotWon(true);
				   				}//end if
			   int payoutRandom = rand.nextInt(payoutScope);
			        int payoutRandomTwo = rand.nextInt(payoutScope);
			        	if(payoutRandom == payoutRandomTwo) {
			        		if(RunTime.isJackpotWon() == false) {	
			        			RunTime.setPayoutWon(true);
			        			}//end if
			        			}//end if
RunTimeData.setRunTime(RunTime);//updates runtime
}//end gameResult method
public static void runGame(){
	RunTimeData RunTime = RunTimeData.getRunTime();//runtimeData loaded
		int totalAmountOfPlayers = RunTime.getTotalAmountOfPlayers();
		int totalAmountOfMachines = RunTime.getTotalAmountOfMachines();
		ArrayList<SlotMachine> machineArray = RunTime.getMachineArray();
		ArrayList<Player> playerArray = RunTime.getPlayerArray();
		Date todaysDate = RunTime.getTodaysDate();
		boolean jackpotWon = RunTime.isJackpotWon(),payoutWon = RunTime.isPayoutWon();
		
	double credit = 0;
	int x = 0, playerSelect = 0, machineSelect = 0;
	Player selectedPlayer = null;
	do{
		System.out.println("these are all the players you can pick : ");
		System.out.println("---------------------------------");
		for(int i = 0; i < totalAmountOfPlayers ; i++){//prints all the machines to select
				selectedPlayer = playerArray.get(i);
				if(selectedPlayer.getMoneyBalance()>0){
				System.out.println("Player name : "+selectedPlayer.getFirstName()+ " " +selectedPlayer.getMiddleInitial()+ " " +selectedPlayer.getLastName());
				System.out.println("their available funds : $"+selectedPlayer.getMoneyBalance());
				System.out.println("they were born on : "+selectedPlayer.getDob());
				i= i+1;
				System.out.println("the selection code for this player is : " + i);
				i = i-1;
				System.out.println("---------------------------------");
				}
				}
				try {
					playerSelect = DataValidation.validateInt("please enter the selection code : ");
					playerSelect = playerSelect-1;//to match array
					selectedPlayer = playerArray.get(playerSelect);//grabs player object from array
					x = 1;
					}
					catch(Exception e){
						System.out.println("you made an invalid selection, please try again..");
						x=0;
						}
	}while(x == 0);
	double moneyBalance = selectedPlayer.getMoneyBalance();
	x = 0;
	do {
		System.out.println();
		System.out.println("these are all the Slot machines you can pick : ");
		System.out.println("---------------------------------");
		for(int i = 0; i < totalAmountOfMachines ; i++){//prints all the machines to select
				SlotMachine selectedSlot = machineArray.get(i);
				if(selectedSlot.getFunds()>0){
				System.out.println("the slot machines name is : "+selectedSlot.getMachineName());
				System.out.println("the available funds are :"+selectedSlot.getFunds());
				System.out.println("the jackpot odds are : "+selectedSlot.getJackpotOdds());
				System.out.println("the payout odds are : "+selectedSlot.getPayoutOdds());
				System.out.println("the normal payout is : "+selectedSlot.getPayout());
				System.out.println("the jackpot is : "+selectedSlot.getJackpotPayout());
				System.out.println("the cost to play is : "+ selectedSlot.getCost());
				i = i+1;
				System.out.println("the selection code for this machine is : " + i);
				i= i-1;
				System.out.println("---------------------------------");
				}
				}
				try {
					machineSelect = DataValidation.validateInt("please enter the selection code : ");
					machineSelect = machineSelect -1;
					x = 1;
					}catch(Exception e){
						System.out.println("you made an invalid selection, please try again..");
						x = 0;
						}
						}while(x == 0);
	x=0;
	do {
			SlotMachine selectedSlot = machineArray.get(machineSelect);//grabs machine object from array
			RunTime.setSelectedSlot(selectedSlot);//updates runtime selected slot
			System.out.println();
	
	
		//charges the player for playing
		moneyBalance = moneyBalance - 1.00;//its a dollar
		selectedPlayer.setMoneyBalance(moneyBalance);
		double machineFunds = selectedSlot.getFunds();
		machineFunds = machineFunds + selectedSlot.getCost();
		selectedSlot.setFunds(machineFunds);	
	oddsCheck();
	jackpotWon = RunTime.isJackpotWon();
	payoutWon = RunTime.isPayoutWon();
	Date ifBirthDay = selectedPlayer.getDob();
	int month = ifBirthDay.getMonth();
	int day = ifBirthDay.getDay();
			if(jackpotWon == true) {
				credit = selectedSlot.getJackpotPayout();
						if(month == todaysDate.getMonth()){
							if(day == todaysDate.getDay()){
								credit = (credit * 2);
								System.out.println("---------------------------------");
								System.out.println("We see it is your birthday! You get double payout on your birthday!");
								System.out.println("Normally the jackpot payout for this machine is "+selectedSlot.getJackpotPayout());
								System.out.println("---------------------------------");
								}
								}
						moneyBalance = moneyBalance + credit;
						selectedPlayer.setMoneyBalance(moneyBalance);
						machineFunds = machineFunds - selectedSlot.getJackpotPayout();
						selectedSlot.setFunds(machineFunds);
						System.out.println("---------------------------------");
						System.out.println("You won the Jackpot! : $"+ credit);
						System.out.println("Current player funds : $"+selectedPlayer.getMoneyBalance());
						System.out.println("---------------------------------");
						}
			if(payoutWon == true){// for doubling the payout on birthdays
				credit = selectedSlot.getPayout();
				if(month == todaysDate.getMonth()){
					if(day == todaysDate.getDay()){
						credit = (credit * 2);
						System.out.println("---------------------------------");
						System.out.println("We see it is your birthday! You get double payout on your birthday!");
						System.out.println("Normally the payout for this machine is "+selectedSlot.getPayout());
						System.out.println("---------------------------------");
						}
						}
						moneyBalance = moneyBalance + credit;
						selectedPlayer.setMoneyBalance(moneyBalance);
						machineFunds = machineFunds - selectedSlot.getPayout();
						selectedSlot.setFunds(machineFunds);
						System.out.println("---------------------------------");
						System.out.println("You won : $" + credit);
						System.out.println("Current player funds : $"+selectedPlayer.getMoneyBalance());
						System.out.println("---------------------------------");
			}
			if(payoutWon==false){
				if(jackpotWon==false){
						System.out.println("---------------------------------");
						System.out.println("Looks like your luck didn't come through this time.. It's a loss.");
						System.out.println("Current player funds : $"+selectedPlayer.getMoneyBalance());
						System.out.println("---------------------------------");
						}
						}	
			credit = 0;
			if(selectedPlayer.getMoneyBalance()<= 0){
				System.out.println("---------------------------------");
				System.out.println("looks like "+selectedPlayer.getFirstName()+" "+selectedPlayer.getMiddleInitial()+" "
											+selectedPlayer.getLastName()+ " lost all his money.... he has been forcefully");
				System.out.println("removed from the property and banned....");
				System.out.println("hopefully he gets his life on track.");
				System.out.println("---------------------------------");
				x=1;//forces the user to exit as they lost all money
				}
			if(selectedSlot.getFunds()<=0){
				System.out.println("---------------------------------");
				System.out.println("looks like the slot machine "+selectedSlot.getMachineName() +" lost all its money....");
				System.out.print("it printed out an IOU slip, "+selectedPlayer.getFirstName()+" "+selectedPlayer.getMiddleInitial());
				System.out.print(" "+selectedPlayer.getLastName()+" took it to the counter");
				System.out.println();
				System.out.println("the casinio paid him out, the machine has been removed.");
				System.out.println("the staff seems to be watching him more....");
				System.out.println("---------------------------------");
				x=1;//forces the player to stop using the machine by removing it
				}
			machineArray.set(machineSelect, selectedSlot);//this updates the original machine with the new data
			playerArray.set(playerSelect,selectedPlayer);	// and player objects
			System.out.println("---------------------------------");
			System.out.println("Would you like to keep playing this slot machine?");
			System.out.println(" 'y' for yes, 'n' for no ");
			System.out.println("---------------------------------");
			int choiceLooper = 0;
			do {
				char choice = DataValidation.validateChar("enter choice : ");
					switch(choice){	
						case 'y':		
							x=0;
							choiceLooper = 1;
							break;		
						case 'Y':	
							x=0;
							choiceLooper = 1;
							break;
						case 'n':		
							x=1;
							choiceLooper = 1;
							break;
						case 'N':		
							x=1;
							choiceLooper = 1;
							break;
						default:
							System.out.println("invalid selection.");
							break;
					}
					}while(choiceLooper==0);
	}while(x==0);
	RunTimeData.setRunTime(RunTime);//updates runtime
	System.out.print(" Sending you back to the main menu! ");
}//end of game script method
//-----------Main
public static void main(String[] args){
	try {
		RunTimeData RunTime = RunTimeData.getRunTime();
		boolean firststart = RunTime.isFirstStart();
			}catch(Exception e){// will always catch before runtime is initialized.
				System.out.println("Hello user! Welcome to our casino! We will now load all our Assets!...");
				firstRun();//initializes runtime
				}
	boolean keepRunning = true;	
	do {
		try{
			System.out.println();
			System.out.println("---------------------------------");
			char menuSelect = DataValidation.validateChar("please enter a valid menu choice\n 'q' "
														+ "to quit.\n 'p' to enter a new player.\n" + 
												 	" 's' to enter a new slot machine.\n 'g' to gamble."
												 	+ "\n enter selection : ");
					switch(menuSelect){	
						case 'q':		
							keepRunning = false;
							break;		
						case 'Q':		
							keepRunning = false;
							break;
						case 'p':		
							buildingPlayer();
							break;
						case 'P':		
							buildingPlayer();
							break;
						case 's':		
							buildingSlotMachine();
							break;
						case 'S':		
							buildingSlotMachine();
							break;
						case 'g':		
							runGame();
							break;
						case 'G':		
							runGame();
							break;
							}
							}catch(Exception e){
								System.out.println("something went wrong~! sending back to menu!");
								}
								//end switch for menu
		}while(keepRunning == true);//end main do
System.out.println("Game Terminated, thanks for playing!");
}//end main
}//end class	