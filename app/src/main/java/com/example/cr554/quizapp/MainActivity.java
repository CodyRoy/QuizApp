package com.example.cr554.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Quiz quiz1 = new Quiz(getString(R.string.question_one), getString(R.string.q1_ans1), getString(R.string.q1_ans2), getString(R.string.q1_ans3));
        Quiz quiz2 = new Quiz(getString(R.string.question_two), getString(R.string.q2_ans1), getString(R.string.q2_ans2), getString(R.string.q2_ans3);
        Quiz quiz3 = new Quiz(getString(R.string.question_three), getString(R.string.q3_ans1), getString(R.string.q3_ans2), getString(R.string.q3_ans3));

        //populate layout with quiz stuff
        //textview = question
        //radiobuttonn1-3 = questions. Randomly populate? Probably way past scope.
    }

    public void submit(View view){
        //submit the question(s) for grading
        //<advance to next q>
    }

}
