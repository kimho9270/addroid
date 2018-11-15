package com.example.a405_24.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = MainActivity.this;
        final EditText num1 = findViewById(R.id.num1);
        final EditText num2 = findViewById(R.id.num2);
        final TextView tv = findViewById(R.id.textView);
        int c = 0;
        class Calc{
            int num1,num2,res;
            String op;
            public void exe(){
                switch (op){
                    case "+":res = num1+num2; break;
                    case "-":
                        res = num1-num2;break;
                    case "*":res = num1*num2;break;
                    case "/":res = num1/num2;break;
                }

            }
            public void setNum1(int num1){
                this.num1 = num1;
            }
            public int getNum1(){
                return num1;
            }
            public void setNum2(int num2){
                this.num2 = num2;
            }
            public int getNum2(){
                return num2;
            }
            public void setRes(int res){
                this.res = res;
            }
            public int getRes(){
                return res;
            }
            public void setOp(String op){
                this.op = op;
            }
            public String getOp(){
                return op;
            }

        }
        final Calc calc = new Calc();
        findViewById(R.id.plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());
                int c = a+b;
                Toast.makeText(ctx,"덧셈결과 : "+c,Toast.LENGTH_LONG).show();
                tv.setText(c+"");
            }
        });
        findViewById(R.id.minus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());
                int c = a-b;
                Toast.makeText(ctx,"뺄셈결과"+c,Toast.LENGTH_LONG).show();
                tv.setText(c+"");
            }
        });
        findViewById(R.id.multiply).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());

                int c = a*b;
                Toast.makeText(ctx,"곱셈 결과 : "+c,Toast.LENGTH_LONG).show();
                tv.setText(c+"");
            }
        });
        findViewById(R.id.division).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());

                int c = a/b;
                Toast.makeText(ctx,"나누셈결과 : "+c,Toast.LENGTH_LONG).show();
                tv.setText(c+"");
            }
        });
    }
}
