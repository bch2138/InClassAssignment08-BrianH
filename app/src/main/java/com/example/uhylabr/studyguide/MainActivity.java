package com.example.uhylabr.studyguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Questions> questions;
    private QuestionsAdapter questionsAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initalData();

        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        questionsAdapter = new QuestionsAdapter(questions, this);
        recyclerView.setAdapter(new QuestionsAdapter(questions, this));

    }

    private void initalData(){
        questions=new ArrayList<>();
        questions.add(new Questions(R.string.africa, R.string.question_africa, R.drawable.africa, false));
        questions.add(new Questions(R.string.australia, R.string.question_australia, R.drawable.australia, true));
        questions.add(new Questions(R.string.asia, R.string.question_asia, R.drawable.asia, true));
        questions.add(new Questions(R.string.middle_east, R.string.question_mideast, R.drawable.mideast, false));
        questions.add(new Questions(R.string.oceans, R.string.question_oceans, R.drawable.oceans, true));
        questions.add(new Questions(R.string.americas, R.string.question_americas, R.drawable.americas, true));
    }

@Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
}
@Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.add:
                questions.add(getRandomQuestion());
                questionsAdapter.notifyDataSetChanged();
                return true;
            case R.id.save:
                Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.share:
                Toast.makeText(this,"Share it baby", Toast.LENGTH_SHORT).show();
                return true;
                default:
                    return super.onOptionsItemSelected(item);
        }
}
private Questions getRandomQuestion(){
        int num = (int)(Math.random()*5);
        switch (num){
            case 0:
                return new Questions(R.string.australia, R.string.question_australia, R.drawable.australia,true);
            case 1:
                return new Questions(R.string.africa, R.string.question_africa, R.drawable.africa,false);
            case 2:
                return new Questions(R.string.asia, R.string.question_asia, R.drawable.asia,true);
            case 3:
                return new Questions(R.string.middle_east, R.string.question_mideast, R.drawable.mideast,false);
            case 4:
                return new Questions(R.string.oceans, R.string.question_oceans, R.drawable.oceans,true);
            default:
                return new Questions(R.string.americas, R.string.question_americas, R.drawable.americas,true);
        }}

        }


