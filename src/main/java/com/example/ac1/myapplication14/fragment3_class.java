package com.example.ac1.myapplication14;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class fragment3_class extends Fragment {
    private static final String TAG = "tab3_main";
    private Button send;
    private EditText text;
    private TextView partner;
    private TextView user;

    public fragment3_class(){
        int n=0;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab3_main, container, false);
        text=(EditText) view.findViewById(R.id.text);
        partner=(TextView) view.findViewById(R.id.partner);
        user=(TextView) view.findViewById(R.id.user);
        send = (Button) view.findViewById(R.id.send);

        //this whole class is mostly firebase i'll focus on that for the next hw.
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setText(text.getText().toString());
            }
        });

        return view;
    }
}



