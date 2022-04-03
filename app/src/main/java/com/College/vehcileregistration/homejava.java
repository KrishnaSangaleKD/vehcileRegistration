package com.College.vehcileregistration;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.College.vehcileregistration.R;

public class homejava extends Fragment
{
TextView title,desc;
DatebaseFunction DFB;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

    View v = inflater.inflate(R.layout.homefragement,container,false);
    title = v.findViewById(R.id.vehcile1title);
    desc = v.findViewById(R.id.vehcile1no);
    DFB=new DatebaseFunction(getContext());

    Cursor cursor = DFB.displaynotes();
        if (cursor.getCount()== 0){
                title.setText("hello");
                desc.setText("Abhijeet");
            }

          else    {
    while (cursor.moveToNext()) {
        title.setText(cursor.getString(0));
        desc.setText(cursor.getString(1));
    }
        }

        return v;
    }


}
