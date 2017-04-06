package com.example.okanaydin.homeworkrehber.FirebaseAuthentication;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.okanaydin.homeworkrehber.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class NewPassword extends AppCompatActivity {


    private EditText email;
    private Button yeniParolaGonder;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_password);

        email=(EditText)findViewById(R.id.uyeEmail);
        yeniParolaGonder=(Button)findViewById(R.id.yeniParolaGonder);

        //FirebaseAuth sınıfının referans olduğu nesneleri kullanabilmek için getInstance methodunu kullanıyoruz.
        auth = FirebaseAuth.getInstance();

        yeniParolaGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mail=email.getText().toString().trim();

                if (TextUtils.isEmpty(mail)){
                    Toast.makeText(getApplicationContext(),"Mail giriniz:",Toast.LENGTH_SHORT).show();
                    return;
                }

                auth.sendPasswordResetEmail(mail).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(getApplicationContext(),"Yeni parolanız mail adresine gönderilmiştir.",Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(getApplicationContext(),"Mail Gönderilemedi!",Toast.LENGTH_SHORT).show();
                        }
                    }
                });



            }

        });


    }
}
