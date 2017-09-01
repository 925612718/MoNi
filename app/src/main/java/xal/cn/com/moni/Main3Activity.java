package xal.cn.com.moni;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.youth.banner.Banner;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main3Activity extends AppCompatActivity {

    @BindView(R.id.banner)
    Banner banner;
    ArrayList<String> images =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String image = intent.getStringExtra("image");
        String image1 = intent.getStringExtra("image1");
        images.add(image);
        images.add(image1);
        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        banner.setImages(images);

        //banner设置方法全部调用完毕时最后调用
        banner.start();



    }
}
