package com.ting.androidexample.ui.activities;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.ting.androidexample.R;


/**
 * @author tingzi [zhangjieting@gmail.com]
 *
 */
public class ExampleActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setupViews();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_example, menu);
        return true;
    }
    
    private void setupViews() {
    	
    	ScrollView scrollView = new ScrollView(this);
    	
    	LinearLayout linearLayout = new LinearLayout(this);
    	linearLayout.setOrientation(LinearLayout.VERTICAL);
  
    	//add button1
    	Button button1 = new Button(this);
    	button1.setText("Download");
    	button1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(getApplicationContext(), DownloadActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button1);
    	
    	//add button2
    	Button button2 = new Button(this);
    	button2.setText("AlertDialog");
    	button2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(getApplicationContext(), AlertDialogActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button2);
    	
    	//add button3
    	Button button3 = new Button(this);
    	button3.setText("DragListView");
    	button3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(getApplicationContext(), DragListViewActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button3);
    	
    	//add button4
    	Button button4 = new Button(this);
    	button4.setText("Notification");
    	button4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(getApplicationContext(), NotificationActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button4);
    	
    	//add button5
    	Button button5 = new Button(this);
    	button5.setText("Json");
    	button5.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(getApplicationContext(), JsonActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button5);
    	
    	//add button6
    	Button button6 = new Button(this);
    	button6.setText("StringBuilderActivity");
    	button6.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(getApplicationContext(), StringBuilderActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button6);
    	
    	//add button7
    	Button button7 = new Button(this);
    	button7.setText("MutiParamActivity");
    	button7.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(getApplicationContext(), MultiParamActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button7);
    	
    	//add button8
/*    	Button button8 = new Button(this);
    	button8.setText("ReflexActivity");
    	button8.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(getApplicationContext(), ReflexActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button8);*/
    	
    	//add button9
    	Button button9 = new Button(this);
    	button9.setText("KeyguardActivity");
    	button9.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(getApplicationContext(), KeyguardActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button9);
    	
    	//add button10
    	Button button10 = new Button(this);
    	button10.setText("ResolveInfoActivity");
    	button10.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
//				intent.setClass(getApplicationContext(), ResolveInfoActivity.class);
				intent.setComponent(new ComponentName("com.ting.androidexample", 
						"com.ting.androidexample.ui.activities.ResolveInfoActivity"));
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button10);
    
    	//add button11
    	Button button11 = new Button(this);
    	button11.setText("AIDLActivity");
    	button11.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(getApplicationContext(), AIDLActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button11);
    	
    	//add button12
    	Button button12 = new Button(this);
    	button12.setText("InnerReceiverActivity");
    	button12.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(getApplicationContext(), InnerReceiverActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button12);
    	
    	//add button13
    	Button button13 = new Button(this);
    	button13.setText("WebViewActivity");
    	button13.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(getApplicationContext(), WebViewActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button13);
    	
    	//add button14
/*    	Button button14 = new Button(this);
    	button14.setText("AccountActivity");
    	button14.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(getApplicationContext(), AccountActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button14);*/
    	
    	//add button15
    	Button button15 = new Button(this);
    	button15.setText("VisitJarServiceActivity");
    	button15.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(getApplicationContext(), VisitJarServiceActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button15);
    	
    	//add button16
    	Button button16 = new Button(this);
    	button16.setText("NetworkActivity");
    	button16.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(getApplicationContext(), NetworkActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button16);
    	
    	//add button17
    	Button button17 = new Button(this);
    	button17.setText("LocationActivity");
    	button17.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(getApplicationContext(), LocationActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button17);
    	
    	//add button18
    	Button button18 = new Button(this);
    	button18.setText("RestartServiceActivity");
    	button18.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(getApplicationContext(), RestartServiceActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button18);
    	
    	//add button19
    	Button button19 = new Button(this);
    	button19.setText("FileActivity");
    	button19.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getApplicationContext(), FileActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button19);
    	
    	//add button20
    	Button button20 = new Button(this);
    	button20.setText("GsonActivity");
    	button20.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getApplicationContext(), GsonActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button20);
    	
    	//add button21
    	Button button21 = new Button(this);
    	button21.setText("PathActivity");
    	button21.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getApplicationContext(), PathActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button21);
    	
    	//add button22
    	Button button22 = new Button(this);
    	button22.setText("ZipActivity");
    	button22.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getApplicationContext(), ZipActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button22);
    	
    	//add button23
    	Button button23 = new Button(this);
    	button23.setText("HttpActivity");
    	button23.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getApplicationContext(), HttpActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button23);
    	
    	//add button24
    	Button button24 = new Button(this);
    	button24.setText("StatFsActivity");
    	button24.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getApplicationContext(), StatFsActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button24);
    	
    	//add button25
    	Button button25 = new Button(this);
    	button25.setText("PhoneActivity");
    	button25.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getApplicationContext(), PhoneActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button25);
    	
    	//add button26
    	Button button26 = new Button(this);
    	button26.setText("PermissionActivity");
    	button26.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getApplicationContext(), PermissionActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button26);
    	
    	//add button27
    	Button button27 = new Button(this);
    	button27.setText("ProcessServiceActivity");
    	button27.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getApplicationContext(), ProcessServiceActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button27);
    	
    	//add button28
    	Button button28 = new Button(this);
    	button28.setText("AssetActivity");
    	button28.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getApplicationContext(), AssetActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button28);
    	
    	//add button29
    	Button button29 = new Button(this);
    	button29.setText("StartWebsiteActivity");
    	button29.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getApplicationContext(), StartWebsiteActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button29);
    	
    	//add button30
    	Button button30 = new Button(this);
    	button30.setText("StartIntentServiceActivity");
    	button30.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getApplicationContext(), StartIntentServiceActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button30);
    	
    	//add button31
    	Button button31 = new Button(this);
    	button31.setText("NewThreadActivity");
    	button31.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getApplicationContext(), NewThreadActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button31);
    	
    	//add button32
    	Button button32 = new Button(this);
    	button32.setText("PendingIntentActivity");
    	button32.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getApplicationContext(), PendingIntentActivity.class);
				startActivity(intent);
			}
    		
    	});
    	linearLayout.addView(button32);
    	
    	scrollView.addView(linearLayout);
    	setContentView(scrollView);
    }
}
