package com.example.coloring;

import android.widget.ImageView;

public class Question {
    int imageID;
    int answerIndex;

    public Question(int imageid, int answerIndex){
        this.imageID = imageid;
        this.answerIndex = answerIndex;
    }
}