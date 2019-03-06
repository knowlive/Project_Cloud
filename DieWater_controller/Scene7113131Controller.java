a//?? o?? ???? ???????(???? ???????? ?? u ?????? ??? ???)
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
public class Scene7113131Controller {
	
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
	
	public Scene7113131Controller(MainActivity arg_activity) {
		mActivity = arg_activity;
	}

	public void updateStatus(int arg_opseq) {

		int mOpSeq = arg_opseq;

		
		if (mOpSeq == 0) {
			TextView  scene7113131_1 = (TextView)mActivity.findViewById(R.id.scene7113131_1); 
			slideToRight ((View)scene7113131_1);
		}
		if (mOpSeq == 1) {
			TextView  scene7113131_2 = (TextView)mActivity.findViewById(R.id.scene7113131_2); 
			slideToRight ((View)scene7113131_2);
		}
		if (mOpSeq == 2) {
			TextView  scene7113131_3 = (TextView)mActivity.findViewById(R.id.scene7113131_3); 
			slideToRight ((View)scene7113131_3);
		}
		if (mOpSeq == 3) {
			TextView  scene7113131_4 = (TextView)mActivity.findViewById(R.id.scene7113131_4); 
			slideToRight ((View)scene7113131_4);
		}
		if (mOpSeq == 4) {
			TextView  scene7113131_5 = (TextView)mActivity.findViewById(R.id.scene7113131_5); 
			slideToRight ((View)scene7113131_5);
		}
		if (mOpSeq == 5) {
			TextView  scene7113131_6 = (TextView)mActivity.findViewById(R.id.scene7113131_6); 
			slideToRight ((View)scene7113131_6);
		}
		if (mOpSeq == 6) {
			TextView  scene7113131_7 = (TextView)mActivity.findViewById(R.id.scene7113131_7); 
			slideToRight ((View)scene7113131_7);
		}
		if (mOpSeq == 7) {
			TextView  scene7113131_8 = (TextView)mActivity.findViewById(R.id.scene7113131_8); 
			slideToRight ((View)scene7113131_8);
		}
		if (mOpSeq == 8) {
			TextView  scene7113131_9 = (TextView)mActivity.findViewById(R.id.scene7113131_9); 
			slideToRight ((View)scene7113131_9);
		}
		if (mOpSeq == 9) {
			TextView  scene7113131_10 = (TextView)mActivity.findViewById(R.id.scene7113131_10); 
			slideToRight ((View)scene7113131_10);
		}
		if (mOpSeq == 10) {
			TextView  scene7113131_11 = (TextView)mActivity.findViewById(R.id.scene7113131_11); 
			slideToRight ((View)scene7113131_11);
		}
		if (mOpSeq == 11) {
			TextView  scene7113131_12 = (TextView)mActivity.findViewById(R.id.scene7113131_12); 
			slideToRight ((View)scene7113131_12);
		}
		if (mOpSeq == 12) {
			TextView  scene7113131_13 = (TextView)mActivity.findViewById(R.id.scene7113131_13); 
			slideToRight ((View)scene7113131_13);
		}
		if (mOpSeq == 13) {
			TextView  scene7113131_14 = (TextView)mActivity.findViewById(R.id.scene7113131_14); 
			slideToRight ((View)scene7113131_14);
		}
		if (mOpSeq == 14) {
			TextView  scene7113131_15 = (TextView)mActivity.findViewById(R.id.scene7113131_15); 
			slideToRight ((View)scene7113131_15);
		}
		if (mOpSeq == 15) {
			TextView  scene7113131_16 = (TextView)mActivity.findViewById(R.id.scene7113131_16); 
			slideToRight ((View)scene7113131_16);
		}
		if (mOpSeq == 16) {
			TextView  scene7113131_17 = (TextView)mActivity.findViewById(R.id.scene7113131_17); 
			slideToRight ((View)scene7113131_17);
		}
		if (mOpSeq == 17) {
			TextView  scene7113131_18 = (TextView)mActivity.findViewById(R.id.scene7113131_18); 
			slideToRight ((View)scene7113131_18);
		}
		if (mOpSeq == 18) {
			TextView  scene7113131_19 = (TextView)mActivity.findViewById(R.id.scene7113131_19); 
			slideToRight ((View)scene7113131_19);
		}
		if (mOpSeq == 19) {
			TextView  scene7113131_20 = (TextView)mActivity.findViewById(R.id.scene7113131_20); 
			slideToRight ((View)scene7113131_20);
		}
		if (mOpSeq == 20) {
			TextView  scene7113131_21 = (TextView)mActivity.findViewById(R.id.scene7113131_21); 
			slideToRight ((View)scene7113131_21);
		}
		if (mOpSeq == 21) {
			TextView  scene7113131_22 = (TextView)mActivity.findViewById(R.id.scene7113131_22); 
			slideToRight ((View)scene7113131_22);
		}
		if (mOpSeq == 22) {
			TextView  scene7113131_23 = (TextView)mActivity.findViewById(R.id.scene7113131_23); 
			slideToRight ((View)scene7113131_23);
		}
		if (mOpSeq == 23) {
			ImageButton  scene7113131_24 = (ImageButton)mActivity.findViewById(R.id.scene7113131_24); 
			slideToRight ((View)scene7113131_24);
		}
		if (mOpSeq == 24) {
			ImageButton  scene7113131_25 = (ImageButton)mActivity.findViewById(R.id.scene7113131_25); 
			slideToRight ((View)scene7113131_25);
		}
	}

	public void hideButton () {
		ImageButton  scene7113131_24 = (ImageButton)mActivity.findViewById(R.id.scene7113131_24); 
		slideToRight_gone ((View)scene7113131_24);

		ImageButton  scene7113131_25 = (ImageButton)mActivity.findViewById(R.id.scene7113131_25); 
		slideToRight_gone ((View)scene7113131_25);
	}

	public int getCount() {
		return (24);
	}

}