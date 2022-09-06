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
			// System.out.println("What is your name?");
			// Scanner scan4 = new Scanner(System.in);
			// String name = scan4.nextLine();
			// namearray.add(name); //so here we are adding name into the namearray
			// System.out.println();
			// System.out.println("Welcome " + name);
			// System.out.println();
			System.out.println("Would you like to open a checking account or a savings account? (Enter checking to create a checking account and enter saving to create a savings account)");
			
			response = scan1.next();

			if (response.equals("checking")){
				Checking(namearray, checkingArray, savingArray);
			}
			else {
				Saving(namearray, checkingArray, savingArray);
			}

		}

		else {
			WelcomeBack(namearray, checkingArray, savingArray);
		}

		// else {
		// 	System.out.println("What is your name?");
		// 	Scanner scan2 = new Scanner(System.in);
		// 	String name = scan2.nextLine();

		// 	System.out.println("Welcome " + name);
		// 	System.out.println();
		// 	int nameIndex = namearray.indexOf(name); //this is saving the index (place value in the arraylist) of the name

		// 	System.out.println("Would you like to access your checking or savings account? (Enter checking for checking and saving for savings)");
		// 	Scanner scan3 = new Scanner(System.in);
		// 	response = scan3.nextLine();

		// 	if (response.equals("checking"))
		// 	{
		// 		checkingATM(nameIndex, checkingArray);
		// 	}
		// 	else {
		// 		savingATM(nameIndex, savingArray);
		// 	}
		// }

		
		
	}

	static void WelcomeBack(ArrayList <String> nameArray, ArrayList <Double> checkingArray, ArrayList <Double> savingArray){
		System.out.println("Welcome back to Seamless bank! Lets assist you in whatever you may need!"); 
		// System.out.println();
		// System.out.println("Lets create another account, wheather that be a checking or savings account? (Enter checking to create a checking account and enter saving to create a savings account)"); //lets change this to accessing to checking or saving
		// Scanner scan17 = new Scanner(System.in);
		// String choice = scan17.nextLine();

		
		
			System.out.println("What is your name?");
			Scanner scan2 = new Scanner(System.in);
			String name = scan2.nextLine();

			System.out.println("Welcome " + name);
			System.out.println();
			int nameIndex = nameArray.indexOf(name); //this is saving the index (place value in the arraylist) of the name

			System.out.println("Would you like to access your checking or savings account? (Enter checking for checking and saving for savings)");
			Scanner scan3 = new Scanner(System.in);
			String response = scan3.nextLine();

			if (response.equals("checking"))
			{
				checkingATM(nameIndex, checkingArray);
			}
			else {
				savingATM(nameIndex, savingArray);
			}
		
		// if (choice.equals("checking")){
		// 	Checking();
		// }

		// else if (choice.equals("saving")){
		// 	Saving();
		// }
	}

	static void Checking(ArrayList <String> namearray, ArrayList <Double> checkingArray, ArrayList <Double> savingArray){
			System.out.println("You have chosen to create a checking account! At this moment we will take some of your information.");
			System.out.println();

			System.out.println("Please enter the name you would like your account to be under.");
			Scanner scan3 = new Scanner(System.in);
			String CustomerName = scan3.nextLine();
			System.out.println();
			namearray.add(CustomerName);

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
			checkingArray.add(Deposit);

			savingArray.add(-1.0);

			// try {
			// 	File CheckingSavingInformation = new File ("CustomerAccountInformation.txt");

			// 	if (!CheckingSavingInformation.exists()){
			// 		CheckingSavingInformation.createNewFile();
			// 	}
			// 	PrintWriter WriteCheckingSavingInformation = new PrintWriter(CheckingSavingInformation);
			// 	WriteCheckingSavingInformation.println("The customers account information:");
			// 	WriteCheckingSavingInformation.println();
			// 	WriteCheckingSavingInformation.println(CustomerName);
			// 	WriteCheckingSavingInformation.println(age);
			// 	WriteCheckingSavingInformation.println(sex);
			// 	WriteCheckingSavingInformation.println(Deposit);
			// 	WriteCheckingSavingInformation.close();
			// 	System.out.println("Your information has been successfully saved! Thank you for providing your business to Seamless Bank. Come back soon!");
			// 	System.out.println();
			// }
			// catch (IOException e){
			// 	e.printStackTrace();
			// }
		}

		static void Saving (ArrayList <String> namearray, ArrayList <Double> checkingArray, ArrayList <Double> savingArray){
			System.out.println("You have chosen to create a savings account! At this point we will take some information.");
					System.out.println();

					System.out.println("Please enter the name you would like your account to be under.");
					Scanner scan10 = new Scanner(System.in);
					String name = scan10.nextLine();
					System.out.println();
					namearray.add(name);

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
					savingArray.add(Deposit);

					checkingArray.add(-1.0);

					// try {
					// 	File CheckingSavingInformation = new File ("CustomerAccountInformation.txt");

					// 	if (!CheckingSavingInformation.exists()){
					// 		CheckingSavingInformation.createNewFile();
					// 	}
					// 	PrintWriter WriteCheckingSavingInformation = new PrintWriter (CheckingSavingInformation);
					// 	// WriteCheckingSavingInformation.println("The customers account information:");
					// 	// WriteCheckingSavingInformation.println();
					// 	// WriteCheckingSavingInformation.println(name);
					// 	// WriteCheckingSavingInformation.println(Age);
					// 	// WriteCheckingSavingInformation.println(sex);
					// 	WriteCheckingSavingInformation.println(Deposit);
					// 	WriteCheckingSavingInformation.close();
					// 	System.out.println("Your information has been successfully saved! Thank you for providing your business to Seamless Bank. Come back soon!");
					// 	System.out.println();
					// }
					// catch (IOException e){
					// 	e.printStackTrace();
					// }

		}

static void WriteFile(PrintWriter information, ArrayList <String> namearray, ArrayList <Double> checkingArray, ArrayList <Double> savingArray){
						//File CheckingSavingInformation = new File ("CustomerAccountInformation.txt"); (have this in main)

						// if (!CheckingSavingInformation.exists()){
						// 	CheckingSavingInformation.createNewFile();
						// }
						// PrintWriter WriteCheckingSavingInformation = new PrintWriter (Information);
	for (int i = 0; i < namearray.size(); i++){
		information.println(namearray.get(i));
		information.println(checkingArray.get(i));
		information.println(savingArray.get(i));
	}
	information.close();
	}
	
static void ReadFile(Scanner inFile, ArrayList <String> namearray, ArrayList <Double> checkingArray, ArrayList <Double> savingArray){
	boolean doubleTracker = false;

	while(inFile.hasNext()){
		String holdString = inFile.nextLine();
		Double holdDoubles = inFile.nextDouble();
		if (inFile.nextLine()){
			namearray.add(inFile.nextLine());
			doubleTracker = false;
		}
		else if (inFile.nextDouble()){
			checkingArray.add(InFile.nextDouble());
			doubleTracker = true;
		}
		else if (inFile.nextDouble() && doubleTracker == true){
			savingArray.add(InFile.nextDouble());
		}

	}
	
}	


static void checkingATM(int index, ArrayList <Double> checkingATM){
		System.out.println("For your checking account: Would you like to see your balance, deposit money, or withdraw money? (enter balance for balance, deposit for deposit, or withdraw for withdraw)");
		Scanner scan15 = new Scanner(System.in);
		String selection = scan15.nextLine();
		System.out.println();

		if (selection.equals("balance")){
			//System.out.println("Your balance is: $" + checkingATM.get(index));
			System.out.println(checkingATM.get(index));
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

	public static void main(String[] args) throws Exception{
		FileInputStream ReadInformation = new FileInputStream("CustomerAccountInformation.txt");
		
		Scanner inFile = new Scanner(ReadInformation);

		// Accounts();
		ArrayList <Double> checkingBalance = new ArrayList<>(3);
		ArrayList <Double> savingsBalance = new ArrayList<>(3);


		ArrayList <String> name = new ArrayList<>(3); 
		name.add("Prethel Alam");
		name.add("Alex");
		name.add("Joe");

		checkingBalance.add(23.23);
		checkingBalance.add(10.21);
		checkingBalance.add(15.23);

		savingsBalance.add(115.21);
		savingsBalance.add(135.43);
		savingsBalance.add(174.32);

		Scanner scan1 = new Scanner(System.in);
		Welcome(name, scan1, checkingBalance, savingsBalance);
		//System.out.println(name.get(0));

	
		PrintWriter pw = new PrintWriter (new File("CustomerAccountInformation.txt"));
		WriteFile(pw, name, checkingBalance, savingsBalance);



		//array list: the size of the array list is changable (you can add or subtract spaces or locations) but you cant do that in an array 
	}
}
//}
	