

#### 效果图 （带提示图标）
       
<img src="https://github.com/igeek-YZ/ExpandTextView/blob/master/pics/expandtextview.gif" width = "491" height = "635" alt="960" align=center />


#### 效果图 （不带提示图标）

<img src="https://github.com/igeek-YZ/ExpandTextView/blob/master/pics/expandtextview2.gif" width = "491" height = "635" alt="960" align=center />

#### activity 文件

	ExpandTextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (ExpandTextView) findViewById(R.id.cusTextView);
        textView.updateText(getResources().getString(R.string.test_expandtext));
    }
    


#### xml文件
	
	<widget.ExpandTextView
        android:background="@android:color/white"
        android:id="@+id/cusTextView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="12dp"
        android:paddingLeft="8dp"
        android:paddingRight="8dp"
        android:paddingBottom="8dp"
        android:paddingTop="8dp"
        app:drawableHeight="12dp"
        app:drawableWidth="14dp"
        app:expandDrawable="@mipmap/up"
        app:maxLines="3"
        app:shrinkDrawable="@mipmap/down"
        app:textColor="@android:color/black"
        app:textSize="14sp" />



#### 属性说明  

	<declare-styleable name="ExpandTextView">
        <!-- 文本颜色 -->
        <attr name="textColor" format="color|reference"/>
        <!-- 最大显示文本行数 -->
        <attr name="maxLines" format="integer|reference"/>
        <!-- 文本字体大小 -->
        <attr name="textSize" format="dimension|reference"/>
        <!-- 动画显示时间-->
        <attr name="animDuration" format="integer|reference"/>
        <!-- 提示图标的宽度 -->
        <attr name="drawableWidth" format="dimension|reference"/>
        <!-- 提示图标的高度 -->
        <attr name="drawableHeight" format="dimension|reference"/>
        <!-- 展开时候的提示图标 -->
        <attr name="expandDrawable" format="color|reference"/>
        <!-- 收缩收起时候的提示图标 -->
        <attr name="shrinkDrawable" format="color|reference"/>
    </declare-styleable>






