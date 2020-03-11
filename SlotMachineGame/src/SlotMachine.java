public class SlotMachine {
	private boolean build;
	private double funds;
	private int jackpotOdds;
	private int payoutOdds;
	private double payout;
	private double jackpotPayout;
	private double cost;
	private String machineName;
	
//------Constructor
public SlotMachine(boolean build, double funds, int jackpotOdds,int payoutOdds, double payout, 
							double jackpotPayout, double cost, String machineName){
				this.build = build;
				if(build == true) {//for user generated
					payout = DataValidation.validateDouble("Enter the payout : ");
					jackpotPayout = DataValidation.validateDouble("Enter the jackpot payout : ");
					cost = 1.00;//it is always 1.00
					machineName = DataValidation.validateString("Enter the machine name : ");
					funds = DataValidation.validateDouble("Enter the funds : ");
					jackpotOdds = DataValidation.validateInt("Enter the jackpot odds: ");
					payoutOdds = DataValidation.validateInt("Enter the payout odds : ");
					}
				if(build == false){//for system hard coded
					this.funds = funds;
					this.jackpotOdds = jackpotOdds;
					this.payoutOdds = payoutOdds;
					this.payout = payout;
					this.jackpotPayout = jackpotPayout;
					this.cost = cost;
					this.machineName = machineName;
					}
				}
//-------------SETTERS
public void setPayout(double payout) {
				this.payout = payout;
			}
public void setJackpotPayout(double jackpotPayout) {
				this.jackpotPayout = jackpotPayout;
			}
public void setCost(double cost) {
				this.cost = cost;
			}
public void setMachineName(String machineName) {
				this.machineName = machineName;
			}
public void setFunds(double funds) {
				this.funds = funds;
			}
public void setJackpotOdds(int jackpotOdds) {
			this.jackpotOdds = jackpotOdds;
			}
public void setPayoutOdds(int payoutOdds) {
		this.payoutOdds = payoutOdds;
		}
//-------------GETTERS
public double getFunds(){ 
	return funds;
	}
public int getJackpotOdds() {
			return jackpotOdds;
		}
public int getPayoutOdds() {
			return payoutOdds;
		}
public double getPayout() {
			return payout;
		}
public double getJackpotPayout() {
			return jackpotPayout;
		}
public double getCost() {
			return cost;
		}
public String getMachineName() {
			return machineName;
		}
//-------------toString	
@Override
public String toString() {
	String result = super.toString();
			result +=	"the available funds are :" + funds;
			result += 	"the jackpot odds are : " + jackpotOdds;
			result +=	"the payout odds are : " + payoutOdds;
			result += 	"the normal payout is : " + payout ;
			result +=	"the jackpot is : "+ jackpotPayout;
			result +=	"the cost to play is : " + cost;
			result += 	"the slot machines name is : " + machineName;
			return result;
			}
public boolean isBuild() {
	return build;
}
public void setBuild(boolean build) {
	this.build = build;
}
}//end class
