package com.example.okanaydin.homeworkrehber.FirebaseAuthentication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.okanaydin.homeworkrehber.Activities.MainActivity;
import com.example.okanaydin.homeworkrehber.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends AppCompatActivity {


    private EditText uyeEmail,uyeParola;
    private Button yeniUyeButton,uyeGirisButton;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //FirebaseAuth sınıfının referans olduğu nesneleri kullanmak için getInstance methodunu kullanıyoruz.
        auth=FirebaseAuth.getInstance();

        uyeEmail=(EditText)findViewById(R.id.uyeEmail);
        uyeParola=(EditText)findViewById(R.id.uyeParola);
        yeniUyeButton=(Button)findViewById(R.id.yeniUyeButton);
        uyeGirisButton=(Button)findViewById(R.id.uyeGirisButton);

        yeniUyeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email=uyeEmail.getText().toString();
                String parola=uyeParola.getText().toString();

                if (TextUtils.isEmpty(email)){
                    Toast.makeText(getApplicationContext(),"Mail adresinizi giriniz",Toast.LENGTH_LONG).show();
                    return;
                }

                if (TextUtils.isEmpty(parola)){
                    Toast.makeText(getApplicationContext(),"Parola giriniz",Toast.LENGTH_LONG).show();
                }

                if (parola.length()<8){
                    Toast.makeText(getApplicationContext(),"Parola en az 8 karakterden oluşmalıdır",Toast.LENGTH_LONG).show();
                }


                //FirebaseAuth ile email,parola parametrelerini kullanarak yeni bir kullanıcı oluşturuyoruz.
                auth.createUserWithEmailAndPassword(email,parola)
                        .addOnCompleteListener(SignUp.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {


                                //İşlem başarısız olursa kullanıcıya bir Toast mesajıyla bildiriyoruz.
                                if (!task.isSuccessful()) {

                                    Toast.makeText(getApplicationContext(), "Yetkilendirme Hatası", Toast.LENGTH_LONG).show();
                                }

                                //İşlem başarılı ise  MainActivity e yönlendiriyoruz.
                                else {
                                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                                    finish();
                                }

                            }
                        });

            }
        });


        uyeGirisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(),Login.class));
                finish();

            }
        });





    }
}

