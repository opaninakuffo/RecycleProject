package com.example.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BinLocation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bin_location);
        TextView creditsTextView = findViewById(R.id.creditsTextBox);
        TextView userFirstNameTextView = findViewById(R.id.userFirstName);
        creditsTextView.setText(DataHub.currentUser.getCreditFormatted());
        userFirstNameTextView.setText(DataHub.currentUser.getFirstName());
    }

    public void onclickBigBenBin(View view){
        if (DataHub.bigBenBin.isFull()) {
            AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
            builder1.setCancelable(true);
            builder1.setTitle("Error");
            builder1.setMessage("Sorry\nBig Ben bin is full.\nPlease try bin at Akornor or Essentials");
            builder1.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                }
            });
            AlertDialog dialog = builder1.create();
            dialog.show();
        }
        else {
            DataHub.currentUser.setCurrentBin(DataHub.bigBenBin);
            Intent int1=new Intent(this, BarcodePage.class);
            startActivity(int1);
        }
    }

    public void onclickEsentialsBin(View view){
        if (DataHub.essentialsBin.isFull()) {
            AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
            builder1.setCancelable(true);
            builder1.setTitle("Error");
            builder1.setMessage("Sorry\nEssentials bin is full.\nPlease try bin at Akornor or Big Ben");
            builder1.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                }
            });
            AlertDialog dialog = builder1.create();
            dialog.show();
        }
        else {
            DataHub.currentUser.setCurrentBin(DataHub.essentialsBin);
            Intent int1=new Intent(this, BarcodePage.class);
            startActivity(int1);
        }
    }

    public void onclickAkornorBin(View view){
        if (DataHub.akornorBin.isFull()) {
            AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
            builder1.setCancelable(true);
            builder1.setTitle("Error");
            builder1.setMessage("Sorry\nAkornor bin is full.\nPlease try bin at Big Ben or Essentials");
            builder1.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                }
            });
            AlertDialog dialog = builder1.create();
            dialog.show();
        }
        else {
            DataHub.currentUser.setCurrentBin(DataHub.akornorBin);
            Intent int1=new Intent(this, BarcodePage.class);
            startActivity(int1);
        }
    }

    public void onclickExit(View view){
        Intent int1=new Intent(this, MainActivity.class);
        startActivity(int1);
    }
}
