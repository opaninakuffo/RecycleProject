package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class guardian_of_the_galaxy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guardian_of_the_galaxy);
        TextView guardianTextView = findViewById(R.id.guardiansTextField);
        TextView guardian2TextView = findViewById(R.id.noOfRecyclesText);
        TextView championTextView = findViewById(R.id.championText);
        TextView withTextView = findViewById(R.id.withText);

        if (DataHub.studentData.isEmpty()) {
            guardian2TextView.setVisibility(View.INVISIBLE);
            withTextView.setVisibility(View.INVISIBLE);
            championTextView.setVisibility(View.INVISIBLE);
            String noGuardian = "OMG! There is no Guardian";
            guardianTextView.setText(noGuardian);
        }
        else {
            User maxUser = null;
            double maxCredit = -1;
            for(User user : DataHub.studentData.values()){
                if (user.getCredit()>maxCredit) {
                    maxUser = user;
                    maxCredit = user.getCredit();
                }
            }
            String guardianText = maxUser.getFirstName()+" "+maxUser.getLastName()+", C"+maxUser.getYearGroup();
            String recycleText = Double.toString(maxUser.getCredit()/0.2) + " RECYCLE(S)";
            guardianTextView.setText(guardianText);
            guardian2TextView.setText(recycleText);
        }
    }
}
