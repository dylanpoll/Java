import java.util.ArrayList;

public class RunTimeData {
	//this is used for all the data the game needs to run, it lets 
	//all the data meet at a point for unpacking in runGame
	private  int totalAmountOfPlayers;
	private  int totalAmountOfMachines;
	private  ArrayList<SlotMachine> machineArray;
	private  ArrayList<Player> playerArray;
	private  boolean jackpotWon;
	private  boolean payoutWon;
	private  Date todaysDate;
	private  SlotMachine selectedSlot;
	private  boolean firstStart;
	private static  RunTimeData RunTime;
//-----------constructor
public RunTimeData(int totalAmountOfPlayers, int totalAmountOfMachines, ArrayList<SlotMachine> machineArray,
		ArrayList<Player> playerArray, boolean jackpotWon, boolean payoutWon, Date todaysDate, SlotMachine selectedSlot, boolean firstStart, RunTimeData RunTime) {
	this.totalAmountOfPlayers = totalAmountOfPlayers;
	this.totalAmountOfMachines = totalAmountOfMachines;
	this.machineArray = machineArray;
	this.playerArray = playerArray;
	this.jackpotWon = jackpotWon;
	this.payoutWon = payoutWon;
	this.todaysDate = todaysDate;
	this.selectedSlot = selectedSlot;
	this.firstStart = firstStart;
	try {
		RunTimeData.RunTime = RunTime;
		setRunTime(RunTime);
		}
		catch(Exception e){
			System.out.println("RunTime environment is fully loaded!");
			}
}//end of constructor
//----------setters
public void setFirstStart(boolean firstStart) {
	this.firstStart = firstStart;
}
public void setSelectedSlot(SlotMachine selectedSlot) {
	this.selectedSlot = selectedSlot;
}
public void setTotalAmountOfPlayers(int totalAmountOfPlayers) {
	this.totalAmountOfPlayers = totalAmountOfPlayers;
			}
public void setTotalAmountOfMachines(int totalAmountOfMachines) {
	this.totalAmountOfMachines = totalAmountOfMachines;
			}
public void setMachineArray(ArrayList<SlotMachine>machineArray) {
	this.machineArray = machineArray;
			}
public void setPlayerArray(ArrayList<Player>playerArray) {
	this.playerArray = playerArray;
			}
public void setJackpotWon(boolean jackpotWon){
	this.jackpotWon = jackpotWon;
			}
public void setPayoutWon(boolean payoutWon){
	this.payoutWon = payoutWon;
			}
public void setTodaysDate(Date todaysDate){
				this.todaysDate = todaysDate;
}
public static void setRunTime(RunTimeData RunTime){
	RunTimeData.RunTime = RunTime;
	}
//---------getters
public static RunTimeData getRunTime(){
	return RunTime;
}
public ArrayList<SlotMachine> getMachineArray() {
			return machineArray;
			}
public ArrayList<Player> getPlayerArray(){
				return playerArray;
			}
public boolean isJackpotWon(){
				return jackpotWon;
			}
public boolean isPayoutWon(){
				return payoutWon;
			}
public Date getTodaysDate(){
				return todaysDate;
			}
public int getTotalAmountOfPlayers() {
				return totalAmountOfPlayers;
			}
public int getTotalAmountOfMachines() {
				return totalAmountOfMachines;
			}
public SlotMachine getSelectedSlot() {
	return selectedSlot;
}
public boolean isFirstStart() {
	return firstStart;
}
}

