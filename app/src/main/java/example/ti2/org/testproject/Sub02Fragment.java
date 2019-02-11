package example.ti2.org.testproject;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by tisquare on 2019-01-23.
 */

public class Sub02Fragment extends Fragment {
    private static final String TAG ="Sub02Fragment";
    private static TextView mTextView;

    public Sub02Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "Sub02Fragment onCreate()");
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "Sub02Fragment onCreateView()");
        View view = inflater.inflate(R.layout.fragment_sub02, container, false);

        mTextView = view.findViewById(R.id.f_sub02_tv);

        return view;
    }

    public void setTextView(String text) {
        mTextView.setText(text);
    }

    @Override
    public void onAttach(Context context) {
        Log.d(TAG, "Sub02Fragment onAttach()");
        super.onAttach(context);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "Sub02Fragment onViewCreated()");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, "Sub02Fragment onActivityCreated()");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d(TAG, "Sub02Fragment onStart()");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d(TAG, "Sub02Fragment onResume()");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d(TAG, "Sub02Fragment onPause()");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d(TAG, "Sub02Fragment onStop()");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "Sub02Fragment onDestroy()");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d(TAG, "Sub02Fragment onDetach()");
        super.onDetach();
    }
}
