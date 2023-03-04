package com.estructuradatos.algoritmos.condicionales;

public class AnnalynsInfiltration {

    public static boolean canFastAttack(boolean knightIsAwake) {
       
    
        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFastAttack() method");

        
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
       
    	
    	throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");
    }


    public static void main(String[] args){
    	
    	boolean knightIsAwake = false;
    	boolean archerIsAwake = true;
    	boolean prisonerIsAwake = false;
    	boolean petDogIsPresent = false;
    	
    	
    	if (knightIsAwake) {
    		AnnalynsInfiltration.canFastAttack(knightIsAwake);
		}
    	
    	
    	if (knightIsAwake == false && knightIsAwake == true && prisonerIsAwake == false ) {
    		AnnalynsInfiltration.canSpy(knightIsAwake,knightIsAwake,prisonerIsAwake);
		}
    	
    	if (archerIsAwake == false && prisonerIsAwake == true) {
    		AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake);
		}
    	
        if (knightIsAwake == false && archerIsAwake ==true && prisonerIsAwake ==false && petDogIsPresent == false) {
        	 AnnalynsInfiltration.canFreePrisoner(knightIsAwake,archerIsAwake,prisonerIsAwake,petDogIsPresent);
		}
        
      
    }

}
