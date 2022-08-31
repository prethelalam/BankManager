//package BankManager;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
//import java.io.PrintWriter;
import java.io.*; //need to import this package in order to crate and write in files (by putting in * you can include all the classes you want to use (such as write and print)


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

	static void WelcomeBack(){
		System.out.println("Welcome back to Seamless bank! Lets assist you in whatever you may need!");
	}
//make a checking and savings function
	static void Accounts() {
		System.out.println("Are you a new customer? (enter y/n)");
		Scanner scan7 = new Scanner(System.in);
		String answer = scan7.nextLine();
		char Answer = answer.charAt(0);
		System.out.println();

		if (Answer == 'y'){ 
			System.out.println("Would you like to open a checking account or a savings account? Enter checking for checking and saving for savings.");
			Scanner scan2 = new Scanner(System.in);
			String option = scan2.nextLine();
			//char decision = option.charAt(0); //this converts the string into a char
			System.out.println();

			if (option.equals("checking")){
			System.out.println("You have chosen to create a checking account! At this moment we will take some of your information.");
			System.out.println();

			System.out.println("Please enter the name you would like your account to be under.");
			Scanner scan3 = new Scanner(System.in);
			String CustomerName = scan3.nextLine();
			System.out.println();

			System.out.println("What is your current age?");
			Scanner scan4 = new Scanner(System.in);
			String age = scan4.nextLine();
			Integer Age = Integer.parseInt(age);
			System.out.println();

			System.out.println("What is your sex (Male/Female)?");
			Scanner scan5 = new Scanner(System.in);
			String sex = scan5.nextLine();
			//char Sex = sex.charAt(0);
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
				WriteCheckingInformation.println("The customers checking account information:");
				WriteCheckingInformation.println();
				WriteCheckingInformation.print("Customer name is ");
				WriteCheckingInformation.println(CustomerName);
				WriteCheckingInformation.print("Customers age is ");
				WriteCheckingInformation.println(Age);
				WriteCheckingInformation.print("Customers sex is ");
				WriteCheckingInformation.println(sex);
				WriteCheckingInformation.print("Customers current balance: $");
				WriteCheckingInformation.println(Deposit);
				WriteCheckingInformation.close();
				System.out.println("Your information has been successfully saved! Thank you for providing your business to Seamless Bank. Come back soon!");
				System.out.println();
			}
			catch (IOException e){
				e.printStackTrace();
			}
			WelcomeBack();
			Accounts();
			}

			else if (option.equals("saving")){
				System.out.println("You have chosen to create a savings account! At this point we will take some information.");
					System.out.println();

					System.out.println("Please enter the name you would like your account to be under.");
					Scanner scan10 = new Scanner(System.in);
					String name = scan10.nextLine();
					System.out.println();
					
					System.out.println("What is your current age?");
					Scanner scan11 = new Scanner(System.in);
					String age = scan11.nextLine();
					Integer Age = Integer.parseInt(age);
					System.out.println();

					System.out.println("What is your sex (M/F)");
					Scanner scan12 = new Scanner(System.in);
					String sex = scan12.nextLine();
					//char Sex = sex.charAt(0);
					System.out.println();

					System.out.println("How much would you like to deposit into your savings account?");
					Scanner scan13 = new Scanner(System.in);
					String deposit = scan13.nextLine();
					Double Deposit = Double.parseDouble(deposit);
					System.out.println();

					try {
						File SavingInformation = new File ("CustomerSavingsAccount.txt");

						if (!SavingInformation.exists()){
							SavingInformation.createNewFile();
						}
						PrintWriter WriteSavingInformation = new PrintWriter (SavingInformation);
						WriteSavingInformation.println("The customers savings account information:");
						WriteSavingInformation.println();
						WriteSavingInformation.print("Customer name is ");
						WriteSavingInformation.println(name);
						WriteSavingInformation.print("Customers age is ");
						WriteSavingInformation.println(Age);
						WriteSavingInformation.print("Customers sex is ");
						WriteSavingInformation.println(sex);
						WriteSavingInformation.print("Customers current balance: $");
						WriteSavingInformation.println(Deposit);
						WriteSavingInformation.close();
						System.out.println("Your information has been successfully saved! Thank you for providing your business to Seamless Bank. Come back soon!");
						System.out.println();
					}
					catch (IOException e){
						e.printStackTrace();
					}
					WelcomeBack();
					Accounts();
			}
		}

		//so after making a checking for a new customer, you arent new anymore, so give the option to make a savings after they finish making a checking. do the same for if you make a savings account first
		// can ask if you would like to make a savings account. if not then you can do would you like to access your checking or savings account (but you dont have a savings)
		else if (Answer == 'n'){
			System.out.println("Would you like to access your checking or savings account. (Enter checking for checking and saving for saving)");
			Scanner scan8 = new Scanner(System.in);
			String response = scan8.nextLine();
			System.out.println();
			
			if (response.equals("checking"))
			{
				System.out.println("For your checking account: Would you like to see your balance, deposit money, or withdraw money? (enter balance for balance, deposit for deposit, or withdraw for withdraw)");
				Scanner scan15 = new Scanner(System.in);
				String selection = scan15.nextLine();
				System.out.println();

				if (selection.equals("balance")){
					//read the checking account (balance)
				}

				else if (selection.equals("deposit")){
					//ask if they wanna deposit (add to current balance)
				}

				else if (selection.equals("withdraw")){
					//withdraw money from current balance 
				}
			}

			else if (response.equals("saving")){
				System.out.println("For your saving account: Would you like to see your balance, deposit money, or withdraw money? (enter balance for balance, deposit for deposit, or withdraw for withdraw)");
				Scanner scan14 = new Scanner(System.in);
				String selection = scan14.nextLine();
				System.out.println();

				if (selection.equals("balance")){
					//read balance 
				}

				else if (selection.equals("deposit")){
					//deposit money (add to current balance)
				}

				else if (selection.equals("withdraw")){
					//withdraw money from current balance 
				}
			}
		}
	}	

	public static void main(String[] args) {
		Welcome();
		Accounts();
	} 
}	