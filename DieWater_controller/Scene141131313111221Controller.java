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
public class Scene141131313111221Controller {
	
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
	
	public Scene141131313111221Controller(MainActivity arg_activity) {
		mActivity = arg_activity;
	}

	public void updateStatus(int arg_opseq) {

		int mOpSeq = arg_opseq;

		if (mOpSeq == 0) {
			TextView  scene141131313111221_1 = (TextView)mActivity.findViewById(R.id.scene141131313111221_1); 
			slideToRight ((View)scene141131313111221_1);
		}
		if (mOpSeq == 1) {
			TextView  scene141131313111221_2 = (TextView)mActivity.findViewById(R.id.scene141131313111221_2); 
			slideToRight ((View)scene141131313111221_2);
		}
		if (mOpSeq == 2) {
			TextView  scene141131313111221_3 = (TextView)mActivity.findViewById(R.id.scene141131313111221_3); 
			slideToRight ((View)scene141131313111221_3);
		}
		if (mOpSeq == 3) {
			TextView  scene141131313111221_4 = (TextView)mActivity.findViewById(R.id.scene141131313111221_4); 
			slideToRight ((View)scene141131313111221_4);
		}
		if (mOpSeq == 4) {
			TextView  scene141131313111221_5 = (TextView)mActivity.findViewById(R.id.scene141131313111221_5); 
			slideToRight ((View)scene141131313111221_5);
		}
		if (mOpSeq == 5) {
			TextView  scene141131313111221_6 = (TextView)mActivity.findViewById(R.id.scene141131313111221_6); 
			slideToRight ((View)scene141131313111221_6);
		}
	}

	public int getCount() {
		return (5);
	}

}

