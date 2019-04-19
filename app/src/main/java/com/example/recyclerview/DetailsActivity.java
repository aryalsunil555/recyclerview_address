package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsActivity extends AppCompatActivity {
    CircleImageView circImg;
    TextView tvFullname, tvPhoneNum,tvEmail,tvAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        circImg=findViewById(R.id.imgDetailsProfile);
        tvFullname=findViewById(R.id.tvFullName);
        tvPhoneNum=findViewById(R.id.tvPhone_Details);
        tvAddress=findViewById(R.id.tvAddress);
        tvEmail=findViewById(R.id.tvEmail);

        Bundle bundle=getIntent().getExtras();

        if(bundle!=null){
            circImg.setImageResource(bundle.getInt("image"));
            tvFullname.setText(bundle.getString("name"));
            tvPhoneNum.setText(bundle.getString("phone"));
            tvEmail.setText(bundle.getString("email"));
            tvAddress.setText(bundle.getString("address"));

        }
    }
}
