//package BankManager;
import java.util.Scanner;

public class BankManager {
	static void Bank() {
		System.out.println("Welcome to Seamless Bank! Our repution is that we provide a seamless experience in many different transactions and creating various accounts for our clients!");
		System.out.println();
		System.out.println("What is your name?");
		Scanner scan1 = new Scanner(System.in);
		String name = scan1.nextLine();
		System.out.println();
		System.out.print("Welcome ");
		System.out.println(name);
	}

	public static void main(String[] args) {
		Bank();
	}
}

