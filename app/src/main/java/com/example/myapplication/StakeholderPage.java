package com.example.myapplication;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StakeholderPage extends AppCompatActivity{
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stakeholder_page);
    }

    public void onclick1Akornor(View view){
        Intent int1=new Intent(this,stakerholder_login_page.class);
        startActivity(int1);
    }

    public void onclickBigben(View view){
        Intent int1=new Intent(this,stakerholder_login_page.class);
        startActivity(int1);
    }

    public void onclickEssentials(View view){
        Intent int1=new Intent(this,stakerholder_login_page.class);
        startActivity(int1);
    }

    public void onclickZoomlion(View view){
        Intent int1=new Intent(this,stakerholder_login_page.class);
        startActivity(int1);
    }

}
