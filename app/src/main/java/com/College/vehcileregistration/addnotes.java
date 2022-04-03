package com.College.vehcileregistration;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class addnotes extends Fragment {
Button Addnotes;
EditText title,Disc;
DatebaseFunction DBF;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_addnotes, container, false);
        title = v.findViewById(R.id.et_title);
        Disc = v.findViewById(R.id.nots);
        Addnotes =v.findViewById(R.id.Addbutton);
        DBF =new DatebaseFunction(getContext());
        Addnotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean result = DBF.insertnotes(title.getText().toString(),Disc.getText().toString());
                if (result){
                    Toast.makeText(getContext(),"Save successfully",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getContext(),"Error",Toast.LENGTH_LONG).show();
                }

            }
        });

        return v;
    }
}