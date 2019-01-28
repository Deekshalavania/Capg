package com.capgemini.main.bean;
//import com.capgemini.app4.*;
import com.bean.app4.bean.Account;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account();
        Account a2=new Account();
        a1.setBalance(2000);
        a1.setAccHolder("smith");
        a1.deposit(2000);
        a2.setBalance(3000);
        a2.setAccHolder("kathy");
        a2.withdraw(2000);
        System.out.println("Updated salary of smith is\t" +a1.getBalance());
        System.out.println("Account Holder is\t" +a1.getAccHolder());
        
        System.out.println("Updated details of kathy\t" +a2.getBalance());
        System.out.println("Account Holder\t" +a2.getAccHolder());
      System.out.println(a1);
    /* System.out.println(a2);
      Saving t s=new Saving();*/
       
		

	}

}
