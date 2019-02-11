package example.ti2.org.testproject;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Sub01Fragment.OnFragmentInteractionListener{
    private static final String TAG ="MainActivity";
    private Sub02Fragment mSub02Fragment;
    private Fragment mSub03Fragment;
    private EditText editText;
    private TextView cButton;
    private Button moveAnotherFragment;


    @Override
    public void onCreate(final Bundle savedInstanceState) {
        // 깃헙
        Log.d(TAG, "MainActivity onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mSub01Fragment = new Sub01Fragment();
        editText = (EditText) findViewById(R.id.a_main_fragment01).findViewById(R.id.f_sub01_et);
        moveAnotherFragment = (Button) findViewById(R.id.move_to_fragment);

        moveAnotherFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                mSub03Fragment = (Fragment)fm.findFragmentById(R.id.a_main_fragment03);
                fragmentTransaction.hide(mSub03Fragment);
                fragmentTransaction.commit();
            }
        });

        cButton = (TextView)findViewById(R.id.change_activity);

        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), NextActivity.class);
                intent.putExtra("test", editText.getText().toString());
                startActivity(intent);
            }
        });

        mSub02Fragment = new Sub02Fragment();

        Intent intent2 = getIntent();
        if(getIntent() != null){
            String check = intent2.getStringExtra("back");
            try{
                editText.setText(check);
                editText.setSelection(check.length());
            } catch (Exception e) {
                editText.setText("");
            }
        }
    }

    @Override
    public void onFragmentInteraction(String text) {
        mSub02Fragment.setTextView(text);
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
