package com.kevin.administrator.tweenanimation;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
private ImageView imageView_main;
    private Context mContext=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    initView();
    }

    private void initView() {
   imageView_main= (ImageView) findViewById(R.id.imageView_main);
    }

    public void clickView(View view) {
        switch (view.getId()){
            case R.id.button_alpha:
              imageView_main.startAnimation(AnimationUtils.loadAnimation(mContext,R.anim.alpha));
        break;
            case R.id.button_rotate:
                imageView_main.startAnimation(AnimationUtils.loadAnimation(mContext,R.anim.rotate));
       break;
            case R.id.button_scale:
                imageView_main.startAnimation(AnimationUtils.loadAnimation(mContext,R.anim.scale));
                break;
            case R.id.button_translate:
                imageView_main.startAnimation(AnimationUtils.loadAnimation(mContext,R.anim.translate));
                break;
            case R.id.button_set:
                imageView_main.startAnimation(AnimationUtils.loadAnimation(mContext,R.anim.set));
                break;

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       switch (item.getItemId()){
           case R.id.action_intent:
               Intent intent=new Intent(mContext,NextActivity.class);
              startActivity(intent);
               break;
       }
        return super.onOptionsItemSelected(item);
    }
}
