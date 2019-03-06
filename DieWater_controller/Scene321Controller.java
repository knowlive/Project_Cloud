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
public class Scene321Controller {
	
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
	
	public Scene321Controller(MainActivity arg_activity) {
		mActivity = arg_activity;
	}

	public void updateStatus(int arg_opseq) {

		int mOpSeq = arg_opseq;

		if (mOpSeq == 0) {
			TextView  scene321_1 = (TextView)mActivity.findViewById(R.id.scene321_1); 
			slideToRight ((View)scene321_1);
		}
		if (mOpSeq == 1) {
			TextView  scene321_2 = (TextView)mActivity.findViewById(R.id.scene321_2); 
			slideToRight ((View)scene321_2);
		}
		if (mOpSeq == 2) {
			TextView  scene321_3 = (TextView)mActivity.findViewById(R.id.scene321_3); 
			slideToRight ((View)scene321_3);
		}
		if (mOpSeq == 3) {
			TextView  scene321_4 = (TextView)mActivity.findViewById(R.id.scene321_4); 
			slideToRight ((View)scene321_4);
		}
		if (mOpSeq == 4) {
			TextView  scene321_5 = (TextView)mActivity.findViewById(R.id.scene321_5); 
			slideToRight ((View)scene321_5);
		}
		if (mOpSeq == 5) {
			TextView  scene321_6 = (TextView)mActivity.findViewById(R.id.scene321_6); 
			slideToRight ((View)scene321_6);
		}
		if (mOpSeq == 6) {
			TextView  scene321_7 = (TextView)mActivity.findViewById(R.id.scene321_7); 
			slideToRight ((View)scene321_7);
		}
		if (mOpSeq == 7) {
			TextView  scene321_8 = (TextView)mActivity.findViewById(R.id.scene321_8); 
			slideToRight ((View)scene321_8);
		}
		if (mOpSeq == 8) {
			TextView  scene321_9 = (TextView)mActivity.findViewById(R.id.scene321_9); 
			slideToRight ((View)scene321_9);
		}
		if (mOpSeq == 9) {
			TextView  scene321_10 = (TextView)mActivity.findViewById(R.id.scene321_10); 
			slideToRight ((View)scene321_10);
		}
	}

	public int getCount() {
		return (9);
	}

}

