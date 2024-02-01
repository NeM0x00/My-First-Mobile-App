package com.test.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // For Welcome Message Pop up
        Toast.makeText(this,"Welcome Master" ,Toast.LENGTH_LONG).show();
    }

    public void onbtnRegisterClick(View view){
        //Here is The Text View
        TextView FirstName = findViewById(R.id.textView1);
        TextView LastName =findViewById(R.id.textView2);
        TextView Email = findViewById(R.id.textView3) ;
        TextView Phone = findViewById(R.id.textView4) ;

        // Variables
        EditText txt1 = findViewById(R.id.FirstName) ;
        EditText txt2 = findViewById(R.id.LastName) ;
        EditText txt3 = findViewById(R.id.Email);
        EditText txt4 = findViewById(R.id.Phone);

        //Print the Process
        FirstName.setText("First Name : " + txt1.getText().toString() );
        LastName.setText("Last Name : " + txt2.getText().toString());
        Email.setText("Email : " + txt3.getText().toString() );
        Phone.setText("Phone : " + txt4.getText().toString());

    }
}