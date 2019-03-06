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
public class Scene611313Controller {
	
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
	
	public Scene611313Controller(MainActivity arg_activity) {
		mActivity = arg_activity;
	}

	public void updateStatus(int arg_opseq) {

		int mOpSeq = arg_opseq;

		if (mOpSeq == 0) {
			TextView  scene611313_1 = (TextView)mActivity.findViewById(R.id.scene611313_1); 
			slideToRight ((View)scene611313_1);
		}
		if (mOpSeq == 1) {
			TextView  scene611313_2 = (TextView)mActivity.findViewById(R.id.scene611313_2); 
			slideToRight ((View)scene611313_2);
		}
		if (mOpSeq == 2) {
			TextView  scene611313_3 = (TextView)mActivity.findViewById(R.id.scene611313_3); 
			slideToRight ((View)scene611313_3);
		}
		if (mOpSeq == 3) {
			TextView  scene611313_4 = (TextView)mActivity.findViewById(R.id.scene611313_4); 
			slideToRight ((View)scene611313_4);
		}
		if (mOpSeq == 4) {
			TextView  scene611313_5 = (TextView)mActivity.findViewById(R.id.scene611313_5); 
			slideToRight ((View)scene611313_5);
		}
		if (mOpSeq == 5) {
			TextView  scene611313_6 = (TextView)mActivity.findViewById(R.id.scene611313_6); 
			slideToRight ((View)scene611313_6);
		}
		if (mOpSeq == 6) {
			TextView  scene611313_7 = (TextView)mActivity.findViewById(R.id.scene611313_7); 
			slideToRight ((View)scene611313_7);
		}
		if (mOpSeq == 7) {
			TextView  scene611313_8 = (TextView)mActivity.findViewById(R.id.scene611313_8); 
			slideToRight ((View)scene611313_8);
		}
		if (mOpSeq == 8) {
			ImageButton  scene611313_9 = (ImageButton)mActivity.findViewById(R.id.scene611313_9); 
			slideToRight ((View)scene611313_9);
		}
		if (mOpSeq == 9) {
			ImageButton  scene611313_10 = (ImageButton)mActivity.findViewById(R.id.scene611313_10); 
			slideToRight ((View)scene611313_10);
		}
	}

	public void hideButton () {
		ImageButton  scene611313_9 = (ImageButton)mActivity.findViewById(R.id.scene611313_9); 
		slideToRight_gone ((View)scene611313_9);

		ImageButton  scene611313_10 = (ImageButton)mActivity.findViewById(R.id.scene611313_10); 
		slideToRight_gone ((View)scene611313_10);
	}

	public int getCount() {
		return (9);
	}

}

