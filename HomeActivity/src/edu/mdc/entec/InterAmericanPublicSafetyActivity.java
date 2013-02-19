package edu.mdc.entec;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class InterAmericanPublicSafetyActivity extends ListActivity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		String[] PublicSafety = {"Phone: (305)-237-6046", "Parking Map", "Visit Website"};
		
		setListAdapter(new ArrayAdapter<String> (this,android.R.layout.simple_list_item_1, PublicSafety));
	}
	String SafetyPhoneNumber = "tel:305-237-6046";
	
		
		protected void onListItemClick(ListView l, View v, int position, long id) {
			
			switch(position) {
			case 0:
				Intent CallSafetyNumber = new Intent(Intent.ACTION_DIAL, Uri.parse(SafetyPhoneNumber));
				startActivity(CallSafetyNumber);
				break;
			case 1:
				startActivity(new Intent(InterAmericanPublicSafetyActivity.this, InterAmericanParkingMapActivity.class));
				break;
			case 2:
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mdc.edu/main/safety/")));
				break;
	}
	

}
	}
