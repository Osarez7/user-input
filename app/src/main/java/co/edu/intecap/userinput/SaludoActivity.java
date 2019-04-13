package co.edu.intecap.userinput;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SaludoActivity extends AppCompatActivity {

    @BindView(R.id.txt_saludo) private TextView txtSaludo;
    @BindView(R.id.edit_txt_nombre) private EditText editTextNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo); //aqui asignamos el layout
        ButterKnife.bind(this);
    }


    @OnClick(R.id.btn_saludar)
    private  void saludar(View v){
        String nombre = editTextNombre.getText().toString();
        if (!nombre.trim().isEmpty()) {
            txtSaludo.setText("Hello " + nombre.trim());

        }else{
            Toast.makeText(SaludoActivity.this, "No se aceptan textos vacios", Toast.LENGTH_SHORT).show();
        }
    }

}
