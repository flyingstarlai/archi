package dev.starlai.archi.ui.menucontent;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dev.starlai.archi.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuContentFragment extends Fragment {


    public MenuContentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu_content, container, false);
    }

}
