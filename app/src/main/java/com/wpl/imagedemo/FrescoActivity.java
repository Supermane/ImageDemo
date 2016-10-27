package com.wpl.imagedemo;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

public class FrescoActivity extends AppCompatActivity {

    private SimpleDraweeView img;
    String str1 = "http://img5.imgtn.bdimg.com/it/u=987087732,826991765&fm=21&gp=0.jpg";
    String str2 = "http://img.pconline.com.cn/images/upload/upc/tx/wallpaper/1209/10/c1/13758581_1347257278695.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresco);

        //获取控件
        img = (SimpleDraweeView) findViewById(R.id.img);
        Uri uri = Uri.parse(str1);
        //定义控制类的监听对象
        ControllerListener listener = new BaseControllerListener() {
        };
        //创建一个Drawee控件的监听类
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri(uri)
                .setTapToRetryEnabled(true)      //是否允许重新加载
                .setOldController(img.getController())
                .setControllerListener(listener)
                .build();

        img.setController(controller);

        //img.setImageURI(uri);
    }
}
