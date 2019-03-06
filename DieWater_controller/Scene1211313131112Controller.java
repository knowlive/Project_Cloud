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
public class Scene1211313131112Controller {
	
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
	
	public Scene1211313131112Controller(MainActivity arg_activity) {
		mActivity = arg_activity;
	}

	public void updateStatus(int arg_opseq) {

		int mOpSeq = arg_opseq;

		if (mOpSeq == 0) {
			TextView  scene1211313131112_1 = (TextView)mActivity.findViewById(R.id.scene1211313131112_1); 
			slideToRight ((View)scene1211313131112_1);
		}
		if (mOpSeq == 1) {
			TextView  scene1211313131112_2 = (TextView)mActivity.findViewById(R.id.scene1211313131112_2); 
			slideToRight ((View)scene1211313131112_2);
		}
		if (mOpSeq == 2) {
			TextView  scene1211313131112_3 = (TextView)mActivity.findViewById(R.id.scene1211313131112_3); 
			slideToRight ((View)scene1211313131112_3);
		}
		if (mOpSeq == 3) {
			TextView  scene1211313131112_4 = (TextView)mActivity.findViewById(R.id.scene1211313131112_4); 
			slideToRight ((View)scene1211313131112_4);
		}
		if (mOpSeq == 4) {
			TextView  scene1211313131112_5 = (TextView)mActivity.findViewById(R.id.scene1211313131112_5); 
			slideToRight ((View)scene1211313131112_5);
		}
		if (mOpSeq == 5) {
			TextView  scene1211313131112_6 = (TextView)mActivity.findViewById(R.id.scene1211313131112_6); 
			slideToRight ((View)scene1211313131112_6);
		}
		if (mOpSeq == 6) {
			TextView  scene1211313131112_7 = (TextView)mActivity.findViewById(R.id.scene1211313131112_7); 
			slideToRight ((View)scene1211313131112_7);
		}
		if (mOpSeq == 7) {
			TextView  scene1211313131112_8 = (TextView)mActivity.findViewById(R.id.scene1211313131112_8); 
			slideToRight ((View)scene1211313131112_8);
		}
		if (mOpSeq == 8) {
			TextView  scene1211313131112_9 = (TextView)mActivity.findViewById(R.id.scene1211313131112_9); 
			slideToRight ((View)scene1211313131112_9);
		}
		if (mOpSeq == 9) {
			TextView  scene1211313131112_10 = (TextView)mActivity.findViewById(R.id.scene1211313131112_10); 
			slideToRight ((View)scene1211313131112_10);
		}
		if (mOpSeq == 10) {
			TextView  scene1211313131112_11 = (TextView)mActivity.findViewById(R.id.scene1211313131112_11); 
			slideToRight ((View)scene1211313131112_11);
		}
		if (mOpSeq == 11) {
			TextView  scene1211313131112_12 = (TextView)mActivity.findViewById(R.id.scene1211313131112_12); 
			slideToRight ((View)scene1211313131112_12);
		}
		if (mOpSeq == 12) {
			TextView  scene1211313131112_13 = (TextView)mActivity.findViewById(R.id.scene1211313131112_13); 
			slideToRight ((View)scene1211313131112_13);
		}
		if (mOpSeq == 13) {
			TextView  scene1211313131112_14 = (TextView)mActivity.findViewById(R.id.scene1211313131112_14); 
			slideToRight ((View)scene1211313131112_14);
		}
		if (mOpSeq == 14) {
			TextView  scene1211313131112_15 = (TextView)mActivity.findViewById(R.id.scene1211313131112_15); 
			slideToRight ((View)scene1211313131112_15);
		}
		if (mOpSeq == 15) {
			TextView  scene1211313131112_16 = (TextView)mActivity.findViewById(R.id.scene1211313131112_16); 
			slideToRight ((View)scene1211313131112_16);
		}
		if (mOpSeq == 16) {
			TextView  scene1211313131112_17 = (TextView)mActivity.findViewById(R.id.scene1211313131112_17); 
			slideToRight ((View)scene1211313131112_17);
		}
		if (mOpSeq == 17) {
			TextView  scene1211313131112_18 = (TextView)mActivity.findViewById(R.id.scene1211313131112_18); 
			slideToRight ((View)scene1211313131112_18);
		}
		if (mOpSeq == 18) {
			TextView  scene1211313131112_19 = (TextView)mActivity.findViewById(R.id.scene1211313131112_19); 
			slideToRight ((View)scene1211313131112_19);
		}
		if (mOpSeq == 19) {
			TextView  scene1211313131112_20 = (TextView)mActivity.findViewById(R.id.scene1211313131112_20); 
			slideToRight ((View)scene1211313131112_20);
		}
		if (mOpSeq == 20) {
			TextView  scene1211313131112_21 = (TextView)mActivity.findViewById(R.id.scene1211313131112_21); 
			slideToRight ((View)scene1211313131112_21);
		}
		if (mOpSeq == 21) {
			TextView  scene1211313131112_22 = (TextView)mActivity.findViewById(R.id.scene1211313131112_22); 
			slideToRight ((View)scene1211313131112_22);
		}
		if (mOpSeq == 22) {
			TextView  scene1211313131112_23 = (TextView)mActivity.findViewById(R.id.scene1211313131112_23); 
			slideToRight ((View)scene1211313131112_23);
		}
		if (mOpSeq == 23) {
			TextView  scene1211313131112_24 = (TextView)mActivity.findViewById(R.id.scene1211313131112_24); 
			slideToRight ((View)scene1211313131112_24);
		}
		if (mOpSeq == 24) {
			TextView  scene1211313131112_25 = (TextView)mActivity.findViewById(R.id.scene1211313131112_25); 
			slideToRight ((View)scene1211313131112_25);
		}
		if (mOpSeq == 25) {
			ImageButton  scene1211313131112_26 = (ImageButton)mActivity.findViewById(R.id.scene1211313131112_26); 
			slideToRight ((View)scene1211313131112_26);
		}
		if (mOpSeq == 26) {
			TextView  scene1211313131112_27 = (TextView)mActivity.findViewById(R.id.scene1211313131112_27); 
			slideToRight ((View)scene1211313131112_27);
		}
		if (mOpSeq == 27) {
			TextView  scene1211313131112_28 = (TextView)mActivity.findViewById(R.id.scene1211313131112_28); 
			slideToRight ((View)scene1211313131112_28);
		}
		if (mOpSeq == 28) {
			TextView  scene1211313131112_29 = (TextView)mActivity.findViewById(R.id.scene1211313131112_29); 
			slideToRight ((View)scene1211313131112_29);
		}
		if (mOpSeq == 29) {
			TextView  scene1211313131112_30 = (TextView)mActivity.findViewById(R.id.scene1211313131112_30); 
			slideToRight ((View)scene1211313131112_30);
		}
		if (mOpSeq == 30) {
			TextView  scene1211313131112_31 = (TextView)mActivity.findViewById(R.id.scene1211313131112_31); 
			slideToRight ((View)scene1211313131112_31);
		}
		if (mOpSeq == 31) {
			TextView  scene1211313131112_32 = (TextView)mActivity.findViewById(R.id.scene1211313131112_32); 
			slideToRight ((View)scene1211313131112_32);
		}
		if (mOpSeq == 32) {
			TextView  scene1211313131112_33 = (TextView)mActivity.findViewById(R.id.scene1211313131112_33); 
			slideToRight ((View)scene1211313131112_33);
		}
		if (mOpSeq == 33) {
			TextView  scene1211313131112_34 = (TextView)mActivity.findViewById(R.id.scene1211313131112_34); 
			slideToRight ((View)scene1211313131112_34);
		}
		if (mOpSeq == 34) {
			TextView  scene1211313131112_35 = (TextView)mActivity.findViewById(R.id.scene1211313131112_35); 
			slideToRight ((View)scene1211313131112_35);
		}
		if (mOpSeq == 35) {
			ImageButton  scene1211313131112_36 = (ImageButton)mActivity.findViewById(R.id.scene1211313131112_36); 
			slideToRight ((View)scene1211313131112_36);
		}
		if (mOpSeq == 36) {
			ImageButton  scene1211313131112_37 = (ImageButton)mActivity.findViewById(R.id.scene1211313131112_37); 
			slideToRight ((View)scene1211313131112_37);
		}
	}

	public void hideButton () {
		ImageButton  scene1211313131112_36 = (ImageButton)mActivity.findViewById(R.id.scene1211313131112_36); 
		slideToRight_gone ((View)scene1211313131112_36);

		ImageButton  scene1211313131112_37 = (ImageButton)mActivity.findViewById(R.id.scene1211313131112_37); 
		slideToRight_gone ((View)scene1211313131112_37);
	}

	public int getCount() {
		return (36);
	}

}
