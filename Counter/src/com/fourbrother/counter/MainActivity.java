package com.fourbrother.counter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	int counter;
	Button add,sub,res;
	TextView display;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		counter=0;
		add= (Button)findViewById(R.id.bAdd);
		sub= (Button)findViewById(R.id.bSub);
		res= (Button)findViewById(R.id.bRes);
		display=(TextView)findViewById(R.id.tvdisplay);
		
		
		add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				counter++;
				display.setText("Tasbee Count is "+ counter);
			}
		});
		
		
      sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if(counter>0)
				{
				counter--;
				display.setText("Tasbee Count is "+ counter);
				}
				else if(counter==0)
				{
					display.setText("Tasbee Count is "+ counter);
				}
			}
		});
      
      
      res.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				counter=0;
				display.setText("Tasbee Count is "+ counter);
			}
		});
		
		
		
		
		
	}
		
	
	
}
