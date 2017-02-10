package com.example.cr554.quizapp;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int questionCounter =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //probably terrible performance in large enough quantities

        Quiz quiz1 = new Quiz(getString(R.string.question_one), getString(R.string.q1_ans1), getString(R.string.q1_ans2), getString(R.string.q1_ans3));
        Quiz quiz2 = new Quiz(getString(R.string.question_two), getString(R.string.q2_ans1), getString(R.string.q2_ans2), getString(R.string.q2_ans3));
        Quiz quiz3 = new Quiz(getString(R.string.question_three), getString(R.string.q3_ans1), getString(R.string.q3_ans2), getString(R.string.q3_ans3));
        final Quiz[] fullQuiz = new Quiz[]{quiz1,quiz2,quiz3};


        quizPopulate(fullQuiz[questionCounter]);

        final Button button = (Button) findViewById(R.id.submitButton);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                if (questionCounter == fullQuiz.length){
                    //things
                }
                else{
                    //right/wrong
                    questionCounter++;
                    quizPopulate(fullQuiz[questionCounter]);
                }
            }
        });
    }

    public void quizPopulate(Quiz quiz){
        //find all the things that need to change
        TextView quizQuestion = (TextView) findViewById(R.id.question_text);
        RadioButton quizAns1Correct = (RadioButton) findViewById(R.id.answerOne);
        RadioButton quizAns2Wrong = (RadioButton) findViewById(R.id.answerTwo);
        RadioButton quizAns3Wrong = (RadioButton) findViewById(R.id.answerThree);

        //set them to the new thing
        quizQuestion.setText(quiz.getQuestion());
        quizAns1Correct.setText(quiz.getAnswerCorrect());
        quizAns2Wrong.setText(quiz.getAnswerWrong2());
        quizAns3Wrong.setText(quiz.getAnswerWrong3());
    }

}
