package com.bridgelabz.moodanalyser;

/**
 * Hello world!
 *
 */
public class MoodAnalyser
{

    public String analyseMood(String message) {
        if (message.contains("sa")){
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}
