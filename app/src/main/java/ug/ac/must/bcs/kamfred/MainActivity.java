package ug.ac.must.bcs.kamfred;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = (TextView) findViewById(R.id.btnLogin);
    }

    public void showNextpage(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("btn")) {
            Intent intent = new Intent(this, PersonData.class);
            startActivity(intent);
        } else if (button_text.equals("btnRegister")) {
            Intent intent = new Intent(this, RegistrationForm.class);
            startActivity(intent);

        }
    }


}