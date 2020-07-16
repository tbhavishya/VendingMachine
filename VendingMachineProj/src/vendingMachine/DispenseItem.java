package vendingMachine;

public class DispenseItem implements State{
	private  VendingMachine vendingmachine;
	

	public DispenseItem(VendingMachine vendingmachine) {
		this.vendingmachine = vendingmachine;
	}

	@Override
	public void collectCash(int cash) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispenseChange(String productCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispenseItem(String productCode) {
		vendingmachine.removeProduct(productCode);
		System.out.println("Dispensing Item:"+productCode);
		vendingmachine.setState(new Ready(this.vendingmachine));
		
	}

	@Override
	public void cancelTransaction() {
		// TODO Auto-generated method stub
		
	}

}
