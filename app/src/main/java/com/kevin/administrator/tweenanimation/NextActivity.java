package com.kevin.administrator.tweenanimation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class NextActivity extends AppCompatActivity {
private Context mContext=this;

    private ImageView imageView_mian;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    initView();
    }

    private void initView() {
        imageView_mian= (ImageView) findViewById(R.id.imageView_main);
    }
    public  void clickView(View view){
        switch (view.getId()){
            case R.id.button_alpha:
                ObjectAnimator animator1=ObjectAnimator.ofFloat(imageView_mian,"alpha",0,0.1f,0.5f,0.1f,0);
                animator1.setDuration(3000);
                animator1.setRepeatCount(ValueAnimator.INFINITE);
                animator1.setRepeatMode(ValueAnimator.REVERSE);
                animator1.start();
                break;
            case R.id.button_rotate:
                ObjectAnimator animator2=ObjectAnimator.ofFloat(imageView_mian,"rotation",360,270,180,90,-180,-270,-350);
                animator2.setDuration(3000);
                animator2.setRepeatMode(ValueAnimator.REVERSE);
                animator2.setRepeatCount(ValueAnimator.INFINITE);
                animator2.start();
                break;
            case R.id.button_scale:
                ObjectAnimator animator3x=ObjectAnimator.ofFloat(imageView_mian,"scaleX",0,0.1f,0.2f,0.3f,0.5f,1f,2f,3f,5f);
                ObjectAnimator animator3y=ObjectAnimator.ofFloat(imageView_mian,"scaleY",0,0.1f,0.2f,0.3f,0.5f,1f,2f,3f,5f);
                animator3x.setDuration(3000);
                animator3x.setRepeatMode(ValueAnimator.REVERSE);
                animator3x.setRepeatCount(ValueAnimator.INFINITE);
                animator3x.start();
                animator3y.setDuration(3000);
            animator3y.setRepeatMode(ValueAnimator.REVERSE);
            animator3y.setRepeatCount(ValueAnimator.INFINITE);
            animator3y.start();

                break;
            case R.id.button_set:
                AnimatorSet animatorSet=new AnimatorSet();
                ObjectAnimator animator_1=ObjectAnimator.ofFloat(imageView_mian,"alpha",0,0.1f,0.5f,0.1f,0);
                animator_1.setDuration(3000);
                animator_1.setRepeatCount(ValueAnimator.INFINITE);
                animator_1.setRepeatMode(ValueAnimator.REVERSE);
                ObjectAnimator animator_2=ObjectAnimator.ofFloat(imageView_mian,"rotation",360,270,180,90,0,-90,-180,-270,-360);
                animator_2.setDuration(3000);
                animator_2.setRepeatMode(ValueAnimator.REVERSE);
                animator_2.setRepeatCount(ValueAnimator.INFINITE);
                ObjectAnimator animator_3x=ObjectAnimator.ofFloat(imageView_mian,"scaleX",0,0.1f,0.2f,0.3f,0.5f,1f,2f,3f,5f);
                ObjectAnimator animator_3y=ObjectAnimator.ofFloat(imageView_mian,"scaleY",0,0.1f,0.2f,0.3f,0.5f,1f,2f,3f,5f);
                animator_3x.setDuration(3000);
                animator_3x.setRepeatMode(ValueAnimator.REVERSE);
                animator_3x.setRepeatCount(ValueAnimator.INFINITE);
                animator_3x.start();
                animator_3y.setDuration(3000);
                animator_3y.setRepeatMode(ValueAnimator.REVERSE);
                animator_3y.setRepeatCount(ValueAnimator.INFINITE);
                List<Animator> list=new ArrayList<>();
                list.add(animator_1);
                list.add(animator_2);
                list.add(animator_3x);
                list.add(animator_3y);

                animatorSet.playTogether(list);
                animatorSet.start();

        }
    }
}
