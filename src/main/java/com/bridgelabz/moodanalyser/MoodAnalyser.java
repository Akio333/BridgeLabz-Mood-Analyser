package com.bridgelabz.moodanalyser;

/**
 * Hello world!
 *
 */
public class MoodAnalyser
{
    String message;
    MoodAnalyser(String message){
        this.message = message;
    }
    public String analyseMood() {
        if (message.contains("sad")){
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}
