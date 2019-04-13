package co.edu.intecap.userinput;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private int mCounter = 0;
    private  TextView txtCountValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCountValue = findViewById(R.id.txtCounterValue);
        txtCountValue.setText(String.valueOf(0));

        //se asigna un click listener a nuestro boton
        Button clickButton = findViewById(R.id.button2);
        clickButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        mCounter++;
        txtCountValue.setText(String.valueOf((mCounter)));
        Toast.makeText(this, "CLICK!!!", Toast.LENGTH_SHORT).show();
    }


}
