package edu.mdc.entec;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class WestActivity extends Activity {
	
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.west_campus_layout);
        
        
        //btnMyMdc
        ImageView MyMdc=(ImageView)findViewById(R.id.btnMyMdc);
        MyMdc.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		
        		//Loads the MyMDC page
        		startActivity(new Intent(Intent.ACTION_VIEW,
        				Uri.parse("https://mymdc.mdc.edu/")));
        		
        		//startActivity(new Intent(Intent.ACTION_VIEW,
        		//Uri.parse("")))));
        	}
        });
        
        //btnEmail
        ImageView Email=(ImageView)findViewById(R.id.btnEmail);
        Email.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		
        		//Loads student e-mail access
        		startActivity(new Intent(Intent.ACTION_VIEW,
        				Uri.parse("http://email.mymdc.net/")));
        		
        		//startActivity(new Intent(menuMDC.this,
        		//		change_me.class));
        	}
        });
        
        //btnEvents
        ImageView Events=(ImageView)findViewById(R.id.btnEvents);
        Events.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		
        		//Loads the events for West
        		startActivity(new Intent(Intent.ACTION_VIEW,
        				Uri.parse("http://calendar.mdc.edu/default.aspx?category=&location=10-0-0&view=Grid")));
        		
        		//startActivity(new Intent(menuMDC.this,
        		//		change_me.class));
        	}
        });
        
        //btnMap
        ImageView Map=(ImageView)findViewById(R.id.btnMap);
        Map.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		
        		//Loads up the maps
        		startActivity(new Intent(Intent.ACTION_VIEW,
        				Uri.parse("http://www.mdc.edu/west/images/images_home/west_c_map.gif")));
        		
        		//startActivity(new Intent(menuMDC.this,
        		//		change_me.class));
        	}
        });
        
        //btnAngel
        ImageView Angel=(ImageView)findViewById(R.id.btnAngel);
        Angel.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		
        		//Goes to the URL for Angel
        		startActivity(new Intent(Intent.ACTION_VIEW,
        				Uri.parse("https://mycourses.mdc.edu/")));
        	}
        });
        
        //btnNews
        ImageView News=(ImageView)findViewById(R.id.btnNews);
        News.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		
        		//Loads campus news
        		startActivity(new Intent(Intent.ACTION_VIEW,
        				Uri.parse("http://www.mdc.edu/main/news/")));
        		
        		//startActivity(new Intent(menuMDC.this,
        		//		change_me.class));
        	}
        });
        
        //btnLibrary
        ImageView Library=(ImageView)findViewById(R.id.btnLibrary);
        Library.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		
        		//Loads the West Library
        		startActivity(new Intent(Intent.ACTION_VIEW,
        				Uri.parse("http://www.mdc.edu/west/library/")));
        		
        		//startActivity(new Intent(menuMDC.this,
        		//		change_me.class));
        	}
        });
        
        //btnCourses
        ImageView Courses=(ImageView)findViewById(R.id.btnCourses);
        Courses.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		
        		//Loads the course catalogs.
        		startActivity(new Intent(Intent.ACTION_VIEW,
        				Uri.parse("http://www.mdc.edu/main/academics/course_offerings.aspx")));
        		
        		//startActivity(new Intent(menuMDC.this,
        		//		change_me.class));
        	}
        });
        
        //btnPublicSafety
        ImageView PublicSafety=(ImageView)findViewById(R.id.btnPublicSafety);
        PublicSafety.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		
        		//Loads the Public Safety info for West
        		
        		startActivity(new Intent(WestActivity.this,
        				WestPublicSafetyActivity.class));
        	}
        });
        
        //btnPhoneDir
        ImageView PhoneDir=(ImageView)findViewById(R.id.btnPhoneDir);
        PhoneDir.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		
        		//Loads the West Directory
        		
        		
        		startActivity(new Intent(WestActivity.this, WestPhoneDirActivity.class));
        	}
        });
        
        //btnSwitchCampus
        ImageView SwitchCampus=(ImageView)findViewById(R.id.btnHome);
        SwitchCampus.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		
        		//Goes back to the pick campus window.
        		startActivity(new Intent(WestActivity.this, HomeActivity.class));
        	}
        });

	}
}
