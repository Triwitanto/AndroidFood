package androidfood.triwi.id.androidfood;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button btnSignIn, btnRegister, btnHitung, btnCoba;
    TextView txtJudul;
    EditText textMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignIn = (Button) findViewById(R.id.btnLogin);
        btnRegister = (Button) findViewById(R.id.btnRegister);
        btnHitung = (Button) findViewById(R.id.btnHitung);
        btnCoba = (Button) findViewById(R.id.btnCoba);
        textMessage = (EditText) findViewById(R.id.textMessage);

        txtJudul = (TextView) findViewById(R.id.txtJudul);
        Typeface face = Typeface.createFromAsset(getAssets(), "font/txtjudul.TTF");
        txtJudul.setTypeface(face);


            btnSignIn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String title = getResources().getString(R.string.pesan);
                    Intent sendIntent = new Intent();
                    sendIntent.setAction(Intent.ACTION_SEND);
                    sendIntent.putExtra(Intent.EXTRA_TEXT, title);
                    sendIntent.setType("text/plain");

                    if (sendIntent.resolveActivity(getPackageManager()) != null) {
                        startActivity(sendIntent);
                    }
                }
            });


            btnRegister.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);

                    startActivity(intent);

                }
            });

            btnHitung.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, HitungActivity.class);

                    startActivity(intent);

                }
            });

            btnCoba.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, HitungActivity.class);
                    startActivity(intent);
                }
            });
        }

    }
