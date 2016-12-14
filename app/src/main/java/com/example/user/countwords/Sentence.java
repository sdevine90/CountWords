//package com.example.user.countwords;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//
///**
// * Created by user on 13/12/2016.
// */
//public class Sentence extends AppCompatActivity {
//    EditText questionEditText;
//    Button touchButton;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState){
//        Log.d("Sentence", "onCreateCalled");
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        questionEditText = (EditText)findViewById(R.id.question_text);
//        touchButton = (Button)findViewById(R.id.touch_button);
//
//        touchButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                Log.d("Sentence", "Touch button clicked");
//                String sentence = questionEditText.getText().toString();
//                Log.d("Sentence", "Question" + question);
//                Wordcount wordcount = new Wordcount(sentence);
////                return integer i am getting into a string
//            }
//
//        }
//    }
//
//}
