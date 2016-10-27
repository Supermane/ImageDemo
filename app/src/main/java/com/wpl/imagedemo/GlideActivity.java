package com.wpl.imagedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class GlideActivity extends AppCompatActivity {

    String str1 = "http://img5.imgtn.bdimg.com/it/u=987087732,826991765&fm=21&gp=0.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);

        //获取控件
        ImageView im = (ImageView) findViewById(R.id.im);

        //Glide图片处理机制
        Glide.with(GlideActivity.this).load(str1).into(im);
    }
}
