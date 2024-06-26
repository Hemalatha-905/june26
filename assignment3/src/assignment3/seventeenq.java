package assignment3;

public class seventeenq {
	public static void main(String [] args) {
		int a =86,b=74,c=34,d,e;
		d=a+b+c;
		e=d/3;
		if (e>=80)
			System.out.println("Grade A with :"+e);
		else if (e>=60 && e<80)
			System.out.println("Grade B with :"+e);
		else if (e>=40 && e<60)
			System.out.println("Grade C with :"+e);
		else
			System.out.println("Grade D with :"+e);
	}

}
