package cz.muni.fi.android2.pstanko.cv01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button loginButton;
    private EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = (Button) findViewById(R.id.loginButton);
        text = (EditText) findViewById(R.id.message);
        loginButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                // 1st activity
                Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                intent.putExtra("EXTRA_MESSAGE", text.getText());
                startActivity(intent);

            }
        });
    }
}
