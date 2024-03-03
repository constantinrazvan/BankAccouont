/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankaccouont;

import java.util.ArrayList;

/**
Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, 
* and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.
 */

// System.out.println(Account.iban);

public class Account {
    // iban, nume, pin, balance
    
    //
        private String iban;
        private String nume; 
        private int pin; 
        private double balance; 
    //
    
    public Account(String iban, String nume, int pin, double balance) { 
        this.iban = iban; 
        this.nume = nume; 
        this.pin = pin; 
        this.balance = balance;
    }
    
    
    //Getteri si Setteri 
    
    //Getteri -> ne ajuta sa afisam informatii private 
    //Setteri -> ne ajuta sa setam informatiile 
    
    //Getteri
     

    public String getIban() {
        return iban;
    }

    public String getNume() {
        return nume;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }
    
    //Setteri 
    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + 
                    "iban=" + iban + 
                    ", nume=" + nume + 
                    ", pin=" + pin + 
                    ", balance=" + balance + 
                '}';
    }
    
    
    
}
