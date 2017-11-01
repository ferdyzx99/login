package com.example.ma.loginscreen;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ma.loginscreen.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    Button botonLogin;
    Button botonRegistrarse;
    Button botonInvitado;


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        botonInvitado = (Button) view.findViewById(R.id.ActivityLogingBTN_Invitado);
        botonLogin = (Button) view.findViewById(R.id.activityLogin_btn_Login);


        //listener boton invitado
        botonInvitado.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Mensajeria mensajeria = (Mensajeria) getContext();
                mensajeria.vaInvitado("invitado");
            }
        });


        //listener boton login
        botonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (validate() == true) {
                    EditText mieditText =  view.findViewById(R.id.logininputNameEditText);
                    Mensajeria mensajeria = (Mensajeria) getContext();
                    mensajeria.vaUsuario(mieditText.getText().toString() );



                }

            }
        });


        return view;

    }


    public interface Mensajeria {
        public void vaInvitado(String usuario);

        public void vaUsuario(String usuario);


    }


    final private boolean validate() {
        //aca hay que programar la validacion
        return true;
    }


}
