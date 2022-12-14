import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.text.NumberFormat;
import java.io.*; //need to import this package in order to create and write in files (by putting in * you can include all the classes you want to use (such as write and print))


public class BankManager {
	static void Welcome(ArrayList <String> namearray, Scanner scan1, ArrayList <Double> checkingArray, ArrayList <Double> savingArray) {

		System.out.println();
		System.out.println("Welcome to Seamless Bank! Our repution is that we provide a seamless experience in many different transactions and creating various accounts for our clients!");
		System.out.println();
		System.out.println("Are you a new or exisiting customer? (enter new or existing)");
		String response = scan1.next();
		System.out.println();

		if (response.equals("new")){
			System.out.println("Would you like to open a checking account or a savings account? (Enter checking to create a checking account and enter saving to create a savings account)");
			response = scan1.next();
			System.out.println();

			if (response.equals("checking")){
				Checking(namearray, checkingArray, savingArray);
				System.out.println("Thank you for your service, come back soon!");
			}
			else {
				Saving(namearray, checkingArray, savingArray);
				System.out.println("Thank you for your service, come back soon!");
			}

		}

		else {
			WelcomeBack(namearray, checkingArray, savingArray);
		}
	}

	static void WelcomeBack(ArrayList <String> nameArray, ArrayList <Double> checkingArray, ArrayList <Double> savingArray){
		System.out.println("Welcome back to Seamless bank! Lets assist you in whatever you may need!"); 
			System.out.println();
			System.out.println("What is your name?");
			Scanner scan2 = new Scanner(System.in);
			String name = scan2.nextLine();
			System.out.println();

			System.out.println("Welcome " + name);
			System.out.println();
			int nameIndex = nameArray.indexOf(name); //this is saving the index (place value in the arraylist) of the name

			System.out.println("Would you like to access your checking or savings account or leave the store? (Enter checking for checking, saving for savings, enter leave to leave the store)");
			Scanner scan3 = new Scanner(System.in);
			String response = scan3.nextLine();

			while (true){
				if (response.equals("checking"))
				{
					checkingATM(nameIndex, checkingArray);
					System.out.println("Would you like to access your checking or savings account or leave the store? (Enter checking for checking, saving for savings, enter leave to leave the store)");
					response = scan3.nextLine();
					System.out.println();

				}
				else if (response.equals("saving")) {
					savingATM(nameIndex, savingArray);
					System.out.println("Would you like to access your checking or savings account or leave the store? (Enter checking for checking, saving for savings, enter leave to leave the store)");
					response = scan3.nextLine();
					System.out.println();
				}
				else {
					System.out.println("Thank you for using our service. Come back soon!");
					break; //this breaks you out of the loop 
				}
			}
	}

	static void Checking(ArrayList <String> namearray, ArrayList <Double> checkingArray, ArrayList <Double> savingArray){
			System.out.println("You have chosen to create a checking account! At this moment we will take some of your information.");
			System.out.println();

			System.out.println("Please enter the name you would like your account to be under.");
			Scanner scan3 = new Scanner(System.in);
			String CustomerName = scan3.nextLine();
			System.out.println();
			namearray.add(CustomerName);

			System.out.println("How much money would you like to deposit into your checking account?");
			Scanner scan6 = new Scanner(System.in);
			String amount = scan6.nextLine();
			Double Deposit = Double.parseDouble(amount);
			System.out.println();
			checkingArray.add(Deposit);

			savingArray.add(0.0);
		}

		static void Saving (ArrayList <String> namearray, ArrayList <Double> checkingArray, ArrayList <Double> savingArray){
			System.out.println("You have chosen to create a savings account! At this point we will take some information.");
					System.out.println();

					System.out.println("Please enter the name you would like your account to be under.");
					Scanner scan10 = new Scanner(System.in);
					String name = scan10.nextLine();
					System.out.println();
					namearray.add(name);

					System.out.println("How much would you like to deposit into your savings account?");
					Scanner scan13 = new Scanner(System.in);
					String deposit = scan13.nextLine();
					Double Deposit = Double.parseDouble(deposit);
					System.out.println();
					savingArray.add(Deposit);

					checkingArray.add(0.0);
		}

static void WriteFile(PrintWriter information, ArrayList <String> namearray, ArrayList <Double> checkingArray, ArrayList <Double> savingArray){
		for (int i = 0; i<namearray.size(); i++){
			information.println(namearray.get(i));
			information.println(checkingArray.get(i));
			information.println(savingArray.get(i));
		}
	
	information.close();
	}
	
static void ReadFile(Scanner inFile, ArrayList <String> namearray, ArrayList <Double> checkingArray, ArrayList <Double> savingArray){
	int counter = 0;
	while(inFile.hasNext()){

		if (counter == 3){ //this counter is tracking which array we are adding too
			counter = 0;
		}
		if (counter == 0){
				namearray.add(inFile.next());	
		}
		if (counter == 1){
		
				checkingArray.add(inFile.nextDouble());
			
		}
		if (counter == 2){
			
				savingArray.add(inFile.nextDouble());
			
		}
		counter++;
	}
	inFile.close();
}	


static void checkingATM(int index, ArrayList <Double> checkingATM){ //need to adjust the index i think
		System.out.println("For your checking account: Would you like to see your balance, deposit money, or withdraw money? (enter balance for balance, deposit for deposit, or withdraw for withdraw)");
		Scanner scan15 = new Scanner(System.in);
		String selection = scan15.nextLine();
		System.out.println();

		if (selection.equals("balance")){
			System.out.println("Your balance is: $" + checkingATM.get(index));
			System.out.println();
			}

		else if (selection.equals("deposit")){
			System.out.println("How much would you like to deposit?");
			Scanner scan5 = new Scanner(System.in);
			Double depositAmount = scan5.nextDouble(); //this is something else you can do to read doubles
			Double intialBalance = checkingATM.get(index);
			Double NewBalance = intialBalance + depositAmount;
			checkingATM.set(index, NewBalance);
			System.out.println();
			System.out.println("Your new balance is: $" + NewBalance);
			System.out.println();
			}

		else if (selection.equals("withdraw")){
			System.out.println("How much would you like to withdraw?");
			Scanner scan6 = new Scanner(System.in);
			Double withdrawAmount = scan6.nextDouble();
			Double intialBalance = checkingATM.get(index);
			Double NewBalance = intialBalance - withdrawAmount;
			checkingATM.set(index, NewBalance);
			System.out.println();
			System.out.println("Your new balance is: $" + NewBalance);
			System.out.println();
		}
	}

	static void savingATM(int index, ArrayList <Double> savingATM){
				System.out.println("For your saving account: Would you like to see your balance, deposit money, or withdraw money? (enter balance for balance, deposit for deposit, or withdraw for withdraw)");
				Scanner scan14 = new Scanner(System.in);
				String selection = scan14.nextLine();
				System.out.println();

				if (selection.equals("balance")){
					System.out.println("Your balance is: $" + savingATM.get(index));
					System.out.println();
					}
				
				else if (selection.equals("deposit")){
					System.out.println("How much would you like to deposit");
					Scanner scan6 = new Scanner(System.in);
					Double depositAmount = scan6.nextDouble();
					Double initialBalance = savingATM.get(index);
					Double NewBalance = initialBalance + depositAmount;
					savingATM.set(index, NewBalance);
					System.out.println();
					System.out.println("Your new balance is: $" + NewBalance);
					System.out.println();
				}

				else if (selection.equals("withdraw")){
					System.out.println("How much would you like to withdraw?");
					Scanner scan7 = new Scanner(System.in);
					Double withdrawAmount = scan7.nextDouble();
					Double intialBalance = savingATM.get(index);
					Double NewBalance = intialBalance - withdrawAmount;
					savingATM.set(index, NewBalance);
					System.out.println();
					System.out.println("Your new balance is: $" + NewBalance);
					System.out.println();
				}
				}

	public static void main(String[] args) throws Exception{
		
		FileInputStream ReadInformation = new FileInputStream("CustomerAccountInformation.txt"); 
		//this is to read the information from the text file that we created
		
		Scanner inFile = new Scanner(ReadInformation);

		//Here you made an arraylist to hold the checking and saving balance. there are 3 indexes 0,1,2
		ArrayList <Double> checkingBalance = new ArrayList<>(3); //so we have 2 empty array lists because it is all being printed onto 1 line
		ArrayList <Double> savingsBalance = new ArrayList<>(3);

		//here you made an arraylist to hold the name. there are 3 indexes 0,1,2
		ArrayList <String> name = new ArrayList<>(3); 
		ReadFile(inFile, name, checkingBalance, savingsBalance);
		//above we are passing in the information for the read file helper function

		Scanner scan1 = new Scanner(System.in);
		Welcome(name, scan1, checkingBalance, savingsBalance);
		// 	//here we are passing in information for the welcome function so we can store all those values in the appropriate index

		//this is the write helper function where we are passing in parameters into the function 
		PrintWriter pw = new PrintWriter (new File("CustomerAccountInformation.txt"));
		WriteFile(pw, name, checkingBalance, savingsBalance);

		//array list: the size of the array list is changable (you can add or subtract spaces or locations) but you cant do that in an array 
	}
}

	