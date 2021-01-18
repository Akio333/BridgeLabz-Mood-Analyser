package com.bridgelabz.moodanalyser;

import static org.junit.Assert.assertTrue;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple MoodAnalyser.
 */
public class MoodAnalyserTest
{
    MoodAnalyser moodAnalyser=new MoodAnalyser();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldReturn_SAD_Mood() throws Exception {
        String mood = moodAnalyser.analyseMood("This is a sad message.");
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void shouldReturn_HAPPY_Mood() throws Exception {
        String mood = moodAnalyser.analyseMood("This is a Happy message.");
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
        Assert.assertEquals("HAPPY",mood);
    }
}

