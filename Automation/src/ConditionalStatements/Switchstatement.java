package ConditionalStatements;

public class Switchstatement {

	public static void main(String[] args) {
		
		String browser = "firefox";
		
		switch(browser){
			
			case "firefox":
				
				System.out.println("The test cases are executed on firefox");
				
				//break;
				
				
			case "chrome":
				
				System.out.println("The test cases are executed on chrome ");
				
				//break;
				
			case "IE":
				
				System.out.println("The test cases are executed on IE");
				
				//break;
				
			default :
			
			System.out.println("it is not matching with the provided browsers");
		}
		
		
	}

}
