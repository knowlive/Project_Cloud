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
public class Scene1811313131121121211Controller {
	
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
	
	public Scene1811313131121121211Controller(MainActivity arg_activity) {
		mActivity = arg_activity;
	}

	public void updateStatus(int arg_opseq) {

		int mOpSeq = arg_opseq;

		if (mOpSeq == 0) {
			TextView  scene1811313131121121211_1 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_1); 
			slideToRight ((View)scene1811313131121121211_1);
		}
		if (mOpSeq == 1) {
			TextView  scene1811313131121121211_2 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_2); 
			slideToRight ((View)scene1811313131121121211_2);
		}
		if (mOpSeq == 2) {
			TextView  scene1811313131121121211_3 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_3); 
			slideToRight ((View)scene1811313131121121211_3);
		}
		if (mOpSeq == 3) {
			TextView  scene1811313131121121211_4 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_4); 
			slideToRight ((View)scene1811313131121121211_4);
		}
		if (mOpSeq == 4) {
			TextView  scene1811313131121121211_5 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_5); 
			slideToRight ((View)scene1811313131121121211_5);
		}
		if (mOpSeq == 5) {
			TextView  scene1811313131121121211_6 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_6); 
			slideToRight ((View)scene1811313131121121211_6);
		}
		if (mOpSeq == 6) {
			TextView  scene1811313131121121211_7 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_7); 
			slideToRight ((View)scene1811313131121121211_7);
		}
		if (mOpSeq == 7) {
			TextView  scene1811313131121121211_8 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_8); 
			slideToRight ((View)scene1811313131121121211_8);
		}
		if (mOpSeq == 8) {
			TextView  scene1811313131121121211_9 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_9); 
			slideToRight ((View)scene1811313131121121211_9);
		}
		if (mOpSeq == 9) {
			TextView  scene1811313131121121211_10 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_10); 
			slideToRight ((View)scene1811313131121121211_10);
		}
		if (mOpSeq == 10) {
			TextView  scene1811313131121121211_11 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_11); 
			slideToRight ((View)scene1811313131121121211_11);
		}
		if (mOpSeq == 11) {
			TextView  scene1811313131121121211_12 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_12); 
			slideToRight ((View)scene1811313131121121211_12);
		}
		if (mOpSeq == 12) {
			TextView  scene1811313131121121211_13 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_13); 
			slideToRight ((View)scene1811313131121121211_13);
		}
		if (mOpSeq == 13) {
			TextView  scene1811313131121121211_14 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_14); 
			slideToRight ((View)scene1811313131121121211_14);
		}
		if (mOpSeq == 14) {
			TextView  scene1811313131121121211_15 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_15); 
			slideToRight ((View)scene1811313131121121211_15);
		}
		if (mOpSeq == 15) {
			TextView  scene1811313131121121211_16 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_16); 
			slideToRight ((View)scene1811313131121121211_16);
		}
		if (mOpSeq == 16) {
			TextView  scene1811313131121121211_17 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_17); 
			slideToRight ((View)scene1811313131121121211_17);
		}
		if (mOpSeq == 17) {
			TextView  scene1811313131121121211_18 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_18); 
			slideToRight ((View)scene1811313131121121211_18);
		}
		if (mOpSeq == 18) {
			TextView  scene1811313131121121211_19 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_19); 
			slideToRight ((View)scene1811313131121121211_19);
		}
		if (mOpSeq == 19) {
			TextView  scene1811313131121121211_20 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_20); 
			slideToRight ((View)scene1811313131121121211_20);
		}
		if (mOpSeq == 20) {
			TextView  scene1811313131121121211_21 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_21); 
			slideToRight ((View)scene1811313131121121211_21);
		}
		if (mOpSeq == 21) {
			TextView  scene1811313131121121211_22 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_22); 
			slideToRight ((View)scene1811313131121121211_22);
		}
		if (mOpSeq == 22) {
			TextView  scene1811313131121121211_23 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_23); 
			slideToRight ((View)scene1811313131121121211_23);
		}
		if (mOpSeq == 23) {
			TextView  scene1811313131121121211_24 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_24); 
			slideToRight ((View)scene1811313131121121211_24);
		}
		if (mOpSeq == 24) {
			TextView  scene1811313131121121211_25 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_25); 
			slideToRight ((View)scene1811313131121121211_25);
		}
		if (mOpSeq == 25) {
			TextView  scene1811313131121121211_26 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_26); 
			slideToRight ((View)scene1811313131121121211_26);
		}
		if (mOpSeq == 26) {
			TextView  scene1811313131121121211_27 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_27); 
			slideToRight ((View)scene1811313131121121211_27);
		}
		if (mOpSeq == 27) {
			TextView  scene1811313131121121211_28 = (TextView)mActivity.findViewById(R.id.scene1811313131121121211_28); 
			slideToRight ((View)scene1811313131121121211_28);
		}
		if (mOpSeq == 28) {
			ImageButton  scene1811313131121121211_29 = (ImageButton)mActivity.findViewById(R.id.scene1811313131121121211_29); 
			slideToRight ((View)scene1811313131121121211_29);
		}
		if (mOpSeq == 29) {
			ImageButton  scene1811313131121121211_30 = (ImageButton)mActivity.findViewById(R.id.scene1811313131121121211_30); 
			slideToRight ((View)scene1811313131121121211_30);
		}
	}

	public void hideButton () {
		ImageButton  scene1811313131121121211_29 = (ImageButton)mActivity.findViewById(R.id.scene1811313131121121211_29); 
		slideToRight_gone ((View)scene1811313131121121211_29);

		ImageButton  scene1811313131121121211_30 = (ImageButton)mActivity.findViewById(R.id.scene1811313131121121211_30); 
		slideToRight_gone ((View)scene1811313131121121211_30);
	}

	public int getCount() {
		return (29);
	}

}
