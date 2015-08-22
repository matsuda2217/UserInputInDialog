package com.example.tt.userinputindialog;


import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnShow = (Button)findViewById(R.id.btnShow) ;
        final TextView textView =  (TextView) findViewById(R.id.textView);
        final LinearLayout root = (LinearLayout) findViewById(R.id.container);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //---------------Dialog------------------
                View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.user_input, null);
             final   Dialog dd = new Dialog(MainActivity.this);
                dd.setTitle("Input");

                dd.setContentView(view);
                dd.setCancelable(true);
                final EditText editText = (EditText) view.findViewById(R.id.editText);
                Button btn = (Button) view.findViewById(R.id.editText1);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "55555", Toast.LENGTH_SHORT).show();
                        textView.setText(editText.getText());
                        dd.dismiss();
                    }
                });
                dd.show();
                //----------------------end of Dialog--------------------

                //----AlertDialog----------------------
               /* View view = (LayoutInflater.from(MainActivity.this)).inflate(R.layout.user_input, null);

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setView(view);
                alertDialog.setTitle("User Input");
                alertDialog.setRecycleOnMeasureEnabled(true);
                final EditText editText = (EditText) view.findViewById(R.id.editText);
                alertDialog.setCancelable(true);
                alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, editText.getText().toString() + "55555", Toast.LENGTH_SHORT).show();
                        textView.setText(editText.getText());

                    }
                });
                alertDialog.show();*/
                // Dialog dialog = alertDialog.create();
                // dialog.show();
            }
            //-----END-------
        });
    }


}
