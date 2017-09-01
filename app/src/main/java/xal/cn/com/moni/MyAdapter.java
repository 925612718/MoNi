package xal.cn.com.moni;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;

/**
 * Created by Administrator on 2017/8/31.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {
    List<Bean.DataBean> list;
    Context context;
    @BindView(R.id.mimage)
    ImageView mimage;


    public MyAdapter(List<Bean.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, final int position) {
        Glide.with(context).load(list.get(position).getGoods_img()).into(holder.iv);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linsern.onclick(position);

            }
        });
    }
public void setOnClickLinser(Linsern linsers){
    this.linsern =linsers;
}

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {

        private ImageView iv;

        public MyHolder(View itemView) {
            super(itemView);
            iv =itemView.findViewById(R.id.mimage);
        }
    }
    Linsern linsern;
    public interface Linsern{
        void onclick(int position);
    }
}
