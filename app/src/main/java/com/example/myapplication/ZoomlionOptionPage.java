package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
public class ZoomlionOptionPage extends AppCompatActivity{
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zoomlion_options_page);
    }
    public void onclickbinstats(View view){
        Intent int1=new Intent(this,BinStatsPage.class);
        startActivity(int1);
    }

    public void onclickviewcredit(View view){
        Intent int1=new Intent(this,ViewCreditsPage.class);
        startActivity(int1);
    }

    public void onclickback(View view){
        Intent int1=new Intent(this,MainActivity.class);
        startActivity(int1);
    }

}
