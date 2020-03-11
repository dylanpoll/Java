public class Player extends Name{
	private boolean build;
	private Date dob;
	private boolean legalAge;
	private double moneyBalance;
//-----constructor
public Player(boolean buildName, String firstName, char middleInitial, String lastName, boolean build,Date dob,boolean legalAge,double moneyBalance){
	super(buildName ,firstName, middleInitial, lastName);
	this.build = build;
		if(build == true) {
			System.out.println("Enter The Player's Birthday");
			this.dob = new Date();
			this.dob = dob;
			this.buildSetlegalAge(legalAge);
			this.moneyBalance = DataValidation.validateDouble("Please enter in the funds of this player :");
			}
			if (build == false) {
				this.setDob(dob);
				this.setlegalAge(legalAge);
				this.setMoneyBalance(moneyBalance);
				}
	}
//-----getters
public boolean getLegalAge(){
		return legalAge;
	}
public Date getDob() {
		return dob;
	}
public double getMoneyBalance() {
		return moneyBalance;
	}
//------setters for normal constructor
public void setDob(Date dob){
	this.dob = dob;
	}
public void setMoneyBalance(double moneyBalance) {
	this.moneyBalance= moneyBalance;
}
public void setlegalAge(boolean legalAge){
	this.legalAge = legalAge;
	}
//--for user making new players belowV
public void buildSetlegalAge(boolean legalAge) {
		legalAge = false; //sets it to false, only need argument for true.
		try {
			if(dob.getYear()==2002) {
				if(dob.getMonth()<8){
					legalAge = true;
				}
				if(dob.getMonth() == 8){
					if(dob.getDay()<9){
						legalAge = true;
					}
					}
					}	
				if(dob.getYear()<2001){//clearly over 18.
					legalAge = true;
					}
			}
			catch(Exception e){
				System.out.println("Looks like you are not old enough to play :( .. please go home child.");
				}
		this.buildSetlegalAge(legalAge);
	 	}
//-------to string
@Override
public String toString() {
		String result = super.toString();
		result += "Date of Birth: " +dob;
		result += "Current Balance: "+ moneyBalance;
		return result;
	}
public boolean isBuild() {
	return build;
}
public void setBuild(boolean build) {
	this.build = build;
}

}