package game;
class Constants{
	private double SalesTaxRate;
	private int MaximumNoPlayers;
	private int MinimumPlayerAge;
//getters---
protected double getSalesTaxRate() {
		return SalesTaxRate;
	}
protected int getMinimumPlayerAge() {
		return MinimumPlayerAge;
	}
protected int getMaximumNoPlayers() {
		return MaximumNoPlayers;
	}
//setters---
protected void setMaximumNoPlayers(int maximumNoPlayers) {
		MaximumNoPlayers = maximumNoPlayers;
	}
protected void setMinimumPlayerAge(int minimumPlayerAge) {
		MinimumPlayerAge = minimumPlayerAge;
	}
protected void setSalesTaxRate(double salesTaxRate) {
		SalesTaxRate = salesTaxRate;
	}
//to-string	
@Override
public String toString() {
		return "Constants [SalesTaxRate=" + SalesTaxRate + ", MaximumNoPlayers=" + MaximumNoPlayers
				+ ", MinimumPlayerAge=" + MinimumPlayerAge + "]";
	}
}
