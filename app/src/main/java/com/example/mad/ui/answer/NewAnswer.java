package com.example.mad.ui.answer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.mad.R;
import com.example.mad.answer.AnswerDB;
import com.example.mad.question.QuestionDB;
import com.example.mad.ui.question_and_answer.QuestionAndAnswer;
import com.example.mad.user.User;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class NewAnswer extends BottomSheetDialogFragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container ,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.new_answer , container , false);
        EditText answer = (EditText) v.findViewById(R.id.new_answer);
        Button saveAnswer = v.findViewById(R.id.new_answer_btn);
        saveAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnswerDB.newAnswer(QuestionAndAnswer.questionID, User.getUserID(),answer.getText().toString());
                dismiss();
            }
        });
        return v;
    }
}
