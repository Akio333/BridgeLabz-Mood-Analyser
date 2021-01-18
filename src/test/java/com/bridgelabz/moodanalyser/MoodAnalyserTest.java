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
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldReturn_SAD_Mood() throws Exception {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a sad message.");
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
        Assert.assertEquals("SAD",mood);
    }
}

