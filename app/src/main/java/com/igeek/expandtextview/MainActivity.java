package com.igeek.expandtextview;

import android.app.Activity;
import android.os.Bundle;

import widget.ExpandTextView;


public class MainActivity extends Activity {

    ExpandTextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (ExpandTextView) findViewById(R.id.cusTextView);
//        textView.updateText(getResources().getString(R.string.title_activity_main2));
    }

    @Override
    protected void onResume() {
        super.onResume();
        textView.updateText(getResources().getString(R.string.test_expandtext));
    }
}
