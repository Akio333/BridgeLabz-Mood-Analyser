package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

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
    public void givenNullMoodShouldThrowException() throws Exception {
            MoodAnalyser moodAnalyser = new MoodAnalyser(null);
            String mood= moodAnalyser.analyseMood();
            Assert.assertEquals("Happy",mood);
    }
}

