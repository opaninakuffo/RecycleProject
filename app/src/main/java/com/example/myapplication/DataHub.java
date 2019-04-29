package com.example.myapplication;

import java.util.ArrayList;
import java.util.Hashtable;

public class DataHub {
    public static Hashtable<Integer, User> studentData = new Hashtable<>();
    public static ArrayList<String> barcodeData = new ArrayList<>();
    public static User currentUser;
    public static Bin essentialsBin = new Bin("Essentials Bin", 3);
    public static Bin bigBenBin = new Bin("Big Ben Bin", 3);
    public static Bin akornorBin = new Bin("Akornor Bin", 3);
}


