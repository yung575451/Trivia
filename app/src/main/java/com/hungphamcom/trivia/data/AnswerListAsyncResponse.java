package com.hungphamcom.trivia.data;

import com.hungphamcom.trivia.model.Question;

import java.util.ArrayList;

public interface AnswerListAsyncResponse {
    void processFinished(ArrayList<Question> questionArrayList);
}
