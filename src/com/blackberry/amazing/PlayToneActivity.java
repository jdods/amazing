package com.blackberry.amazing;

import android.app.Activity;
//import android.content.Intent;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class PlayToneActivity extends Activity {

	 public  boolean PlayTone() throws InterruptedException{
	     ToneGenerator toneGenerator= new ToneGenerator(AudioManager.STREAM_DTMF,ToneGenerator.MAX_VOLUME);
	     int[] type;
	     int duration;
	     type = new int[] {
	             ToneGenerator.TONE_DTMF_1, 
	             ToneGenerator.TONE_DTMF_2, 
	             ToneGenerator.TONE_DTMF_3, 
	             ToneGenerator.TONE_DTMF_A, 
	             ToneGenerator.TONE_DTMF_4, 
	             ToneGenerator.TONE_DTMF_5, 
	             ToneGenerator.TONE_DTMF_6, 
	             ToneGenerator.TONE_DTMF_B, 
	             ToneGenerator.TONE_DTMF_7, 
	             ToneGenerator.TONE_DTMF_8, 
	             ToneGenerator.TONE_DTMF_9, 
	             ToneGenerator.TONE_DTMF_C,
	             };
	     for (int element : type) {
	         if (element < ToneGenerator.TONE_DTMF_A){
	             duration = 200;
	         } else {
	             duration = 700;
	         }
            toneGenerator.startTone(element, duration);
	        Thread.sleep(50);
            toneGenerator.stopTone();
            Thread.sleep(50);
	     }
        return true;
	   }  
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		Intent intent = getIntent();
		getIntent();
		
    	try {
			PlayTone();
		} catch (InterruptedException e) {
			e.printStackTrace(); // TODO Auto-generated catch block
		}
   
		setContentView(R.layout.activity_play_tone);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.play_tone, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
