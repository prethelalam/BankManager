//package BankManager;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.text.NumberFormat;
//import java.io.PrintWriter;
import java.io.*; //need to import this package in order to crate and write in files (by putting in * you can include all the classes you want to use (such as write and print)


public class BankManager {
	public static Double Deposit;
	static void Welcome(ArrayList <String> namearray, Scanner scan1, ArrayList <Double> checkingArray, ArrayList <Double> savingArray) {
		

		System.out.println();
		System.out.println("Welcome to Seamless Bank! Our repution is that we provide a seamless experience in many different transactions and creating various accounts for our clients!");
		System.out.println("Are you a new or exisiting customer? (enter new or existing)");

		//Scanner scan1 = new Scanner(System.in);
		String response = scan1.next();

		if (response.equals("new")){
			System.out.println("What is your name?");
			Scanner scan4 = new Scanner(System.in);
			String name = scan4.nextLine();
			namearray.add(name); //so here we are adding name into the namearray
			System.out.println();
			System.out.println("Welcome " + name);
			System.out.println();
			System.out.println("Would you like to open a checking account or a savings account? (Enter checking to create a checking account and enter saving to create a savings account)");
			
			response = scan1.next();

			if (response.equals("checking")){
				Checking();
			}
			else {
				Saving();
			}

		}

		else {
			System.out.println("What is your name?");
			Scanner scan2 = new Scanner(System.in);
			String name = scan2.nextLine();

			System.out.println("Welcome " + name);
			System.out.println();
			int nameIndex = namearray.indexOf(name); //this is saving the index (place value in the arraylist) of the name

			System.out.println("Would you like to access your checking or savings account? (Enter checking for checking and saving for savings)");
			Scanner scan3 = new Scanner(System.in);
			response = scan3.nextLine();

			if (response.equals("checking"))
			{
				checkingATM(nameIndex, checkingArray);
			}
			else {
				savingATM(nameIndex, savingArray);
			}
		}

		
		
	}

	static void WelcomeBack(){
		System.out.println("Welcome back to Seamless bank! Lets assist you in whatever you may need!"); 
		System.out.println();
		System.out.println("Lets create another account, wheather that be a checking or savings account? (Enter checking to create a checking account and enter saving to create a savings account)"); //lets change this to accessing to checking or saving
		Scanner scan17 = new Scanner(System.in);
		String choice = scan17.nextLine();
		System.out.println();
		
		if (choice.equals("checking")){
			Checking();
		}

		else if (choice.equals("saving")){
			Saving();
		}
	}

	static void Checking(){
			System.out.println("You have chosen to create a checking account! At this moment we will take some of your information.");
			System.out.println();

			System.out.println("Please enter the name you would like your account to be under.");
			Scanner scan3 = new Scanner(System.in);
			String CustomerName = scan3.nextLine();
			System.out.println();

			System.out.println("What is your current age?");
			Scanner scan4 = new Scanner(System.in);
			String age = scan4.nextLine();
			//Integer Age = Integer.parseInt(age);
			System.out.println();

			System.out.println("What is your sex (Male/Female)?");
			Scanner scan5 = new Scanner(System.in);
			String sex = scan5.nextLine();
			//char Sex = sex.charAt(0);
			System.out.println();

			System.out.println("How much money would you like to deposit into your checking account?");
			Scanner scan6 = new Scanner(System.in);
			String amount = scan6.nextLine();
			BankManager.Deposit = Double.parseDouble(amount);
			System.out.println();

			try {
				File CheckingInformation = new File ("CustomerCheckingAccount.txt");

				if (!CheckingInformation.exists()){
					CheckingInformation.createNewFile();
				}
				PrintWriter WriteCheckingInformation = new PrintWriter(CheckingInformation);
				WriteCheckingInformation.println("The customers checking account information:");
				WriteCheckingInformation.println();
				WriteCheckingInformation.println("Customer name is " + CustomerName);
				WriteCheckingInformation.println("Customers age is " + age);
				WriteCheckingInformation.println("Customers sex is " + sex);
				WriteCheckingInformation.println("Customers current balance:"); //seperate the sentence and amount on different lines and read only the price in ATM function
				WriteCheckingInformation.println(Deposit);
				WriteCheckingInformation.close();
				System.out.println("Your information has been successfully saved! Thank you for providing your business to Seamless Bank. Come back soon!");
				System.out.println();
			}
			catch (IOException e){
				e.printStackTrace();
			}
		}

		static void Saving (){
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

					System.out.println("What is your sex (Male/Female)");
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
						WriteSavingInformation.println("Customer name is " + name);
						WriteSavingInformation.println("Customers age is " + Age);
						WriteSavingInformation.println("Customers sex is " + sex);
						WriteSavingInformation.println("Customers current balance:");
						WriteSavingInformation.println(Deposit);
						WriteSavingInformation.close();
						System.out.println("Your information has been successfully saved! Thank you for providing your business to Seamless Bank. Come back soon!");
						System.out.println();
					}
					catch (IOException e){
						e.printStackTrace();
					}
		}

static void checkingATM(int index, ArrayList <Double> checkingATM){
		System.out.println("For your checking account: Would you like to see your balance, deposit money, or withdraw money? (enter balance for balance, deposit for deposit, or withdraw for withdraw)");
		Scanner scan15 = new Scanner(System.in);
		String selection = scan15.nextLine();
		System.out.println();

		if (selection.equals("balance")){
			System.out.println("Your balance is: $" + checkingATM.get(index));
				}

		else if (selection.equals("deposit")){
			System.out.println("How much would you like to deposit?");
			Scanner scan5 = new Scanner(System.in);
			Double depositAmount = scan5.nextDouble(); //this is something else you can do to read doubles
			Double intialBalance = checkingATM.get(index);
			Double NewBalance = intialBalance + depositAmount;
			checkingATM.set(index, NewBalance);
			System.out.println("Your new balance is: $" + NewBalance);
		
			}

		else if (selection.equals("withdraw")){
			System.out.println("How much would you like to withdraw?");
			Scanner scan6 = new Scanner(System.in);
			Double withdrawAmount = scan6.nextDouble();
			Double intialBalance = checkingATM.get(index);
			Double NewBalance = intialBalance - withdrawAmount;
			checkingATM.set(index, NewBalance);
			System.out.println("Your new balance is: $" + NewBalance);
		}
	}
//}
			
			//else if (response.equals("saving")){
				static void savingATM(int index, ArrayList <Double> savingATM){
				System.out.println("For your saving account: Would you like to see your balance, deposit money, or withdraw money? (enter balance for balance, deposit for deposit, or withdraw for withdraw)");
				Scanner scan14 = new Scanner(System.in);
				String selection = scan14.nextLine();
				System.out.println();

				if (selection.equals("balance")){
					System.out.println("Your balance is: $" + savingATM.get(index));
					}
				
				else if (selection.equals("deposit")){
					System.out.println("How much would you like to deposit");
					Scanner scan6 = new Scanner(System.in);
					Double depositAmount = scan6.nextDouble();
					Double initialBalance = savingATM.get(index);
					Double NewBalance = initialBalance + depositAmount;
					savingATM.set(index, NewBalance);
					System.out.println("Your new balance is: $" + NewBalance);
				}

				else if (selection.equals("withdraw")){
					System.out.println("How much would you like to withdraw?");
					Scanner scan7 = new Scanner(System.in);
					Double withdrawAmount = scan7.nextDouble();
					Double intialBalance = savingATM.get(index);
					Double NewBalance = intialBalance - withdrawAmount;
					savingATM.set(index, NewBalance);
					System.out.println("Your new balance is: $" + NewBalance);
				}
			//}
				}
		
	//}

	public static void main(String[] args) {
		
		// Accounts();
		ArrayList <Double> checkingBalance = new ArrayList<>();
		ArrayList <Double> savingsBalance = new ArrayList<>();


		ArrayList <String> name = new ArrayList<>(); 
		name.add("Prethel Alam");
		checkingBalance.add(23.23);
		savingsBalance.add(100.21);

		Scanner scan1 = new Scanner(System.in);
		Welcome(name, scan1, checkingBalance, savingsBalance);
		//System.out.println(name.get(0));
	


		//array list: the size of the array list is changable (you can add or subtract spaces or locations) but you cant do that in an array 
	}
}
//}
	