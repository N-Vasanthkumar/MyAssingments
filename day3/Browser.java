package week1.day3;

public class Browser {

	public String launchBrowser (String browserName) {
		
		return browserName;
	
	}
	
	
	public void loadURL() {

		
	System.out.println("Application url loaded successfully");
	}
	
	public static void main(String[] args) {
		
		Browser browser= new Browser();
				browser.launchBrowser("Browser launch successfully");
		browser.loadURL();
				
	}

}
