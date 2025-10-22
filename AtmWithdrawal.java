/*Write a java program to simulate an ATM withdrawal process.
Ask the user to enter the withdrawal amount.

Check if the entered amount is less than or equal to the account balance(initially 10000Rs).

If the balance is sufficient, deduct the withdrawal amount and display the remaining balance.

Otherwise, display the message "Insufficient funds". */


package com.codegnan.controlstatements;

import java.util.Scanner;

public class AtmWithdrawal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double balance=10000;
		System.out.println("Enter withdrawal amount :");
		int amt=sc.nextInt();
		if(amt<=balance) {
			balance-=amt;
			System.out.println("Withdrawal succesfull . Remaining balance is: " +balance);
		}
		else {
			System.out.println("Insufficient balance");
		}
		sc.close();
	}

}
