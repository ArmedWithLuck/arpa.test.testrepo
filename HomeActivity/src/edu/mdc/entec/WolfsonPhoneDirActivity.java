package edu.mdc.entec;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WolfsonPhoneDirActivity extends ListActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] directory={"Operator:	305-237-3000","Admissions:	305-237-3644", 
							"Advisement:	305-237-3077", "Financial Aid:	305-237-3244",
							"Student Life:	305-237-3536", "Library:	305-237-3144"};
		setListAdapter(new ArrayAdapter<String>(this, 
				       R.layout.wolfson_campus_phone_dir_layout, R.id.directoryContacts, directory));		
	}
	
	protected void onListItemClick(ListView l, View v, int position, long id) {
		switch(position){
		case 0:
			String operator = "tel:3052373000";
			startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(operator)));
			break;
		case 1:
			String admissions = "tel:3052373644";
			startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(admissions)));
			break;
		case 2:
			String advisement = "tel:3052373077";
			startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(advisement)));
			break;
		case 3:
			String financial_aid = "tel:3052373244";
			startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(financial_aid)));
			break;
		case 4:
			String student_life = "tel:3052373536";
			startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(student_life)));
			break;
		case 5:
			String library = "tel:3052373144";
			startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(library)));
			break;			
		}
	}
};