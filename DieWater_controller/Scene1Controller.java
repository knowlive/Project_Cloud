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
public class Scene1Controller {
	
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
			TextView  scene1_1 = (TextView)mActivity.findViewById(R.id.scene1_1); 
			slideToRight ((View)scene1_1);
		}
		if (mOpSeq == 1) {
			TextView  scene1_2 = (TextView)mActivity.findViewById(R.id.scene1_2); 
			slideToRight ((View)scene1_2);
		}
		if (mOpSeq == 2) {
			TextView  scene1_3 = (TextView)mActivity.findViewById(R.id.scene1_3); 
			slideToRight ((View)scene1_3);
		}
		if (mOpSeq == 3) {
			TextView  scene1_4 = (TextView)mActivity.findViewById(R.id.scene1_4); 
			slideToRight ((View)scene1_4);
		}
		if (mOpSeq == 4) {
			TextView  scene1_5 = (TextView)mActivity.findViewById(R.id.scene1_5); 
			slideToRight ((View)scene1_5);
		}
		if (mOpSeq == 5) {
			TextView  scene1_6 = (TextView)mActivity.findViewById(R.id.scene1_6); 
			slideToRight ((View)scene1_6);
		}
		if (mOpSeq == 6) {
			TextView  scene1_7 = (TextView)mActivity.findViewById(R.id.scene1_7); 
			slideToRight ((View)scene1_7);
		}
		if (mOpSeq == 7) {
			TextView  scene1_8 = (TextView)mActivity.findViewById(R.id.scene1_8); 
			slideToRight ((View)scene1_8);
		}
		if (mOpSeq == 8) {
			TextView  scene1_9 = (TextView)mActivity.findViewById(R.id.scene1_9); 
			slideToRight ((View)scene1_9);
		}
		if (mOpSeq == 9) {
			TextView  scene1_10 = (TextView)mActivity.findViewById(R.id.scene1_10); 
			slideToRight ((View)scene1_10);
		}
		if (mOpSeq == 10) {
			TextView  scene1_11 = (TextView)mActivity.findViewById(R.id.scene1_11); 
			slideToRight ((View)scene1_11);
		}
		if (mOpSeq == 11) {
			TextView  scene1_12 = (TextView)mActivity.findViewById(R.id.scene1_12); 
			slideToRight ((View)scene1_12);
		}
		if (mOpSeq == 12) {
			TextView  scene1_13 = (TextView)mActivity.findViewById(R.id.scene1_13); 
			slideToRight ((View)scene1_13);
		}
		if (mOpSeq == 13) {
			TextView  scene1_14 = (TextView)mActivity.findViewById(R.id.scene1_14); 
			slideToRight ((View)scene1_14);
		}
		if (mOpSeq == 14) {
			TextView  scene1_15 = (TextView)mActivity.findViewById(R.id.scene1_15); 
			slideToRight ((View)scene1_15);
		}
		if (mOpSeq == 15) {
			TextView  scene1_16 = (TextView)mActivity.findViewById(R.id.scene1_16); 
			slideToRight ((View)scene1_16);
		}
		if (mOpSeq == 16) {
			TextView  scene1_17 = (TextView)mActivity.findViewById(R.id.scene1_17); 
			slideToRight ((View)scene1_17);
		}
		if (mOpSeq == 17) {
			TextView  scene1_18 = (TextView)mActivity.findViewById(R.id.scene1_18); 
			slideToRight ((View)scene1_18);
		}
		if (mOpSeq == 18) {
			TextView  scene1_19 = (TextView)mActivity.findViewById(R.id.scene1_19); 
			slideToRight ((View)scene1_19);
		}
		if (mOpSeq == 19) {
			TextView  scene1_20 = (TextView)mActivity.findViewById(R.id.scene1_20); 
			slideToRight ((View)scene1_20);
		}
		if (mOpSeq == 20) {
			TextView  scene1_21 = (TextView)mActivity.findViewById(R.id.scene1_21); 
			slideToRight ((View)scene1_21);
		}
		if (mOpSeq == 21) {
			TextView  scene1_22 = (TextView)mActivity.findViewById(R.id.scene1_22); 
			slideToRight ((View)scene1_22);
		}
		if (mOpSeq == 22) {
			TextView  scene1_23 = (TextView)mActivity.findViewById(R.id.scene1_23); 
			slideToRight ((View)scene1_23);
		}
		if (mOpSeq == 23) {
			TextView  scene1_24 = (TextView)mActivity.findViewById(R.id.scene1_24); 
			slideToRight ((View)scene1_24);
		}
		if (mOpSeq == 24) {
			TextView  scene1_25 = (TextView)mActivity.findViewById(R.id.scene1_25); 
			slideToRight ((View)scene1_25);
		}
		if (mOpSeq == 25) {
			TextView  scene1_26 = (TextView)mActivity.findViewById(R.id.scene1_26); 
			slideToRight ((View)scene1_26);
		}
		if (mOpSeq == 26) {
			TextView  scene1_27 = (TextView)mActivity.findViewById(R.id.scene1_27); 
			slideToRight ((View)scene1_27);
		}
		if (mOpSeq == 27) {
			TextView  scene1_28 = (TextView)mActivity.findViewById(R.id.scene1_28); 
			slideToRight ((View)scene1_28);
		}
		if (mOpSeq == 28) {
			TextView  scene1_29 = (TextView)mActivity.findViewById(R.id.scene1_29); 
			slideToRight ((View)scene1_29);
		}
		if (mOpSeq == 29) {
			TextView  scene1_30 = (TextView)mActivity.findViewById(R.id.scene1_30); 
			slideToRight ((View)scene1_30);
		}
		if (mOpSeq == 30) {
			TextView  scene1_31 = (TextView)mActivity.findViewById(R.id.scene1_31); 
			slideToRight ((View)scene1_31);
		}
		if (mOpSeq == 31) {
			TextView  scene1_32 = (TextView)mActivity.findViewById(R.id.scene1_32); 
			slideToRight ((View)scene1_32);
		}
		if (mOpSeq == 32) {
			TextView  scene1_33 = (TextView)mActivity.findViewById(R.id.scene1_33); 
			slideToRight ((View)scene1_33);
		}
		if (mOpSeq == 33) {
			TextView  scene1_34 = (TextView)mActivity.findViewById(R.id.scene1_34); 
			slideToRight ((View)scene1_34);
		}
		if (mOpSeq == 34) {
			ImageButton scene1_35 = (ImageButton)mActivity.findViewById(R.id.scene1_35); 
			slideToRight ((View)scene1_35);
		}
		if (mOpSeq == 35) {
			ImageButton scene1_36 = (ImageButton)mActivity.findViewById(R.id.scene1_36); 
			slideToRight ((View)scene1_36);
		}
	}

	public void hideButton () {
		ImageButton  scene1_35 = (ImageButton)mActivity.findViewById(R.id.scene1_35); 
		slideToRight_gone ((View)scene1_35);

		ImageButton  scene1_36 = (ImageButton)mActivity.findViewById(R.id.scene1_36); 
		slideToRight_gone ((View)scene1_36);
	}

	public int getCount() {
		return (35);
	}

}

