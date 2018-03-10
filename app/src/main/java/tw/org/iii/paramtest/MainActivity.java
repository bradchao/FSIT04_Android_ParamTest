package tw.org.iii.paramtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private MainApp mainApp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainApp = (MainApp) getApplication();
        Log.v("brad", "MainActivity:myrand = " + mainApp.myrand);

        mainApp.myrand = (int)(Math.random()*49+1);
        Log.v("brad", "MainActivity:myrand = " + mainApp.myrand);

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
        Log.v("brad", "onActivityResult:" + resultCode);

        if (resultCode == RESULT_OK &&
                requestCode == 412){
            int rand = data.getIntExtra("rand", -1);
            Log.v("brad", "OK:" + rand);
        }else {
            Log.v("brad", "XX");
        }

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
