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
public class Scene51131Controller {
	
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
	
	public Scene51131Controller(MainActivity arg_activity) {
		mActivity = arg_activity;
	}

	public void updateStatus(int arg_opseq) {

		int mOpSeq = arg_opseq;

		
		if (mOpSeq == 0) {
			TextView  scene51131_1 = (TextView)mActivity.findViewById(R.id.scene51131_1); 
			slideToRight ((View)scene51131_1);
		}
		if (mOpSeq == 1) {
			TextView  scene51131_2 = (TextView)mActivity.findViewById(R.id.scene51131_2); 
			slideToRight ((View)scene51131_2);
		}
		if (mOpSeq == 2) {
			TextView  scene51131_3 = (TextView)mActivity.findViewById(R.id.scene51131_3); 
			slideToRight ((View)scene51131_3);
		}
		if (mOpSeq == 3) {
			TextView  scene51131_4 = (TextView)mActivity.findViewById(R.id.scene51131_4); 
			slideToRight ((View)scene51131_4);
		}
		if (mOpSeq == 4) {
			TextView  scene51131_5 = (TextView)mActivity.findViewById(R.id.scene51131_5); 
			slideToRight ((View)scene51131_5);
		}
		if (mOpSeq == 5) {
			TextView  scene51131_6 = (TextView)mActivity.findViewById(R.id.scene51131_6); 
			slideToRight ((View)scene51131_6);
		}
		if (mOpSeq == 6) {
			TextView  scene51131_7 = (TextView)mActivity.findViewById(R.id.scene51131_7); 
			slideToRight ((View)scene51131_7);
		}
		if (mOpSeq == 7) {
			TextView  scene51131_8 = (TextView)mActivity.findViewById(R.id.scene51131_8); 
			slideToRight ((View)scene51131_8);
		}
		if (mOpSeq == 8) {
			TextView  scene51131_9 = (TextView)mActivity.findViewById(R.id.scene51131_9); 
			slideToRight ((View)scene51131_9);
		}
		if (mOpSeq == 9) {
			TextView  scene51131_10 = (TextView)mActivity.findViewById(R.id.scene51131_10); 
			slideToRight ((View)scene51131_10);
		}
		if (mOpSeq == 10) {
			TextView  scene51131_11 = (TextView)mActivity.findViewById(R.id.scene51131_11); 
			slideToRight ((View)scene51131_11);
		}
		if (mOpSeq == 11) {
			TextView  scene51131_12 = (TextView)mActivity.findViewById(R.id.scene51131_12); 
			slideToRight ((View)scene51131_12);
		}
		if (mOpSeq == 12) {
			TextView  scene51131_13 = (TextView)mActivity.findViewById(R.id.scene51131_13); 
			slideToRight ((View)scene51131_13);
		}
		if (mOpSeq == 13) {
			TextView  scene51131_14 = (TextView)mActivity.findViewById(R.id.scene51131_14); 
			slideToRight ((View)scene51131_14);
		}
		if (mOpSeq == 14) {
			TextView  scene51131_15 = (TextView)mActivity.findViewById(R.id.scene51131_15); 
			slideToRight ((View)scene51131_15);
		}
		if (mOpSeq == 15) {
			TextView  scene51131_16 = (TextView)mActivity.findViewById(R.id.scene51131_16); 
			slideToRight ((View)scene51131_16);
		}
		if (mOpSeq == 16) {
			TextView  scene51131_17 = (TextView)mActivity.findViewById(R.id.scene51131_17); 
			slideToRight ((View)scene51131_17);
		}
		if (mOpSeq == 17) {
			TextView  scene51131_18 = (TextView)mActivity.findViewById(R.id.scene51131_18); 
			slideToRight ((View)scene51131_18);
		}
		if (mOpSeq == 18) {
			ImageButton  scene51131_19 = (ImageButton)mActivity.findViewById(R.id.scene51131_19); 
			slideToRight ((View)scene51131_19);
		}
		if (mOpSeq == 19) {
			ImageButton  scene51131_20 = (ImageButton)mActivity.findViewById(R.id.scene51131_20); 
			slideToRight ((View)scene51131_20);
		}
	}

	public void hideButton () {
		ImageButton  scene51131_19 = (ImageButton)mActivity.findViewById(R.id.scene51131_19); 
		slideToRight_gone ((View)scene51131_19);

		ImageButton  scene51131_20 = (ImageButton)mActivity.findViewById(R.id.scene51131_20); 
		slideToRight_gone ((View)scene51131_20);
	}

	public int getCount() {
		return (19);
	}

}
