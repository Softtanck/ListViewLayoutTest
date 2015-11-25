package com.softtanck.listviwelayouttest.adapter;

import java.util.List;

import com.softtanck.listviwelayouttest.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class Myadapter extends BaseAdapter {

	private Context mContext;

	private List<String> list;

	public Myadapter(Context context, List<String> list) {
		this.mContext = context;
		this.list = list;
	}

	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		convertView = View.inflate(mContext, R.layout.item, null);

		return convertView;
	}

}
