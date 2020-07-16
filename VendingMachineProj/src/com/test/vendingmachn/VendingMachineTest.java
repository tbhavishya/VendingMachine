package com.test.vendingmachn;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import vendingMachine.DispenseChange;
import vendingMachine.Ready;
import vendingMachine.State;
import vendingMachine.VendingMachine;


class VendingMachineTest {

	
	  VendingMachine vm = new VendingMachine();
	 
     private  Map<String, Integer> productCodePriceMap = new HashMap<String, Integer>();

	   
	    @AfterClass
	    public  void tearDown(){
	        vm = null;
	    }
	    @Test
	    public void testIntialCash() {
	    	State s = new Ready(vm);
	    	System.out.println(vm);
	    	s.collectCash(25);
	    	assertEquals(25, vm.getCollectedCash());
	    }
	    
	    @Test
	    public void testDispenseChange() {

	        productCodePriceMap.put("COKE",25);
	        productCodePriceMap.put("SODA",50);
	        productCodePriceMap.put("PEPSI",75);
	        vm.setProductCodePriceMap(productCodePriceMap);
	    	State s = new DispenseChange(vm);
	        vm.addCollectedCash(75);
	    	s.dispenseChange("SODA");
	    }
	    @Test
	    public void testDispenseitem() {
	    	
	    }
}
