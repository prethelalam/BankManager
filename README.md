# BankManager
I am progrmaming a Bank Manager using the text editor VS code.

# Reflection

## Introduction/Purpose:
I utilized a text editor called Visual Studio Code to build a bank manager program using the programming language java. The program will create new customers who are able to create a checking and savings account. All of their information along with there checking and savings balance will be stored in a text file. Moreover, existing customers are able to check their balance, deposit, and withdraw money from either account as well. This program taught me how to create text files in java, while also reading from the text files in order to check the balance, deposit money, and withdraw money. I also learned how to create methods in java which allowed me to create many helping methods that can be utilized multiple times throughout my program. Lastly, I learned how to program an arraylist and pass in information through methods and the arraylist.

## Problem I ran into:
The first problem I ran into was reading specific information from a text file when it came to checking a customers balance. I solved this problem by creating a method where I passed in information (arraylists that I created for the customer name, checking amount, and savings amount). I created a while loop and counter to continously track which array was being read from the text file. The second issue I ran into was determining how to deposit/withdraw money and have the new balance be reflected in the text file. I ended up having to create a separate arraylist for the customers name, checking balance, and savings balance. This way I could only look at the specfic arraylist (for checking or saving) and call that value. Then I turned the value into a double and added it to the users input (the amount they want to deposit and withdraw). Afterwards I took the new variable which equalled the initial balance and new amount deposited or withdrawed and stored it in the text file in the index for the balance. 

## Conclusion:
My takeaways from creating this bank manager program is that I need to gain a better understanding of how array works, along with solidfying my knowledge in java foundations. I believe these foundational concepts will allow me to be able to determine solutions quicker, while also thinking of more creative solutions. Moving forward, I am going to begin reading a java textbook that breaksdown all of the foundational information and apply that knowledge to new projects.
