package com.example.android.fantasyfootballtrivia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the Submit Answer button is clicked.
     * String scoreMessage displays the number of correct answers and then displays what the
     * correct answer is for each question. The Toast is also there because the assignment
     * required it.
     */
    public void submitAnswers(View view) {
        int score; //this is the number of correct answers
        score = scoreQuestionOne() + scoreQuestionTwo() + scoreQuestionThree() + scoreQuestionFour();
        String scoreMessage = "You got " + score + " questions correct.";
        scoreMessage += "\n\nCorrect Answers:";
        scoreMessage += "\n1. Russell Wilson and Tom Brady"; //http://pfref.com/tiny/A46Bz
        scoreMessage += "\n2. Peyton Manning"; //http://pfref.com/tiny/2DZ6m
        scoreMessage += "\n3. Clinton Portis"; //http://pfref.com/tiny/H8eVI
        scoreMessage += "\n4. LaDainian Tomlinson"; //http://pfref.com/tiny/B2m1P
        Toast.makeText(this, "You got " + score + " correct", Toast.LENGTH_LONG).show();
        displayScoreMessage(scoreMessage);
    }

    /*Checks the answer for question 1 and returns a score of 1 if the answer is correct*/
    private int scoreQuestionOne() {
        int questionScore = 0;
        CheckBox answerOne = (CheckBox) findViewById(R.id.q1_nick_foles_checkbox);
        boolean answerOneChecked = answerOne.isChecked();
        CheckBox answerTwo = (CheckBox) findViewById(R.id.q1_jeff_garcia_checkbox);
        boolean answerTwoChecked = answerTwo.isChecked();
        CheckBox answerThree = (CheckBox) findViewById(R.id.q1_russell_wilson_checkbox);
        boolean answerThreeChecked = answerThree.isChecked();
        CheckBox answerFour = (CheckBox) findViewById(R.id.q1_aaron_rodgers_checkbox);
        boolean answerFourChecked = answerFour.isChecked();
        CheckBox answerFive = (CheckBox) findViewById(R.id.q1_tom_brady_checkbox);
        boolean answerFiveChecked = answerFive.isChecked();
        CheckBox answerSix = (CheckBox) findViewById(R.id.q1_tony_romo_checkbox);
        boolean answerSixChecked = answerSix.isChecked();
        if (answerThreeChecked && answerFiveChecked) {
            if (answerOneChecked || answerTwoChecked || answerFourChecked || answerSixChecked) {
                return questionScore;
            } else {
                questionScore = 1;
            }
        }
        return questionScore;
    }

    /*Checks the answer for question 2 and returns a score of 1 if the answer is correct*/
    private int scoreQuestionTwo() {
        int questionScore = 0;
        RadioButton correctAnswer = (RadioButton) findViewById(R.id.q2_peyton_manning_radiobox);
        boolean correctAnswerChecked = correctAnswer.isChecked();
        if (correctAnswerChecked) {
            questionScore = 1;
        }
        return questionScore;
    }

    /*Checks the answer for question 3 and returns a score of 1 if the answer is correct*/
    private int scoreQuestionThree() {
        int questionScore = 0;
        EditText inputAnswer = (EditText) findViewById(R.id.question_three_answer);
        String answer = inputAnswer.getText().toString();
        if (answer.equals("Clinton Portis")) {
            questionScore = 1;
        }
        return questionScore;

    }

    /*Checks the answer for question 4 and returns a score of 1 if the answer is correct*/
    private int scoreQuestionFour() {
        int questionScore = 0;
        RadioButton correctAnswer = (RadioButton) findViewById(R.id.q4_ladainian_tomlinson_radiobox);
        boolean correctAnswerChecked = correctAnswer.isChecked();
        if (correctAnswerChecked) {
            questionScore = 1;
        }
        return questionScore;
    }

    /*
     * Displays the score message
     */
    private void displayScoreMessage(String scoreMessage) {
        TextView scoreMessageTextView = (TextView) findViewById(R.id.score_text_view);
        scoreMessageTextView.setText(scoreMessage);
    }

    /*
     * This method resets all of the answers and clears the score message
     */
    public void resetAnswers(View view) {

        //Question One answers are unchecked
        CheckBox questionOneAnswerOne = (CheckBox) findViewById(R.id.q1_nick_foles_checkbox);
        questionOneAnswerOne.setChecked(false);
        CheckBox questionOneAnswerTwo = (CheckBox) findViewById(R.id.q1_jeff_garcia_checkbox);
        questionOneAnswerTwo.setChecked(false);
        CheckBox questionOneAnswerThree = (CheckBox) findViewById(R.id.q1_russell_wilson_checkbox);
        questionOneAnswerThree.setChecked(false);
        CheckBox questionOneAnswerFour = (CheckBox) findViewById(R.id.q1_aaron_rodgers_checkbox);
        questionOneAnswerFour.setChecked(false);
        CheckBox questionOneAnswerFive = (CheckBox) findViewById(R.id.q1_tom_brady_checkbox);
        questionOneAnswerFive.setChecked(false);
        CheckBox questionOneAnswerSix = (CheckBox) findViewById(R.id.q1_tony_romo_checkbox);
        questionOneAnswerSix.setChecked(false);

        //Question Two answers are unchecked
        RadioButton questionTwoAnswerOne = (RadioButton) findViewById(R.id
                .q2_drew_brees_radiobox);
        questionTwoAnswerOne.setChecked(false);
        RadioButton questionTwoAnswerTwo = (RadioButton) findViewById(R.id
                .q2_peyton_manning_radiobox);
        questionTwoAnswerTwo.setChecked(false);
        RadioButton questionTwoAnswerThree = (RadioButton) findViewById(R.id
                .q2_aaron_rodgers_radiobox);
        questionTwoAnswerThree.setChecked(false);
        RadioButton questionTwoAnswerFour = (RadioButton) findViewById(R.id
                .q2_tom_brady_radiobox);
        questionTwoAnswerFour.setChecked(false);
        RadioButton questionTwoAnswerFive = (RadioButton) findViewById(R.id
                .q2_dan_marino_radiobox);
        questionTwoAnswerFive.setChecked(false);

        //Question Three answer is erased
        EditText questionThreeAnswer = (EditText) findViewById(R.id.question_three_answer);
        questionThreeAnswer.setText("");

        //Question Four answers are unchecked
        RadioButton questionFourAnswerOne = (RadioButton) findViewById(R.id
                .q4_ladainian_tomlinson_radiobox);
        questionFourAnswerOne.setChecked(false);
        RadioButton questionFourAnswerTwo = (RadioButton) findViewById(R.id
                .q4_marshall_faulk_radiobox);
        questionFourAnswerTwo.setChecked(false);
        RadioButton questionFourAnswerThree = (RadioButton) findViewById(R.id
                .q4_priest_holmes_radiobox);
        questionFourAnswerThree.setChecked(false);
        RadioButton questionFourAnswerFour = (RadioButton) findViewById(R.id
                .q4_shaun_alexander_radiobox);
        questionFourAnswerFour.setChecked(false);
        RadioButton questionFourAnswerFive = (RadioButton) findViewById(R.id
                .q4_emmitt_smith_radiobox);
        questionFourAnswerFive.setChecked(false);

        //Clears the score message
        displayScoreMessage("");
    }
}
