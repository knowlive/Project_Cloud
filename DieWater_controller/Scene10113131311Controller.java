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
public class Scene10113131311Controller {
	
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
	
	public Scene10113131311Controller(MainActivity arg_activity) {
		mActivity = arg_activity;
	}

	public void updateStatus(int arg_opseq) {

		int mOpSeq = arg_opseq;

		if (mOpSeq == 0) {
			TextView  scene10113131311_1 = (TextView)mActivity.findViewById(R.id.scene10113131311_1); 
			slideToRight ((View)scene10113131311_1);
		}
		if (mOpSeq == 1) {
			TextView  scene10113131311_2 = (TextView)mActivity.findViewById(R.id.scene10113131311_2); 
			slideToRight ((View)scene10113131311_2);
		}
		if (mOpSeq == 2) {
			TextView  scene10113131311_3 = (TextView)mActivity.findViewById(R.id.scene10113131311_3); 
			slideToRight ((View)scene10113131311_3);
		}
		if (mOpSeq == 3) {
			TextView  scene10113131311_4 = (TextView)mActivity.findViewById(R.id.scene10113131311_4); 
			slideToRight ((View)scene10113131311_4);
		}
		if (mOpSeq == 4) {
			TextView  scene10113131311_5 = (TextView)mActivity.findViewById(R.id.scene10113131311_5); 
			slideToRight ((View)scene10113131311_5);
		}
		if (mOpSeq == 5) {
			TextView  scene10113131311_6 = (TextView)mActivity.findViewById(R.id.scene10113131311_6); 
			slideToRight ((View)scene10113131311_6);
		}
		if (mOpSeq == 6) {
			TextView  scene10113131311_7 = (TextView)mActivity.findViewById(R.id.scene10113131311_7); 
			slideToRight ((View)scene10113131311_7);
		}
		if (mOpSeq == 7) {
			TextView  scene10113131311_8 = (TextView)mActivity.findViewById(R.id.scene10113131311_8); 
			slideToRight ((View)scene10113131311_8);
		}
		if (mOpSeq == 8) {
			TextView  scene10113131311_9 = (TextView)mActivity.findViewById(R.id.scene10113131311_9); 
			slideToRight ((View)scene10113131311_9);
		}
		if (mOpSeq == 9) {
			TextView  scene10113131311_10 = (TextView)mActivity.findViewById(R.id.scene10113131311_10); 
			slideToRight ((View)scene10113131311_10);
		}
		if (mOpSeq == 10) {
			TextView  scene10113131311_11 = (TextView)mActivity.findViewById(R.id.scene10113131311_11); 
			slideToRight ((View)scene10113131311_11);
		}
		if (mOpSeq == 11) {
			TextView  scene10113131311_12 = (TextView)mActivity.findViewById(R.id.scene10113131311_12); 
			slideToRight ((View)scene10113131311_12);
		}
		if (mOpSeq == 12) {
			TextView  scene10113131311_13 = (TextView)mActivity.findViewById(R.id.scene10113131311_13); 
			slideToRight ((View)scene10113131311_13);
		}
		if (mOpSeq == 13) {
			TextView  scene10113131311_14 = (TextView)mActivity.findViewById(R.id.scene10113131311_14); 
			slideToRight ((View)scene10113131311_14);
		}
		if (mOpSeq == 14) {
			TextView  scene10113131311_15 = (TextView)mActivity.findViewById(R.id.scene10113131311_15); 
			slideToRight ((View)scene10113131311_15);
		}
		if (mOpSeq == 15) {
			TextView  scene10113131311_16 = (TextView)mActivity.findViewById(R.id.scene10113131311_16); 
			slideToRight ((View)scene10113131311_16);
		}
		if (mOpSeq == 16) {
			TextView  scene10113131311_17 = (TextView)mActivity.findViewById(R.id.scene10113131311_17); 
			slideToRight ((View)scene10113131311_17);
		}
		if (mOpSeq == 17) {
			TextView  scene10113131311_18 = (TextView)mActivity.findViewById(R.id.scene10113131311_18); 
			slideToRight ((View)scene10113131311_18);
		}
		if (mOpSeq == 18) {
			TextView  scene10113131311_19 = (TextView)mActivity.findViewById(R.id.scene10113131311_19); 
			slideToRight ((View)scene10113131311_19);
		}
		if (mOpSeq == 19) {
			TextView  scene10113131311_20 = (TextView)mActivity.findViewById(R.id.scene10113131311_20); 
			slideToRight ((View)scene10113131311_20);
		}
		if (mOpSeq == 20) {
			TextView  scene10113131311_21 = (TextView)mActivity.findViewById(R.id.scene10113131311_21); 
			slideToRight ((View)scene10113131311_21);
		}
		if (mOpSeq == 21) {
			TextView  scene10113131311_22 = (TextView)mActivity.findViewById(R.id.scene10113131311_22); 
			slideToRight ((View)scene10113131311_22);
		}
		if (mOpSeq == 22) {
			TextView  scene10113131311_23 = (TextView)mActivity.findViewById(R.id.scene10113131311_23); 
			slideToRight ((View)scene10113131311_23);
		}
		if (mOpSeq == 23) {
			TextView  scene10113131311_24 = (TextView)mActivity.findViewById(R.id.scene10113131311_24); 
			slideToRight ((View)scene10113131311_24);
		}
		if (mOpSeq == 24) {
			TextView  scene10113131311_25 = (TextView)mActivity.findViewById(R.id.scene10113131311_25); 
			slideToRight ((View)scene10113131311_25);
		}
		if (mOpSeq == 25) {
			TextView  scene10113131311_26 = (TextView)mActivity.findViewById(R.id.scene10113131311_26); 
			slideToRight ((View)scene10113131311_26);
					}
		if (mOpSeq == 26) {
			TextView  scene10113131311_27 = (TextView)mActivity.findViewById(R.id.scene10113131311_27); 
			slideToRight ((View)scene10113131311_27);
		}
		if (mOpSeq == 27) {
			TextView  scene10113131311_28 = (TextView)mActivity.findViewById(R.id.scene10113131311_28); 
			slideToRight ((View)scene10113131311_28);
		}
		if (mOpSeq == 28) {
			TextView  scene10113131311_29 = (TextView)mActivity.findViewById(R.id.scene10113131311_29); 
			slideToRight ((View)scene10113131311_29);
		}
		if (mOpSeq == 29) {
			TextView  scene10113131311_30 = (TextView)mActivity.findViewById(R.id.scene10113131311_30); 
			slideToRight ((View)scene10113131311_30);
		}
		if (mOpSeq == 30) {
			TextView  scene10113131311_31 = (TextView)mActivity.findViewById(R.id.scene10113131311_31); 
			slideToRight ((View)scene10113131311_31);
		}
		if (mOpSeq == 31) {
			TextView  scene10113131311_32 = (TextView)mActivity.findViewById(R.id.scene10113131311_32); 
			slideToRight ((View)scene10113131311_32);
		}
		if (mOpSeq == 32) {
			TextView  scene10113131311_33 = (TextView)mActivity.findViewById(R.id.scene10113131311_33); 
			slideToRight ((View)scene10113131311_33);
		}
		if (mOpSeq == 33) {
			TextView  scene10113131311_34 = (TextView)mActivity.findViewById(R.id.scene10113131311_34); 
			slideToRight ((View)scene10113131311_34);
		}
		if (mOpSeq == 34) {
			TextView  scene10113131311_35 = (TextView)mActivity.findViewById(R.id.scene10113131311_35); 
			slideToRight ((View)scene10113131311_35);
		}
		if (mOpSeq == 35) {
			ImageButton  scene10113131311_36 = (ImageButton)mActivity.findViewById(R.id.scene10113131311_36); 
			slideToRight ((View)scene10113131311_36);
		}
		if (mOpSeq == 36) {
			ImageButton  scene10113131311_37 = (ImageButton)mActivity.findViewById(R.id.scene10113131311_37); 
			slideToRight ((View)scene10113131311_37);
		}
	}

	public void hideButton () {
		ImageButton  scene10113131311_36 = (ImageButton)mActivity.findViewById(R.id.scene10113131311_36); 
		slideToRight_gone ((View)scene10113131311_36);

		ImageButton  scene10113131311_37 = (ImageButton)mActivity.findViewById(R.id.scene10113131311_37); 
		slideToRight_gone ((View)scene10113131311_37);
	}

	public int getCount() {
		return (36);
	}

}

