package assignment3;

public class twentyoneq {

	public static void main(String[] args) {
		int units = 380;  
          
        float billToPay = 0;  
         
        if(units < 100)  
        {  
            billToPay = units * 1.20f; 
            
        }  
         
        else if(units < 300){  
            billToPay = 100 * 1.20f + (units - 100) * 2;  
        }  
         
        else if(units > 300)  
        {  
            billToPay = 100 * 1.20f + 200 * 2 + (units - 300) * 3;  
        }  
        System.out.println("The electricity bill for " +units+ " is : " + billToPay);   
    } 
  


	}


