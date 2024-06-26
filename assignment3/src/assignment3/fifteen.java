package assignment3;

public class fifteen {

	public static void main(String[] args) {
		int a=34,b=34,c=34;
		
		if (a==b &&b==c)
			System.out.println("Its a equilateral triangle");
		else if (a==b || b==c  || a==c)
			System.out.println("Its  a isosceles triangle");
		else
			System.out.println("Scalane triangle");
	}

}
