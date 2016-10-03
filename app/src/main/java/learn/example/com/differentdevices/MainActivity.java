package learn.example.com.differentdevices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import me.leolin.shortcutbadger.ShortcutBadger;

public class MainActivity extends AppCompatActivity {

    //private fields
    private int badgeCount = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void startActivity(View view){
        startActivity(new Intent(this, SecondActivity.class));
    }

    public void updateBadge(View view){
        ShortcutBadger.applyCount(this, ++badgeCount); //for 1.1.4+
    }
}
