package ConditionalStatements;

public class NestedIf {

	public static void main(String[]args){
		
		String browser = "safari";
		
		if(browser.equalsIgnoreCase("Firefox")){
			
			System.out.println("The browser is " + browser);
			
		}
		
		else if(browser.equalsIgnoreCase("chrome")){
			
			System.out.println("The browser is " + browser);
		}
		
		
		else if (browser.equalsIgnoreCase("IE")){
			
			System.out.println("The browser is " + browser);
		}
		
		else
			
			System.out.println("please provide another browser name");
		}
		
	}

