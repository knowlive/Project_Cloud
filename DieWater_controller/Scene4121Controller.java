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
public class Scene4121Controller {
	
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
	
	public Scene4121Controller(MainActivity arg_activity) {
		mActivity = arg_activity;
	}

	public void updateStatus(int arg_opseq) {

		int mOpSeq = arg_opseq;

		
		if (mOpSeq == 0) {
			TextView  scene4121_1 = (TextView)mActivity.findViewById(R.id.scene4121_1); 
			slideToRight ((View)scene4121_1);
		}
		if (mOpSeq == 1) {
			TextView  scene4121_2 = (TextView)mActivity.findViewById(R.id.scene4121_2); 
			slideToRight ((View)scene4121_2);
		}
		if (mOpSeq == 2) {
			TextView  scene4121_3 = (TextView)mActivity.findViewById(R.id.scene4121_3); 
			slideToRight ((View)scene4121_3);
		}
		if (mOpSeq == 3) {
			TextView  scene4121_4 = (TextView)mActivity.findViewById(R.id.scene4121_4); 
			slideToRight ((View)scene4121_4);
		}
		if (mOpSeq == 4) {
			TextView  scene4121_5 = (TextView)mActivity.findViewById(R.id.scene4121_5); 
			slideToRight ((View)scene4121_5);
		}
		if (mOpSeq == 5) {
			TextView  scene4121_6 = (TextView)mActivity.findViewById(R.id.scene4121_6); 
			slideToRight ((View)scene4121_6);
		}
		if (mOpSeq == 6) {
			TextView  scene4121_7 = (TextView)mActivity.findViewById(R.id.scene4121_7); 
			slideToRight ((View)scene4121_7);
		}
		if (mOpSeq == 7) {
			TextView  scene4121_8 = (TextView)mActivity.findViewById(R.id.scene4121_8); 
			slideToRight ((View)scene4121_8);
		}
		if (mOpSeq == 8) {
			TextView  scene4121_9 = (TextView)mActivity.findViewById(R.id.scene4121_9); 
			slideToRight ((View)scene4121_9);
		}
		if (mOpSeq == 9) {
			TextView  scene4121_10 = (TextView)mActivity.findViewById(R.id.scene4121_10); 
			slideToRight ((View)scene4121_10);
		}
		if (mOpSeq == 10) {
			TextView  scene4121_11 = (TextView)mActivity.findViewById(R.id.scene4121_11); 
			slideToRight ((View)scene4121_11);
		}
		if (mOpSeq == 11) {
			TextView  scene4121_12 = (TextView)mActivity.findViewById(R.id.scene4121_12); 
			slideToRight ((View)scene4121_12);
		}
		if (mOpSeq == 12) {
			TextView  scene4121_13 = (TextView)mActivity.findViewById(R.id.scene4121_13); 
			slideToRight ((View)scene4121_13);
		}
		if (mOpSeq == 13) {
			TextView  scene4121_14 = (TextView)mActivity.findViewById(R.id.scene4121_14); 
			slideToRight ((View)scene4121_14);
		}
	}

	public int getCount() {
		return (13);
	}

}

