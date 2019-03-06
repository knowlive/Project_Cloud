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
public class Scene16113131311211222Controller {
	
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
			TextView  scene16113131311211222_1 = (TextView)mActivity.findViewById(R.id.scene16113131311211222_1); 
			slideToRight ((View)scene16113131311211222_1);
		}
		if (mOpSeq == 1) {
			TextView  scene16113131311211222_2 = (TextView)mActivity.findViewById(R.id.scene16113131311211222_2); 
			slideToRight ((View)scene16113131311211222_2);
		}
		if (mOpSeq == 2) {
			TextView  scene16113131311211222_3 = (TextView)mActivity.findViewById(R.id.scene16113131311211222_3); 
			slideToRight ((View)scene16113131311211222_3);
		}
		if (mOpSeq == 3) {
			TextView  scene16113131311211222_4 = (TextView)mActivity.findViewById(R.id.scene16113131311211222_4); 
			slideToRight ((View)scene16113131311211222_4);
		}
		if (mOpSeq == 4) {
			TextView  scene16113131311211222_5 = (TextView)mActivity.findViewById(R.id.scene16113131311211222_5); 
			slideToRight ((View)scene16113131311211222_5);
		}
		if (mOpSeq == 5) {
			TextView  scene16113131311211222_6 = (TextView)mActivity.findViewById(R.id.scene16113131311211222_6); 
			slideToRight ((View)scene16113131311211222_6);
		}
		if (mOpSeq == 6) {
			TextView  scene16113131311211222_7 = (TextView)mActivity.findViewById(R.id.scene16113131311211222_7); 
			slideToRight ((View)scene16113131311211222_7);
		}
		if (mOpSeq == 7) {
			TextView  scene16113131311211222_8 = (TextView)mActivity.findViewById(R.id.scene16113131311211222_8); 
			slideToRight ((View)scene16113131311211222_8);
		}
		if (mOpSeq == 8) {
			TextView  scene16113131311211222_9 = (TextView)mActivity.findViewById(R.id.scene16113131311211222_9); 
			slideToRight ((View)scene16113131311211222_9);
		}
		if (mOpSeq == 9) {
			TextView  scene16113131311211222_10 = (TextView)mActivity.findViewById(R.id.scene16113131311211222_10); 
			slideToRight ((View)scene16113131311211222_10);
		}
		if (mOpSeq == 10) {
			TextView  scene16113131311211222_11 = (TextView)mActivity.findViewById(R.id.scene16113131311211222_11); 
			slideToRight ((View)scene16113131311211222_11);
		}
		if (mOpSeq == 11) {
			TextView  scene16113131311211222_12 = (TextView)mActivity.findViewById(R.id.scene16113131311211222_12); 
			slideToRight ((View)scene16113131311211222_12);
		}
		if (mOpSeq == 12) {
			TextView  scene16113131311211222_13 = (TextView)mActivity.findViewById(R.id.scene16113131311211222_13); 
			slideToRight ((View)scene16113131311211222_13);
		}
	}


	public int getCount() {
		return (12);
	}

}
