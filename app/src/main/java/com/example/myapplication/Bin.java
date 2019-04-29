package com.example.myapplication;

import java.text.DecimalFormat;

public class Bin {
    private String name;
    private int capacity;
    private int noOfObjects = 0;

    public Bin (String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public Integer getNoOfObjects() {
        return noOfObjects;
    }

    public int getPercentageCapacity(){
        return (getNoOfObjects()/getCapacity())*100;
    }

    public String getPercentageCapacityFormatted() {
        DecimalFormat df = new DecimalFormat("#0.00");
        return df.format(getPercentageCapacity());
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isFull() {
        return capacity==noOfObjects;
    }

    public void emptyBin() {
        noOfObjects = 0;
    }

    public void addItem() {
        noOfObjects++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
