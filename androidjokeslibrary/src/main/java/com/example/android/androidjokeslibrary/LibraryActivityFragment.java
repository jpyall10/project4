package com.example.android.androidjokeslibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class LibraryActivityFragment extends Fragment {

    public LibraryActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_library, container, false);

        TextView jokeView = (TextView)root.findViewById(R.id.joke_textview);
        Intent intent = getActivity().getIntent();
        String joke = intent.getStringExtra(LibraryActivity.JOKE_KEY);
        if (joke != null && joke.length() != 0) {
            jokeView.setText(joke);
        }

        return root;

    }
}
