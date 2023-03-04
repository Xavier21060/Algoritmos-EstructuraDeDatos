package com.estructuradatos.algoritmos.condicionales;

public class Calculate {

	
	  public  int expectedMinutesInOven(){
	        return 40;
	    }

	    public  int remainingMinutesInOven(int n){
	        int x = expectedMinutesInOven()-n;
	        return x;
	    }

	    public  int preparationTimeInMinutes(int n){
	        int x = n * 2;

	        return x;
	    } 

	    public  int totalTimeInMinutes(int a, int b){

	        int time = preparationTimeInMinutes(a) + b;
	            
	        return time;
	        
	    }
	    
	    public static void main(String[] args) {
			
	    	
	    	Calculate calculate = new Calculate();
	    	int a = calculate.expectedMinutesInOven();
	    	System.out.println(a);
	    	
	    	System.out.println(calculate.remainingMinutesInOven(10));
	    	System.out.println(calculate.preparationTimeInMinutes(3));
	    	System.out.println(calculate.totalTimeInMinutes(3, 20));
		}
}
