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
public class Scene141131313112111Controller {
	
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
	
	public Scene141131313112111Controller(MainActivity arg_activity) {
		mActivity = arg_activity;
	}

	public void updateStatus(int arg_opseq) {

		int mOpSeq = arg_opseq;

		if (mOpSeq == 0) {
			TextView  scene141131313112111_1 = (TextView)mActivity.findViewById(R.id.scene141131313112111_1); 
			slideToRight ((View)scene141131313112111_1);
		}
		if (mOpSeq == 1) {
			TextView  scene141131313112111_2 = (TextView)mActivity.findViewById(R.id.scene141131313112111_2); 
			slideToRight ((View)scene141131313112111_2);
		}
		if (mOpSeq == 2) {
			TextView  scene141131313112111_3 = (TextView)mActivity.findViewById(R.id.scene141131313112111_3); 
			slideToRight ((View)scene141131313112111_3);
		}
		if (mOpSeq == 3) {
			TextView  scene141131313112111_4 = (TextView)mActivity.findViewById(R.id.scene141131313112111_4); 
			slideToRight ((View)scene141131313112111_4);
		}
		if (mOpSeq == 4) {
			TextView  scene141131313112111_5 = (TextView)mActivity.findViewById(R.id.scene141131313112111_5); 
			slideToRight ((View)scene141131313112111_5);
		}
		if (mOpSeq == 5) {
			TextView  scene141131313112111_6 = (TextView)mActivity.findViewById(R.id.scene141131313112111_6); 
			slideToRight ((View)scene141131313112111_6);
		}
		if (mOpSeq == 6) {
			TextView  scene141131313112111_7 = (TextView)mActivity.findViewById(R.id.scene141131313112111_7); 
			slideToRight ((View)scene141131313112111_7);
		}
		if (mOpSeq == 7) {
			TextView  scene141131313112111_8 = (TextView)mActivity.findViewById(R.id.scene141131313112111_8); 
			slideToRight ((View)scene141131313112111_8);
		}
		if (mOpSeq == 8) {
			TextView  scene141131313112111_9 = (TextView)mActivity.findViewById(R.id.scene141131313112111_9); 
			slideToRight ((View)scene141131313112111_9);
		}
		if (mOpSeq == 9) {
			TextView  scene141131313112111_10 = (TextView)mActivity.findViewById(R.id.scene141131313112111_10); 
			slideToRight ((View)scene141131313112111_10);
		}
		if (mOpSeq == 10) {
			ImageButton  scene141131313112111_11 = (ImageButton)mActivity.findViewById(R.id.scene141131313112111_11); 
			slideToRight ((View)scene141131313112111_11);
		}
		if (mOpSeq == 11) {
			ImageButton  scene141131313112111_12 = (ImageButton)mActivity.findViewById(R.id.scene141131313112111_12); 
			slideToRight ((View)scene141131313112111_12);
		}
	}

	public void hideButton () {
		ImageButton  scene141131313112111_11 = (ImageButton)mActivity.findViewById(R.id.scene141131313112111_11); 
		slideToRight_gone ((View)scene141131313112111_11);

		ImageButton  scene141131313112111_12 = (ImageButton)mActivity.findViewById(R.id.scene141131313112111_12); 
		slideToRight_gone ((View)scene141131313112111_12);
	}

	public int getCount() {
		return (11);
	}

}

