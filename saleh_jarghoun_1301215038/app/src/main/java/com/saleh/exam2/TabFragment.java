package com.saleh.exam2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TabFragment extends Fragment {

    private static final String ARG_TAB = "tab_number";

    public static TabFragment newInstance(int tabNumber) {
        TabFragment fragment = new TabFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_TAB, tabNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab, container, false);
        TextView tv = view.findViewById(R.id.tvTabTitle);
        int n = getArguments() != null ? getArguments().getInt(ARG_TAB, 1) : 1;
        String[] names = {"First", "Second", "Third"};
        tv.setText("This is the " + names[n - 1] + " Tab");
        return view;
    }
}
