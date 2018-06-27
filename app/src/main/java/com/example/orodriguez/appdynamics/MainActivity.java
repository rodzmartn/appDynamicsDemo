package com.example.orodriguez.appdynamics;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import com.appdynamics.eumagent.runtime.Instrumentation;

public class MainActivity extends AppCompatActivity {

    ImageView logico;
    //EditText user, pass;
    //Button logi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        Instrumentation.start("AD-AAB-AAJ-XJW", getApplicationContext());

        logico = (ImageView)findViewById(R.id.imageView);
        //user = (EditText)findViewById(R.id.user);
        //pass = (EditText)findViewById(R.id.pass);
        //logi = (Button)findViewById(R.id.logi);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                //que hacer despues de 10 segundos
                //logico.startAnimation(animacion);
                //setContentView(R.layout.login);
                Intent intent = new Intent(getApplicationContext(),login.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();

            }
        }, 2000);

        /*logi = (Button)findViewById(R.id.logi);
        logi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.getText().equals("admin")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"Bienvenido :)", Toast.LENGTH_LONG);
                    //toast.setGravity(Gravity.CENTER,,);
                    toast.show();
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(),"Credenciales incorrectas", Toast.LENGTH_LONG);
                    //toast.setGravity(Gravity.CENTER,,);
                    toast.show();
                }
            }
        });*/
    }
}
