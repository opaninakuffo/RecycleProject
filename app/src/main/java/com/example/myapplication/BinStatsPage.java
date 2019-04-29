package com.example.myapplication;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BinStatsPage extends AppCompatActivity {
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bin_stats_page);
        TextView akornorTextView = findViewById(R.id.akornorItemsTextBox);
        TextView bigBenTextView = findViewById(R.id.bigBenItemsTextBox);
        TextView essentialsTextView = findViewById(R.id.essentialsItemsTextBox);
        TextView akornorTextViewPercent = findViewById(R.id.akornorCapaTextBox);
        TextView bigBenTextViewPercent = findViewById(R.id.bigBenCapaTextBox);
        TextView essentialTextViewPercent = findViewById(R.id.essentialsCapaTextBox);

        String akornorBinNoOfObjects = Integer.toString(DataHub.akornorBin.getNoOfObjects());
        String bigBenBinNoOfObjects = Integer.toString(DataHub.bigBenBin.getNoOfObjects());
        String essentialsBinNoOfObjects = Integer.toString(DataHub.essentialsBin.getNoOfObjects());
        String akornorBinCapacity = DataHub.akornorBin.getPercentageCapacityFormatted();
        String bigBenBinCapacity = DataHub.bigBenBin.getPercentageCapacityFormatted();
        String essentialsBinCapacity = DataHub.essentialsBin.getPercentageCapacityFormatted();

        akornorTextView.setText(akornorBinNoOfObjects);
        bigBenTextView.setText(bigBenBinNoOfObjects);
        essentialsTextView.setText(essentialsBinNoOfObjects);
        akornorTextViewPercent.setText(akornorBinCapacity);
        bigBenTextViewPercent.setText(bigBenBinCapacity);
        essentialTextViewPercent.setText(essentialsBinCapacity);
    }

}
