package md.mazharul.islam.jihan.ramadan2017;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class M_T_CustomAdapter extends BaseAdapter
{
	Activity context;
	String title[];
	String description[];
	String iftar[];

	public M_T_CustomAdapter(Activity context, String[] title, String[] description , String[] iftar) {
		super();
		this.context = context;
		this.title = title;
		this.description = description;
		this.iftar = iftar;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return title.length;
	}

	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	private class ViewHolder {
		TextView txtViewTitle;
		TextView txtViewDescription;
		TextView txtViewifter;
	}

	public View getView(int position, View convertView, ViewGroup parent)
	{
		// TODO Auto-generated method stub
		ViewHolder holder;
		LayoutInflater inflater =  context.getLayoutInflater();

		if (convertView == null)
		{
			convertView = inflater.inflate(R.layout.list_single, null);
			holder = new ViewHolder();
			holder.txtViewTitle = (TextView) convertView.findViewById(R.id.textViewdate);
			holder.txtViewDescription = (TextView) convertView.findViewById(R.id.textViewsehry);
			holder.txtViewifter = (TextView) convertView.findViewById(R.id.textViewiftar);
			convertView.setTag(holder);
		}
		else
		{
			holder = (ViewHolder) convertView.getTag();
		}

		holder.txtViewTitle.setText(title[position]);
		holder.txtViewDescription.setText(description[position]);
		holder.txtViewifter.setText(iftar[position]);

		return convertView;
	}

}