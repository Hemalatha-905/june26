package assignment3;

public class twentyfourq {

	public static void main(String[] args) {
		int a=4;
		String branch="cse";
		switch (a) 
		{
		case 1:
			System.out.println("first year");
			switch(branch)
			{
				case "eee":
		        	System.out.println("english,maths,physics,chemistry");
		        	break;
		        case "ece":
					System.out.println("english,maths,physics,chemistry");
					break;
					
		        case "mech":
		        	System.out.println("english,maths,physics,chemistry");
		        	break;
		        case "civil":
					System.out.println("english,maths,physics,chemistry");
					break;
		        case "cse":
					System.out.println("english,maths,physics,chemistry");
					break;
		        default:
					System.out.println("enter correct value");	
					break;
		}
			break;
		case 2:
			System.out.println("second year");
			switch(branch) {
			
			
	    	case "cse":
				System.out.println("ppl,python,computer architecture");
				break;
	    	case "eee":
	    		System.out.println("bee, control system,measurements");
	    		break;
	    	case "ece":
				System.out.println("electronics and circuits,digital system");
				break;
	    	case "mech":
				System.out.println("basic fundamentals,principles");
				break;
	    	case "civil":
				System.out.println("properties,hydraulics");
				break;
	    	default:
				System.out.println("enter correct value");	
				break;
	    	
	    }
			break;
		case 3:
			System.out.println("third year");
			switch(branch) {
			
			case "cse":
				System.out.println("os,java,computer networks");
				break;
			case "eee":
				System.out.println("transducers,rotating ac machines,fundamentals of eee");
				break;
				
			case "ece":
				
				System.out.println("bee,digital system");
				break;
				
			case "mech":
				System.out.println("dynamics of machinery,manufacturing technology");
				break;
			case "civil":
				System.out.println("solid mechanics ,rc structures");
				break;
			default:
				System.out.println("enter correct value");	
				break;
	    }
			break;
		case 4: 
			System.out.println("fourth year");
			switch(branch) {
			
			
			case "cse":
				
				System.out.println("database,sdlc,os");
				break;
			case "eee":
				System.out.println("power system,dc machines, transformer");
				break;
			case "ece":
				System.out.println("micro controllers,integrated circuits");
				break;
			case "mech":
				System.out.println("electrical machines,design of machine elements");
				break;
			case "civil":
				System.out.println("elective ,project");
				break;
			default:
				System.out.println("enter correct value");	
				break;
	    }
			break;
				
		default:
			System.out.println("enter value from 1 to 4");
		

	}

	}
}
