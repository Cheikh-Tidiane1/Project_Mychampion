package com.example.mychampion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  private Button btnConnect;
  private EditText txtLogin,txtPassword;
  private String login,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtLogin = findViewById(R.id.txtLogin);
        txtPassword = findViewById(R.id.txtPassword);
        btnConnect = findViewById(R.id.btnConnect);
        btnConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login = txtLogin.getText().toString();
                password = txtPassword.getText().toString();
                if (login.isEmpty() || password.isEmpty()){
                    String message ="veuillez remplir tous les champs";
                    Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                    startActivity(intent);
                }

            }
        });

    }
}