package dev.starlai.archi.ui.tabhost.tabcontent1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dev.starlai.archi.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabContent1Fragment extends Fragment {


    public TabContent1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab_content1, null, false);
    }

}
