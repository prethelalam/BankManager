//package BankManager;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
//import java.io.PrintWriter;
import java.io.*; //need to import this package in order to crate and write in files (by putting in * you can include all the classes you want to use (such as write and print)


public class BankManager {
	static void Welcome() {
		System.out.println();
		System.out.println("Welcome to Seamless Bank! Our repution is that we provide a seamless experience in many different transactions and creating various accounts for our clients!");
		System.out.println();
		System.out.println("What is your name?");
		Scanner scan1 = new Scanner(System.in);
		String name = scan1.nextLine();
		System.out.println();
		System.out.println("Welcome " + name + "!");
		System.out.println();
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

	static void Checking(){System.out.println("You have chosen to create a checking account! At this moment we will take some of your information.");
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
				WriteCheckingInformation.println("Customer name is " + CustomerName);
				WriteCheckingInformation.println("Customers age is " + Age);
				WriteCheckingInformation.println("Customers sex is " + sex);
				WriteCheckingInformation.println(/*"Customers current balance: $" +*/ Deposit);
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
						WriteSavingInformation.println("Customers current balance: $" + Deposit);
						WriteSavingInformation.close();
						System.out.println("Your information has been successfully saved! Thank you for providing your business to Seamless Bank. Come back soon!");
						System.out.println();
					}
					catch (IOException e){
						e.printStackTrace();
					}
		}

//make a checking and savings function
	static void Accounts() {
		System.out.println("Are you a new customer? (enter yes/no)"); //lets change this to lets create a savings, checking since they will be new the first time they run it
		Scanner scan7 = new Scanner(System.in);
		String answer = scan7.nextLine();
		//char Answer = answer.charAt(0);
		System.out.println();

		if (answer.equals("yes")){ 
			System.out.println("Would you like to open a checking account or a savings account? (Enter checking to create a checking account and enter saving to create a savings account)");
			Scanner scan2 = new Scanner(System.in);
			String option = scan2.nextLine();
			//char decision = option.charAt(0); //this converts the string into a char
			System.out.println();

			if (option.equals("checking")){
				Checking();
				WelcomeBack();
			}

			else if (option.equals("saving")){
				Saving();
				WelcomeBack();
			}
		}

		//so after making a checking for a new customer, you arent new anymore, so give the option to make a savings after they finish making a checking. do the same for if you make a savings account first
		// can ask if you would like to make a savings account. if not then you can do would you like to access your checking or savings account (but you dont have a savings)
		else if (answer.equals("no")){
			System.out.println("Would you like to access your checking or savings account? (Enter checking to access your checking account and enter saving to access your savings account)");
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
					String text = "";
					int lineNumber;

					try { //this is to read files
						FileReader readfile = new FileReader("CustomerCheckingAccount.txt");
						BufferedReader readbuffer = new BufferedReader(readfile);

						for (lineNumber = 1; lineNumber < 7; lineNumber++) { //set up a for condition
        					if (lineNumber == 6) {
								text = readbuffer.readLine();
							} 
							else {
								readbuffer.readLine();
							}
							}
							} 
							catch (IOException e) {
    						e.printStackTrace();
    					}
					System.out.println(text);
					// thank you (end)
						}
					
				

				else if (selection.equals("deposit")){
					//ask if they wanna deposit (add to current balance)
					//String text = ""; //maybe take out quotes
					//Double Text = Double.parseDouble(text);
					int lineNumber;
					Double money;
					
					System.out.println("How much money would you like to deposit?");
					Scanner scan19 = new Scanner(System.in);
					String capture = scan19.nextLine();
					Double Capture = Double.parseDouble(capture);
					System.out.println();

						try {
							FileReader readfile = new FileReader("CustomerCheckingAccount.txt");
							BufferedReader readbuffer = new BufferedReader(readfile);

							for (lineNumber = 1; lineNumber < 7; lineNumber++){

								if (lineNumber == 6){
									String word; // = Double.parseDouble(text);
									word = readbuffer.readLine();
									Double Word = Double.parseDouble(word);
									
									Double cash;
									cash = Word + Capture;
									System.out.println(cash);

									//SO WHAT IF I READ EVERY LINE INSTEAD AND BASICALLY REINPUT THE SAME STRINGS AND JSUT CHANGE THE AMOUNT. YOU COULD DO THAT (just store it in different varaible names)- like you read a line in balance but then for deposit you stored it under word and were able to add to it
									
									/*File FileToBeModified = new File("CustomerCheckingAccount.txt");
									String oldContent = "";
									BufferedReader reader = new BufferedReader(new FileReader(FileToBeModified));
									String line = reader.readLine();

									while (line != null){
										oldContent = Word + line + System.lineSeparator();
										line = reader.readLine();
									}
									String NewContent = oldContent.replaceALL(Word, cash);
									FileWriter writer = new FileWriter(FileToBeModified);

									Double newContent = Double.parse(NewContent);
									writer.write(newContent);

									reader.close();
									writer.close(); */
								}
								else{
									readbuffer.readLine();
								}
								}
								}
								catch (IOException e) {
									e.printStackTrace();
								}
									
							
						
					//option to check balance
				}

				else if (selection.equals("withdraw")){
					//withdraw money from current balance 

					//option to check balance
				}
			}
			
			
			else if (response.equals("saving")){
				System.out.println("For your saving account: Would you like to see your balance, deposit money, or withdraw money? (enter balance for balance, deposit for deposit, or withdraw for withdraw)");
				Scanner scan14 = new Scanner(System.in);
				String selection = scan14.nextLine();
				System.out.println();

				if (selection.equals("balance")){
					//read balance 
					String text = "";
					int lineNumber;

					try {
						FileReader readfile = new FileReader("CustomerSavingsAccount.txt");
						BufferedReader readbuffer = new BufferedReader(readfile);

						for (lineNumber = 1; lineNumber < 7; lineNumber++){
							if (lineNumber == 6){
								text = readbuffer.readLine();
							}
							else {
								readbuffer.readLine();
							}
							}
						}
						catch (IOException e){
							e.printStackTrace();
						}
						System.out.println(text);
						//thank you (end)
					}
				

				else if (selection.equals("deposit")){
					//deposit money (add to current balance)

					//option to check balance
				}

				else if (selection.equals("withdraw")){
					//withdraw money from current balance 

					//option to check balance
				}
			}
		}
	}
		

	public static void main(String[] args) {
		Welcome();
		Accounts();

		//maybe make a function for a deposit? 
		//maybe make how much the wanna deposit into a function? pass in information
		//double deposit;
		//MoneyInAccount(deposit);
	}
}
	