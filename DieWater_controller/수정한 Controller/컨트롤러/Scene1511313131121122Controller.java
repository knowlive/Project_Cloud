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


//activity_main.xm1
public class Scene1511313131121122Controller {
	
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

	
	public Scene1Controller(MainActivity arg_activity) {
		mActivity = arg_activity;
	}

	public void updateStatus(int arg_opseq) {

		int mOpSeq = arg_opseq;

		if (mOpSeq == 0) {
			TextView  scene1511313131121122_1 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_1); 
			slideToRight ((View)scene1511313131121122_1);
		}
		if (mOpSeq == 1) {
			TextView  scene1511313131121122_2 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_2); 
			slideToRight ((View)scene1511313131121122_2);
		}
		if (mOpSeq == 2) {
			TextView  scene1511313131121122_3 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_3); 
			slideToRight ((View)scene1511313131121122_3);
		}
		if (mOpSeq == 3) {
			TextView  scene1511313131121122_4 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_4); 
			slideToRight ((View)scene1511313131121122_4);
		}
		if (mOpSeq == 4) {
			TextView  scene1511313131121122_5 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_5); 
			slideToRight ((View)scene1511313131121122_5);
		}
		if (mOpSeq == 5) {
			TextView  scene1511313131121122_6 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_6); 
			slideToRight ((View)scene1511313131121122_6);
		}
		if (mOpSeq == 6) {
			TextView  scene1511313131121122_7 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_7); 
			slideToRight ((View)scene1511313131121122_7);
		}
		if (mOpSeq == 7) {
			TextView  scene1511313131121122_8 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_8); 
			slideToRight ((View)scene1511313131121122_8);
		}
		if (mOpSeq == 8) {
			TextView  scene1511313131121122_9 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_9); 
			slideToRight ((View)scene1511313131121122_9);
		}
		if (mOpSeq == 9) {
			TextView  scene1511313131121122_10 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_10); 
			slideToRight ((View)scene1511313131121122_10);
		}
		if (mOpSeq == 10) {
			TextView  scene1511313131121122_11 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_11); 
			slideToRight ((View)scene1511313131121122_11);
		}
		if (mOpSeq == 11) {
			TextView  scene1511313131121122_12 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_12); 
			slideToRight ((View)scene1511313131121122_12);
		}
		if (mOpSeq == 12) {
			TextView  scene1511313131121122_13 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_13); 
			slideToRight ((View)scene1511313131121122_13);
		}
		if (mOpSeq == 13) {
			TextView  scene1511313131121122_14 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_14); 
			slideToRight ((View)scene1511313131121122_14);
		}
		if (mOpSeq == 14) {
			TextView  scene1511313131121122_15 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_15); 
			slideToRight ((View)scene1511313131121122_15);
		}
		if (mOpSeq == 15) {
			TextView  scene1511313131121122_16 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_16); 
			slideToRight ((View)scene1511313131121122_16);
		}
		if (mOpSeq == 16) {
			TextView  scene1511313131121122_17 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_17); 
			slideToRight ((View)scene1511313131121122_17);
		}
		if (mOpSeq == 17) {
			TextView  scene1511313131121122_18 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_18); 
			slideToRight ((View)scene1511313131121122_18);
		}
		if (mOpSeq == 18) {
			TextView  scene1511313131121122_19 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_19); 
			slideToRight ((View)scene1511313131121122_19);
		}
		if (mOpSeq == 19) {
			TextView  scene1511313131121122_20 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_20); 
			slideToRight ((View)scene1511313131121122_20);
		}
		if (mOpSeq == 20) {
			TextView  scene1511313131121122_21 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_21); 
			slideToRight ((View)scene1511313131121122_21);
		}
		if (mOpSeq == 21) {
			TextView  scene1511313131121122_22 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_22); 
			slideToRight ((View)scene1511313131121122_22);
		}
		if (mOpSeq == 22) {
			TextView  scene1511313131121122_23 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_23); 
			slideToRight ((View)scene1511313131121122_23);
		}
		if (mOpSeq == 23) {
			TextView  scene1511313131121122_24 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_24); 
			slideToRight ((View)scene1511313131121122_24);
		}
		if (mOpSeq == 24) {
			TextView  scene1511313131121122_25 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_25); 
			slideToRight ((View)scene1511313131121122_25);
		}
		if (mOpSeq == 25) {
			TextView  scene1511313131121122_26 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_26); 
			slideToRight ((View)scene1511313131121122_26);
		}
		if (mOpSeq == 26) {
			TextView  scene1511313131121122_27 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_27); 
			slideToRight ((View)scene1511313131121122_27);
		}
		if (mOpSeq == 27) {
			TextView  scene1511313131121122_28 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_28); 
			slideToRight ((View)scene1511313131121122_28);
		}
		if (mOpSeq == 28) {
			TextView  scene1511313131121122_29 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_29); 
			slideToRight ((View)scene1511313131121122_29);
		}
		if (mOpSeq == 29) {
			TextView  scene1511313131121122_30 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_30); 
			slideToRight ((View)scene1511313131121122_30);
		}
		if (mOpSeq == 30) {
			TextView  scene1511313131121122_31 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_31); 
			slideToRight ((View)scene1_31);
		}
		if (mOpSeq == 31) {
			TextView  scene1511313131121122_32 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_32); 
			slideToRight ((View)scene1511313131121122_32);
		}
		if (mOpSeq == 32) {
			TextView  scene1511313131121122_33 = (TextView)mActivity.findViewById(R.id.scene1511313131121122_33); 
			slideToRight ((View)scene1511313131121122_33);
		}
		if (mOpSeq == 33) {
			ImageButton scene1511313131121122_34 =   (ImageButton)mActivity.findViewById(R.id.scene1511313131121122_34); 
			slideToRight ((View)scene1511313131121122_34);
		}
		if (mOpSeq == 34) {
			ImageButton scene1511313131121122_35 = (ImageButton)mActivity.findViewById(R.id.scene1511313131121122_35); 
			slideToRight ((View)scene1511313131121122_35);
		}

	}

	public void hideButton () {
		ImageButton  scene1511313131121122_35 = (ImageButton)mActivity.findViewById(R.id.scene1511313131121122_34); 
		slideToRight_gone ((View)scene1511313131121122_34);

		ImageButton  scene1511313131121122_36 = (ImageButton)mActivity.findViewById(R.id.scene1511313131121122_35); 
		slideToRight_gone ((View)scene1511313131121122_35);
	}

	public int getCount() {
		return (34);
	}

}

