package edu.mdc.entec;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import edu.mdc.entec.R;

public class HomesteadPublicSafetyActivity extends Activity 
{
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homestead_campus_public_safety_layout);
		
		Button a=(Button) findViewById(R.id.btnEmergency);
        a.setOnClickListener(new OnClickListener() 
        {
        public void onClick(View v) 
        	{
				// TODO Auto-generated method stub
        		startActivity(new Intent(Intent.ACTION_DIAL,Uri.parse("tel:305-237-5100")));
        	}
        });
        
        TextView b=(TextView) findViewById(R.id.btnWebsite) ;
        b.setOnClickListener(new OnClickListener() 
        {
        public void onClick(View v) 
        	{
				// TODO Auto-generated method stub
        		startActivity(new Intent(Intent.ACTION_VIEW,
				Uri.parse("http://www.mdc.edu/main/safety/")));
			}
    	});
	}

}
