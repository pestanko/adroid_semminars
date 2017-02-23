package cz.muni.fi.android2.pstanko.cv01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String message = getIntent().getStringExtra("EXTRA_MESSAGE");
        Toast.makeText(getApplicationContext(), message + " sent!", Toast.LENGTH_SHORT).show();

    }
}
