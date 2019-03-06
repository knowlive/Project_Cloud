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
public class Scene81131313Controller {
	
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
	
	public Scene81131313Controller(MainActivity arg_activity) {
		mActivity = arg_activity;
	}

	public void updateStatus(int arg_opseq) {

		int mOpSeq = arg_opseq;

		if (mOpSeq == 0) {
			TextView  scene81131313_1 = (TextView)mActivity.findViewById(R.id.scene81131313_1); 
			slideToRight ((View)scene81131313_1);
		}
		if (mOpSeq == 1) {
			TextView  scene81131313_2 = (TextView)mActivity.findViewById(R.id.scene81131313_2); 
			slideToRight ((View)scene81131313_2);
		}
		if (mOpSeq == 2) {
			TextView  scene81131313_3 = (TextView)mActivity.findViewById(R.id.scene81131313_3); 
			slideToRight ((View)scene81131313_3);
		}
		if (mOpSeq == 3) {
			TextView  scene81131313_4 = (TextView)mActivity.findViewById(R.id.scene81131313_4); 
			slideToRight ((View)scene81131313_4);
		}
		if (mOpSeq == 4) {
			TextView  scene81131313_5 = (TextView)mActivity.findViewById(R.id.scene81131313_5); 
			slideToRight ((View)scene81131313_5);
		}
		if (mOpSeq == 5) {
			TextView  scene81131313_6 = (TextView)mActivity.findViewById(R.id.scene81131313_6); 
			slideToRight ((View)scene81131313_6);
		}
		if (mOpSeq == 6) {
			TextView  scene81131313_7 = (TextView)mActivity.findViewById(R.id.scene81131313_7); 
			slideToRight ((View)scene81131313_7);
		}
		if (mOpSeq == 7) {
			TextView  scene81131313_8 = (TextView)mActivity.findViewById(R.id.scene81131313_8); 
			slideToRight ((View)scene81131313_8);
		}
		if (mOpSeq == 8) {
			TextView  scene81131313_9 = (TextView)mActivity.findViewById(R.id.scene81131313_9); 
			slideToRight ((View)scene81131313_9);
		}
		if (mOpSeq == 9) {
			TextView  scene81131313_10 = (TextView)mActivity.findViewById(R.id.scene81131313_10); 
			slideToRight ((View)scene81131313_10);
		}
		if (mOpSeq == 10) {
			TextView  scene81131313_11 = (TextView)mActivity.findViewById(R.id.scene81131313_11); 
			slideToRight ((View)scene81131313_11);
		}
		if (mOpSeq == 11) {
			TextView  scene81131313_12 = (TextView)mActivity.findViewById(R.id.scene81131313_12); 
			slideToRight ((View)scene81131313_12);
		}
		if (mOpSeq == 12) {
			TextView  scene81131313_13 = (TextView)mActivity.findViewById(R.id.scene81131313_13); 
			slideToRight ((View)scene81131313_13);
		}
		if (mOpSeq == 13) {
			TextView  scene81131313_14 = (TextView)mActivity.findViewById(R.id.scene81131313_14); 
			slideToRight ((View)scene81131313_14);
		}
		if (mOpSeq == 14) {
			TextView  scene81131313_15 = (TextView)mActivity.findViewById(R.id.scene81131313_15); 
			slideToRight ((View)scene81131313_15);
		}
		if (mOpSeq == 15) {
			TextView  scene81131313_16 = (TextView)mActivity.findViewById(R.id.scene81131313_16); 
			slideToRight ((View)scene81131313_16);
		}
		if (mOpSeq == 16) {
			TextView  scene81131313_17 = (TextView)mActivity.findViewById(R.id.scene81131313_17); 
			slideToRight ((View)scene81131313_17);
		}
		if (mOpSeq == 17) {
			TextView  scene81131313_18 = (TextView)mActivity.findViewById(R.id.scene81131313_18); 
			slideToRight ((View)scene81131313_18);
		}
		if (mOpSeq == 18) {
			TextView  scene81131313_19 = (TextView)mActivity.findViewById(R.id.scene81131313_19); 
			slideToRight ((View)scene81131313_19);
		}
		if (mOpSeq == 19) {
			TextView  scene81131313_20 = (TextView)mActivity.findViewById(R.id.scene81131313_20); 
			slideToRight ((View)scene81131313_20);
		}
		if (mOpSeq == 20) {
			TextView  scene81131313_21 = (TextView)mActivity.findViewById(R.id.scene81131313_21); 
			slideToRight ((View)scene81131313_21);
		}
		if (mOpSeq == 21) {
			TextView  scene81131313_22 = (TextView)mActivity.findViewById(R.id.scene81131313_22); 
			slideToRight ((View)scene81131313_22);
		}
		if (mOpSeq == 22) {
			TextView  scene81131313_23 = (TextView)mActivity.findViewById(R.id.scene81131313_23); 
			slideToRight ((View)scene81131313_23);
		}
		if (mOpSeq == 23) {
			TextView  scene81131313_24 = (TextView)mActivity.findViewById(R.id.scene81131313_24); 
			slideToRight ((View)scene81131313_24);
		}
		if (mOpSeq == 24) {
			TextView  scene81131313_25 = (TextView)mActivity.findViewById(R.id.scene81131313_25); 
			slideToRight ((View)scene81131313_25);
		}
		if (mOpSeq == 25) {
			ImageButton  scene81131313_26 = (ImageButton)mActivity.findViewById(R.id.scene81131313_26); 
			slideToRight ((View)scene81131313_26);
		}
		if (mOpSeq == 26) {
			ImageButton  scene81131313_27 = (ImageButton)mActivity.findViewById(R.id.scene81131313_27); 
			slideToRight ((View)scene81131313_27);
		}
	}

	public void hideButton () {
		ImageButton  scene81131313_26 = (ImageButton)mActivity.findViewById(R.id.scene81131313_26); 
		slideToRight_gone ((View)scene81131313_26);

		ImageButton  scene81131313_27 = (ImageButton)mActivity.findViewById(R.id.scene81131313_27); 
		slideToRight_gone ((View)scene81131313_27);
	}

	public int getCount() {
		return (26);
	}

}

