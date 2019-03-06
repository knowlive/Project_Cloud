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
public class Scene1811313131121121111Controller {
	
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
	
	public Scene1811313131121121111Controller(MainActivity arg_activity) {
		mActivity = arg_activity;
	}

	public void updateStatus(int arg_opseq) {

		int mOpSeq = arg_opseq;

		if (mOpSeq == 0) {
			TextView  scene1811313131121121111_1 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_1); 
			slideToRight ((View)scene1811313131121121111_1);
		}
		if (mOpSeq == 1) {
			TextView  scene1811313131121121111_2 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_2); 
			slideToRight ((View)scene1811313131121121111_2);
		}
		if (mOpSeq == 2) {
			TextView  scene1811313131121121111_3 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_3); 
			slideToRight ((View)scene1811313131121121111_3);
		}
		if (mOpSeq == 3) {
			TextView  scene1811313131121121111_4 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_4); 
			slideToRight ((View)scene1811313131121121111_4);
		}
		if (mOpSeq == 4) {
			TextView  scene1811313131121121111_5 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_5); 
			slideToRight ((View)scene1811313131121121111_5);
		}
		if (mOpSeq == 5) {
			TextView  scene1811313131121121111_6 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_6); 
			slideToRight ((View)scene1811313131121121111_6);
		}
		if (mOpSeq == 6) {
			TextView  scene1811313131121121111_7 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_7); 
			slideToRight ((View)scene1811313131121121111_7);
		}
		if (mOpSeq == 7) {
			TextView  scene1811313131121121111_8 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_8); 
			slideToRight ((View)scene1811313131121121111_8);
		}
		if (mOpSeq == 8) {
			TextView  scene1811313131121121111_9 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_9); 
			slideToRight ((View)scene1811313131121121111_9);
		}
		if (mOpSeq == 9) {
			TextView  scene1811313131121121111_10 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_10); 
			slideToRight ((View)scene1811313131121121111_10);
		}
		if (mOpSeq == 10) {
			TextView  scene1811313131121121111_11 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_11); 
			slideToRight ((View)scene1811313131121121111_11);
		}
		if (mOpSeq == 11) {
			TextView  scene1811313131121121111_12 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_12); 
			slideToRight ((View)scene1811313131121121111_12);
		}
		if (mOpSeq == 12) {
			TextView  scene1811313131121121111_13 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_13); 
			slideToRight ((View)scene1811313131121121111_13);
		}
		if (mOpSeq == 13) {
			TextView  scene1811313131121121111_14 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_14); 
			slideToRight ((View)scene1811313131121121111_14);
		}
		if (mOpSeq == 14) {
			TextView  scene1811313131121121111_15 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_15); 
			slideToRight ((View)scene1811313131121121111_15);
		}
		if (mOpSeq == 15) {
			TextView  scene1811313131121121111_16 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_16); 
			slideToRight ((View)scene1811313131121121111_16);
		}
		if (mOpSeq == 16) {
			TextView  scene1811313131121121111_17 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_17); 
			slideToRight ((View)scene1811313131121121111_17);
		}
		if (mOpSeq == 17) {
			TextView  scene1811313131121121111_18 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_18); 
			slideToRight ((View)scene1811313131121121111_18);
		}
		if (mOpSeq == 18) {
			TextView  scene1811313131121121111_19 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_19); 
			slideToRight ((View)scene1811313131121121111_19);
		}
		if (mOpSeq == 19) {
			TextView  scene1811313131121121111_20 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_20); 
			slideToRight ((View)scene1811313131121121111_20);
		}
		if (mOpSeq == 20) {
			TextView  scene1811313131121121111_21 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_21); 
			slideToRight ((View)scene1811313131121121111_21);
		}
		if (mOpSeq == 21) {
			TextView  scene1811313131121121111_22 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_22); 
			slideToRight ((View)scene1811313131121121111_22);
		}
		if (mOpSeq == 22) {
			TextView  scene1811313131121121111_23 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_23); 
			slideToRight ((View)scene1811313131121121111_23);
		}
		if (mOpSeq == 23) {
			TextView  scene1811313131121121111_24 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_24); 
			slideToRight ((View)scene1811313131121121111_24);
		}
		if (mOpSeq == 24) {
			TextView  scene1811313131121121111_25 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_25); 
			slideToRight ((View)scene1811313131121121111_25);
		}
		if (mOpSeq == 25) {
			TextView  scene1811313131121121111_26 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_26); 
			slideToRight ((View)scene1811313131121121111_26);
		}
		if (mOpSeq == 26) {
			TextView  scene1811313131121121111_27 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_27); 
			slideToRight ((View)scene1811313131121121111_27);
		}
		if (mOpSeq == 27) {
			TextView  scene1811313131121121111_28 = (TextView)mActivity.findViewById(R.id.scene1811313131121121111_28); 
			slideToRight ((View)scene1811313131121121111_28);
		}
		if (mOpSeq == 28) {
			ImageButton  scene1811313131121121111_29 = (ImageButton)mActivity.findViewById(R.id.scene1811313131121121111_29); 
			slideToRight ((View)scene1811313131121121111_29);
		}
		if (mOpSeq == 29) {
			ImageButton  scene1811313131121121111_30 = (ImageButton)mActivity.findViewById(R.id.scene1811313131121121111_30); 
			slideToRight ((View)scene1811313131121121111_30);
		}
	}

	public void hideButton () {
		ImageButton  scene1811313131121121111_29 = (ImageButton)mActivity.findViewById(R.id.scene1811313131121121111_29); 
		slideToRight_gone ((View)scene1811313131121121111_29);

		ImageButton  scene1811313131121121111_30 = (ImageButton)mActivity.findViewById(R.id.scene1811313131121121111_30); 
		slideToRight_gone ((View)scene1811313131121121111_30);
	}

	public int getCount() {
		return (29);
	}

}

