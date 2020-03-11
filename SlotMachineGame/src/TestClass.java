import java.util.*;
public class TestClass {
	//declared static so they don't run as multiple instances
	static Scanner input = new Scanner(System.in);
	

	static RunTimeData RunTime;
	static String load = null;
	static Player[] playerArray;
	static SlotMachine[] machineArray;
	
//-----------loads initial variables
public static void firstRun(){
	//imports and creates data
		machineArray = new SlotMachine[3];//array
		System.out.println("please enter in todays date!");
			Date todaysDate = new Date();//sets the date
//---------Machines initialized
		int totalAmountOfMachines = 2 ,jackpotOdds = 0, payoutOdds = 0;
		double funds = 0, payout = 0, jackpotPayout= 0, cost = 1.00;
			String machineName = " ";
		funds = 5000.00; jackpotOdds = 1000; payoutOdds = 10; payout = 5.00;
		jackpotPayout= 5000;machineName = "Crazy 8";
		SlotMachine Crazy8 = new SlotMachine(false, funds,jackpotOdds,payoutOdds,payout,
																jackpotPayout, cost, machineName);	
			machineArray[0] = Crazy8;
			System.out.println("Core machine Crazy 8 loaded..");
		
		funds = 55000.00; jackpotOdds = 100000; payoutOdds = 50;
		payout = 25.00; jackpotPayout= 75000.00; machineName = "Lucky Loser";
		SlotMachine luckyLoser = new SlotMachine(false, funds,jackpotOdds,payoutOdds,payout,
																jackpotPayout, cost, machineName);
			machineArray[1] = luckyLoser;
			System.out.println("Core machine Lucky Loser loaded..");
		funds = 1100.00; jackpotOdds = 55; payoutOdds = 5;
		payout = 1.75; jackpotPayout= 45.00; machineName = "Green Machine";
		SlotMachine greenMachine = new SlotMachine(false, funds,jackpotOdds,payoutOdds,payout,
																jackpotPayout, cost, machineName);
			machineArray[2] = greenMachine;
			System.out.println("Core machine Green Machine loaded..");
	System.out.println("All core machines loaded... Loading Players");
//---------players initialized.
		 playerArray = new Player[1];//array
			int totalAmountOfPlayers = 1;
			Date dob = new Date(1953,02,10);
			String firstName = "Charlie";
			String lastName = "Brown";
			char initial = 'C';
			boolean legalAge = true;
		Player charlie = new Player(false,firstName,initial , lastName,false,dob,legalAge,5000);
		playerArray[0] = charlie;
		System.out.println("Core player Charlie loaded...");
		System.out.println("All core players have been loaded...");
	//updates runtime data, runtime data is static so it can't be duplicated
	System.out.println("Assembling runtime data...");
	RunTime = new RunTimeData(totalAmountOfPlayers,totalAmountOfMachines,machineArray,playerArray,
									false, false, todaysDate);
	System.out.println("Core system fully loaded...");
	System.out.println("Sending user to main menu.");
	//------end of first run
	}
//-----------slot machines	
public static void buildingSlotMachine(){
	System.out.println("loaded into building slot machine");
	int totalAmountOfMachines = RunTime.getTotalAmountOfMachines();
	machineArray =  RunTime.getMachineArray();
	//imported data
	System.out.println("sending user to the slot machine builder");
	//try {
	double funds = 0,payout=0,jackpotPayout=0,cost=0;
	int jackpotOdds=0, payoutOdds=0;
	String machineName = "blank";
	SlotMachine newSlotmachine = new SlotMachine(true, funds,jackpotOdds,payoutOdds, payout, 
										jackpotPayout,cost,machineName);//initializes the slot machine
		SlotMachine[] newMachineArray = new SlotMachine[totalAmountOfMachines+1];//array is one larger
					for(int i = 0; i < totalAmountOfMachines; i++){//uses max of old array	
							newMachineArray[i] = machineArray[i];//copy over array
							}//side note, the for loop stops just before fully loading the array to leave 
		newMachineArray[totalAmountOfMachines] = newSlotmachine;//inserts the new slot machine in the array
		System.out.println("The new slot machine has been created!");
		machineArray = newMachineArray;
	RunTime.setMachineArray(machineArray);//updates 
	RunTime.setTotalAmountOfMachines(totalAmountOfMachines);//updates
		//}
		//catch(Exception e){
		//	System.out.println("something didn't work out it seems... sending you back to the main menu.");
		//	}
	}
//-----------new players
public static void buildingPlayer(){
	int totalAmountOfPlayers = RunTime.getTotalAmountOfPlayers();
	Player[] playerArray;
	Date dob = null; 
	playerArray = RunTime.getPlayerArray();
	boolean legalAge = false;
	//imported and created Data for injection.
	System.out.println("loaded into building new player");
	//try {
		String firstName= "";
		char initial = 'x';
		String lastName= "";
		Player playerObject = new Player(true,firstName,initial , lastName, true, dob, legalAge, totalAmountOfPlayers);
		legalAge = playerObject.getLegalAge();//checks if they can be a player, if not they get kicked
				if(legalAge==true){
					Player[] newPlayerArray = new Player[totalAmountOfPlayers+1];//array is one larger
						for(int i = 0; i < totalAmountOfPlayers; i++){//uses max of old array
							newPlayerArray[i] = playerArray[i];//copy over array
							}
					newPlayerArray[totalAmountOfPlayers] = playerObject;
					System.out.println("loading new data into runtime....");
			RunTime.setPlayerArray(playerArray);
			RunTime.setTotalAmountOfPlayers(totalAmountOfPlayers);
		System.out.println("new player has been entered, returning to main menu.");
		}
		if(legalAge==false) {
			System.out.println("you are too young to gamble so we called the police and had your mom pick you up..");
			System.out.println("Player was not added to list. returning to main menu.");
		}
	//}
	//catch(Exception e){
	//	System.out.println("something didn't work out it seems... sending you back to the main menu.");
	//}
	}//end building player
//-----------Game Script
public static void oddsCheck(SlotMachine selectedSlotMachine){//runs RNG slot game round
			Random rand = new Random(); 
			boolean jackpotWon = false;	
		    boolean payoutWon = false;	
		    RunTime.setPayoutWon(payoutWon);
		    RunTime.setJackpotWon(payoutWon);
			int jackpotScope =	selectedSlotMachine.getPayoutOdds();
			   	int jackpotRandom = rand.nextInt(jackpotScope); 
			   		jackpotScope =	selectedSlotMachine.getPayoutOdds();
				   		int jackpotRandomTwo = rand.nextInt(jackpotScope);
				   			if(jackpotRandom == jackpotRandomTwo) { 
				   				jackpotWon = true;	
				   				RunTime.setJackpotWon(jackpotWon);
				   				}//end if
			int payoutScope = selectedSlotMachine.getJackpotOdds();
			   int payoutRandom = rand.nextInt(payoutScope);
			     payoutScope = selectedSlotMachine.getJackpotOdds();
			        int payoutRandomTwo = rand.nextInt(payoutScope);
			        	if(payoutRandom == payoutRandomTwo) {
			        		if(jackpotWon == false) {
			        			payoutWon = true;	
			        			RunTime.setPayoutWon(payoutWon);
			        			}//end if
			        		}//end if
		}//end gameResult
public static void runGame(){
		int x = 0;// for do while loops
		int totalAmountOfPlayers = RunTime.getTotalAmountOfPlayers();
		int totalAmountOfMachines = RunTime.getTotalAmountOfPlayers();
		SlotMachine[] machineArray = RunTime.getMachineArray();
		Player[] playerArray = RunTime.getPlayerArray();
		Date todaysDate = RunTime.getTodaysDate();
		double credit = 0;
		int playerSelect = 0;
		int machineSelect = 0;
		Player selectedPlayer = null;
		SlotMachine selectedSlotMachine = null;
	do{
		System.out.println("these are all the players you can pick : ");
		for(int i = 0; i < totalAmountOfPlayers ; i++){//prints all the machines to select
				System.out.println(playerArray[i]);
				System.out.println("the selection code for this player is : " + i);
			}
			try {
				playerSelect = DataValidation.validateInt("please enter the selection code : ");
				selectedPlayer = playerArray[playerSelect];//grabs player object from array
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
		System.out.println("these are all the Slot machines you can pick : ");
		for(int i = 0; i <= totalAmountOfMachines ; i++){//prints all the machines to select
				System.out.print(machineArray[i]);System.out.println(i);
				System.out.println("the selection code for this machine is : " + i);
			}
			try {
				machineSelect = DataValidation.validateInt("please enter the selection code : ");
				selectedSlotMachine = machineArray[machineSelect];//grabs machine object from array
				System.out.println("The machine is spinning..... ");
				x = 1;
				}
				catch(Exception e){
					System.out.println("you made an invalid selection, please try again..");
					x = 0;
					}
	}while(x == 0);
	//charges the player for playing
		moneyBalance = moneyBalance - 1.00;//its a dollar
		selectedPlayer.setMoneyBalance(moneyBalance);
		double machineFunds = selectedSlotMachine.getFunds();
		machineFunds = machineFunds + selectedSlotMachine.getCost();
		selectedSlotMachine.setFunds(machineFunds);
	oddsCheck(selectedSlotMachine);
		boolean jackpotWon = RunTime.isJackpotWon();
		boolean payoutWon = RunTime.isPayoutWon();
			if(jackpotWon == true) {
				credit = selectedSlotMachine.getJackpotPayout();
					if(selectedPlayer.getDob() == todaysDate){
						credit = (credit * 2);
					}
				moneyBalance = moneyBalance + credit;
				selectedPlayer.setMoneyBalance(moneyBalance);
				machineFunds = machineFunds - selectedSlotMachine.getJackpotPayout();
				selectedSlotMachine.setFunds(machineFunds);
			}
			if(payoutWon == true){// for doubling the payout on birthdays
				credit = selectedSlotMachine.getPayout();
					if(selectedPlayer.getDob() == todaysDate){
						credit = (credit * 2);
					}
				moneyBalance = moneyBalance + credit;
				selectedPlayer.setMoneyBalance(moneyBalance);
				machineFunds = machineFunds - selectedSlotMachine.getPayout();
				selectedSlotMachine.setFunds(machineFunds);
			}else{
				System.out.println("Looks like your luck didn't come through this time.. It's a loss.");
			}
			machineArray[machineSelect] = selectedSlotMachine;//this updates the original machine
			playerArray[playerSelect] = selectedPlayer;	// and player objects	
		SlotMachine[] newMachineArray = new SlotMachine[totalAmountOfMachines];
			for(int i = 0; i < totalAmountOfMachines; i++){
				if(i != machineSelect){
					newMachineArray[i] = machineArray[i];//copy over array
					}
				if(i == machineSelect) {
					newMachineArray[i] = machineArray[machineSelect];//update used machine
					}
			}
			Player[] newPlayerArray = new Player[totalAmountOfPlayers];
			for(int i = 0; i < totalAmountOfMachines; i++){
				if(i != machineSelect){
					newPlayerArray[i] = playerArray[i];//copy over array
					}
				if(i == machineSelect) {
					newPlayerArray[i] = playerArray[playerSelect];//update used player
					}
			}
	credit = 0;
	RunTime = new RunTimeData(totalAmountOfPlayers,totalAmountOfMachines,machineArray,playerArray,
								false, false, todaysDate);//updates runtime data
	System.out.print(" Sending you back to the main menu! ");
	}
//-----------Main
public static void main(String[] args){
		boolean keepRunning = true;
		if(load == null){//loads initial variables
				firstRun();
				load = "loaded";// this makes this code run only 1 time
				}
		do {
		//try{
			char menuSelect = DataValidation.validateChar("please enter a valid menu choice enter 'q' "
														+ "to quit, 'p' to enter a new player, " + 
												 	"'s' to enter a new slot machine or 'g' to gamble : ");
					switch(menuSelect){	//menu
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
					//}
					//}catch(Exception e){
					//	System.out.println("something went wrong~! sending back to menu!");
					}
			//end switch for menu
		}while(keepRunning == true);//end main do
		System.out.println("Game Terminated, thanks for playing!");
	}//end main
}//end class	