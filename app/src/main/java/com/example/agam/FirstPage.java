package com.example.agam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstPage extends AppCompatActivity {
    EditText edPassword, edUsername, edConfirm, edEmail;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);

        edUsername = findViewById(R.id.editTextText2);
        edEmail = findViewById(R.id.editTextText3);
        edPassword = findViewById(R.id.editTextTextPassword2);
        edConfirm = findViewById(R.id.editTextRegConfirmPassword);
        btn = findViewById(R.id.button2);
        tv = findViewById(R.id.textView5);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstPage.this, FrontPage.class));
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edUsername.getText().toString();
                String email = edEmail.getText().toString();
                String confirm = edConfirm.getText().toString();
                String password = edPassword.getText().toString();
                Database db = new Database(getApplicationContext(), "healthcare", null,1);
                if(username.length() == 0 || password.length() == 0){
                    Toast.makeText(getApplicationContext(), "Please fill all details", Toast.LENGTH_SHORT).show();
                }
                else{
                    if(password.compareTo(confirm)==0){
                        if(isValid(password)){
                            db.register(username,email,password);
                            Toast.makeText(getApplicationContext(), "Record Inserted", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(FirstPage.this, FrontPage.class));
                        }
                        else{
                            Toast.makeText(getApplicationContext(),"Password must contain at least six characters.", Toast.LENGTH_SHORT).show();
                        }

                    }else{
                       Toast.makeText(getApplicationContext(),"Password and Confirm Password didn't match",Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
    }
    public static boolean isValid(String passwordhere) {
        int f1=0,f2=0, f3=0;
        if(passwordhere.length() < 8){
            return false;
        }else{
            for(int p = 0; p < passwordhere.length(); p++) {
                if (Character.isLetter(passwordhere.charAt(p))) {
                    f1=1;
                }
            }
            for (int r =0; r < passwordhere.length(); r++) {
                if (Character.isLetter(passwordhere.charAt(r))) {
                    f2=1;
                }
            }
            for (int s=0; s < passwordhere.length(); s++) {
                char c = passwordhere.charAt(s);
                if(c>=33&&c<=46||c==64){
                    f3=1;
                }
            }
            if(f1==1 && f2==1 && f3==1)
                return true;
            return false;
        }
    }
}