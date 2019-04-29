package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;



public class studentRegisterPage extends AppCompatActivity {
    String first;
    String last;
    int yearGroup;
    int id;
    String password;

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_register_page);
    }


    public void onclick1(View view){
        //put student data into collection
        EditText firstName = findViewById(R.id.sFirstName);
        first = firstName.getText().toString();
        EditText lastName = findViewById(R.id.sLastName);
        last= lastName.getText().toString();
        EditText yearG = findViewById(R.id.sYearGroup);
        yearGroup = java.lang.Integer.parseInt(yearG.getText().toString());
        EditText iD = findViewById(R.id.sIDNumber);
        id =  java.lang.Integer.parseInt(iD.getText().toString());
        EditText passWord = findViewById(R.id.sRegisterPassword);
        password = passWord.getText().toString();
        User newUser = new User(first,last,id,yearGroup,password);
        Log.d("Hey",newUser.toString());
        DataHub.studentData.put(newUser.getId(),newUser);
        Intent int1=new Intent(this,studentLoginPage.class);
        startActivity(int1);
    }
}
