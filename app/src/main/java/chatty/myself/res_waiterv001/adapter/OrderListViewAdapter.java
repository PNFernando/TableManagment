package chatty.myself.res_waiterv001.adapter;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
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
import java.util.HashMap;

import chatty.myself.res_waiterv001.utill.Constant;

import chatty.myself.res_waiterv001.R;
import chatty.myself.res_waiterv001.model.showmodel.ShowChatty;

/**
 * @author manish.s
 */

@EBean
public class OrderListViewAdapter extends BaseAdapter {

    @RootContext
    Context context;

    public static final String FIRST_COLUMN  = "Name";
    public static final String SECOND_COLUMN = "UnitPrice";
    public static final String THIRD_COLUMN  = "Qty";
    public static final String FOURTH_COLUMN = "Type";
    public static final String FIFTH_COLUMN  = "Price";


    private ArrayList<HashMap> data = new ArrayList<HashMap>();

    @AfterViews
    public void afterView() {

        getDetails();



    }





    @Background
    void getDetails() {
        HashMap temp = new HashMap();
        temp.put(FIRST_COLUMN,"Chease Kottu");
        temp.put(SECOND_COLUMN, "400");
        temp.put(THIRD_COLUMN, "2");
        temp.put(FOURTH_COLUMN, "L");
        temp.put(FIFTH_COLUMN, "800");
        data.add(temp);

        HashMap temp1 = new HashMap();
        temp1.put(FIRST_COLUMN,"Chease Kottu");
        temp1.put(SECOND_COLUMN, "400");
        temp1.put(THIRD_COLUMN, "2");
        temp1.put(FOURTH_COLUMN, "L");
        temp1.put(FIFTH_COLUMN, "800");
        data.add(temp1);

        HashMap temp2 = new HashMap();
        temp2.put(FIRST_COLUMN,"Chease Kottu");
        temp2.put(SECOND_COLUMN, "400");
        temp2.put(THIRD_COLUMN, "2");
        temp2.put(FOURTH_COLUMN, "L");
        temp2.put(FIFTH_COLUMN, "800");
        data.add(temp2);

        HashMap temp3 = new HashMap();
        temp3.put(FIRST_COLUMN,"Chease Kottu");
        temp3.put(SECOND_COLUMN, "400");
        temp3.put(THIRD_COLUMN, "2");
        temp3.put(FOURTH_COLUMN, "L");
        temp3.put(FIFTH_COLUMN, "800");
        data.add(temp3);

        HashMap temp4 = new HashMap();
        temp4.put(FIRST_COLUMN,"Chease Kottu");
        temp4.put(SECOND_COLUMN, "400");
        temp4.put(THIRD_COLUMN, "2");
        temp4.put(FOURTH_COLUMN, "L");
        temp4.put(FIFTH_COLUMN, "800");
        data.add(temp4);

        changeUi();
    }
    @UiThread
    void changeUi() {
        notifyDataSetChanged();
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
            row = inflater.inflate(R.layout.listview_row, parent, false);

            holder = new RecordHolder();
            holder.txtFirst = (TextView) row.findViewById(R.id.FirstText);
            holder.txtSecond = (TextView) row.findViewById(R.id.SecondText);
            holder.txtThird = (TextView) row.findViewById(R.id.ThirdText);
            holder.txtFourth = (TextView) row.findViewById(R.id.FourthText);
            holder.txtFifth = (TextView) row.findViewById(R.id.FifthText);
            holder.txtFifth = (TextView) row.findViewById(R.id.FifthText);

            row.setTag(holder);
        } else {
            holder = (RecordHolder) row.getTag();
        }
//
//        Item item = data.get(position);
//        holder.txtTitle.setText(item.getTitle());
//        holder.imageItem.setImageBitmap(item.getImage());

        HashMap map = data.get(position);

        holder.txtFirst.setText(map.get(FIRST_COLUMN).toString());
        holder.txtSecond.setText(map.get(SECOND_COLUMN).toString());
        holder.txtThird.setText( map.get(THIRD_COLUMN).toString());
        holder.txtFourth.setText(map.get(FOURTH_COLUMN).toString());
        holder.txtFifth.setText(map.get(FIFTH_COLUMN).toString());
        //imageView.setAlpha(127);
        return row;
    }

    static class RecordHolder {
        TextView txtFirst;
        TextView txtSecond;
        TextView txtThird;
        TextView txtFourth;
        TextView txtFifth;

    }
}