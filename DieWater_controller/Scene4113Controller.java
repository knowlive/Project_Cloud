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
public class Scene4113Controller {
	
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
	
	public Scene4113Controller(MainActivity arg_activity) {
		mActivity = arg_activity;
	}

	public void updateStatus(int arg_opseq) {

		int mOpSeq = arg_opseq;

		
		if (mOpSeq == 0) {
			TextView  scene4113_1 = (TextView)mActivity.findViewById(R.id.scene4113_1); 
			slideToRight ((View)scene4113_1);
		}
		if (mOpSeq == 1) {
			TextView  scene4113_2 = (TextView)mActivity.findViewById(R.id.scene4113_2); 
			slideToRight ((View)scene4113_2);
		}
		if (mOpSeq == 2) {
			TextView  scene4113_3 = (TextView)mActivity.findViewById(R.id.scene4113_3); 
			slideToRight ((View)scene4113_3);
		}
		if (mOpSeq == 3) {
			TextView  scene4113_4 = (TextView)mActivity.findViewById(R.id.scene4113_4); 
			slideToRight ((View)scene4113_4);
		}
		if (mOpSeq == 4) {
			TextView  scene4113_5 = (TextView)mActivity.findViewById(R.id.scene4113_5); 
			slideToRight ((View)scene4113_5);
		}
		if (mOpSeq == 5) {
			TextView  scene4113_6 = (TextView)mActivity.findViewById(R.id.scene4113_6); 
			slideToRight ((View)scene4113_6);
		}
		if (mOpSeq == 6) {
			TextView  scene4113_7 = (TextView)mActivity.findViewById(R.id.scene4113_7); 
			slideToRight ((View)scene4113_7);
		}
		if (mOpSeq == 7) {
			TextView  scene4113_8 = (TextView)mActivity.findViewById(R.id.scene4113_8); 
			slideToRight ((View)scene4113_8);
		}
		if (mOpSeq == 8) {
			TextView  scene4113_9 = (TextView)mActivity.findViewById(R.id.scene4113_9); 
			slideToRight ((View)scene4113_9);
		}
		if (mOpSeq == 9) {
			TextView  scene4113_10 = (TextView)mActivity.findViewById(R.id.scene4113_10); 
			slideToRight ((View)scene4113_10);
		}
		if (mOpSeq == 10) {
			TextView  scene4113_11 = (TextView)mActivity.findViewById(R.id.scene4113_11); 
			slideToRight ((View)scene4113_11);
		}
		if (mOpSeq == 11) {
			TextView  scene4113_12 = (TextView)mActivity.findViewById(R.id.scene4113_12); 
			slideToRight ((View)scene4113_12);
		}
		if (mOpSeq == 12) {
			TextView  scene4113_13 = (TextView)mActivity.findViewById(R.id.scene4113_13); 
			slideToRight ((View)scene4113_13);
		}
		if (mOpSeq == 13) {
			TextView  scene4113_14 = (TextView)mActivity.findViewById(R.id.scene4113_14); 
			slideToRight ((View)scene4113_14);
		}
		if (mOpSeq == 14) {
			TextView  scene4113_15 = (TextView)mActivity.findViewById(R.id.scene4113_15); 
			slideToRight ((View)scene4113_15);
		}
		if (mOpSeq == 15) {
			TextView  scene4113_16 = (TextView)mActivity.findViewById(R.id.scene4113_16); 
			slideToRight ((View)scene4113_16);
		}
		if (mOpSeq == 16) {
			TextView  scene4113_17 = (TextView)mActivity.findViewById(R.id.scene4113_17); 
			slideToRight ((View)scene4113_17);
		}
		if (mOpSeq == 17) {
			TextView  scene4113_18 = (TextView)mActivity.findViewById(R.id.scene4113_18); 
			slideToRight ((View)scene4113_18);
		}
		if (mOpSeq == 18) {
			TextView  scene4113_19 = (TextView)mActivity.findViewById(R.id.scene4113_19); 
			slideToRight ((View)scene4113_19);
		}
		if (mOpSeq == 19) {
			TextView  scene4113_20 = (TextView)mActivity.findViewById(R.id.scene4113_20); 
			slideToRight ((View)scene4113_20);
			}
		if (mOpSeq == 20) {
			TextView  scene4113_21 = (TextView)mActivity.findViewById(R.id.scene4113_21); 
			slideToRight ((View)scene4113_21);
			}
		if (mOpSeq == 21) {
			TextView  scene4113_22 = (TextView)mActivity.findViewById(R.id.scene4113_22); 
			slideToRight ((View)scene4113_22);
			}
		if (mOpSeq == 22) {
			TextView  scene4113_23 = (TextView)mActivity.findViewById(R.id.scene4113_23); 
			slideToRight ((View)scene4113_23);
			}
		if (mOpSeq == 23) {
			TextView  scene4113_24 = (TextView)mActivity.findViewById(R.id.scene4113_24); 
			slideToRight ((View)scene4113_24);
			}
		if (mOpSeq == 24) {
			TextView  scene4113_25 = (TextView)mActivity.findViewById(R.id.scene4113_25); 
			slideToRight ((View)scene4113_25);
			}
		if (mOpSeq == 25) {
			TextView  scene4113_26 = (TextView)mActivity.findViewById(R.id.scene4113_26); 
			slideToRight ((View)scene4113_26);
		}
		if (mOpSeq == 26) {
			ImageButton  scene4113_27 = (ImageButton)mActivity.findViewById(R.id.scene4113_27); 
			slideToRight ((View)scene4113_27);
		}
		if (mOpSeq == 27) {
			ImageButton  scene4113_28 = (ImageButton)mActivity.findViewById(R.id.scene4113_28); 
			slideToRight ((View)scene4113_28);
		}
	}

	public void hideButton () {
		ImageButton  scene4113_27 = (ImageButton)mActivity.findViewById(R.id.scene4113_27); 
		slideToRight_gone ((View)scene4113_27);

		ImageButton  scene4113_28 = (ImageButton)mActivity.findViewById(R.id.scene4113_28); 
		slideToRight_gone ((View)scene4113_28);
	}

	public int getCount() {
		return (27);
	}

}

