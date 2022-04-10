package com.hungphamcom.trivia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.android.volley.toolbox.Volley;
import com.hungphamcom.trivia.data.AnswerListAsyncResponse;
import com.hungphamcom.trivia.data.QuestionBank;
import com.hungphamcom.trivia.model.Question;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView questionTextview;
    private TextView counterTextview;
    private Button trueButton;
    private Button falseButton;
    private ImageButton nextButton;
    private ImageButton prevButton;
    private int currentQuestionIndex=0;
    private List<Question>questionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionTextview=findViewById(R.id.question);
        counterTextview=findViewById(R.id.counter);
        trueButton=findViewById(R.id.true_Button);
        falseButton=findViewById(R.id.false_Button);
        nextButton=findViewById(R.id.next_Button);
        prevButton=findViewById(R.id.previous_Button);

        questionList= new QuestionBank().getQuestions(new AnswerListAsyncResponse() {
            @Override
            public void processFinished(ArrayList<Question> questionArrayList) {
                Log.d("Inside", "processFinished: "+questionArrayList);
            }
        });

        //Log.d("Main", "onCreate: "+ questionList);
    }
}