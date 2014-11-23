package org.loader.dropedittext;

import java.util.ArrayList;
import java.util.List;

import org.loader.dropedittext.R;
import org.loader.dropedittext.R.id;
import org.loader.dropedittext.R.layout;
import org.loader.view.DropEditText;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		DropEditText drop1 = (DropEditText) findViewById(R.id.drop_edit);
		DropEditText drop2 = (DropEditText) findViewById(R.id.drop_edit2);
		
		drop1.setAdapter(new BaseAdapter() {
			private List<String> mList = new ArrayList<String>() {
				{
					add("常用选项 one");
					add("常用选项 two");
					add("常用选项 three");
					add("常用选项 four");
					add("常用选项 five");
					add("常用选项 six");
					add("常用选项 7怎么拼来着？");
				}
			};

			@Override
			public int getCount() {
				return mList.size();
			}

			@Override
			public Object getItem(int position) {
				return mList.get(position);
			}

			@Override
			public long getItemId(int position) {
				return position;
			}

			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				TextView tv = new TextView(MainActivity.this);
				tv.setText(mList.get(position));
				return tv;
			}
		});
		
		drop2.setAdapter(new BaseAdapter() {
			private List<String> mList = new ArrayList<String>() {
				{
					add("常用选项 one");
					add("常用选项 two");
					add("常用选项 three");
					add("常用选项 four");
					add("常用选项 five");
					add("常用选项 six");
					add("常用选项 7怎么拼来着？");
				}
			};

			@Override
			public int getCount() {
				return mList.size();
			}

			@Override
			public Object getItem(int position) {
				return mList.get(position);
			}

			@Override
			public long getItemId(int position) {
				return position;
			}

			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				TextView tv = new TextView(MainActivity.this);
				tv.setText(mList.get(position));
				return tv;
			}
		});
	}
}
