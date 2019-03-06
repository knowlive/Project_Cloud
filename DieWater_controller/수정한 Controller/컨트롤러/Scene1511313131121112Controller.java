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


//activity_main.xml
public class Scene1511313131121112Controller {
	
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
			TextView  scene1511313131121112_1 = (TextView)mActivity.findViewById(R.id.scene1511313131121112_1); 
			slideToRight ((View)scene1511313131121112_1);
		}
		if (mOpSeq == 1) {
			TextView  scene1511313131121112_2 = (TextView)mActivity.findViewById(R.id.scene1511313131121112_2); 
			slideToRight ((View)scene1511313131121112_2);
		}
		if (mOpSeq == 2) {
			TextView  scene1511313131121112_3 = (TextView)mActivity.findViewById(R.id.scene1511313131121112_3); 
			slideToRight ((View)scene1511313131121112_3);
		}
		if (mOpSeq == 3) {
			TextView  scene1511313131121112_4 = (TextView)mActivity.findViewById(R.id.scene1511313131121112_4); 
			slideToRight ((View)scene1511313131121112_4);
		}
		if (mOpSeq == 4) {
			TextView  scene1511313131121112_5 = (TextView)mActivity.findViewById(R.id.scene1511313131121112_5); 
			slideToRight ((View)scene1511313131121112_5);
		}
		if (mOpSeq == 5) {
			TextView  scene1511313131121112_6 = (TextView)mActivity.findViewById(R.id.scene1511313131121112_6); 
			slideToRight ((View)scene1511313131121112_6);
		}
		if (mOpSeq == 6) {
			TextView  scene1511313131121112_7 = (TextView)mActivity.findViewById(R.id.scene1511313131121112_7); 
			slideToRight ((View)scene1511313131121112_7);
		}
		if (mOpSeq == 7) {
			TextView  scene1511313131121112_8 = (TextView)mActivity.findViewById(R.id.scene1511313131121112_8); 
			slideToRight ((View)scene1511313131121112_8);
		}
		if (mOpSeq == 8) {
			TextView  scene1511313131121112_9 = (TextView)mActivity.findViewById(R.id.scene1511313131121112_9); 
			slideToRight ((View)scene1511313131121112_9);
		}
		if (mOpSeq == 9) {
			TextView  scene1511313131121112_10 = (TextView)mActivity.findViewById(R.id.scene1511313131121112_10); 
			slideToRight ((View)scene1511313131121112_10);
		}
		if (mOpSeq == 10) {
			TextView  scene1511313131121112_11 = (TextView)mActivity.findViewById(R.id.scene1511313131121112_11); 
			slideToRight ((View)scene1511313131121112_11);
		}
		if (mOpSeq == 11) {
			TextView  scene1511313131121112_12 = (TextView)mActivity.findViewById(R.id.scene1511313131121112_12); 
			slideToRight ((View)scene1511313131121112_12);
		}



	public int getCount() {
		return (11);
	}

}

