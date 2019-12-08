package com.abdullah.botatoface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    CheckBox ch1;
    CheckBox ch2;
    CheckBox ch3;
    CheckBox ch4;
    CheckBox ch5;
    CheckBox ch6;
    CheckBox ch7;
    CheckBox ch8;
    CheckBox ch9;
    CheckBox ch10;
    ImageView iv1;
    ImageView iv2;
    ImageView iv3;
    ImageView iv4;
    ImageView iv5;
    ImageView iv6;
    ImageView iv7;
    ImageView iv8;
    ImageView iv9;
    ImageView iv10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ch1=findViewById(R.id.ar);
        ch2=findViewById(R.id.ea);
        ch3=findViewById(R.id.ey);
        ch4=findViewById(R.id.eyb);
        ch5=findViewById(R.id.ga);
        ch6=findViewById(R.id.ha);
        ch7=findViewById(R.id.mo);
        ch8=findViewById(R.id.mu);
        ch9=findViewById(R.id.no);
        ch10=findViewById(R.id.sh);
        iv1 =findViewById(R.id.arm) ;
        iv2 =findViewById(R.id.ears) ;
        iv3 =findViewById(R.id.eyes) ;
        iv4 =findViewById(R.id.eyebrows) ;
        iv5 =findViewById(R.id.glasses) ;
        iv6 =findViewById(R.id.hat) ;
        iv7 =findViewById(R.id.mouth) ;
        iv8 =findViewById(R.id.mustache) ;
        iv9 =findViewById(R.id.nose) ;
        iv10 =findViewById(R.id.shoes) ;


        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch1.isChecked())
                    iv1.setVisibility(View.VISIBLE);
                else
                    iv1.setVisibility(View.GONE);
            }
        });

        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch2.isChecked())
                    iv2.setVisibility(View.VISIBLE);
                else
                    iv2.setVisibility(View.GONE);
            }
        });

        ch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch3.isChecked())
                    iv3.setVisibility(View.VISIBLE);
                else
                    iv3.setVisibility(View.GONE);
            }
        });

        ch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch4.isChecked())
                    iv4.setVisibility(View.VISIBLE);
                else
                    iv4.setVisibility(View.GONE);
            }
        });

        ch5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch5.isChecked())
                    iv5.setVisibility(View.VISIBLE);
                else
                    iv5.setVisibility(View.GONE);
            }
        });

        ch6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch6.isChecked())
                    iv6.setVisibility(View.VISIBLE);
                else
                    iv6.setVisibility(View.GONE);
            }
        });

        ch7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch7.isChecked())
                    iv7.setVisibility(View.VISIBLE);
                else
                    iv7.setVisibility(View.GONE);
            }
        });

        ch8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch8.isChecked())
                    iv8.setVisibility(View.VISIBLE);
                else
                    iv8.setVisibility(View.GONE);
            }
        });

        ch9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch9.isChecked())
                    iv9.setVisibility(View.VISIBLE);
                else
                    iv9.setVisibility(View.GONE);
            }
        });

        ch10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch10.isChecked())
                    iv10.setVisibility(View.VISIBLE);
                else
                    iv10.setVisibility(View.GONE);
            }
        });


    }
}