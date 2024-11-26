package com.example.trabajogrupo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText PruebaWatcher;
    private Button PruebaLongClik;
    private ControladorKeyListener ctrK;
    private ControladorLongCLick ctrL;
    private ControladorWatcher ctrW;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ctrW= new ControladorWatcher();
        iniciaComponentes();
    }

    private void iniciaComponentes() {
        PruebaWatcher=findViewById(R.id.editText);
        PruebaWatcher.addTextChangedListener(ctrW);
        PruebaLongClik=findViewById(R.id.button);
        PruebaLongClik.setOnLongClickListener();
    }
}