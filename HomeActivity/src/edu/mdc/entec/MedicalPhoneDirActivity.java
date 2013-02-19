package edu.mdc.entec;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MedicalPhoneDirActivity extends Activity 
{
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		String[] contacts={"Admissions:305-237-4028", "Advisement:305-237-4028", "Financial Aid:305-237-4028",
				"Student Life:305-237-4028", "Library:305-237-4028", "Testing:305-237-4028",
				"Bursar Office:305-237-4028", "Campus Directory List"};
		setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, contacts));
		
	}
	

	private void setListAdapter(ArrayAdapter<String> arrayAdapter) {
		// TODO Auto-generated method stub
		
	}


	protected void onListItemClick(ListView i, View v, int position, long id) 
	{
		
		switch(position) 
		{
			case 0:
				try {
					   Intent intent = new Intent(Intent.ACTION_CALL);
					   intent.setData(Uri.parse("tel:+305-237-4028"));
					   startActivity(intent);
					} 
				catch (Exception e) 
					{
					   Log.e("Homestead Campus", "Failed to invoke call", e);
					}
			break;
			
			case 1:
				try {
					   Intent intent = new Intent(Intent.ACTION_CALL);
					   intent.setData(Uri.parse("tel:+305-237-4028"));
					   startActivity(intent);
					} 
				catch (Exception e) 
					{
					   Log.e("Homestead Campus", "Failed to invoke call", e);
					}
			
			break;
			
			case 2:
				try {
					   Intent intent = new Intent(Intent.ACTION_CALL);
					   intent.setData(Uri.parse("tel:+305-237-4028"));
					   startActivity(intent);
					} 
				catch (Exception e) 
					{
					   Log.e("Homestead Campus", "Failed to invoke call", e);
					}
				
			break;
			
			case 3:
				try {
					   Intent intent = new Intent(Intent.ACTION_CALL);
					   intent.setData(Uri.parse("tel:+305-237-4028"));
					   startActivity(intent);
					} 
				catch (Exception e)
					{
					   Log.e("Homestead Campus", "Failed to invoke call", e);
					}
			
			break;
			
			case 4:
				try {
					   Intent intent = new Intent(Intent.ACTION_CALL);
					   intent.setData(Uri.parse("tel:+305-237-4028"));
					   startActivity(intent);
					} 
				catch (Exception e) 
					{
					   Log.e("Homestead Campus", "Failed to invoke call", e);
					}
				
			break;
			
			case 5:
				try {
					   Intent intent = new Intent(Intent.ACTION_CALL);
					   intent.setData(Uri.parse("tel:+305-237-4028"));
					   startActivity(intent);
					} 
				catch (Exception e) 
					{
					   Log.e("Homestead Campus", "Failed to invoke call", e);
					}
			
			break;
			
			case 6:
				try {
					   Intent intent = new Intent(Intent.ACTION_CALL);
					   intent.setData(Uri.parse("tel:+305-237-4028"));
					   startActivity(intent);
					} 
				catch (Exception e) 
					{
					   Log.e("Homestead Campus", "Failed to invoke call", e);
					}
				
			break;
			
			case 7:
				startActivity(new Intent(Intent.ACTION_VIEW,
						Uri.parse("http://www.mdc.edu/medical/administrativeservices/default.asp")));
			break;
					
		}
	}
}
