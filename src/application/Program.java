package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {
		
		Account acc = new Account(1002, "Alex", 4500.0);
		
		BusinessAccount bacc = new BusinessAccount(1123, "Antonio", 200.0, 1000.0);
		
		
		bacc.loan(900.0);
		
		//UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		System.out.println();
		
		System.out.println("acc1: " + acc1);
		System.out.println("acc2: " + acc2);
		System.out.println("acc3: " + acc3);
		
		System.out.println();
		
		//DOWNCAST
		BusinessAccount acc4 = (BusinessAccount)acc2;
		
		// Aceitou mas o compilador n�o vai pq acc3 n�o � uma BusinessAccount
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		//abaixo a solu��o
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
			System.out.println("acc5: " + acc5);
		}
		
		
		//Sobreposi��o, @Override
		
		Account acc6 = new Account(1001, "Alex", 1000.0);
		acc6.withdraw(200.0);
		System.out.println(acc6.getBalance());
		
		Account acc7 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc7.withdraw(200.0);
		System.out.println(acc7.getBalance());
				
		Account acc8 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc8.withdraw(200.0);
		System.out.println(acc8.getBalance());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
