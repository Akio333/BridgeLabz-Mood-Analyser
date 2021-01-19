package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest
{
    @Test
    public void givenSadMood_ShouldReturn_SAD() throws Exception {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a sad message.");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenHappyMood_ShouldReturn_HAPPY() throws Exception {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a Happy message.");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenANyMood_ShouldReturn_HAPPY() throws Exception {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is an Any message.");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenNullMoodShouldThrowException() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser(null);
            moodAnalyser.analyseMood();
        } catch (MoodAnalysisException moodAnalysisException) {
            Assert.assertEquals("NULL_MESSAGE: Message can not be Null.",moodAnalysisException.getMessage());
        }
    }
    @Test
    public void givenMessageEmpty_shouldThrow_MoodAnalyserException(){
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("");
            moodAnalyser.analyseMood();
        } catch (MoodAnalysisException moodAnalysisException) {
            Assert.assertEquals("EMPTY_MESSAGE: Message can not be Empty.",moodAnalysisException.getMessage());
        }
    }
}

