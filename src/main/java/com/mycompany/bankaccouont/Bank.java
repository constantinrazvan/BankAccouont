/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankaccouont;

/**
Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, 
* and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.
 */

import com.mycompany.bankaccouont.Account;
import java.util.Scanner;
import java.lang.System;
import java.util.ArrayList;
import java.util.Random;

public class Bank {
    
    private static ArrayList<Account> accounts = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void menu() {
        System.out.println("1. Enter in account");
        System.out.println("2. Create account");
        
        int userChoice = input.nextInt();
        
        if(userChoice == 1) {
            login();
        } else if(userChoice == 2) {
            addAccount();
        }
        
    }
    
    
    public static void deposit() {
    } 
    
    public static void withdraw() {
    } 
    
    public static void deleteAccount() {
        
    }
   
    
    public static int randomNumberGenerator(int min, int max) {
        Random r = new Random();
        int randomNum = r.nextInt(max - min);
        int result = randomNum + min;
        return result;
    }

    public static void addAccount() {
        System.out.println("Enter name:");
        String name = input.nextLine();
        
        System.out.println("Enter PIN:");
        int pin = input.nextInt();
        input.nextLine();
        
        double balance = 0.0;
        
        int number = randomNumberGenerator(55000, 100000);
        
        String iban = "RO" + number; 
        
        Account account = new Account(iban, name, pin, balance);
    
        accounts.add(account);
        
        System.out.println("Account added successfully!");
        
        input.close();
    }
    
    public static void login() {
        String name = input.nextLine();
        input.nextLine(); 
        
        for(Account account : accounts) {
            if(account.getNume() == name) {
                System.out.println("Enter your pin: ");
                
                int pin = input.nextInt();
                
                if(account.getPin() == pin) {
                    System.out.println("Congrats! You entered your account!");
                    System.out.println("Hello, " + account.getNume());
                    
                    System.out.println("\n\n\n");
                    System.out.println("What would you like to do now?\n\n");
                    
                    // 1. show the menu (1. deposit, 2. withdraw, 3. delete account, 4. show details account
                    // 2. solve the bug on case 4 
                    // 3. complete the functions (deposit, withdraw)
                    
                    int userChoice = input.nextInt();
                    
                    while(userChoice <= 4) {
                        switch(userChoice) {
                            case 1: 
                                deposit();
                                break;
                            case 2:
                                withdraw();
                                break;
                            case 3: 
                                deleteAccount();
                                break;
                            case 4;
                                account.toString()
                                break;
                        }                          
                    }
                }
            } else {
                System.out.println("Sorry! No user has been found with the name: " + name);
            }
        }
    }
    
    
    public static void main(String[] args) {
        
        
        
           
    }
    
}

 