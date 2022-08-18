package com.example.cw6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int currentStudent =0 ;

ArrayList<Student> studentArrayList = new ArrayList<>() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView bobimage = findViewById(R.id.bobimage) ;

        Button button = findViewById(R.id.butt1) ;

        TextView bobage = findViewById(R.id.bobage) ;
        TextView bobnm = findViewById(R.id.bobnm) ;
        TextView bobgrade = findViewById(R.id.bobgrade) ;
        TextView bobgrade2 = findViewById(R.id.bobgrade2) ;
        TextView bobnm2 = findViewById(R.id.bobnm2) ;
        TextView bobage2 = findViewById(R.id.bobage2) ;



                Intent intent = new Intent() ;

                Student student1 = new Student("Bob 1" ,    17 ,    88 , R.drawable.user_avatar_contact_portfolio_personal_portrait_profile_1_5182) ;
                Student student2 = new Student("Bob 2" ,    16 ,    99 , R.drawable.user_avatar_contact_portfolio_personal_portrait_profile_1_5182) ;
                Student student3 = new Student("Bob 3" ,    15 ,    100 , R.drawable.user_avatar_contact_portfolio_personal_portrait_profile_1_5182) ;

                studentArrayList.add(student1) ;
                studentArrayList.add(student2) ;
                studentArrayList.add(student3) ;

                bobimage.setImageResource(studentArrayList.get(currentStudent).getStudentImage());
                bobnm.setText(studentArrayList.get(currentStudent).getStudentName());
                bobage.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentAge()));
                bobgrade.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentGrade()));


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentStudent++ ;
                if (currentStudent==studentArrayList.size() ) {
                    currentStudent = 0;
                }


                bobimage.setImageResource(studentArrayList.get(currentStudent).getStudentImage());
                bobnm.setText(studentArrayList.get(currentStudent).getStudentName());
                bobage.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentAge()));
                bobgrade.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentGrade()));

          }









            });
        }













    }


