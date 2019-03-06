//�� ó�� ���� ����ȭ��(���� �������� �� ù �ؽ�Ʈ�� �ߴ� ȭ��)
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

//activity_main.xml�� ����Ǿ� ����.(���� ȭ���� activity_main�� ������)
public class Scene311Controller {
	
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
	
	public Scene311Controller(MainActivity arg_activity) {
		mActivity = arg_activity;
	}

	public void updateStatus(int arg_opseq) {

		int mOpSeq = arg_opseq;

		if (mOpSeq == 0) {
			TextView  scene311_1 = (TextView)mActivity.findViewById(R.id.scene311_1); 
			slideToRight ((View)scene311_1);
		}
		if (mOpSeq == 1) {
			TextView  scene311_2 = (TextView)mActivity.findViewById(R.id.scene311_2); 
			slideToRight ((View)scene311_2);
		}
		if (mOpSeq == 2) {
			TextView  scene311_3 = (TextView)mActivity.findViewById(R.id.scene311_3); 
			slideToRight ((View)scene311_3);
		}
		if (mOpSeq == 3) {
			TextView  scene311_4 = (TextView)mActivity.findViewById(R.id.scene311_4); 
			slideToRight ((View)scene311_4);
		}
		if (mOpSeq == 4) {
			TextView  scene311_5 = (TextView)mActivity.findViewById(R.id.scene311_5); 
			slideToRight ((View)scene311_5);
		}
		if (mOpSeq == 5) {
			TextView  scene311_6 = (TextView)mActivity.findViewById(R.id.scene311_6); 
			slideToRight ((View)scene311_6);
		}
		if (mOpSeq == 6) {
			TextView  scene311_7 = (TextView)mActivity.findViewById(R.id.scene311_7); 
			slideToRight ((View)scene311_7);
		}
		if (mOpSeq == 7) {
			TextView  scene311_8 = (TextView)mActivity.findViewById(R.id.scene311_8); 
			slideToRight ((View)scene311_8);
		}
		if (mOpSeq == 8) {
			TextView  scene311_9 = (TextView)mActivity.findViewById(R.id.scene311_9); 
			slideToRight ((View)scene311_9);
		}
		if (mOpSeq == 9) {
			TextView  scene311_10 = (TextView)mActivity.findViewById(R.id.scene311_10); 
			slideToRight ((View)scene311_10);
		}
		if (mOpSeq == 10) {
			TextView  scene311_11 = (TextView)mActivity.findViewById(R.id.scene311_11); 
			slideToRight ((View)scene311_11);
		}
		if (mOpSeq == 11) {
			TextView  scene311_12 = (TextView)mActivity.findViewById(R.id.scene311_12); 
			slideToRight ((View)scene311_12);
		}
		if (mOpSeq == 12) {
			TextView  scene311_13 = (TextView)mActivity.findViewById(R.id.scene311_13); 
			slideToRight ((View)scene311_13);
		}
		if (mOpSeq == 13) {
			TextView  scene311_14 = (TextView)mActivity.findViewById(R.id.scene311_14); 
			slideToRight ((View)scene311_14);
		}
		if (mOpSeq == 14) {
			TextView  scene311_15 = (TextView)mActivity.findViewById(R.id.scene311_15); 
			slideToRight ((View)scene311_15);
		}
		if (mOpSeq == 15) {
			TextView  scene311_16 = (TextView)mActivity.findViewById(R.id.scene311_16); 
			slideToRight ((View)scene311_16);
		}
		if (mOpSeq == 16) {
			TextView  scene311_17 = (TextView)mActivity.findViewById(R.id.scene311_17); 
			slideToRight ((View)scene311_17);
		}
		if (mOpSeq == 17) {
			TextView  scene311_18 = (TextView)mActivity.findViewById(R.id.scene311_18); 
			slideToRight ((View)scene311_18);
		}
		if (mOpSeq == 18) {
			TextView  scene311_19 = (TextView)mActivity.findViewById(R.id.scene311_19); 
			slideToRight ((View)scene311_19);
		}
		if (mOpSeq == 19) {
			TextView  scene311_20 = (TextView)mActivity.findViewById(R.id.scene311_20); 
			slideToRight ((View)scene311_20);
		}
		if (mOpSeq == 20) {
			TextView  scene311_21 = (TextView)mActivity.findViewById(R.id.scene311_21); 
			slideToRight ((View)scene311_21);
		}
		if (mOpSeq == 21) {
			TextView  scene311_22 = (TextView)mActivity.findViewById(R.id.scene311_22); 
			slideToRight ((View)scene311_22);
		}
		if (mOpSeq == 22) {
			TextView  scene311_23 = (TextView)mActivity.findViewById(R.id.scene311_23); 
			slideToRight ((View)scene311_23);
		}
		if (mOpSeq == 23) {
			ImageButton  scene311_24 = (ImageButton)mActivity.findViewById(R.id.scene311_24); 
			slideToRight ((View)scene311_24);
		}
		if (mOpSeq == 24) {
			ImageButton  scene311_25 = (ImageButton)mActivity.findViewById(R.id.scene311_25); 
			slideToRight ((View)scene311_25);
		}
	}

	public void hideButton () {
		ImageButton  scene311_24 = (ImageButton)mActivity.findViewById(R.id.scene311_24); 
		slideToRight_gone ((View)scene311_24);

		ImageButton  scene311_25 = (ImageButton)mActivity.findViewById(R.id.scene311_25); 
		slideToRight_gone ((View)scene311_25);
	}

	public int getCount() {
		return (24);
	}

}

