package com.m2i.poe.bank;

import java.util.Date;
import java.util.ArrayList;

public class Account {
    ///why

    private String id;
    private double solde = 0;
    //String prenom;
    //String adress;
    private boolean isActive = true;
    private boolean isBlocked = false;
    private Date creationDate = new Date();
    private ArrayList<Transaction> transactionList= new ArrayList<> ();
    private double transaction;


    public void display() {
        System.out.print(getId());
    }

    public double withdraw(double amount) {
        if (amount <= getSolde()) {
            setSolde(getSolde() - amount);
            return amount;
        } else {
            return 0;
        }
    }

   public void deposit(double amount) {
        if (isActive() && !isBlocked())  {
                setSolde(getSolde() + amount);
            }
    }


    public void close() {
        setActive(false);
    }

    public void block () {
        setBlocked(true);
    }

    public void unblock() {
        setBlocked(false);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void transaction() {
        if (getSolde()>transaction)
    }

}