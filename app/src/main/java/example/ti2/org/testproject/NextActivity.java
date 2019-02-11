package example.ti2.org.testproject;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {
    private static final String TAG ="NextActivity";
    private TextView textView;
    private Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "NextActivity onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);


        textView = (TextView)findViewById(R.id.textView2);
        buttonBack = (Button)findViewById(R.id.backMain);

        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("test"));
        if(intent.getStringExtra("test") == null || intent.getStringExtra("test").equals("")){
            textView.setText("null값");
            textView.setTextColor(Color.RED);
            textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        }

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(v.getContext(), MainActivity.class);
                if(textView.getText().equals("null값")){
                    intent2.putExtra("back","");
                }else{
                    intent2.putExtra("back",textView.getText());
                }

                startActivity(intent2);
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "MainActivity onRestart() called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "MainActivity onStart() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "MainActivity onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "MainActivity onPause() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "MainActivity onStop() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "MainActivity onDestroy() called");
    }
}
