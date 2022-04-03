package com.College.vehcileregistration;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.College.vehcileregistration.R;
import com.google.android.material.textfield.TextInputEditText;

public class addjava extends Fragment

{
    Button AddVecical;
    DatebaseFunction DBF;
    EditText VecicaleNO,OwnerName,OwnerAddress,Monthandyear,dateofregister,wheeler,color,compny;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.addfragement,container,false);
//            VecicaleNO = v.findViewById(R.id.vehcilenum);
//            OwnerName= v.findViewById(R.id.ownername);
//            OwnerAddress= v.findViewById(R.id.owneraddress);
//            Monthandyear= v.findViewById(R.id.monthandyear);
//            dateofregister= v.findViewById(R.id.date);
//            wheeler= v.findViewById(R.id.wheeler);
//            color= v.findViewById(R.id.color);
//            compny= v.findViewById(R.id.company);
//            AddVecical =v.findViewById(R.id.Addbutton);
//            DBF = new DatebaseFunction(getContext());
//
//            AddVecical.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    boolean result = DBF.insertVecical(VecicaleNO.getText().toString(),OwnerName.getText().toString(),OwnerAddress.getText().toString(),Monthandyear.getText().toString(),dateofregister.getText().toString(),wheeler.getText().toString(),color.getText().toString(),compny.getText().toString());
//                    if(result){
//                        Toast.makeText(getContext(),"Save Successfully",Toast.LENGTH_LONG).show();
//                    }
//                    else {
//                        Toast.makeText(getContext(),"Error",Toast.LENGTH_LONG).show();
//
//                    }
//                }
//            });
        return v;
    }

}
