package vendingMachine;

public class DispenseChange implements State{
	private VendingMachine vendingmachine;
	
	public DispenseChange(VendingMachine vendingmachine) {
		this.vendingmachine = vendingmachine;
	}

	@Override
	public void collectCash(int cash) {
throw new RuntimeException("Dispensing cash unable to collect");	
	}

	@Override
	public void dispenseChange(String productCode) {
		int change =this.vendingmachine.calculateChange(productCode);
		System.out.println("CHANGE OF" +change+"returned");
		this.vendingmachine.setState(new DispenseItem(this.vendingmachine));
		this.vendingmachine.dispenseItem(productCode);
		// TODO Auto-generate method stub
		
	}

	@Override
	public void dispenseItem(String productCode) {
		throw new RuntimeException("dispensing change unable to dispense Item");
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelTransaction() {
		throw new RuntimeException("Dispensing change unable to cancel") ;
		// TODO Auto-generated method stub
		
	}

}
