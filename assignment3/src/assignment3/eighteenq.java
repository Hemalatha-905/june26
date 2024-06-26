package assignment3;

public class eighteenq {

	public static void main(String[] args) {
		int a=75,b=53,c=73;
		int tot=a+b+c;
		float pt = tot/3;
		
		System.out.println("Percentage :"+pt);	
		if(pt>=60)
		{			
			System.out.println("First Division.");
		}
		else if(pt>=50 && pt<=59)
		{			
			System.out.println("Second Division.");
		}
		else if(pt>=40 && pt<=49)
		{			
			System.out.println("Third  Division.");
		}
		else
		{			
			System.out.println("Fail.");
		}
	}

	}


