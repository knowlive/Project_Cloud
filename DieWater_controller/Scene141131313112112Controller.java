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
public class Scene141131313112112Controller {
	
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
	
	public Scene141131313112112Controller(MainActivity arg_activity) {
		mActivity = arg_activity;
	}

	public void updateStatus(int arg_opseq) {

		int mOpSeq = arg_opseq;

		if (mOpSeq == 0) {
			TextView  scene141131313112112_1 = (TextView)mActivity.findViewById(R.id.scene141131313112112_1); 
			slideToRight ((View)scene141131313112112_1);
		}
		if (mOpSeq == 1) {
			TextView  scene141131313112112_2 = (TextView)mActivity.findViewById(R.id.scene141131313112112_2); 
			slideToRight ((View)scene141131313112112_2);
		}
		if (mOpSeq == 2) {
			TextView  scene141131313112112_3 = (TextView)mActivity.findViewById(R.id.scene141131313112112_3); 
			slideToRight ((View)scene141131313112112_3);
		}
		if (mOpSeq == 3) {
			TextView  scene141131313112112_4 = (TextView)mActivity.findViewById(R.id.scene141131313112112_4); 
			slideToRight ((View)scene141131313112112_4);
		}
		if (mOpSeq == 4) {
			TextView  scene141131313112112_5 = (TextView)mActivity.findViewById(R.id.scene141131313112112_5); 
			slideToRight ((View)scene141131313112112_5);
		}
		if (mOpSeq == 5) {
			TextView  scene141131313112112_6 = (TextView)mActivity.findViewById(R.id.scene141131313112112_6); 
			slideToRight ((View)scene141131313112112_6);
		}
		if (mOpSeq == 6) {
			TextView  scene141131313112112_7 = (TextView)mActivity.findViewById(R.id.scene141131313112112_7); 
			slideToRight ((View)scene141131313112112_7);
		}
		if (mOpSeq == 7) {
			TextView  scene141131313112112_8 = (TextView)mActivity.findViewById(R.id.scene141131313112112_8); 
			slideToRight ((View)scene141131313112112_8);
		}
		if (mOpSeq == 8) {
			TextView  scene141131313112112_9 = (TextView)mActivity.findViewById(R.id.scene141131313112112_9); 
			slideToRight ((View)scene141131313112112_9);
		}
		if (mOpSeq == 9) {
			TextView  scene141131313112112_10 = (TextView)mActivity.findViewById(R.id.scene141131313112112_10); 
			slideToRight ((View)scene141131313112112_10);
		}
		if (mOpSeq == 10) {
			TextView  scene141131313112112_11 = (TextView)mActivity.findViewById(R.id.scene141131313112112_11); 
			slideToRight ((View)scene141131313112112_11);
		}
		if (mOpSeq == 11) {
			TextView  scene141131313112112_12 = (TextView)mActivity.findViewById(R.id.scene141131313112112_12); 
			slideToRight ((View)scene141131313112112_12);
		}
		if (mOpSeq == 12) {
			TextView  scene141131313112112_13 = (TextView)mActivity.findViewById(R.id.scene141131313112112_13); 
			slideToRight ((View)scene141131313112112_13);
		}
		if (mOpSeq == 13) {
			TextView  scene141131313112112_14 = (TextView)mActivity.findViewById(R.id.scene141131313112112_14); 
			slideToRight ((View)scene141131313112112_14);
		}
		if (mOpSeq == 14) {
			TextView  scene141131313112112_15 = (TextView)mActivity.findViewById(R.id.scene141131313112112_15); 
			slideToRight ((View)scene141131313112112_15);
		}
		if (mOpSeq == 15) {
			TextView  scene141131313112112_16 = (TextView)mActivity.findViewById(R.id.scene141131313112112_16); 
			slideToRight ((View)scene141131313112112_16);
		}
		if (mOpSeq == 16) {
			TextView  scene141131313112112_17 = (TextView)mActivity.findViewById(R.id.scene141131313112112_17); 
			slideToRight ((View)scene141131313112112_17);
		}
		if (mOpSeq == 17) {
			TextView  scene141131313112112_18 = (TextView)mActivity.findViewById(R.id.scene141131313112112_18); 
			slideToRight ((View)scene141131313112112_18);
		}
		if (mOpSeq == 18) {
			TextView  scene141131313112112_19 = (TextView)mActivity.findViewById(R.id.scene141131313112112_19); 
			slideToRight ((View)scene141131313112112_19);
		}
		if (mOpSeq == 19) {
			TextView  scene141131313112112_20 = (TextView)mActivity.findViewById(R.id.scene141131313112112_20); 
			slideToRight ((View)scene141131313112112_20);
		}
		if (mOpSeq == 20) {
			TextView  scene141131313112112_21 = (TextView)mActivity.findViewById(R.id.scene141131313112112_21); 
			slideToRight ((View)scene141131313112112_21);
		}
		if (mOpSeq == 21) {
			TextView  scene141131313112112_22 = (TextView)mActivity.findViewById(R.id.scene141131313112112_22); 
			slideToRight ((View)scene141131313112112_22);
		}
		if (mOpSeq == 22) {
			TextView  scene141131313112112_23 = (TextView)mActivity.findViewById(R.id.scene141131313112112_23); 
			slideToRight ((View)scene141131313112112_23);
		}
		if (mOpSeq == 23) {
			TextView  scene141131313112112_24 = (TextView)mActivity.findViewById(R.id.scene141131313112112_24); 
			slideToRight ((View)scene141131313112112_24);
		}
		if (mOpSeq == 24) {
			TextView  scene141131313112112_25 = (TextView)mActivity.findViewById(R.id.scene141131313112112_25); 
			slideToRight ((View)scene141131313112112_25);
		}
		if (mOpSeq == 25) {
			ImageButton  scene141131313112112_26 = (ImageButton)mActivity.findViewById(R.id.scene141131313112112_26); 
			slideToRight ((View)scene141131313112112_26);
		}
		if (mOpSeq == 26) {
			TextView  scene141131313112112_27 = (TextView)mActivity.findViewById(R.id.scene141131313112112_27); 
			slideToRight ((View)scene141131313112112_27);
		}
		if (mOpSeq == 27) {
			TextView  scene141131313112112_28 = (TextView)mActivity.findViewById(R.id.scene141131313112112_28); 
			slideToRight ((View)scene141131313112112_28);
		}
		if (mOpSeq == 28) {
			TextView  scene141131313112112_29 = (TextView)mActivity.findViewById(R.id.scene141131313112112_29); 
			slideToRight ((View)scene141131313112112_29);
		}
		if (mOpSeq == 29) {
			TextView  scene141131313112112_30 = (TextView)mActivity.findViewById(R.id.scene141131313112112_30); 
			slideToRight ((View)scene141131313112112_30);
		}
		if (mOpSeq == 30) {
			TextView  scene141131313112112_31 = (TextView)mActivity.findViewById(R.id.scene141131313112112_31); 
			slideToRight ((View)scene141131313112112_31);
		}
		if (mOpSeq == 31) {
			TextView  scene141131313112112_32 = (TextView)mActivity.findViewById(R.id.scene141131313112112_32); 
			slideToRight ((View)scene141131313112112_32);
		}
		if (mOpSeq == 32) {
			TextView  scene141131313112112_33 = (TextView)mActivity.findViewById(R.id.scene141131313112112_33); 
			slideToRight ((View)scene141131313112112_33);
		}
		if (mOpSeq == 33) {
			TextView  scene141131313112112_34 = (TextView)mActivity.findViewById(R.id.scene141131313112112_34); 
			slideToRight ((View)scene141131313112112_34);
		}
		if (mOpSeq == 34) {
			TextView  scene141131313112112_35 = (TextView)mActivity.findViewById(R.id.scene141131313112112_35); 
			slideToRight ((View)scene141131313112112_35);
		}
		if (mOpSeq == 35) {
			TextView  scene141131313112112_36 = (TextView)mActivity.findViewById(R.id.scene141131313112112_36); 
			slideToRight ((View)scene141131313112112_36);
		}
		if (mOpSeq == 36) {
			TextView  scene141131313112112_37 = (TextView)mActivity.findViewById(R.id.scene141131313112112_37); 
			slideToRight ((View)scene141131313112112_37);
		}
		if (mOpSeq == 37) {
			TextView  scene141131313112112_38 = (TextView)mActivity.findViewById(R.id.scene141131313112112_38); 
			slideToRight ((View)scene141131313112112_38);
		}
		if (mOpSeq == 38) {
			TextView  scene141131313112112_39 = (TextView)mActivity.findViewById(R.id.scene141131313112112_39); 
			slideToRight ((View)scene141131313112112_39);
		}
		if (mOpSeq == 39) {
			TextView  scene141131313112112_40 = (TextView)mActivity.findViewById(R.id.scene141131313112112_40); 
			slideToRight ((View)scene141131313112112_40);
		}
		if (mOpSeq == 40) {
			TextView  scene141131313112112_41 = (TextView)mActivity.findViewById(R.id.scene141131313112112_41); 
			slideToRight ((View)scene141131313112112_41);
		}
		if (mOpSeq == 41) {
			TextView  scene141131313112112_42 = (TextView)mActivity.findViewById(R.id.scene141131313112112_42); 
			slideToRight ((View)scene141131313112112_42);
		}
		if (mOpSeq == 42) {
			TextView  scene141131313112112_43 = (TextView)mActivity.findViewById(R.id.scene141131313112112_43); 
			slideToRight ((View)scene141131313112112_43);
		}
		if (mOpSeq == 43) {
			TextView  scene141131313112112_44 = (TextView)mActivity.findViewById(R.id.scene141131313112112_44); 
			slideToRight ((View)scene141131313112112_44);
		}
		if (mOpSeq == 44) {
			TextView  scene141131313112112_45 = (TextView)mActivity.findViewById(R.id.scene141131313112112_45); 
			slideToRight ((View)scene141131313112112_45);
		}
		if (mOpSeq == 45) {
			ImageButton  scene141131313112112_46 = (ImageButton)mActivity.findViewById(R.id.scene141131313112112_46); 
			slideToRight ((View)scene141131313112112_46);
		}
		if (mOpSeq == 46) {
			ImageButton  scene141131313112112_47 = (ImageButton)mActivity.findViewById(R.id.scene141131313112112_47); 
			slideToRight ((View)scene141131313112112_47);
		}
	}

	public void hideButton () {
		ImageButton  scene141131313112112_46 = (ImageButton)mActivity.findViewById(R.id.scene141131313112112_46); 
		slideToRight_gone ((View)scene141131313112112_46);

		ImageButton  scene141131313112112_47 = (ImageButton)mActivity.findViewById(R.id.scene141131313112112_47); 
		slideToRight_gone ((View)scene141131313112112_47);
	}

	public int getCount() {
		return (46);
	}

}

