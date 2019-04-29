package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.EditText;


public class stakerholder_login_page extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stakerholder_login_page);
    }

    public void onclickStakeholder(View view){
        EditText password = findViewById(R.id.passwordTextStakeholder);
        if ("zoomlion".equals(password.getText().toString())) {
            Intent int1=new Intent(this,ZoomlionOptionPage.class);
            startActivity(int1);
        }
        else if ("shops".equals(password.getText().toString())) {
            Intent int1=new Intent(this,ViewCreditsPage.class);
            startActivity(int1);
        }
        else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setCancelable(true);
            builder.setTitle("Error");
            builder.setMessage("Incorrect Password");
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
}
