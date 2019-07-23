package com.example.calculator;

import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    Button one,two,three,four,five,six,seven,eight,nine,zero,addition,multiplication,subraction,divition,equal,clear;
    TextView info,answer;
    private final char ADD='+',MUL='*',DIV='/',SUB='-',EQU=0;
    private double val1=Double.NaN;
    private double val2;
    public char ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findId();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        info.setText(info.getText().toString()+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                info.setText(info.getText().toString()+"9");
            }
        });
        Arithmetic();
    }
    private void compute()
    {
        if(!Double.isNaN(val1))
        {
            val2=Double.parseDouble(info.getText().toString());
            switch (ACTION)
            {
                case ADD:
                    val1=val1+val2;
                    break;
                case SUB:
                    val1=val1-val2;
                    break;
                case MUL:
                    val1=val1*val2;
                    break;
                case DIV:
                    val1=val1/val2;
                    break;
                case EQU:
                    break;
            }
        }
        else
        {
            val1=Double.parseDouble(info.getText().toString());
        }
    }

    private void Arithmetic()
    {
    addition.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            compute();
            ACTION=ADD;
            answer.setText(String.valueOf(val1)+"+");
            info.setText(null);
        }
    });
    subraction.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            compute();
            ACTION=SUB;
            answer.setText(String.valueOf(val1)+"-");
            info.setText(null);
        }
    });
    multiplication.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            compute();
            ACTION=MUL;
            answer.setText(String.valueOf(val1)+"*");
            info.setText(null);
        }
    });
    divition.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            compute();
            ACTION=DIV;
            answer.setText(String.valueOf(val1)+"/");
            info.setText(null);
        }
    });
    equal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            compute();
            ACTION=EQU;
            answer.setText(answer.getText().toString()+ String.valueOf(val2)+"="+String.valueOf(val1));
            info.setText(null);
        }
    });
    clear.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(info.getText().length() > 0){
                CharSequence name = info.getText().toString();
                info.setText(name.subSequence(0, name.length()-1));
            }
            else{
                val1 = Double.NaN;
                val2 = Double.NaN;
                info.setText(null);
                answer.setText(null);
            }
        }
    });

}

    private void findId()
    {
        zero=findViewById(R.id.zeroBtn);
        one=findViewById(R.id.oneBtn);
        two=findViewById(R.id.twoBtn);
        three=findViewById(R.id.threeBtn);
        four=findViewById(R.id.fourBtn);
        five=findViewById(R.id.fiveBtn);
        six=findViewById(R.id.sixBtn);
        seven=findViewById(R.id.sevenBtn);
        eight=findViewById(R.id.eigthBtn);
        nine=findViewById(R.id.nintBtn);
        addition=findViewById(R.id.addBtn);
        subraction=findViewById(R.id.subBtn);
        multiplication=findViewById(R.id.mulBtn);
        divition=findViewById(R.id.divBtn);
        clear=findViewById(R.id.clearBtn);
        equal=findViewById(R.id.equBtn);

        info=findViewById(R.id.info);
        answer=findViewById(R.id.ans);
    }
}
