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
import chatty.myself.res_waiterv001.model.showmodel.EditOrder;
import chatty.myself.res_waiterv001.model.showmodel.ShowChatty;

/**
 * @author manish.s
 */

@EBean
public class EditOrderListViewAdapter extends BaseAdapter {

    @RootContext
    Context context;


    ArrayList<EditOrder> data = new ArrayList<EditOrder>();

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
        String id = "6b3gf51hbfg6bh5fg16gf51g3bn5g1bn63vg56b1n";
        String name = "Saffron";
        String type = "L";
        String qty= "2";

        data.add(new EditOrder(id,name,type,qty));
        data.add(new EditOrder(id,name,type,qty));
        data.add(new EditOrder(id,name,type,qty));
        data.add(new EditOrder(id,name,type,qty));
        data.add(new EditOrder(id,name,type,qty));
        data.add(new EditOrder(id,name,type,qty));
        data.add(new EditOrder(id,name,type,qty));
        data.add(new EditOrder(id,name,type,qty));

        changeUi();
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        RecordHolder holder = null;

//        ImageView imageView = new ImageView(context);
//
        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(R.layout.row_editorder, parent, false);

            holder = new RecordHolder();
            holder.txtName = (TextView) row.findViewById(R.id.txt_name);
            holder.txtType = (TextView) row.findViewById(R.id.txt_type);
            holder.txtQty = (TextView) row.findViewById(R.id.txt_qty);



            row.setTag(holder);
        } else {
            holder = (RecordHolder) row.getTag();
        }




        EditOrder item = data.get(position);
        holder.txtName.setText(item.getName());
        holder.txtType.setText(item.getType());
        holder.txtQty.setText(item.getQty());


        return row;
    }

    static class RecordHolder {
        TextView txtName;
        TextView txtType;
        TextView txtQty;


    }
}