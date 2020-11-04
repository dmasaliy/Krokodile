package com.game.krokodile;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    Button play;
    TextView textView;
    ImageView whose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        play = (Button) findViewById(R.id.play);
        textView = (TextView) findViewById(R.id.textView);
        whose = (ImageView) findViewById(R.id.whose);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play.setEnabled(false);
                play.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        play.setEnabled(true);
                    }
                }, 2000);
                playRoller();
            }
        });
    }


    @SuppressLint("UseCompatLoadingForDrawables")
    private void playRoller() {
        int rolNumber = (int) (Math.random() * 10 + 1);

        switch (rolNumber) {
            case 1:
                //Glide.with(this).load(imageSelected).into(imageView);
                //whose.setImageDrawable(getResources().getDrawable(R.drawable.duck));
                Glide.with(this).load(R.drawable.duck).into(whose);
                textView.setText("Duck");
                Toast.makeText(this, "Duck", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Glide.with(this).load(R.drawable.gnome).into(whose);
                textView.setText("Gnome");
                Toast.makeText(this, "Gnome", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Glide.with(this).load(R.drawable.broom).into(whose);
                textView.setText("Broom");
                Toast.makeText(this, "broom", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Glide.with(this).load(R.drawable.house).into(whose);
                textView.setText("House");
                Toast.makeText(this, "House", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                Glide.with(this).load(R.drawable.honey).into(whose);
                textView.setText("Honey");
                Toast.makeText(this, "Honey", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                Glide.with(this).load(R.drawable.laptop).into(whose);
                textView.setText("Laptop");
                Toast.makeText(this, "Laptop", Toast.LENGTH_SHORT).show();
                break;
            case 7:
                Glide.with(this).load(R.drawable.toilet).into(whose);
                textView.setText("Toilet");
                Toast.makeText(this, "Toilet", Toast.LENGTH_SHORT).show();
                break;
            case 8:
                Glide.with(this).load(R.drawable.ice_cream).into(whose);
                textView.setText("Ice cream");
                Toast.makeText(this, "Ice cream", Toast.LENGTH_SHORT).show();
                break;
            case 9:
                Glide.with(this).load(R.drawable.knife).into(whose);
                textView.setText("Knife");
                Toast.makeText(this, "Knife", Toast.LENGTH_SHORT).show();
                break;
            case 10:
                Glide.with(this).load(R.drawable.nuts).into(whose);
                textView.setText("Nuts");
                Toast.makeText(this, "Nuts", Toast.LENGTH_SHORT).show();
                break;
            case 11:
                Glide.with(this).load(R.drawable.chookolate).into(whose);
                textView.setText("Chokoolate");
                Toast.makeText(this, "Chokoolate", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}