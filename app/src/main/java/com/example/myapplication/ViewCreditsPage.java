package com.example.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;


public class ViewCreditsPage extends AppCompatActivity {

    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_credits_page);
        LinearLayout linearView = findViewById(R.id.linearLayout);
        ArrayList<User> students = new ArrayList<>(DataHub.studentData.values());
        for (User student : students) {
            TextView studentTextView = new TextView(this);
            studentTextView.setText(student.toString());
            studentTextView.setTextSize(24);
            linearView.addView(studentTextView);
        }
    }

    public void onclickBack(View view){
        Intent int1=new Intent(this, MainActivity.class);
        startActivity(int1);
    }
}
