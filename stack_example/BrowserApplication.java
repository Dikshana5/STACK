package stack_example;

public class BrowserApplication {

	public static void main(String[] args) {
		Browser obj = new Browser();
		obj.visit("abc.com");
		obj.visit("google.com");
		obj.visit("youtube.com");
		obj.visit("instagram.com");
		obj.showAllHistory();
		obj.back();
		obj.getCurrentPage();
		obj.showAllHistory();
	}

}
