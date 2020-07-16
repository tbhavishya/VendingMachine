package vendingMachine;

public class TransactionCancelled implements State {
	private VendingMachine vendingMachine;

	public TransactionCancelled(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelTransaction() {

		System.out.println("Returning Collected Cash:"+vendingMachine.getCollectedCash());
		vendingMachine.setCollectedCash(0);
		vendingMachine.setState(new Ready(vendingMachine));
	}
	

}
