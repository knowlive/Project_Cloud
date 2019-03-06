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
public class Scene22Controller {
	
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
	
	public Scene22Controller(MainActivity arg_activity) {
		mActivity = arg_activity;
	}

	public void updateStatus(int arg_opseq) {

		int mOpSeq = arg_opseq;

		
		if (mOpSeq == 0) {
			TextView  scene22_1 = (TextView)mActivity.findViewById(R.id.scene22_1); 
			slideToRight ((View)scene22_1);
		}
		if (mOpSeq == 1) {
			TextView  scene22_2 = (TextView)mActivity.findViewById(R.id.scene22_2); 
			slideToRight ((View)scene22_2);
		}
		if (mOpSeq == 2) {
			TextView  scene22_3 = (TextView)mActivity.findViewById(R.id.scene22_3); 
			slideToRight ((View)scene22_3);
		}
		if (mOpSeq == 3) {
			TextView  scene22_4 = (TextView)mActivity.findViewById(R.id.scene22_4); 
			slideToRight ((View)scene22_4);
		}
		if (mOpSeq == 4) {
			TextView  scene22_5 = (TextView)mActivity.findViewById(R.id.scene22_5); 
			slideToRight ((View)scene22_5);
		}
		if (mOpSeq == 5) {
			TextView  scene22_6 = (TextView)mActivity.findViewById(R.id.scene22_6); 
			slideToRight ((View)scene22_6);
		}
		if (mOpSeq == 6) {
			TextView  scene22_7 = (TextView)mActivity.findViewById(R.id.scene22_7); 
			slideToRight ((View)scene22_7);
		}
		if (mOpSeq == 7) {
			TextView  scene22_8 = (TextView)mActivity.findViewById(R.id.scene22_8); 
			slideToRight ((View)scene22_8);
		}
		if (mOpSeq == 8) {
			TextView  scene22_9 = (TextView)mActivity.findViewById(R.id.scene22_9); 
			slideToRight ((View)scene22_9);
		}
		if (mOpSeq == 9) {
			TextView  scene22_10 = (TextView)mActivity.findViewById(R.id.scene22_10); 
			slideToRight ((View)scene22_10);
		}
		if (mOpSeq == 10) {
			TextView  scene22_11 = (TextView)mActivity.findViewById(R.id.scene22_11); 
			slideToRight ((View)scene22_11);
		}
		if (mOpSeq == 11) {
			TextView  scene22_12 = (TextView)mActivity.findViewById(R.id.scene22_12); 
			slideToRight ((View)scene22_12);
		}
		if (mOpSeq == 12) {
			TextView  scene22_13 = (TextView)mActivity.findViewById(R.id.scene22_13); 
			slideToRight ((View)scene22_13);
		}
		if (mOpSeq == 13) {
			TextView  scene22_14 = (TextView)mActivity.findViewById(R.id.scene22_14); 
			slideToRight ((View)scene22_14);
		}
		if (mOpSeq == 14) {
			TextView  scene22_15 = (TextView)mActivity.findViewById(R.id.scene22_15); 
			slideToRight ((View)scene22_15);
		}
		if (mOpSeq == 15) {
			TextView  scene22_16 = (TextView)mActivity.findViewById(R.id.scene22_16); 
			slideToRight ((View)scene22_16);
		}
		if (mOpSeq == 16) {
			TextView  scene22_17 = (TextView)mActivity.findViewById(R.id.scene22_17); 
			slideToRight ((View)scene22_17);
		}
		if (mOpSeq == 17) {
			TextView  scene22_18 = (TextView)mActivity.findViewById(R.id.scene22_18); 
			slideToRight ((View)scene22_18);
		}
		if (mOpSeq == 18) {
			TextView  scene22_19 = (TextView)mActivity.findViewById(R.id.scene22_19); 
			slideToRight ((View)scene22_19);
		}
		if (mOpSeq == 19) {
			TextView  scene22_20 = (TextView)mActivity.findViewById(R.id.scene22_20); 
			slideToRight ((View)scene22_20);
		}
		if (mOpSeq == 20) {
			ImageButton  scene22_21 = (ImageButton)mActivity.findViewById(R.id.scene22_21); 
			slideToRight ((View)scene22_21);
		}
		if (mOpSeq == 21) {
			ImageButton  scene22_22 = (ImageButton)mActivity.findViewById(R.id.scene22_22); 
			slideToRight ((View)scene22_22);
		}
	}

	public void hideButton () {
		ImageButton  scene22_21 = (ImageButton)mActivity.findViewById(R.id.scene22_21); 
		slideToRight_gone ((View)scene22_21);

		ImageButton  scene22_22 = (ImageButton)mActivity.findViewById(R.id.scene22_22); 
		slideToRight_gone ((View)scene22_22);
	}

	public int getCount() {
		return (21);
	}

}

