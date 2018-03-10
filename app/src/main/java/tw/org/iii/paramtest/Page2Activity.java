package tw.org.iii.paramtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Page2Activity extends AppCompatActivity {
    private TextView tv;
    private MainApp mainApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        mainApp = (MainApp)getApplication();
        Log.v("brad", "page2:myrand=" + mainApp.myrand);

        tv = findViewById(R.id.tv);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int stage = intent.getIntExtra("stage", -1);
        boolean sound = intent.getBooleanExtra("sound", false);

        tv.setText("Name: " + name + "\n" +
            "Stage: " + stage + "\n" +
            "Sound: " + (sound?"On":"Off"));


    }

    public void test2(View view) {
        int rand = (int)(Math.random()*49+1);
        Log.v("brad", "page2: rand = " + rand);
        //setResult(RESULT_OK);

        Intent intent = new Intent();
        intent.putExtra("rand", rand);
        setResult(RESULT_OK, intent);
        finish();
    }
}
