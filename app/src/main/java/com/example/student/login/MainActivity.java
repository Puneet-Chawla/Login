package com.example.student.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button b1;
    EditText tv,tv1;
    CheckBox c1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        tv=(EditText)findViewById(R.id.tv);
        tv1=(EditText)findViewById(R.id.tv2);
        c1=(CheckBox)findViewById(R.id.c1);
    }
    public void clicked(View v)
    {
        if(tv.getText().toString()=="Puneet" && tv1.getText().toString()=="Puneet" &&c1.isChecked()==true)
        {
            Intent i=new Intent(this,Main2Activity.class);
            startActivity(i);
        }
        else
        {
            tv.setText(" ");
            tv1.setText(" ");
            tv.setError("Enter valid Id");
            tv1.setError("Enter valid Password");
            //c1.isChecked()=false;
        }
    }
}
