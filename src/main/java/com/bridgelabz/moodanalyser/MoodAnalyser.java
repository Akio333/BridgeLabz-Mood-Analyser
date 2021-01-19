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
    public String analyseMood() throws Exception{
        try{
            if (message.contains("sad")){
                return "SAD";
            }
            else {
                return "HAPPY";
            }
        } catch (NullPointerException nullPointerException){
            return "Happy";
        }
    }
}
