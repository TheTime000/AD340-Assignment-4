package com.example.ac1.myapplication14;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class fragment1_class extends Fragment {
    private static final String TAG = "tab1_main";
    private Button edit;
    private EditText firstLast;
    private EditText email;
    private EditText phone;
    private EditText psw;
    private EditText Aka;
    private EditText about;
    private EditText lookin;
    private ImageView image;

    public fragment1_class(){
        int nu =0;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1_main, container, false);

        edit = (Button) view.findViewById(R.id.button);
        firstLast= (EditText) view.findViewById(R.id.firstLast);
        email= (EditText) view.findViewById(R.id.email);
        phone= (EditText) view.findViewById(R.id.phone);
        psw= (EditText) view.findViewById(R.id.psw);
        Aka= (EditText) view.findViewById(R.id.Aka);
        about= (EditText) view.findViewById(R.id.about);
        image= (ImageView) view.findViewById(R.id.image);


        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent (fragment1_class.this, fragment1_class.class );
                //startActivity(intent);

            }
        });

        return view;
    }

    public String text() {
        return this.firstLast.getText().toString()+" AKA "+this.Aka.getText().toString()+" 29'";
    }
}



