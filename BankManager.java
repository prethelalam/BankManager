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
		System.out.println("Are you a new customer? (enter y/n)");
		Scanner scan7 = new Scanner(System.in);
		String answer = scan7.nextLine();
		char Answer = answer.charAt(0);
		System.out.println();

		/*System.out.println("Would you like to open a checking account? Enter y/n.");
		Scanner scan2 = new Scanner(System.in);
		String option = scan2.nextLine();
		char decision = option.charAt(0); //this converts the string into a char
		System.out.println();*/
		

		if (Answer == 'y'){ //store this infomation in a text file. get/store customer age, sex, how much money they would like to deposit
			System.out.println("Would you like to open a checking account? Enter y/n.");
			Scanner scan2 = new Scanner(System.in);
			String option = scan2.nextLine();
			char decision = option.charAt(0); //this converts the string into a char
			System.out.println();

			//put option to make a savings account, maybe don't put it here 

			System.out.println("You have chosen to create a checking account! At this moment we will take some of your information.");
			System.out.println();

			System.out.println("Please enter the name you would like your account to be under.");
			Scanner scan3 = new Scanner(System.in);
			String CustomerName = scan3.nextLine();
			System.out.println();

			//System.out.print("The checking account will be under ");
			//System.out.println(CustomerName); PUT AT THE END FOR SUMMARY OF INFORMATION THEN BE LIKE INFO HAS BEEN STORED (maybe)
			//System.out.println();
			System.out.println("What is your current age?");
			Scanner scan4 = new Scanner(System.in);
			String age = scan4.nextLine();
			Integer Age = Integer.parseInt(age);
			System.out.println();

			System.out.println("What is your sex (M/F)?");
			Scanner scan5 = new Scanner(System.in);
			String sex = scan5.nextLine();
			char Sex = sex.charAt(0);
			System.out.println();

			System.out.println("How much money would you like to deposit into your checking account?");
			Scanner scan6 = new Scanner(System.in);
			String amount = scan6.nextLine();
			Double Deposit = Double.parseDouble(amount);
			System.out.println();

			try {
				File CheckingInformation = new File ("CustomerCheckingAccount.txt");

				if (!CheckingInformation.exists()){
					CheckingInformation.createNewFile();
				}
				PrintWriter WriteCheckingInformation = new PrintWriter(CheckingInformation);
				WriteCheckingInformation.println("The customers checking out information:");
				WriteCheckingInformation.println();
				WriteCheckingInformation.print("Customer name is ");
				WriteCheckingInformation.println(CustomerName);
				WriteCheckingInformation.print("Customer age is ");
				WriteCheckingInformation.println(Age);
				WriteCheckingInformation.print("Customers sex is ");
				WriteCheckingInformation.println(Sex);
				WriteCheckingInformation.print("Customers current balance: $");
				WriteCheckingInformation.println(Deposit);
				//other information asked by customer
				WriteCheckingInformation.close();
				System.out.println("Your information has been successfully saved!");
			}
			catch (IOException e){
				e.printStackTrace();
			}

		}

		else if (Answer == 'n'){
			System.out.println("Would you like to see how much is in your checking balance? (enter y/n)");
			Scanner scan8 = new Scanner(System.in);
			String response = scan8.nextLine();
			char Response = response.charAt(0);
			System.out.println();
			
			if (Response == 'y'){
			//read the checking account (balance)
			}

			if (Response == 'n'){
				//ask if they wanna deposit, withdraw money
			}
		}
	}
		static void Saving() {
				System.out.println("Would you like to create a savings account? (enter y/n)");
				Scanner scan9 = new Scanner (System.in);
				String input = scan9.nextLine();
				char Input = input.charAt(0);
				System.out.println();

				if (Input == 'y'){
					System.out.println("You have chosen to create a savings account! At this point we will take some information.");
					System.out.println();
					//create text file for savings account
				}
				else if (Input == 'n'){
					System.out.println("You have chosen not to create a saving account. Would you like to check your balance?");
					//ask if they want to deposit or withdraw money
			}
		}
	
		
		/*else if (decision == 'n'){
			System.out.println();
			System.out.println("You have opted into not creating a checking account."); //maybe add something here before welcome function
			Welcome();
		} */
		
	

	public static void main(String[] args) {
		Welcome();
		Checking();
		Saving();
	} 
}


/*
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
		} */