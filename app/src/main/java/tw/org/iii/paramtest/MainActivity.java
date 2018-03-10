package tw.org.iii.paramtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoPage2(View view) {
        Intent intent =
                new Intent(this, Page2Activity.class);
        intent.putExtra("name", "Brad");
        intent.putExtra("stage", 4);
        intent.putExtra("sound", true);
        //startActivity(intent);
        startActivityForResult(intent, 412);
    }

    public void gotoPage3(View view) {
        Intent intent =
                new Intent(this, Page3Activity.class);
        //startActivity(intent);
        startActivityForResult(intent, 174);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.v("brad", "onActivityResult");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("brad", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("brad", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("brad", "onRestart");
    }
}
