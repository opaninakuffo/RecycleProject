package com.example.myapplication;

import java.text.DecimalFormat;

public class User {
    private String firstName;
    private String lastName;
    private int id;
    private double credit = 0;
    private int yearGroup;
    private String password;
    private Bin currentBin;

    public User(String firstName, String lastName, int id, int yearGroup, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.yearGroup = yearGroup;
        this.password = password;
    }

    public User(String firstName, String lastName, int id, int yearGroup, String password, double credit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.yearGroup = yearGroup;
        this.password = password;
        this.credit = credit;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + "       "+ "GH¢ "+ getCreditFormatted();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Bin getCurrentBin(){
        return this.currentBin;
    }

    public int getId() {
        return id;
    }

    public double getCredit() {
        return credit;
    }

    public String getCreditFormatted() {
        DecimalFormat df = new DecimalFormat("#0.00");
        return df.format(credit);
    }

    public int getYearGroup() {
        return yearGroup;
    }

    public String getPassword() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public void addCredit() {
        this.credit = this.credit + 0.2;
    }

    public void setYearGroup(int yearGroup) {
        this.yearGroup = yearGroup;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCurrentBin(Bin currentBin) {
        this.currentBin = currentBin;
    }
}
