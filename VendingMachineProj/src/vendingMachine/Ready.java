package vendingMachine;

public class Ready implements State{
    private VendingMachine vendingmachine;
    
    public Ready(VendingMachine vendingmachine) {
		this.vendingmachine = vendingmachine;
	}
	@Override
	public void collectCash(int cash) {
		this.vendingmachine.addCollectedCash(cash);
		
	}

	

	

	@Override
	public void dispenseChange(String productCode) {
		this.vendingmachine.setState(new DispenseChange(this.vendingmachine));
		this.vendingmachine.dispenseChange(productCode);
		
	}

	@Override
	public void dispenseItem(String productCode) {
		throw new RuntimeException("trasaction not started unable to dispense item");
		
	}

	@Override
	public void cancelTransaction() {
		this.vendingmachine.setState(new TransactionCancelled(vendingmachine));
		this.vendingmachine.cancelTransaction();
		
		
	}

}
