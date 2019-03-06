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
public class Scene322Controller {
	
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
	
	public Scene322Controller(MainActivity arg_activity) {
		mActivity = arg_activity;
	}

	public void updateStatus(int arg_opseq) {

		int mOpSeq = arg_opseq;

		if (mOpSeq == 0) {
			TextView  scene322_1 = (TextView)mActivity.findViewById(R.id.scene322_1); 
			slideToRight ((View)scene322_1);
		}
		if (mOpSeq == 1) {
			TextView  scene322_2 = (TextView)mActivity.findViewById(R.id.scene322_2); 
			slideToRight ((View)scene322_2);
		}
		if (mOpSeq == 2) {
			TextView  scene322_3 = (TextView)mActivity.findViewById(R.id.scene322_3); 
			slideToRight ((View)scene322_3);
		}
		if (mOpSeq == 3) {
			TextView  scene322_4 = (TextView)mActivity.findViewById(R.id.scene322_4); 
			slideToRight ((View)scene322_4);
		}
		if (mOpSeq == 4) {
			TextView  scene322_5 = (TextView)mActivity.findViewById(R.id.scene322_5); 
			slideToRight ((View)scene322_5);
		}
		if (mOpSeq == 5) {
			TextView  scene322_6 = (TextView)mActivity.findViewById(R.id.scene322_6); 
			slideToRight ((View)scene322_6);
		}
		if (mOpSeq == 6) {
			TextView  scene322_7 = (TextView)mActivity.findViewById(R.id.scene322_7); 
			slideToRight ((View)scene322_7);
		}
	}
	public int getCount() {
		return (6);
	}

}

