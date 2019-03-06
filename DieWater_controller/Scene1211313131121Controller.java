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
public class Scene1211313131121Controller {
	
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
	
	public Scene1211313131121Controller(MainActivity arg_activity) {
		mActivity = arg_activity;
	}

	public void updateStatus(int arg_opseq) {

		int mOpSeq = arg_opseq;

		if (mOpSeq == 0) {
			TextView  scene1211313131121_1 = (TextView)mActivity.findViewById(R.id.scene1211313131121_1); 
			slideToRight ((View)scene1211313131121_1);
		}
		if (mOpSeq == 1) {
			TextView  scene1211313131121_2 = (TextView)mActivity.findViewById(R.id.scene1211313131121_2); 
			slideToRight ((View)scene1211313131121_2);
		}
		if (mOpSeq == 2) {
			TextView  scene1211313131121_3 = (TextView)mActivity.findViewById(R.id.scene1211313131121_3); 
			slideToRight ((View)scene1211313131121_3);
		}
		if (mOpSeq == 3) {
			TextView  scene1211313131121_4 = (TextView)mActivity.findViewById(R.id.scene1211313131121_4); 
			slideToRight ((View)scene1211313131121_4);
		}
		if (mOpSeq == 4) {
			TextView  scene1211313131121_5 = (TextView)mActivity.findViewById(R.id.scene1211313131121_5); 
			slideToRight ((View)scene1211313131121_5);
		}
		if (mOpSeq == 5) {
			TextView  scene1211313131121_6 = (TextView)mActivity.findViewById(R.id.scene1211313131121_6); 
			slideToRight ((View)scene1211313131121_6);
		}
		if (mOpSeq == 6) {
			TextView  scene1211313131121_7 = (TextView)mActivity.findViewById(R.id.scene1211313131121_7); 
			slideToRight ((View)scene1211313131121_7);
		}
		if (mOpSeq == 7) {
			TextView  scene1211313131121_8 = (TextView)mActivity.findViewById(R.id.scene1211313131121_8); 
			slideToRight ((View)scene1211313131121_8);
		}
		if (mOpSeq == 8) {
			TextView  scene1211313131121_9 = (TextView)mActivity.findViewById(R.id.scene1211313131121_9); 
			slideToRight ((View)scene1211313131121_9);
		}
		if (mOpSeq == 9) {
			TextView  scene1211313131121_10 = (TextView)mActivity.findViewById(R.id.scene1211313131121_10); 
			slideToRight ((View)scene1211313131121_10);
		}
		if (mOpSeq == 10) {
			TextView  scene1211313131121_11 = (TextView)mActivity.findViewById(R.id.scene1211313131121_11); 
			slideToRight ((View)scene1211313131121_11);
		}
		if (mOpSeq == 11) {
			TextView  scene1211313131121_12 = (TextView)mActivity.findViewById(R.id.scene1211313131121_12); 
			slideToRight ((View)scene1211313131121_12);
		}
		if (mOpSeq == 12) {
			TextView  scene1211313131121_13 = (TextView)mActivity.findViewById(R.id.scene1211313131121_13); 
			slideToRight ((View)scene1211313131121_13);
		}
		if (mOpSeq == 13) {
			TextView  scene1211313131121_14 = (TextView)mActivity.findViewById(R.id.scene1211313131121_14); 
			slideToRight ((View)scene1211313131121_14);
		}
		if (mOpSeq == 14) {
			TextView  scene1211313131121_15 = (TextView)mActivity.findViewById(R.id.scene1211313131121_15); 
			slideToRight ((View)scene1211313131121_15);
		}
		if (mOpSeq == 15) {
			TextView  scene1211313131121_16 = (TextView)mActivity.findViewById(R.id.scene1211313131121_16); 
			slideToRight ((View)scene1211313131121_16);
		}
		if (mOpSeq == 16) {
			TextView  scene1211313131121_17 = (TextView)mActivity.findViewById(R.id.scene1211313131121_17); 
			slideToRight ((View)scene1211313131121_17);
		}
		if (mOpSeq == 17) {
			TextView  scene1211313131121_18 = (TextView)mActivity.findViewById(R.id.scene1211313131121_18); 
			slideToRight ((View)scene1211313131121_18);
		}
		if (mOpSeq == 18) {
			TextView  scene1211313131121_19 = (TextView)mActivity.findViewById(R.id.scene1211313131121_19); 
			slideToRight ((View)scene1211313131121_19);
		}
		if (mOpSeq == 19) {
			TextView  scene1211313131121_20 = (TextView)mActivity.findViewById(R.id.scene1211313131121_20); 
			slideToRight ((View)scene1211313131121_20);
		}
		if (mOpSeq == 20) {
			TextView  scene1211313131121_21 = (TextView)mActivity.findViewById(R.id.scene1211313131121_21); 
			slideToRight ((View)scene1211313131121_21);
		}
		if (mOpSeq == 21) {
			TextView  scene1211313131121_22 = (TextView)mActivity.findViewById(R.id.scene1211313131121_22); 
			slideToRight ((View)scene1211313131121_22);
		}
		if (mOpSeq == 22) {
			TextView  scene1211313131121_23 = (TextView)mActivity.findViewById(R.id.scene1211313131121_23); 
			slideToRight ((View)scene1211313131121_23);
		}
		if (mOpSeq == 23) {
			TextView  scene1211313131121_24 = (TextView)mActivity.findViewById(R.id.scene1211313131121_24); 
			slideToRight ((View)scene1211313131121_24);
		}
		if (mOpSeq == 24) {
			TextView  scene1211313131121_25 = (TextView)mActivity.findViewById(R.id.scene1211313131121_25); 
			slideToRight ((View)scene1211313131121_25);
		}
		if (mOpSeq == 25) {
			TextView  scene1211313131121_26 = (TextView)mActivity.findViewById(R.id.scene1211313131121_26); 
			slideToRight ((View)scene1211313131121_26);
		}
		if (mOpSeq == 26) {
			TextView  scene1211313131121_27 = (TextView)mActivity.findViewById(R.id.scene1211313131121_27); 
			slideToRight ((View)scene1211313131121_27);
		}
		if (mOpSeq == 27) {
			TextView  scene1211313131121_28 = (TextView)mActivity.findViewById(R.id.scene1211313131121_28); 
			slideToRight ((View)scene1211313131121_28);
		}
		if (mOpSeq == 28) {
			TextView  scene1211313131121_29 = (TextView)mActivity.findViewById(R.id.scene1211313131121_29); 
			slideToRight ((View)scene1211313131121_29);
		}
		if (mOpSeq == 29) {
			TextView  scene1211313131121_30 = (TextView)mActivity.findViewById(R.id.scene1211313131121_30); 
			slideToRight ((View)scene1211313131121_30);
		}
		if (mOpSeq == 30) {
			TextView  scene1211313131121_31 = (TextView)mActivity.findViewById(R.id.scene1211313131121_31); 
			slideToRight ((View)scene1211313131121_31);
		}
		if (mOpSeq == 31) {
			TextView  scene1211313131121_32 = (TextView)mActivity.findViewById(R.id.scene1211313131121_32); 
			slideToRight ((View)scene1211313131121_32);
		}
		if (mOpSeq == 32) {
			TextView  scene1211313131121_33 = (TextView)mActivity.findViewById(R.id.scene1211313131121_33); 
			slideToRight ((View)scene1211313131121_33);
		}
		if (mOpSeq == 33) {
			TextView  scene1211313131121_34 = (TextView)mActivity.findViewById(R.id.scene1211313131121_34); 
			slideToRight ((View)scene1211313131121_34);
		}
		if (mOpSeq == 34) {
			TextView  scene1211313131121_35 = (TextView)mActivity.findViewById(R.id.scene1211313131121_35); 
			slideToRight ((View)scene1211313131121_35);
		}
		if (mOpSeq == 35) {
			TextView  scene1211313131121_36 = (TextView)mActivity.findViewById(R.id.scene1211313131121_36); 
			slideToRight ((View)scene1211313131121_36);
		}
		if (mOpSeq == 36) {
			TextView  scene1211313131121_37 = (TextView)mActivity.findViewById(R.id.scene1211313131121_37); 
			slideToRight ((View)scene1211313131121_37);
		}
		if (mOpSeq == 37) {
			TextView  scene1211313131121_38 = (TextView)mActivity.findViewById(R.id.scene1211313131121_38); 
			slideToRight ((View)scene1211313131121_38);
		}
		if (mOpSeq == 38) {
			TextView  scene1211313131121_39 = (TextView)mActivity.findViewById(R.id.scene1211313131121_39); 
			slideToRight ((View)scene1211313131121_39);
		}
		if (mOpSeq == 39) {
			TextView  scene1211313131121_40 = (TextView)mActivity.findViewById(R.id.scene1211313131121_40); 
			slideToRight ((View)scene1211313131121_40);
		}
		if (mOpSeq == 40) {
			TextView  scene1211313131121_41 = (TextView)mActivity.findViewById(R.id.scene1211313131121_41); 
			slideToRight ((View)scene1211313131121_41);
		}
		if (mOpSeq == 41) {
			TextView  scene1211313131121_42 = (TextView)mActivity.findViewById(R.id.scene1211313131121_42); 
			slideToRight ((View)scene1211313131121_42);
		}
		if (mOpSeq == 42) {
			TextView  scene1211313131121_43 = (TextView)mActivity.findViewById(R.id.scene1211313131121_43); 
			slideToRight ((View)scene1211313131121_43);
		}
		if (mOpSeq == 43) {
			TextView  scene1211313131121_44 = (TextView)mActivity.findViewById(R.id.scene1211313131121_44); 
			slideToRight ((View)scene1211313131121_44);
		}
		if (mOpSeq == 44) {
			TextView  scene1211313131121_45 = (TextView)mActivity.findViewById(R.id.scene1211313131121_45); 
			slideToRight ((View)scene1211313131121_45);
		}
		if (mOpSeq == 45) {
			TextView  scene1211313131121_46 = (TextView)mActivity.findViewById(R.id.scene1211313131121_46); 
			slideToRight ((View)scene1211313131121_46);
		}
		if (mOpSeq == 46) {
			TextView  scene1211313131121_47 = (TextView)mActivity.findViewById(R.id.scene1211313131121_47); 
			slideToRight ((View)scene1211313131121_47);
		}
		if (mOpSeq == 47) {
			TextView  scene1211313131121_48 = (TextView)mActivity.findViewById(R.id.scene1211313131121_48); 
			slideToRight ((View)scene1211313131121_48);
		}
		if (mOpSeq == 48) {
			TextView  scene1211313131121_49 = (TextView)mActivity.findViewById(R.id.scene1211313131121_49); 
			slideToRight ((View)scene1211313131121_49);
		}
		if (mOpSeq == 49) {
			TextView  scene1211313131121_50 = (TextView)mActivity.findViewById(R.id.scene1211313131121_50); 
			slideToRight ((View)scene1211313131121_50);
		}
		if (mOpSeq == 50) {
			TextView  scene1211313131121_51 = (TextView)mActivity.findViewById(R.id.scene1211313131121_51); 
			slideToRight ((View)scene1211313131121_51);
		}
		if (mOpSeq == 51) {
			TextView  scene1211313131121_52 = (TextView)mActivity.findViewById(R.id.scene1211313131121_52); 
			slideToRight ((View)scene1211313131121_52);
		}
		if (mOpSeq == 52) {
			TextView  scene1211313131121_53 = (TextView)mActivity.findViewById(R.id.scene1211313131121_53); 
			slideToRight ((View)scene1211313131121_53);
		}
		if (mOpSeq == 53) {
			TextView  scene1211313131121_54 = (TextView)mActivity.findViewById(R.id.scene1211313131121_54); 
			slideToRight ((View)scene1211313131121_54);
		}
		if (mOpSeq == 54) {
			TextView  scene1211313131121_55 = (TextView)mActivity.findViewById(R.id.scene1211313131121_55); 
			slideToRight ((View)scene1211313131121_55);
		}
		if (mOpSeq == 55) {
			TextView  scene1211313131121_56 = (TextView)mActivity.findViewById(R.id.scene1211313131121_56); 
			slideToRight ((View)scene1211313131121_56);
		}
		if (mOpSeq == 56) {
			TextView  scene1211313131121_57 = (TextView)mActivity.findViewById(R.id.scene1211313131121_57); 
			slideToRight ((View)scene1211313131121_57);
		}
		if (mOpSeq == 57) {
			TextView  scene1211313131121_58 = (TextView)mActivity.findViewById(R.id.scene1211313131121_58); 
			slideToRight ((View)scene1211313131121_58);
		}
		if (mOpSeq == 58) {
			TextView  scene1211313131121_59 = (TextView)mActivity.findViewById(R.id.scene1211313131121_59); 
			slideToRight ((View)scene1211313131121_59);
		}
		if (mOpSeq == 59) {
			TextView  scene1211313131121_60 = (TextView)mActivity.findViewById(R.id.scene1211313131121_60); 
			slideToRight ((View)scene1211313131121_60);
		}
		if (mOpSeq == 60) {
			TextView  scene1211313131121_61 = (TextView)mActivity.findViewById(R.id.scene1211313131121_61); 
			slideToRight ((View)scene1211313131121_61);
		}
		if (mOpSeq == 61) {
			TextView  scene1211313131121_62 = (TextView)mActivity.findViewById(R.id.scene1211313131121_62); 
			slideToRight ((View)scene1211313131121_62);
		}
		if (mOpSeq == 62) {
			TextView  scene1211313131121_63 = (TextView)mActivity.findViewById(R.id.scene1211313131121_63); 
			slideToRight ((View)scene1211313131121_63);
		}
		if (mOpSeq == 63) {
			TextView  scene1211313131121_64 = (TextView)mActivity.findViewById(R.id.scene1211313131121_64); 
			slideToRight ((View)scene1211313131121_64);
		}
		if (mOpSeq == 64) {
			ImageButton  scene1211313131121_65 = (ImageButton)mActivity.findViewById(R.id.scene1211313131121_65); 
			slideToRight ((View)scene1211313131121_65);
		}
		if (mOpSeq == 65) {
			ImageButton  scene1211313131121_66 = (ImageButton)mActivity.findViewById(R.id.scene1211313131121_66); 
			slideToRight ((View)scene1211313131121_66);
		}
	}

	public void hideButton () {
		ImageButton  scene1211313131121_65 = (ImageButton)mActivity.findViewById(R.id.scene1211313131121_65); 
		slideToRight_gone ((View)scene1211313131121_65);

		ImageButton  scene1211313131121_66 = (ImageButton)mActivity.findViewById(R.id.scene1211313131121_66); 
		slideToRight_gone ((View)scene1211313131121_66);
	}

	public int getCount() {
		return (65);
	}

}

