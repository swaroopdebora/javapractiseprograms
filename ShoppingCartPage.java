package booksPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	// method with return type void and with arguments
	protected void add(int a, int b) {
		System.out.println("a+b is " + (a + b));
	}

	// private method with returntype
	private double add(double a, double b) {
		return (a + b);
	}

	// defualt method with return type
	String getCollageName() {
		return "Oxford Colage";
	}

	// method with return type void and without arguments
	public void add() {
		int a = 10;
		int b = 10;
		System.out.println("a+b is " + (a + b));
	}

	public static void main(String[] args) {
		ShoppingCartPage obj1 = new ShoppingCartPage();
		obj1.add();
		obj1.add(20, 20);
		obj1.add(10.00, 15.00);
		String mycollagename = obj1.getCollageName();
		System.out.println(mycollagename);

	}

}
