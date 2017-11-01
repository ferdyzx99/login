package com.example.ma.loginscreen;


import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements LoginFragment.Mensajeria {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        LoginFragment fragment = new LoginFragment();
        fragmentTransaction.add(R.id.LoginActivityContenedordeFraments,fragment).commit();




    }

    @Override
    public void vaInvitado(String usuario) {

       Intent intent = new Intent(this,Suruta.class);
        Bundle mibundle = new  Bundle();
       mibundle.putString(Suruta.usuario,usuario);
       intent.putExtras(mibundle);
        startActivity(intent) ;
    }


    public  void vaUsuario(String usuario){

        Intent intent = new Intent(this,Suruta.class);
        Bundle mibundle = new  Bundle();
        mibundle.putString(Suruta.usuario,usuario);
        intent.putExtras(mibundle);
        startActivity(intent) ;





    }



}
