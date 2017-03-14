package ro.pub.cs.systems.eim.lab3.phonedialer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class PhoneDialerActivity extends AppCompatActivity {

    EditText phoneNumber;


    private class MyButtonListener implements OnClickListener
    {
        @Override
        public void onClick(View v) {
            String text = phoneNumber.getText();
            text += ((Button)v).getText().toString();
            phoneNumber.setText(text);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);
        phoneNumber = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button0);
    }
}
