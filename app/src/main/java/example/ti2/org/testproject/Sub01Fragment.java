package example.ti2.org.testproject;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by tisquare on 2019-01-23.
 */

public class Sub01Fragment extends Fragment {
    private static final String TAG ="Sub01Fragment";
    private OnFragmentInteractionListener mListener;

    public Sub01Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "Sub01Fragment onCreate()");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "Sub01Fragment onCreateView()");

        View view = inflater.inflate(R.layout.fragment_sub01, container, false);

        final EditText editText = view.findViewById(R.id.f_sub01_et);
        Button button = view.findViewById(R.id.f_sub01_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mListener != null) {
                    String input = editText.getText().toString();
                    mListener.onFragmentInteraction(input);
                }
            }
        });

        return view;
    }

    @Override
    public void onAttach(Context context) {
        Log.d(TAG, "Sub01Fragment onAttach()");
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        Log.d(TAG, "Sub01Fragment onDetach()");
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onStart() {
        Log.d(TAG, "Sub01Fragment onStart()");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d(TAG, "Sub01Fragment onResume()");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d(TAG, "Sub01Fragment onPause()");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d(TAG, "Sub01Fragment onStop()");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "Sub01Fragment onDestroy()");
        super.onDestroy();
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(String text);
    }
}
