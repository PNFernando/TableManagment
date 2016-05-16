package chatty.myself.res_waiterv001.adapter;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.material.widget.RadioButton;
import com.squareup.picasso.Picasso;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;
import org.androidannotations.annotations.UiThread;

import java.util.ArrayList;

import chatty.myself.res_waiterv001.R;
import chatty.myself.res_waiterv001.TableViewActivity;
import chatty.myself.res_waiterv001.model.showmodel.ShowChatty;

/**
 * @author manish.s
 */

@EBean
public class TableGridViewAdapter extends BaseAdapter {

    @RootContext
    Context context;


    ArrayList<ShowChatty> data = new ArrayList<ShowChatty>();

    private TableViewClickListner tableViewClickListner;


    @AfterViews
    public void afterView() {
        getDetails();


    }


    @UiThread
    void changeUi() {
        notifyDataSetChanged();
    }


    @Background
    void getDetails() {
        String name = "Coffie Table 01";
        String url = "http://g03.a.alicdn.com/kf/HTB1pHVAJFXXXXbnXFXXq6xXFXXX7/Wood-chair-chair-hotel-chair-painted-wood-and-steel-structure-small-tables-and-chairs-combination-of.jpg";
        String age = "22";

        data.add(new ShowChatty("Main Table 01", "http://pimg.tradeindia.com/01249650/b/1/Hotel-Dining.jpg", age, true));
        data.add(new ShowChatty("Garden Table 01", "http://previews.123rf.com/images/lunglee/lunglee1405/lunglee140500023/29650440-Many-wooden-tables-and-chairs-on-terrace-in-hotel-restaurant--Stock-Photo.jpg", age, false));
        data.add(new ShowChatty(name, url, age, true));
        data.add(new ShowChatty(name, url, age, true));
        data.add(new ShowChatty(name, url, age, false));
        data.add(new ShowChatty(name, url, age, true));
        data.add(new ShowChatty(name, url, age, true));
        data.add(new ShowChatty(name, url, age, false));
        data.add(new ShowChatty(name, url, age, false));
        changeUi();
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public ShowChatty getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View row = convertView;
        RecordHolder holder = null;

//        ImageView imageView = new ImageView(context);
//
        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(R.layout.row_table, parent, false);

            holder = new RecordHolder();
            holder.txtName = (TextView) row.findViewById(R.id.txt_name);
            holder.imageView = (ImageView) row.findViewById(R.id.item_image);
            holder.txtAge = (TextView) row.findViewById(R.id.txt_age);
            holder.txtStatus = (RadioButton) row.findViewById(R.id.radioButton);
            row.setTag(holder);
        } else {
            holder = (RecordHolder) row.getTag();
        }
//
//        Item item = data.get(position);
//        holder.txtTitle.setText(item.getTitle());
//        holder.imageItem.setImageBitmap(item.getImage());

        ImageView imageView = (ImageView) row.findViewById(R.id.item_image);
        TextView nameView = (TextView) row.findViewById(R.id.txt_name);
        TextView ageText = (TextView) row.findViewById(R.id.txt_age);
        RadioButton radioButton = (RadioButton) row.findViewById(R.id.radioButton);

        ShowChatty item = data.get(position);
        holder.txtName.setText(item.getName());

        if (item.getStatus()) {
            holder.txtStatus.setChecked(true);
        } else {
            holder.txtStatus.setChecked(false);
        }

        //holder.imageUrl.setImageBitmap(item.getImage());

        Picasso.with(context).load(Uri.parse(item.getUrl())).into(holder.imageView);


        holder.txtAge.setText(item.getAge());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        //imageView.setAlpha(127);


        row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tableViewClickListner.onClick(getItem(position),v);
            }
        });


        return row;
    }

    static class RecordHolder {
        TextView txtName;
        ImageView imageView;
        TextView txtAge;
        RadioButton txtStatus;

    }

    public void setOnTableViewClickListner(TableViewClickListner tableViewClickListner) {

        this.tableViewClickListner = tableViewClickListner;
    }


    public interface  TableViewClickListner{
        void onClick(ShowChatty showChatty, View view);
    }
}