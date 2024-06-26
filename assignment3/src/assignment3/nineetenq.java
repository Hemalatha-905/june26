package assignment3;

public class nineetenq {

	public static void main(String[] args) {
		int age= 15;
		char g='F',s='U';
		if(s == 'M' || s== 'm')
		{			
			System.out.println("Driver should be Insured.");
		}
		else if(s == 'U' && g == 'M' && age > 30 || s == 'u' && g == 'm' && age > 30)
		{			
			System.out.println("Driver should be Insured.");
		}
		else if(s == 'U' && g == 'F' && age > 25 || s == 'u' && g == 'f' && age > 25)
		{			
			System.out.println("Driver should be Insured.");
		}
		else
		{			
			System.out.println("Driver should not be Insured.");
		}
	}
		
		

	}


