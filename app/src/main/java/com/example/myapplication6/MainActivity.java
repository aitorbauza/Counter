package com.example.myapplication6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView showCountTextView;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ToolBar
        setTitle("Hello Constraint");

        showCountTextView = findViewById(R.id.show_count);
        Button buttonToast = findViewById(R.id.button_toast);
        Button buttonCount = findViewById(R.id.button_count);

        // Botón TOAST
        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementCount();
                Toast.makeText(MainActivity.this, " " + count, Toast.LENGTH_SHORT).show();
            }
        });

        // Botón COUNT
        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementCount();
            }
        });
    }

    // Método para incrementar el contador y actualizar el TextView
    private void incrementCount() {
        count++;
        showCountTextView.setText(String.valueOf(count));
    }
}
