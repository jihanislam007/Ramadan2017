package md.mazharul.islam.jihan.ramadan2017;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String> {
	
	private final Activity context;
	private final String[] web;
	
	public CustomAdapter(Activity context, String[] web) {

		super(context, R.layout.list_single, web);

		this.context = context;

		this.web = web;

	}
	
	@Override
	public View getView(int position, View view, ViewGroup parent) {

		LayoutInflater inflater = context.getLayoutInflater();

		View rowView= inflater.inflate(R.layout.list_district, null, true);

		TextView txtTitle = (TextView) rowView.findViewById(R.id.textView_list_dis);


		txtTitle.setText(web[position]);


		return rowView;
}
}