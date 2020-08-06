package sg.edu.rp.c347.p11_mydatabook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DrawerAdapter extends ArrayAdapter<String> {

    private ArrayList<String> drawer;
    private Context context;
    private TextView tv;
    private ImageView imageView;

    public DrawerAdapter(Context context, int resource, ArrayList<String> objects){
        super(context, resource, objects);
        this.drawer = objects;
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);
        tv = (TextView) rowView.findViewById(R.id.tvTitle);
        imageView = (ImageView) rowView.findViewById(R.id.imageIcon);

        String title = drawer.get(position);
        tv.setText(title);
        // Set the TextView to show the food
        if (title.contentEquals("Bio")){
            imageView.setImageResource(android.R.drawable.ic_dialog_info);
        }
        else if (title.contentEquals("Vaccination")){
            imageView.setImageResource(android.R.drawable.ic_menu_edit);
        }
        else if (title.contentEquals("Anniversary")){
            imageView.setImageResource(android.R.drawable.ic_menu_my_calendar);
        }
        else {
            imageView.setImageResource(android.R.drawable.star_big_on);
        }
        return rowView;
    }
}
