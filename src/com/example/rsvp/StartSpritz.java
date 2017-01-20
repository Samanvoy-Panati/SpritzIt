package com.example.rsvp;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Toast;

//import com.andrewgiang.textspritzer.lib.Spritzer;
//import com.andrewgiang.textspritzer.lib.SpritzerTextView;

public class StartSpritz extends Activity {

    public static final String TAG = StartSpritz.class.getName();
    private SpritzerTextView mSpritzerTextView;
    private SeekBar mSeekBarTextSize;
    private SeekBar mSeekBarWpm;
    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_spritz);

        //Review the view and set text to be spritzed
        mSpritzerTextView = (SpritzerTextView) findViewById(R.id.spritzTV);
        mSpritzerTextView.setSpritzText("OpenSpritz has nothing to do with Spritz Incorporated. " + " Ameya Sam Manali " +
                "This is an open source, community created project, made with love because Spritz is " +
                "such an awesome technique for reading with.");


        //This attaches a progress bar that show exactly how far you are into your spritz
        mProgressBar = (ProgressBar) findViewById(R.id.spritz_progress);
        mSpritzerTextView.attachProgressBar(mProgressBar);


        //Set how fast the spritzer should go
        mSpritzerTextView.setWpm(500);

        //Set Click Control listeners, these will be called when the user uses the click controls
        mSpritzerTextView.setOnClickControlListener(new SpritzerTextView.OnClickControlListener() {
            @Override
            public void onPause() {
                Toast.makeText(StartSpritz.this, "Spritzer has been paused", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onPlay() {
                Toast.makeText(StartSpritz.this, "Spritzer is playing", Toast.LENGTH_SHORT).show();

            }
        });

        mSpritzerTextView.setOnCompletionListener(new Spritzer.OnCompletionListener() {
            @Override
            public void onComplete() {
                Toast.makeText(StartSpritz.this, "Spritzer is finished", Toast.LENGTH_SHORT).show();

            }
        });

//        mSpritzerTextView.setDelayStrategy(new DelayStrategy() {
//            @Override
//            public int delayMultiplier(String word) {
//                if(word.contains("-")){
//                  return 5;
//                }
//                return 1;
//            }
//        });


        setupSeekBars();


    }

    /**
     * This is just shows two seek bars to change wpm and text size
     */
    private void setupSeekBars() {
   //     mSeekBarTextSize = (SeekBar) findViewById(R.id.seekBarTextSize);
  //      mSeekBarWpm = (SeekBar) findViewById(R.id.seekBarWpm);
        mSpritzerTextView.setWpm(400);
        mSpritzerTextView.setTextSize(35);
   /*     if (mSeekBarWpm != null && mSeekBarTextSize != null) {
            mSeekBarWpm.setMax(mSpritzerTextView.getWpm() * 2);

            mSeekBarTextSize.setMax((int) mSpritzerTextView.getTextSize() * 2);
            mSeekBarWpm.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    if (progress > 0) {
                        mSpritzerTextView.setWpm(progress);
                    }
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {
                }
            });
            mSeekBarTextSize.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    mSpritzerTextView.setTextSize(progress);

                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });

            mSeekBarWpm.setProgress(mSpritzerTextView.getWpm());
            mSeekBarTextSize.setProgress((int) mSpritzerTextView.getTextSize());
        }

    }
    */
    }

}
