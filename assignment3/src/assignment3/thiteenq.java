package assignment3;

public class thiteenq {

	public static void main(String[] args) {
		int n=2616;
		
	    if (n/1000>=0 && (n%1000)/500>=0 && ((n%1000)%500)/100>=0 && ((n%1000)%500)/10>=0 && (((n%1000)%500)%10)/5>=0 && ((((n%1000)%500)%10)/5)/2>=0 && (((((n%1000)%500)%10)/5)/1)>=0 )                      
	    {
	   
	    
			System.out.println("1000 rupes notes=" +n/1000);
	        System.out.println("500 rupes notes=" +(n%1000)/500);
	        System.out.println("100 rupes notes=" +((n%1000)%500)/100);
	        System.out.println("10 rupes notes=" +((n%1000)%500)/10);
	        System.out.println("5 rupes notes=" +(((n%1000)%500)%10)/5);
	        System.out.println("2 rupes notes=" +((((n%1000)%500)%10)/5)/2);
	        System.out.println("1 rupes notes=" +((((n%1000)%500)%10)/5)/1);
	        
	        
	        
	    }
	    
	    else
	    	System.out.println("zero 1000 rupes notes");
				
					

	}

}

