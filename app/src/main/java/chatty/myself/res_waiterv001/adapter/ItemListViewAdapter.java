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
import chatty.myself.res_waiterv001.model.showmodel.ShowChatty;

/**
 * @author manish.s
 */

@EBean
public class ItemListViewAdapter extends BaseAdapter {

    @RootContext
    Context context;


    ArrayList<ShowChatty> data = new ArrayList<ShowChatty>();

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
        String name = "Johnny";
        String url = "http://fc03.deviantart.net/fs70/f/2012/008/6/4/png_johnny_deep_by_clauueditions-d4lqghi.png";
        String age= "22";

        data.add(new ShowChatty(name, url, "I would like to add you as a chattysdvbdsfvsdvsdvsvsvsdvsdvsd", true));
        data.add(new ShowChatty(name, url, "I would like to add you as a chattysdvbdsfvsdvsdvsvsvsdvsdvsd", false));
        data.add(new ShowChatty(name, url, "I would like to add you as a chattysdvbdsfvsdvsdvsvsvsdvsdvsd", true));
        data.add(new ShowChatty(name, url, "I would like to add you as a chattysdvbdsfvsdvsdvsvsvsdvsdvsd", true));
        data.add(new ShowChatty(name, url, "I would like to add you as a chattysdvbdsfvsdvsdvsvsvsdvsdvsd", false));
        data.add(new ShowChatty(name, url, "I would like to add you as a chattysdvbdsfvsdvsdvsvsvsdvsdvsd", true));
        data.add(new ShowChatty(name, url, "I would like to add you as a chattysdvbdsfvsdvsdvsvsvsdvsdvsd", true));
        data.add(new ShowChatty(name, url, "I would like to add you as a chattysdvbdsfvsdvsdvsvsvsdvsdvsd", false));
        data.add(new ShowChatty(name, url, "I would like to add you as a chattysdvbdsfvsdvsdvsvsvsdvsdvsd", false));
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
            row = inflater.inflate(R.layout.row_fooditem, parent, false);

            holder = new RecordHolder();
            holder.txtName = (TextView) row.findViewById(R.id.txt_name);
            holder.imageView = (ImageView) row.findViewById(R.id.item_image);
            holder.txtDescription = (TextView) row.findViewById(R.id.txt_description);

            row.setTag(holder);
        } else {
            holder = (RecordHolder) row.getTag();
        }


        ImageView imageView = (ImageView) row.findViewById(R.id.item_image);

        ShowChatty item = data.get(position);
        holder.txtName.setText(item.getName());
        holder.txtDescription.setText(item.getAge());



        //holder.imageUrl.setImageBitmap(item.getImage());

        Picasso.with(context).load(Uri.parse(item.getUrl())).into(holder.imageView);



        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        //imageView.setAlpha(127);
        return row;
    }

    static class RecordHolder {
        TextView txtName;
        ImageView imageView;
        TextView txtDescription;
        RadioButton txtStatus;

    }
}