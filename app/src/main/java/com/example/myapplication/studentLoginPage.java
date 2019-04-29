package com.example.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class studentLoginPage extends AppCompatActivity {
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login_page);
    }

    public void onclickStudentlogin(View view){
        EditText userID = findViewById(R.id.sLoginIDText);
        EditText pass = findViewById(R.id.sLoginPasswordText);
        if (DataHub.studentData.containsKey(Integer.parseInt(userID.getText().toString())) &&
            DataHub.studentData.get(Integer.parseInt(userID.getText().toString())).getPassword().equals(pass.getText().toString())) {
            DataHub.currentUser = DataHub.studentData.get(Integer.parseInt(userID.getText().toString()));
            Intent int1 = new Intent(this, BinLocation.class);
            startActivity(int1);
        }
        else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setCancelable(true);
            builder.setTitle("Error");
            builder.setMessage("Incorrect Password\nNew? Please register");
            builder.setPositiveButton("Retry",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
            builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
    }

    public void onclickStudentregister(View view){
        Intent int1=new Intent(this, studentRegisterPage.class);
        startActivity(int1);
    }

    public void onclickback(View view){
        Intent int1=new Intent(this,MainActivity.class);
        startActivity(int1);
    }
}
