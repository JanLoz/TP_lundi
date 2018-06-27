package com.m2i.poe.bank;

import java.util.ArrayList;
import java.util.Date;

public class Transaction {

    private int id;
    private Date creationDate=new Date (); ///date de maintenant
    private double amount;
    private toAccount;


    public Transaction (double amount) {
        this.amount=amount;
    }

    pubic String toString() {
        return ("id" + "Date" + "amount")
    }

}
