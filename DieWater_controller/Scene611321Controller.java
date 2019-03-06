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
public class Scene611321Controller {
	
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
	
	public Scene611321Controller(MainActivity arg_activity) {
		mActivity = arg_activity;
	}

	public void updateStatus(int arg_opseq) {

		int mOpSeq = arg_opseq;

		if (mOpSeq == 0) {
			TextView  scene611321_1 = (TextView)mActivity.findViewById(R.id.scene611321_1); 
			slideToRight ((View)scene611321_1);
		}
		if (mOpSeq == 1) {
			TextView  scene611321_2 = (TextView)mActivity.findViewById(R.id.scene611321_2); 
			slideToRight ((View)scene611321_2);
		}
		if (mOpSeq == 2) {
			TextView  scene611321_3 = (TextView)mActivity.findViewById(R.id.scene611321_3); 
			slideToRight ((View)scene611321_3);
		}
		if (mOpSeq == 3) {
			TextView  scene611321_4 = (TextView)mActivity.findViewById(R.id.scene611321_4); 
			slideToRight ((View)scene611321_4);
		}
		if (mOpSeq == 4) {
			TextView  scene611321_5 = (TextView)mActivity.findViewById(R.id.scene611321_5); 
			slideToRight ((View)scene611321_5);
		}
		if (mOpSeq == 5) {
			ImageButton  scene611321_6 = (ImageButton)mActivity.findViewById(R.id.scene611321_6); 
			slideToRight ((View)scene611321_6);
		}
		if (mOpSeq == 6) {
			ImageButton  scene611321_7 = (ImageButton)mActivity.findViewById(R.id.scene611321_7); 
			slideToRight ((View)scene611321_7);
		}
	}

	public void hideButton () {
		ImageButton  scene611321_6 = (ImageButton)mActivity.findViewById(R.id.scene611321_6); 
		slideToRight_gone ((View)scene611321_6);

		ImageButton  scene611321_7 = (ImageButton)mActivity.findViewById(R.id.scene611321_7); 
		slideToRight_gone ((View)scene611321_7);
	}

	public int getCount() {
		return (6);
	}

}

