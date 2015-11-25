package com.softtanck.listviwelayouttest;

import java.util.ArrayList;
import java.util.List;

import com.softtanck.listviwelayouttest.adapter.Myadapter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListView;

public class MainActivity extends Activity {

	private ListView mlistview;

	private Myadapter adapter;

	private List<String> list;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mlistview = (ListView) findViewById(R.id.lv);

		list = new ArrayList<String>();

		for (int i = 0; i < 10; i++) {
			list.add("");
		}
		adapter = new Myadapter(MainActivity.this, list);
		mlistview.setAdapter(adapter);
		setHeight();
	}

	public void setHeight() {

		int listViewHeight = 0;
		int dividerHeight = mlistview.getDividerHeight();
		int adaptCount = adapter.getCount();
		for (int i = 0; i < adaptCount; i++) {
			View temp = adapter.getView(i, null, mlistview);
			temp.measure(0, 0);
			listViewHeight += temp.getMeasuredHeight() + dividerHeight;
		}
		LayoutParams layoutParams = this.mlistview.getLayoutParams();
		layoutParams.width = LayoutParams.FILL_PARENT;
		layoutParams.height = listViewHeight;
		mlistview.setLayoutParams(layoutParams);
	}
}
