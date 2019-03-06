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
public class Scene312Controller {
	
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
	
	public Scene312Controller(MainActivity arg_activity) {
		mActivity = arg_activity;
	}

	public void updateStatus(int arg_opseq) {

		int mOpSeq = arg_opseq;

		if (mOpSeq == 0) {
			TextView  scene312_1 = (TextView)mActivity.findViewById(R.id.scene312_1); 
			slideToRight ((View)scene312_1);
		}
		if (mOpSeq == 1) {
			TextView  scene312_2 = (TextView)mActivity.findViewById(R.id.scene312_2); 
			slideToRight ((View)scene312_2);
		}
		if (mOpSeq == 2) {
			TextView  scene312_3 = (TextView)mActivity.findViewById(R.id.scene312_3); 
			slideToRight ((View)scene312_3);
		}
		if (mOpSeq == 3) {
			TextView  scene312_4 = (TextView)mActivity.findViewById(R.id.scene312_4); 
			slideToRight ((View)scene312_4);
		}
		if (mOpSeq == 4) {
			TextView  scene312_5 = (TextView)mActivity.findViewById(R.id.scene312_5); 
			slideToRight ((View)scene312_5);
		}
		if (mOpSeq == 5) {
			TextView  scene312_6 = (TextView)mActivity.findViewById(R.id.scene312_6); 
			slideToRight ((View)scene312_6);
		}
		if (mOpSeq == 6) {
			ImageButton  scene312_7 = (ImageButton)mActivity.findViewById(R.id.scene312_7); 
			slideToRight ((View)scene312_7);
		}
		if (mOpSeq == 7) {
			ImageButton  scene312_8 = (ImageButton)mActivity.findViewById(R.id.scene312_8); 
			slideToRight ((View)scene312_8);
		}
	}

	public void hideButton () {
		ImageButton  scene312_7 = (ImageButton)mActivity.findViewById(R.id.scene312_7); 
		slideToRight_gone ((View)scene312_8);

		ImageButton  scene312_8 = (ImageButton)mActivity.findViewById(R.id.scene312_8); 
		slideToRight_gone ((View)scene312_8);
	}

	public int getCount() {
		return (7);
	}

}

