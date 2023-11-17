package com.example.scrollingtextapp;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button commentBtn;
    private EditText editText;

    private TextView commentView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        commentBtn = findViewById(R.id.commentBtn);
        editText = findViewById(R.id.editText);
        commentView = findViewById(R.id.commentView);

        commentBtn.setOnClickListener(v -> addComment());
    }

    public void addComment(){
        if (commentBtn.getText().equals("Add Comment")){
            setEditTextVisible();
        } else {
            setEditTextInvisible();
            commentView.setText(editText.getText());
        }
    }

    private void setEditTextVisible(){
        editText.setVisibility(View.VISIBLE);
        commentBtn.setText("Save Comment");
    }

    private void setEditTextInvisible(){
        editText.setVisibility(View.INVISIBLE);
        commentBtn.setText("Add Comment");
    }
}