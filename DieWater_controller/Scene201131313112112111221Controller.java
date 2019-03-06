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
public class Scene201131313112112111221Controller {
	
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
	
	public Scene201131313112112111221Controller(MainActivity arg_activity) {
		mActivity = arg_activity;
	}

	public void updateStatus(int arg_opseq) {

		int mOpSeq = arg_opseq;

		if (mOpSeq == 0) {
			TextView  scene201131313112112111221_1 = (TextView)mActivity.findViewById(R.id.scene201131313112112111221_1); 
			slideToRight ((View)scene201131313112112111221_1);
		}
		if (mOpSeq == 1) {
			TextView  scene201131313112112111221_2 = (TextView)mActivity.findViewById(R.id.scene201131313112112111221_2); 
			slideToRight ((View)scene201131313112112111221_2);
		}
		if (mOpSeq == 2) {
			TextView  scene201131313112112111221_3 = (TextView)mActivity.findViewById(R.id.scene201131313112112111221_3); 
			slideToRight ((View)scene201131313112112111221_3);
		}
		if (mOpSeq == 3) {
			TextView  scene201131313112112111221_4 = (TextView)mActivity.findViewById(R.id.scene201131313112112111221_4); 
			slideToRight ((View)scene201131313112112111221_4);
		}
		if (mOpSeq == 4) {
			TextView  scene201131313112112111221_5 = (TextView)mActivity.findViewById(R.id.scene201131313112112111221_5); 
			slideToRight ((View)scene201131313112112111221_5);
		}
		if (mOpSeq == 5) {
			TextView  scene201131313112112111221_6 = (TextView)mActivity.findViewById(R.id.scene201131313112112111221_6); 
			slideToRight ((View)scene201131313112112111221_6);
		}
		if (mOpSeq == 6) {
			TextView  scene201131313112112111221_7 = (TextView)mActivity.findViewById(R.id.scene201131313112112111221_7); 
			slideToRight ((View)scene201131313112112111221_7);
		}
		if (mOpSeq == 7) {
			TextView  scene201131313112112111221_8 = (TextView)mActivity.findViewById(R.id.scene201131313112112111221_8); 
			slideToRight ((View)scene201131313112112111221_8);
		}
		if (mOpSeq == 8) {
			TextView  scene201131313112112111221_9 = (TextView)mActivity.findViewById(R.id.scene201131313112112111221_9); 
			slideToRight ((View)scene201131313112112111221_9);
		}
		if (mOpSeq == 9) {
			TextView  scene201131313112112111221_10 = (TextView)mActivity.findViewById(R.id.scene201131313112112111221_10); 
			slideToRight ((View)scene201131313112112111221_10);
		}
		if (mOpSeq == 10) {
			TextView  scene201131313112112111221_11 = (TextView)mActivity.findViewById(R.id.scene201131313112112111221_11); 
			slideToRight ((View)scene201131313112112111221_11);
		}
		if (mOpSeq == 11) {
			TextView  scene201131313112112111221_12 = (TextView)mActivity.findViewById(R.id.scene201131313112112111221_12); 
			slideToRight ((View)scene201131313112112111221_12);
		}
		if (mOpSeq == 12) {
			TextView  scene201131313112112111221_13 = (TextView)mActivity.findViewById(R.id.scene201131313112112111221_13); 
			slideToRight ((View)scene201131313112112111221_13);
		}
		if (mOpSeq == 13) {
			TextView  scene201131313112112111221_14 = (TextView)mActivity.findViewById(R.id.scene201131313112112111221_14); 
			slideToRight ((View)scene201131313112112111221_14);
		}
		if (mOpSeq == 14) {
			TextView  scene201131313112112111221_15 = (TextView)mActivity.findViewById(R.id.scene201131313112112111221_15); 
			slideToRight ((View)scene201131313112112111221_15);
		}
		if (mOpSeq == 15) {
			TextView  scene201131313112112111221_16 = (TextView)mActivity.findViewById(R.id.scene201131313112112111221_16); 
			slideToRight ((View)scene201131313112112111221_16);
		}
		if (mOpSeq == 16) {
			TextView  scene201131313112112111221_17 = (TextView)mActivity.findViewById(R.id.scene201131313112112111221_17); 
			slideToRight ((View)scene201131313112112111221_17);
		}
		if (mOpSeq == 17) {
			TextView  scene201131313112112111221_18 = (TextView)mActivity.findViewById(R.id.scene201131313112112111221_18); 
			slideToRight ((View)scene201131313112112111221_18);
		}
		if (mOpSeq == 18) {
			TextView  scene201131313112112111221_19 = (TextView)mActivity.findViewById(R.id.scene201131313112112111221_19); 
			slideToRight ((View)scene201131313112112111221_19);
		}
		if (mOpSeq == 19) {
			TextView  scene201131313112112111221_20 = (TextView)mActivity.findViewById(R.id.scene201131313112112111221_20); 
			slideToRight ((View)scene201131313112112111221_20);
		}
		if (mOpSeq == 20) {
			TextView  scene201131313112112111221_21 = (TextView)mActivity.findViewById(R.id.scene201131313112112111221_21); 
			slideToRight ((View)scene201131313112112111221_21);
		}
		if (mOpSeq == 21) {
			TextView  scene201131313112112111221_22 = (TextView)mActivity.findViewById(R.id.scene201131313112112111221_22); 
			slideToRight ((View)scene201131313112112111221_22);
		}
		if (mOpSeq == 22) {
			TextView  scene201131313112112111221_23 = (TextView)mActivity.findViewById(R.id.scene201131313112112111221_23); 
			slideToRight ((View)scene201131313112112111221_23);
		}
		if (mOpSeq == 23) {
			TextView  scene201131313112112111221_24 = (TextView)mActivity.findViewById(R.id.scene201131313112112111221_24); 
			slideToRight ((View)scene201131313112112111221_24);
		}
	}

	public int getCount() {
		return (23);
	}

}

