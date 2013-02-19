package edu.mdc.entec;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class WolfsonPublicSafetyActivity extends ListActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		String[] safety={"Hialeah Campus:  305-237-8701", "Homestead Campus:  305-237-5100",
						 "InterAmerican Campus:  305-237-6046", "Kendall Campus:  305-237-2100",
						 "Medical Campus:  305-237-4100", "North Campus:  305-237-1100",
						 "West Campus:  305-237-8100", "Wolfson Campus:  305-237-3100",
						 "TDD:  800-955-8771"};
		setListAdapter(new ArrayAdapter<String>(this, 
				R.layout.wolfson_campus_public_safety_layout, R.id.safetyContacts, safety));		
	}
	
	protected void onListItemClick(ListView l, View v, int position, long id) {
		switch(position){
		case 0:
			String hialeah = "tel:3052378701";
			startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(hialeah)));
			break;
		case 1:
			String homestead = "tel:3052375100";
			startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(homestead)));
			break;
		case 2:
			String interamerican = "tel:3052376046";
			startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(interamerican)));
			break;
		case 3:
			String kendall = "tel:3052372100";
			startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(kendall)));
			break;
		case 4:
			String medical = "tel:3052374100";
			startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(medical)));
			break;
		case 5:
			String north = "tel:3052371100";
			startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(north)));
			break;
		case 6:
			String west = "tel:3052378100";
			startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(west)));
			break;
		case 7:
			String wolfson = "tel:3052373100";
			startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(wolfson)));
			break;
		case 8:
			String tdd = "tel:8009558771";
			startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(tdd)));
			break;			
		}
	}
};