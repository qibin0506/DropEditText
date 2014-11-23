DropEditText
============

like a spinner but can edit 

效果演示：

![image](https://github.com/qibin0506/DropEditText/blob/master/image/1.png)

![image](https://github.com/qibin0506/DropEditText/blob/master/image/2.png)

![image](https://github.com/qibin0506/DropEditText/blob/master/image/3.png)


使用方法:
在布局文件配置：

<org.loader.view.DropEditText
	android:id="@+id/drop_edit"
	android:layout_width="200dip"
	android:layout_height="wrap_content"
	drop:drawableRight="@drawable/drop"
	drop:dropMode="flower_parent" />
		
<org.loader.view.DropEditText
	android:id="@+id/drop_edit2"
	android:layout_width="200dip"
	android:layout_height="wrap_content"
	drop:drawableRight="@drawable/drop"
	drop:dropMode="wrap_content"
	drop:hint="DropEditText" />

在Activity中：
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