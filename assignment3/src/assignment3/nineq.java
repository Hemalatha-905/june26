package assignment3;

public class nineq {
	public static void main(String[] args) {
		char a='#';
		if(a>='0' && a<='9')
			System.out.println("digit");
		else if (a>= 'a' && a<='z' || a>='A' && a<='Z')
			System.out.println(" alphabet");
		else
			System.out.println("special symbol");
	}

}
