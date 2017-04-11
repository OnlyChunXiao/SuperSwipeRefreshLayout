package com.king.superswiperefreshlayout.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import com.king.superswiperefreshlayout.R;
import com.king.base.adapter.ViewHolderAdapter;
import com.king.base.util.ViewHolder;

import java.util.List;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @date 2016/9/18
 */
public class ListAdapter extends ViewHolderAdapter<String> {

    public ListAdapter(Context context, List<String> listData) {
        super(context, listData);
    }

    @Override
    public View buildConvertView(LayoutInflater layoutInflater, String s, int position) {
        return inflate(R.layout.list_item);
    }

    @Override
    public void bindViewDatas(ViewHolder holder, String s, int position) {
        holder.setText(R.id.tv,s);
    }
}
