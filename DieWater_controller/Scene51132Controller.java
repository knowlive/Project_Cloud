//?? o?? ???? ???????(???? ???????? ?? u ?????? ??? ???)
package com.cookandroid.diewater.controller;
 
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.cookandroid.diewater.MainActivity;
import com.cookandroid.diewater.R;

//activity_main.xml?? ?????? ????.(???? ????? activity_main?? ??????)
public class Scene51132Controller {
	
	public MainActivity  mActivity;

	public void slideToRight(View view){
		TranslateAnimation animate = new TranslateAnimation(0,view.getWidth(),0,0);
		animate.setDuration(500);
		animate.setFillAfter(true);
		view.startAnimation(animate);
		view.setVisibility(View.VISIBLE);
	}

	public void slideToRight_gone (View view){
		TranslateAnimation animate = new TranslateAnimation(0,view.getWidth(),0,0);
		animate.setDuration(500);
		animate.setFillAfter(true);
		view.startAnimation(animate);
		view.setVisibility(View.GONE);
	}
	
	public Scene51132Controller(MainActivity arg_activity) {
		mActivity = arg_activity;
	}

	public void updateStatus(int arg_opseq) {

		int mOpSeq = arg_opseq;

		
		if (mOpSeq == 0) {
			TextView  scene51132_1 = (TextView)mActivity.findViewById(R.id.scene51132_1); 
			slideToRight ((View)scene51132_1);
		}
		if (mOpSeq == 1) {
			TextView  scene51132_2 = (TextView)mActivity.findViewById(R.id.scene51132_2); 
			slideToRight ((View)scene51132_2);
		}
		if (mOpSeq == 2) {
			TextView  scene51132_3 = (TextView)mActivity.findViewById(R.id.scene51132_3); 
			slideToRight ((View)scene51132_3);
		}
		if (mOpSeq == 3) {
			TextView  scene51132_4 = (TextView)mActivity.findViewById(R.id.scene51132_4); 
			slideToRight ((View)scene51132_4);
		}
		if (mOpSeq == 4) {
			TextView  scene51132_5 = (TextView)mActivity.findViewById(R.id.scene51132_5); 
			slideToRight ((View)scene51132_5);
		}
		if (mOpSeq == 5) {
			TextView  scene51132_6 = (TextView)mActivity.findViewById(R.id.scene51132_6); 
			slideToRight ((View)scene51132_6);
		}
		if (mOpSeq == 6) {
			TextView  scene51132_7 = (TextView)mActivity.findViewById(R.id.scene51132_7); 
			slideToRight ((View)scene51132_7);
		}
		if (mOpSeq == 7) {
			TextView  scene51132_8 = (TextView)mActivity.findViewById(R.id.scene51132_8); 
			slideToRight ((View)scene51132_8);
		}
		if (mOpSeq == 8) {
			TextView  scene51132_9 = (TextView)mActivity.findViewById(R.id.scene51132_9); 
			slideToRight ((View)scene51132_9);
		}
		if (mOpSeq == 9) {
			TextView  scene51132_10 = (TextView)mActivity.findViewById(R.id.scene51132_10); 
			slideToRight ((View)scene51132_10);
		}
		if (mOpSeq == 10) {
			TextView  scene51132_11 = (TextView)mActivity.findViewById(R.id.scene51132_11); 
			slideToRight ((View)scene51132_11);
		}
		if (mOpSeq == 11) {
			TextView  scene51132_12 = (TextView)mActivity.findViewById(R.id.scene51132_12); 
			slideToRight ((View)scene51132_12);
		}
		if (mOpSeq == 12) {
			ImageButton  scene51132_13 = (ImageButton)mActivity.findViewById(R.id.scene51132_13); 
			slideToRight ((View)scene51132_13);
		}
		if (mOpSeq == 13) {
			ImageButton  scene51132_14 = (ImageButton)mActivity.findViewById(R.id.scene51132_14); 
			slideToRight ((View)scene51132_14);
		}
	}

	public void hideButton () {
		ImageButton  scene51132_13 = (ImageButton)mActivity.findViewById(R.id.scene51132_13); 
		slideToRight_gone ((View)scene51132_13);

		ImageButton  scene51132_14 = (ImageButton)mActivity.findViewById(R.id.scene51132_14); 
		slideToRight_gone ((View)scene51132_14);
	}

	public int getCount() {
		return (13);
	}

}
