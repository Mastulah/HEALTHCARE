package com.example.agam;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDetails extends AppCompatActivity {
    private final String[][] doctor_details1 =
            {
                    {"Doctor Name : Nantume Massy", "Hospital Address : Kamwokya", "Exp : 5years", "Mobile no: 077498272828", "600"},
                    {"Doctor Name : Natayi Carol", "Hospital Address : Nansana", "Exp : 3years", "Mobile no: 077498283648", "900"},
                    {"Doctor Name : Namutebi Sarah", "Hospital Address : Kawempe", "Exp : 9years", "Mobile no: 077498273892", "300"},
                    {"Doctor Name : Namubiru Leilah", "Hospital Address : Rubaga", "Exp : 5years", "Mobile no: 077498271096", "500"},
                    {"Doctor Name : Lubega Hakim", "Hospital Address : Nsambya", "Exp : 4years", "Mobile no: 077498272094", "800"}
            };

    private final String[][] doctor_details2 =
            {
                    {"Doctor Name : Kafero Kai", "Hospital Address : Kamwokya", "Exp : 5years", "Mobile no: 077498272828", "600"},
                    {"Doctor Name : Nakafero Carol", "Hospital Address : Nansana", "Exp : 3years", "Mobile no: 077498283648", "900"},
                    {"Doctor Name : Ssebuli Sarah", "Hospital Address : Kawempe", "Exp : 9years", "Mobile no: 077498273892", "300"},
                    {"Doctor Name : Adochi Leilah", "Hospital Address : Rubaga", "Exp : 5years", "Mobile no: 077498271096", "500"},
                    {"Doctor Name : Kigozi Hakim", "Hospital Address : Nsambya", "Exp : 4years", "Mobile no: 077498272094", "800"}
            };
    private final String[][] doctor_details3 =
            {
                    {"Doctor Name : Nankya Michelle", "Hospital Address : Kamwokya", "Exp : 5years", "Mobile no: 077498272828", "600"},
                    {"Doctor Name : Luzinda Maria", "Hospital Address : Nansana", "Exp : 3years", "Mobile no: 077498283648", "900"},
                    {"Doctor Name : Laggu Ken", "Hospital Address : Kawempe", "Exp : 9years", "Mobile no: 077498273892", "300"},
                    {"Doctor Name : Ankunda Andrew", "Hospital Address : Rubaga", "Exp : 5years", "Mobile no: 077498271096", "500"},
                    {"Doctor Name : Mwaya Benson", "Hospital Address : Nsambya", "Exp : 4years", "Mobile no: 077498272094", "800"}
            };

    private final String[][] doctor_details4 =
            {
                    {"Doctor Name : Lukwago Karim", "Hospital Address : Kamwokya", "Exp : 5years", "Mobile no: 077498272828", "600"},
                    {"Doctor Name : Kyagulanyi Adam", "Hospital Address : Nansana", "Exp : 3years", "Mobile no: 077498283648", "900"},
                    {"Doctor Name : Museveni Khalil", "Hospital Address : Kawempe", "Exp : 9years", "Mobile no: 077498273892", "300"},
                    {"Doctor Name : Kibuye Kim", "Hospital Address : Rubaga", "Exp : 5years", "Mobile no: 077498271096", "500"},
                    {"Doctor Name : Nankunda Hadijah", "Hospital Address : Nsambya", "Exp : 4years", "Mobile no: 077498272094", "800"}
            };

    private final String[][] doctor_details5 =
            {
                    {"Doctor Name : Lutaaya Mary", "Hospital Address : Kamwokya", "Exp : 5years", "Mobile no: 077498272828", "600"},
                    {"Doctor Name : Nalutaaya Zaina", "Hospital Address : Nansana", "Exp : 3years", "Mobile no: 077498283648", "900"},
                    {"Doctor Name : Nabukenya Leinah", "Hospital Address : Kawempe", "Exp : 9years", "Mobile no: 077498273892", "300"},
                    {"Doctor Name : Nakisozi Mastulah", "Hospital Address : Rubaga", "Exp : 5years", "Mobile no: 077498271096", "500"},
                    {"Doctor Name : Gitrode Evelyne", "Hospital Address : Nsambya", "Exp : 4years", "Mobile no: 077498272094", "800"}
            };
    TextView tv;
    Button btn;
    String[][] doctor_details = {};
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);

        tv = findViewById(R.id.textViewDDTitle);
        btn = findViewById(R.id.buttonDDBack);

        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);

        if(title.compareTo("Family Physicians")==0)
            doctor_details = doctor_details1;
        else
        if(title.compareTo("Dietician")==0)
            doctor_details = doctor_details2;
        else
        if(title.compareTo("Dentist")==0)
            doctor_details = doctor_details3;
        else
        if(title.compareTo("Surgeon")==0)
            doctor_details = doctor_details4;
        else
            doctor_details = doctor_details5;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctorDetails.this, FindDoctor.class));
            }
        });

        list = new ArrayList();
        for (String[] doctorDetail : doctor_details) {
            item = new HashMap<String, String>();
            item.put("line1", doctorDetail[0]);
            item.put("line2", doctorDetail[1]);
            item.put("line3", doctorDetail[2]);
            item.put("line4", doctorDetail[3]);
            item.put("line5", "Cons Fees:" + doctorDetail[4] + "/=");
            list.add(item);
        }
//        sa = new SimpleAdapter(this,)
    }
}