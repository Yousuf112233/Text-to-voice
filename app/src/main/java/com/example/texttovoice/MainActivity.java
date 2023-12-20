package com.example.texttovoice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextToSpeech textToSpeech;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
        button=findViewById(R.id.button);
        textToSpeech = new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

            }
        });








      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              if(editText.length()>0){


                  textToSpeech.speak(editText.getText().toString(),TextToSpeech.QUEUE_FLUSH,null,null);



              }else {

                  editText.setError("plz input ");


              }





          }
      });







    }
}