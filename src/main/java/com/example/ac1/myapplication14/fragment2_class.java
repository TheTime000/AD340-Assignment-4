package com.example.ac1.myapplication14;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class fragment2_class extends Fragment {
    private static final String TAG = "tab2_main";
    private Button chatbtn;
    private Button profilebtn;
    private View view;
    private ImageView image;
    private TextView info;

    public fragment2_class(){
        int n=0;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab2_main, container, false);

        fragment1_class frag1 = new fragment1_class();

        chatbtn = (Button) view.findViewById(R.id.chatbtn);
        profilebtn = (Button) view.findViewById(R.id.profilebtn);
        image = (ImageView) view.findViewById(R.id.imageView);
        info = (TextView) view.findViewById(R.id.info);

        info.setText(frag1.text());


        chatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chat();
            }
        });

        profilebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fragment2_class.this, fragment1_class.class);
                startActivity(intent);
            }
        });

        return view;
    }

    public void chat() {
        Intent intent = new Intent (fragment2_class.this , fragment3_class.class );
        startActivity(intent);

}

}



