package com.ritik.emojireactionview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.ritik.emojireactionlibrary.ClickInterface;
import com.ritik.emojireactionlibrary.EmojiReactionView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

        EmojiReactionView myImage;
    int clickedEmoji = 0;

    public static RecyclerView.Adapter mAdapter;
    ArrayList<Feed> feeds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("point 22", clickedEmoji + "");
        myImage = findViewById(R.id.image);
        if (savedInstanceState != null) {
            clickedEmoji = savedInstanceState.getInt("emojiNumber");
            myImage.setClickedEmojiNumber(clickedEmoji);
            Log.i("point 27", "here");
        }

        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "clicked!!", Toast.LENGTH_SHORT).show();
            }
        });

        myImage.setOnEmojiClickListener(new ClickInterface() {
            @Override
            public void onEmojiClicked(int emojiIndex, int x, int y) {
                Toast.makeText(MainActivity.this, "em" + (emojiIndex + 1) + "!", Toast.LENGTH_SHORT).show();
                clickedEmoji = emojiIndex;
            }

            @Override
            public void onEmojiUnclicked(int emojiIndex, int x, int y) {
                Toast.makeText(MainActivity.this, "em" + (emojiIndex + 1) + "! undo", Toast.LENGTH_SHORT).show();
            }
        });
//        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
//
//        feeds = new ArrayList<>();
//
//        mAdapter = new FeedAdapter(feeds);
//
//        feeds.add(new Feed("Rahul", R.drawable.android1_min, "Nov 6,11:52 AM", "howdy", -1));
//        feeds.add(new Feed("Ritik", R.drawable.android1_min, "Nov 6,11:52 AM", "fine", 1));
//        feeds.add(new Feed("Raj", R.drawable.android1_min, "Nov 6,11:52 AM", "Yup", 1));
//        feeds.add(new Feed("Rajendra", R.drawable.android1_min, "Nov 6,11:52 AM", "Enjoying", 1));
//        feeds.add(new Feed("Ravish", R.drawable.android1_min, "Nov 6,11:52 AM", "Life's Good", 1));
//        feeds.add(new Feed("Rajnath", R.drawable.android1_min, "Nov 6,11:52 AM", "Beautiful", 1));
//        feeds.add(new Feed("Ramesh", R.drawable.android1_min, "Nov 6,11:52 AM", "Great", 1));
//        feeds.add(new Feed("Rohit", R.drawable.android1_min, "Nov 6,11:52 AM", "Wooooow", 1));
//        mRecyclerView.setAdapter(mAdapter);
//
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void test(View view) {
//        myImage.test();
//        Log.i("point 45", myImage.getCentre()[0] + " " + myImage.getCentre()[1]);
//        Log.i("point 46", myImage.getRadius() + " " + myImage.getClickedEmojiNumber());
//        Log.i("point 47", myImage.getNumberOfEmojis() + " " + myImage.getEmojisRisingSpeed());
//        Log.i("point 48", myImage.getCoverRect().left + " " + myImage.getCoverRect().right);
//        Log.i("point 49", myImage.getCoverSide() + " " + myImage.getCoverCenterX());
//        Log.i("point 50", myImage.getCoverCenterY() + " " + myImage.getEmojiReactSide());
    }

    public void test1(View view) {
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("emojiNumber", clickedEmoji);
        super.onSaveInstanceState(outState);
    }
}
