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
public class Scene111131313111Controller {
	
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
	
	public Scene111131313111Controller(MainActivity arg_activity) {
		mActivity = arg_activity;
	}

	public void updateStatus(int arg_opseq) {

		int mOpSeq = arg_opseq;

		if (mOpSeq == 0) {
			TextView  scene111131313111_1 = (TextView)mActivity.findViewById(R.id.scene111131313111_1); 
			slideToRight ((View)scene111131313111_1);
		}
		if (mOpSeq == 1) {
			TextView  scene111131313111_2 = (TextView)mActivity.findViewById(R.id.scene111131313111_2); 
			slideToRight ((View)scene111131313111_2);
		}
		if (mOpSeq == 2) {
			TextView  scene111131313111_3 = (TextView)mActivity.findViewById(R.id.scene111131313111_3); 
			slideToRight ((View)scene111131313111_3);
		}
		if (mOpSeq == 3) {
			TextView  scene111131313111_4 = (TextView)mActivity.findViewById(R.id.scene111131313111_4); 
			slideToRight ((View)scene111131313111_4);
		}
		if (mOpSeq == 4) {
			TextView  scene111131313111_5 = (TextView)mActivity.findViewById(R.id.scene111131313111_5); 
			slideToRight ((View)scene111131313111_5);
		}
		if (mOpSeq == 5) {
			TextView  scene111131313111_6 = (TextView)mActivity.findViewById(R.id.scene111131313111_6); 
			slideToRight ((View)scene111131313111_6);
		}
		if (mOpSeq == 6) {
			TextView  scene111131313111_7 = (TextView)mActivity.findViewById(R.id.scene111131313111_7); 
			slideToRight ((View)scene111131313111_7);
		}
		if (mOpSeq == 7) {
			TextView  scene111131313111_8 = (TextView)mActivity.findViewById(R.id.scene111131313111_8); 
			slideToRight ((View)scene111131313111_8);
		}
		if (mOpSeq == 8) {
			TextView  scene111131313111_9 = (TextView)mActivity.findViewById(R.id.scene111131313111_9); 
			slideToRight ((View)scene111131313111_9);
		}
		if (mOpSeq == 9) {
			TextView  scene111131313111_10 = (TextView)mActivity.findViewById(R.id.scene111131313111_10); 
			slideToRight ((View)scene111131313111_10);
		}
		if (mOpSeq == 10) {
			TextView  scene111131313111_11 = (TextView)mActivity.findViewById(R.id.scene111131313111_11); 
			slideToRight ((View)scene111131313111_11);
		}
		if (mOpSeq == 11) {
			TextView  scene111131313111_12 = (TextView)mActivity.findViewById(R.id.scene111131313111_12); 
			slideToRight ((View)scene111131313111_12);
		}
		if (mOpSeq == 12) {
			TextView  scene111131313111_13 = (TextView)mActivity.findViewById(R.id.scene111131313111_13); 
			slideToRight ((View)scene111131313111_13);
		}
		if (mOpSeq == 13) {
			ImageButton  scene111131313111_14 = (ImageButton)mActivity.findViewById(R.id.scene111131313111_14); 
			slideToRight ((View)scene111131313111_14);
		}
		if (mOpSeq == 14) {
			ImageButton  scene111131313111_15 = (ImageButton)mActivity.findViewById(R.id.scene111131313111_15); 
			slideToRight ((View)scene111131313111_15);
		}
	}

	public void hideButton () {
		ImageButton  scene111131313111_14 = (ImageButton)mActivity.findViewById(R.id.scene111131313111_14); 
		slideToRight_gone ((View)scene111131313111_14);

		ImageButton  scene111131313111_15 = (ImageButton)mActivity.findViewById(R.id.scene111131313111_15); 
		slideToRight_gone ((View)scene111131313111_15);
	}

	public int getCount() {
		return (14);
	}

}

