package com.example.srima.loginvalidation;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import android.view.View;

import android.widget.EditText;
import android.widget.Toast;


import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import org.w3c.dom.Text;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText) findViewById(R.id.maill);
        password=(EditText) findViewById(R.id.pass);
        button=(Button)findViewById(R.id.but);
        String user =username .getText().toString();
        String pwd=password.getText().toString();
           if((user.equals(""))&&(pwd.equals(""))){
               button.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Toast.makeText(getApplicationContext(),"both fields are mandatory",Toast.LENGTH_LONG).show();
                   }
               });

       }else if((user!=null)&&(pwd!=null)){
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(),"both fields ",Toast.LENGTH_LONG).show();
                }
            });
        }

}
}