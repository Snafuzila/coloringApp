package com.example.coloring;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class Game {
    //UI
    Question[] questions; // contain the pictureID and its index of right answer.
    ImageView imView; // connect the component from the .xml to the code.
    int[] imgArr = new int[8]; // array the size of the pictures
    Button[] buttons = new Button[8]; // array the size of all the Buttons
    int currentQuestionIndex;
    TextView scoreTV;

    //Score system.
    int score = 0;
    final int pointsPerQuestion = 10;



    View.OnClickListener btnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            if (questions[currentQuestionIndex].answerIndex == (Integer) v.getTag()) {
                score += pointsPerQuestion; //add score when right answer.
                scoreTV.setText(Integer.toString(score)); //show the score on screen.
                if (currentQuestionIndex != (questions.length - 1)) //check when the question is the last question.
                    SetQuestion(currentQuestionIndex + 1);//if it doesn't, set the next question.
                else {
                    Question current = questions[currentQuestionIndex]; //if it does, saves the current question.
                    ShuffleQuestions(); //shuffle all questions.
                    while (current.equals(questions[0])) { //now we check if current question = next question, if it does, shuffle again.
                        ShuffleQuestions();
                    }
                    currentQuestionIndex = 0;
                    SetQuestion(currentQuestionIndex);
                }
            }
        }
    };


//----
    public Game(MainActivity activity){
        Init(activity);
    }
//----

// initializing all the buttons, images, components
    private void Init(MainActivity activity){
        currentQuestionIndex = 0;
        scoreTV = activity.findViewById(R.id.score);
        imView = (ImageView)activity.findViewById(R.id.MainImage); //connecting ImView to the .xml components

        // collecting the images with "picture"+number from res/drawable/ to imgArr.
        for(int i=0; i<imgArr.length; i++){
            imgArr[i] = (activity.getResources().getIdentifier("picture"+i, "drawable", "com.example.coloring"));
        }


        questions = new Question[imgArr.length]; //initialize the questions array

        questions[0] = new Question(imgArr[0], 2); //giving the correct answer to each image.
        questions[1] = new Question(imgArr[1], 3);
        questions[2] = new Question(imgArr[2], 1);
        questions[3] = new Question(imgArr[3], 5);
        questions[4] = new Question(imgArr[4], 3);
        questions[5] = new Question(imgArr[5], 4);
        questions[6] = new Question(imgArr[6], 0);
        questions[7] = new Question(imgArr[7], 0);

        ShuffleQuestions();
        SetQuestion(currentQuestionIndex);


        buttons[0] = (Button)activity.findViewById(R.id.button0);// Red
        buttons[1] = (Button)activity.findViewById(R.id.button1);// Orange
        buttons[2] = (Button)activity.findViewById(R.id.button2);// Yellow
        buttons[3] = (Button)activity.findViewById(R.id.button3);// Green
        buttons[4] = (Button)activity.findViewById(R.id.button4);// Blue
        buttons[5] = (Button)activity.findViewById(R.id.button5);// Purple
        buttons[6] = (Button)activity.findViewById(R.id.button6);// White
        buttons[7] = (Button)activity.findViewById(R.id.button7);// Black

        // setting all the buttons Onclick
        for (int i = 0; i<buttons.length; i++) {
            buttons[i].setOnClickListener(btnClick);
            buttons[i].setTag(i); //by setting tag i can do the same OnClick function on all the buttons and know which button was pressed.
        }
    }

    private void ShuffleQuestions(){
        Random rand = new Random();

        for (int i = 0; i < questions.length ;i++) {
            int randomIndexToSwap = rand.nextInt(questions.length);
            Question temp = questions[randomIndexToSwap];
            questions[randomIndexToSwap] = questions[i];
            questions[i] = temp;
        }
    }

    private void SetQuestion(int questionIndex){ //sets next question
        currentQuestionIndex = questionIndex;
        imView.setImageResource(questions[currentQuestionIndex].imageID);
    }
}
// manifest
// android:largeHeap="true"
// android:hardwareAccelerated="false"
// some pictures were very big and the app couldn't handle it, after these lines in the manifest, the app does handle.
// *not necessary anymore since i changed the image's size (minimized them).
