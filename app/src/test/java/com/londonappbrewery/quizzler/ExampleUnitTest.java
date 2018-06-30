package com.londonappbrewery.quizzler;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    public static class TrueFalse {

        private int mQuestionID;
        private boolean mAnswer;

        public TrueFalse(int questionResourceID, boolean trueOrFalse) {
            mQuestionID = questionResourceID;
            mAnswer = trueOrFalse;
        }

        public int getQuestionID() {
            return mQuestionID;
        }

        public void setQuestionID(int questionID) {
            mQuestionID = questionID;
        }

        public boolean isAnswer() {
            return mAnswer;
        }

        public void setAnswer(boolean answer) {
            mAnswer = answer;
        }
    }
}