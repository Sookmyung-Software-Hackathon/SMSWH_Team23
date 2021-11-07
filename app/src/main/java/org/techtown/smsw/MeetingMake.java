package org.techtown.smsw;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

public class MeetingMake extends AppCompatActivity {

    private static final String TAG = "MeetingMake";
    private FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meeting_write);

        findViewById(R.id.meetingMakeButton).setOnClickListener(onClickListener);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.meetingMakeButton:
                    profileUpdate();
                    break;
            }
        }
    };

    private void profileUpdate(){
        final String title = ((EditText) findViewById(R.id.meeting_title)).getText().toString();
        final String contents = ((EditText) findViewById(R.id.meeting_content)).getText().toString();
        final String time = ((EditText) findViewById(R.id.meeting_time)).getText().toString();

        if (title.length() > 0 && contents.length() > 0){
            user = FirebaseAuth.getInstance().getCurrentUser();
            PostInfo postInfo = new PostInfo(title, contents, user.getUid(), time);
            uploader(postInfo);
        } else {
            startToast("회원정보를 입력해주세요.");
        }
    }

    private void startToast(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    private void uploader(PostInfo postInfo) {

        FirebaseFirestore db = FirebaseFirestore.getInstance();

        db.collection("posts")
                .add(postInfo)
                .addOnSuccessListener(documentReference -> Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId()))
                .addOnFailureListener(e -> Log.w(TAG, "Error adding document", e));
    }

}