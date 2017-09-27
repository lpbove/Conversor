package iam47992649.orgescoladeltreball.conversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button convert;
    private EditText dollar, euro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convert = (Button) findViewById(R.id.submit);
        dollar = (EditText) findViewById(R.id.dollarNum);
        euro = (EditText) findViewById(R.id.euroNum);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doConversion();
            }
        };
        convert.setOnClickListener(listener);
    }
    private void doConversion(){
        double euros = Double.parseDouble(euro.getText().toString());
        double dollars = euros * 1.17;

}
