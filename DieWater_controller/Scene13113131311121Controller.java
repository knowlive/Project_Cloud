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
public class Scene13113131311121Controller {
	
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
	
	public Scene13113131311121Controller(MainActivity arg_activity) {
		mActivity = arg_activity;
	}

	public void updateStatus(int arg_opseq) {

		int mOpSeq = arg_opseq;

		if (mOpSeq == 0) {
			TextView  scene13113131311121_1 = (TextView)mActivity.findViewById(R.id.scene13113131311121_1); 
			slideToRight ((View)scene13113131311121_1);
		}
		if (mOpSeq == 1) {
			TextView  scene13113131311121_2 = (TextView)mActivity.findViewById(R.id.scene13113131311121_2); 
			slideToRight ((View)scene13113131311121_2);
		}
		if (mOpSeq == 2) {
			TextView  scene13113131311121_3 = (TextView)mActivity.findViewById(R.id.scene13113131311121_3); 
			slideToRight ((View)scene13113131311121_3);
		}

	}

	public int getCount() {
		return (2);
	}

}

