public class RunTimeData {
	//this is used for all the data the game needs to run, it lets 
	//all the data meet at a point for unpacking in runGame
	private int totalAmountOfPlayers;
	private int totalAmountOfMachines;
	private SlotMachine[] machineArray;
	private Player[] playerArray;
	private boolean jackpotWon;
	private boolean payoutWon;
	private Date todaysDate;

//-----------constructor
public RunTimeData(int totalAmountOfPlayers, int totalAmountOfMachines, SlotMachine[] machineArray,
			Player[] playerArray, boolean jackpotWon, boolean payoutWon, Date todaysDate) {
	this.totalAmountOfPlayers = totalAmountOfPlayers;
	this.totalAmountOfMachines = totalAmountOfMachines;
	this.machineArray = machineArray;
	this.playerArray = playerArray;
	this.jackpotWon = jackpotWon;
	this.payoutWon = payoutWon;
	this.todaysDate = todaysDate;
	}
//----------setters
public void setTotalAmountOfPlayers(int totalAmountOfPlayers) {
			this.totalAmountOfPlayers = totalAmountOfPlayers;
			}
public void setTotalAmountOfMachines(int totalAmountOfMachines) {
			this.totalAmountOfMachines = totalAmountOfMachines;
			}
public void setMachineArray(SlotMachine[] machineArray) {
			this.machineArray = machineArray;
			}
public void setPlayerArray(Player[] playerArray) {
				this.playerArray = playerArray;
			}
public void setJackpotWon(boolean jackpotWon) {
			this.jackpotWon = jackpotWon;
			}
public void setPayoutWon(boolean payoutWon) {
			this.payoutWon = payoutWon;
			}
public void setTodaysDate(Date todaysDate) {
				this.todaysDate = todaysDate;
}
//---------getters
public SlotMachine[] getMachineArray() {
			return machineArray;
			}
public Player[] getPlayerArray(){
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
}
