package example.ti2.org.testproject;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by tisquare on 2019-01-23.
 */

public class Sub03Fragment extends Fragment {
    private static final String TAG ="Sub03Fragment";

    public Sub03Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "Sub03Fragment onCreate()");
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "Sub03Fragment onCreateView()");
        View view = inflater.inflate(R.layout.fragment_sub03, container, false);

        return view;
    }

    @Override
    public void onAttach(Context context) {
        Log.d(TAG, "Sub03Fragment onAttach()");
        super.onAttach(context);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "Sub03Fragment onViewCreated()");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, "Sub03Fragment onActivityCreated()");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d(TAG, "Sub03Fragment onStart()");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d(TAG, "Sub03Fragment onResume()");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d(TAG, "Sub03Fragment onPause()");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d(TAG, "Sub03Fragment onStop()");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "Sub03Fragment onDestroy()");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d(TAG, "Sub03Fragment onDetach()");
        super.onDetach();
    }
}
