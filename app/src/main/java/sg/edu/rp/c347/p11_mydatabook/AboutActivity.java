package sg.edu.rp.c347.p11_mydatabook;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class AboutActivity extends AppCompatActivity {

    ActionBar ab;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        imageView = findViewById(R.id.imgView);

        String imageUrl = "https://upload.wikimedia.org/wikipedia/commons/8/80/Republic_Polytechnic_Logo.jpg";
        Picasso.with(getApplicationContext()).load(imageUrl).into(imageView);
    }
}
