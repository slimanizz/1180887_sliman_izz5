package com.example.a1180887_sliman_izz;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.jetbrains.annotations.Nullable;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment2.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment2 newInstance(String param1, String param2) {
        Fragment2 fragment = new Fragment2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_2, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        final Fragment1.communicator1 communicator = (Fragment1.communicator1)getActivity();
        TextView result = getView().findViewById(R.id.square_result);
        Button increment = getView().findViewById(R.id.button_increment);
        Button decrement = getView().findViewById(R.id.button_decrement);
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView) getActivity().findViewById(R.id.square_result);
                String number = textView.getText().toString();
                int num;
                if(number.isEmpty()) {
                    TextView textView2 = (TextView) getActivity().findViewById(R.id.square_result);
                    number = textView2.getText().toString();
                }
                num = Integer.parseInt(number);
                int newVal = num + 1;
                communicator.respond1(newVal + "");
            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView) getActivity().findViewById(R.id.square_result);
                String number = textView.getText().toString();
                int num;
                if(number.isEmpty()) {
                    TextView textView2 = (TextView) getActivity().findViewById(R.id.square_result);
                    number = textView2.getText().toString();
                }
                num = Integer.parseInt(number);
                int newVal = num - 1;
                communicator.respond1(newVal + "");
            }
        });
    }

    interface communicator2 {
        public void respond2(String data);
    }

    public void changeData(String data) {
        TextView textView = (TextView) getActivity().findViewById(R.id.square_result);
        textView.setText(data);
    }

}