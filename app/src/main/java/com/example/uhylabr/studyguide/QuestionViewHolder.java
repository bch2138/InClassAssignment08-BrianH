package com.example.uhylabr.studyguide;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView questionCountry;
    public TextView countryQuestion;
    public ImageView countryImage;

    public QuestionViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        questionCountry = (TextView) itemView.findViewById(R.id.question_country);
        countryQuestion = (TextView) itemView.findViewById(R.id.country_question);
        countryImage = (ImageView) itemView.findViewById(R.id.country_image);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int messageResId = 0;
                Toast.makeText(context, questionCountry.getText(), Toast.LENGTH_SHORT).show();

                //i know i need to fix this to get it to work correctly.  now is it a matter of
                //creating a new method like checkAnswer() and then displays the toast?
                if (isTrue==aTrue){
                    messageResId=R.string.true_toast;
                    Toast.makeText(MainActivity.this, messageResId, Toast.LENGTH_SHORT).show();
                else {messageResId=R.string.false_toast;
                    Toast.makeText(MainActivity.this, messageResId, Toast.LENGTH_SHORT).show();}}}});}}