package org.techtown.smsw;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MeetingListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meeting);


        FloatingActionButton b1 = (FloatingActionButton)findViewById(R.id.floatingActionButton); /*페이지 전환버튼*/

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(getApplication(), MeetingMake.class);

                startActivity(intent1);
            }
        });


    }
}