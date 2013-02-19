package edu.mdc.entec;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class KendallPhoneDirActivity extends ListActivity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String [] directory= {"Operator", "Security", "Admissions", "Financial Aid", "Library",
				"Advisement", "Academic Affairs","Campus Directory"};
		
		setListAdapter (new ArrayAdapter<String>(this, R.layout.kendall_campus_phone_dir_layout, R.id.listViewDirectory, directory));
	  }
	protected void onListItemClick(ListView l, View v, int position, long id) {
		switch (position) {
		case 0:
			startActivity(new Intent(Intent.ACTION_DIAL, 
					Uri.parse("tel: 305-237-2000")));
			break;
		case 1:
			startActivity(new Intent(Intent.ACTION_DIAL, 
					Uri.parse("tel: 305-237-2100")));
			break;			
		case 2:
			startActivity(new Intent(Intent.ACTION_DIAL, 
					Uri.parse("tel: 305-237-2222")));
			break;			
		case 3:
			startActivity(new Intent(Intent.ACTION_DIAL, 
					Uri.parse("tel: 305-237-2325")));
			break;		
		case 4:
			startActivity(new Intent(Intent.ACTION_DIAL, 
					Uri.parse("tel: 305-237-2321")));
			break;			
		case 5:
			startActivity(new Intent(Intent.ACTION_DIAL, 
					Uri.parse("tel: 305-237-2339")));
			break;	
		case 6:
			startActivity(new Intent(Intent.ACTION_DIAL, 
					Uri.parse("tel: 305-237-0972")));
			break;
		case 7:
        	startActivity(new Intent(Intent.ACTION_VIEW,
                	Uri.parse("http://phonebook.mdc.edu")));
			break;			
			
		}
	}
}

 
