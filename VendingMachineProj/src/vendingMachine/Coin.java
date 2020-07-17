package vendingMachine;


	public enum Coin {
	    PENNY(1), NICKLE(5), DIME(20), QUARTER(25);
	   
	    private int denomination;
	   
	    private Coin(int denomination){
	        this.denomination = denomination;
	    }
	   
	    public int getDenomination(){
	        return denomination;
	    }
	}



