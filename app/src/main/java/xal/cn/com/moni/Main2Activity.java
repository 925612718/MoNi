package xal.cn.com.moni;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {
    ArrayList<Bean.DataBean> list = new ArrayList<>();
    @BindView(R.id.mrecycle)
    RecyclerView mrecycle;
    private MyAdapter adapter;
    private ProgressDialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
        mrecycle.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        adapter = new MyAdapter(list,this);
        mrecycle.setAdapter(adapter);
        adapter.setOnClickLinser(new MyAdapter.Linsern() {
            @Override
            public void onclick(int position) {
                Intent intent =new Intent(Main2Activity.this,Main3Activity.class);
                intent.putExtra("image",list.get(position).getGoods_img());
                intent.putExtra("image1",list.get(0).getGoods_img());
                startActivity(intent);

            }
        });
        SpacesItemDecoration decoration=new SpacesItemDecoration(16);
        mrecycle.addItemDecoration(decoration);
        pro();
        initData();
    }

    private void initData() {
        OkhttpUtils.getInstance().getNetData("http://m.yunifang.com/yunifang/mobile/goods/getall?random=60305&encode=b0358434fda8d7478bfc325b5828b721&category_id=17", new OkhttpUtils.CallBacks() {
            @Override
            public void getString(String ss) {
                Gson gson = new Gson();
                Bean bean = gson.fromJson(ss, Bean.class);
                final List<Bean.DataBean> data = bean.getData();
//                String img = data.get(0).getGoods_img();
                list.addAll(data);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        dialog.dismiss();
                        adapter.notifyDataSetChanged();
                    }
                });
            }
        });

    }

    private void pro() {
        dialog = new ProgressDialog(this);
        dialog.setMessage("正在加载.....");
        dialog.show();
    }
}
