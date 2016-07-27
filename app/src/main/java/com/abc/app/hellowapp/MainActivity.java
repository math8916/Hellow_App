package com.abc.app.hellowapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{
    EditText first_num, second_num;
    Button bt_pluse,bt_minus,bt_multi,bt_divid,bt_persent,bt_result;
    TextView tv_result;
    private int calresult3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first_num= (EditText) findViewById(R.id.first_num);
        second_num= (EditText) findViewById(R.id.second_num);
        bt_pluse= (Button) findViewById(R.id.bt_pluse);
        bt_minus= (Button) findViewById(R.id.bt_minus);
        bt_multi= (Button) findViewById(R.id.bt_multi);
        bt_divid= (Button) findViewById(R.id.bt_divid);
        bt_persent= (Button) findViewById(R.id.bt_persent);
        bt_result= (Button) findViewById(R.id.bt_result);
        tv_result= (TextView) findViewById(R.id.tv_result);
        bt_pluse.setOnClickListener(this);
        bt_minus.setOnClickListener(this);
        bt_multi.setOnClickListener(this);
        bt_divid.setOnClickListener(this);
        bt_persent.setOnClickListener(this);
        bt_result.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_pluse:
            Toast.makeText(MainActivity.this,first_num.getText().toString(),Toast.LENGTH_LONG).show();
            Toast.makeText(MainActivity.this,second_num.getText().toString(),Toast.LENGTH_LONG).show();
                this.setCalresult3(
                    Integer.parseInt(first_num.getText().toString())+Integer.parseInt(second_num.getText().toString()));
                break;
            case R.id.bt_minus:
                this.setCalresult3(
                        Integer.parseInt(first_num.getText().toString())-Integer.parseInt(second_num.getText().toString()));
                break;
            case R.id.bt_multi:
                this.setCalresult3(
                        Integer.parseInt(first_num.getText().toString())*Integer.parseInt(second_num.getText().toString())
                );
                break;
            case R.id.bt_divid:
                this.setCalresult3(Integer.parseInt(first_num.getText().toString())/Integer.parseInt(second_num.getText().toString()));
                break;
            case R.id.bt_persent:
                this.setCalresult3(Integer.parseInt(first_num.getText().toString())%Integer.parseInt(second_num.getText().toString()));
                break;

            case R.id.bt_result:
                this.tv_result.setText("계산 결과:"+this.getCalresult3());
                break;

        }
    }

    public int getCalresult3() {
        return calresult3;
    }

    public void setCalresult3(int calresult3) {
        this.calresult3 = calresult3;
    }
}
