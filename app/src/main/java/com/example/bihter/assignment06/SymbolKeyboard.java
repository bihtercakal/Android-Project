package com.example.bihter.assignment06;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class SymbolKeyboard extends Fragment {


    Button submit;

    //This method provides that submit when using symbol keyboard
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.symbol_keyboard, viewGroup, false);
        submit = (Button) view.findViewById(R.id.btnSave);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),MainActivity.edt1.getText(),Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }








}
