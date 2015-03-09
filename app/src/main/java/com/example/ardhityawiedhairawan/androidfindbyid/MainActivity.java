package com.example.ardhityawiedhairawan.androidfindbyid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/*
*  Ardhitya Wiedha Irawan
*  @papap_aila
*  March 2015
* */
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);

        LinearLayout container = (LinearLayout) this.findViewById(R.id.countainer);
        // Mendefinisikan textview dengan bantuan variable container yang sudah dideklarasikan diatasnya
        TextView t = (TextView) container.findViewById(R.id.textView);
        t.setText(R.string.copyright);
        // Mendefinisikan ImageView dengan bantuan variable container yang sudah dideklarasikan diatasnya
        ImageView im = (ImageView) container.findViewById(R.id.imageView);
        im.setImageResource(R.drawable.androlite);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Aw aw aw aw ...",Toast.LENGTH_SHORT );
                toast.show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.linkmarket)));
                startActivity(intent);

            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
