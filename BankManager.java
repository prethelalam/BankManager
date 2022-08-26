//package BankManager;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
//import java.io.*; //need to import this package in order to crate and write in files (by putting in * you can include all the classes you want to use (such as write and print)


public class BankManager {
	static void Welcome() {
		System.out.println("Welcome to Seamless Bank! Our repution is that we provide a seamless experience in many different transactions and creating various accounts for our clients!");
		System.out.println();
		System.out.println("What is your name?");
		Scanner scan1 = new Scanner(System.in);
		String name = scan1.nextLine();
		System.out.println();
		System.out.print("Welcome ");
		System.out.print(name);
		System.out.println("!");
		System.out.println();
	}

	static void Checking() {
		System.out.println("Would you like to open a checking account? Enter y/n.");
		Scanner scan2 = new Scanner(System.in);
		String option = scan2.nextLine();
		char decision = option.charAt(0); //this converts the string into a char
		System.out.println();

		if (decision == 'y'){ //store this infomation in a text file. get/store customer age, sex.
			System.out.println("You have chosen to create a checking account! At this moment we will take some of your information.");
			System.out.println();
			System.out.println("Please enter the name you would like your account to be under.");
			Scanner scan3 = new Scanner(System.in);
			String CustomerName = scan3.nextLine();
			System.out.println();
			System.out.print("The checking account will be under ");
			System.out.println(CustomerName);
		}
		else if (decision == 'n'){
			System.out.println();
			System.out.println("You have opted into not creating a checking account."); //maybe add something here before welcome function
			Welcome();
		}
	}

	public static void main(String[] args) {
		Welcome();
		Checking();

		try { //implement this in the checking function
		File CheckingInformation = new File("CustomerCheckingInformation.txt"); // so we name the file then we create a new file and named it CustomerCheckingInformation

		if (!CheckingInformation.exists()){ //here we are checking if the file exists
			CheckingInformation.createNewFile(); 
		}
		PrintWriter WriteInformation = new PrintWriter(CheckingInformation);
		WriteInformation.println("This is my file content");
		WriteInformation.close();
		System.out.println("Done");
		}
		catch (IOException e){
			e.printStackTrace(); //this is a try catch block
		}
	}
}

