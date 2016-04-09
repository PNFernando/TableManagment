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
import chatty.myself.res_waiterv001.model.showmodel.CategoryModel;
import chatty.myself.res_waiterv001.model.showmodel.CategoryModel;

/**
 * @author manish.s
 */

@EBean
public class CategoryGridViewAdapter extends BaseAdapter {

    @RootContext
    Context context;


    ArrayList<CategoryModel> data = new ArrayList<CategoryModel>();

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
        String name = "Soft Drinks";
        String url = "http://fc03.deviantart.net/fs70/f/2012/008/6/4/png_johnny_deep_by_clauueditions-d4lqghi.png";
    

        data.add(new CategoryModel(name, url));
        data.add(new CategoryModel(name, url));
        data.add(new CategoryModel(name, url));
        data.add(new CategoryModel(name, url));
        data.add(new CategoryModel(name, url));
        data.add(new CategoryModel(name, url));
        data.add(new CategoryModel(name, url));
        data.add(new CategoryModel(name, url));
        data.add(new CategoryModel(name, url));
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
            row = inflater.inflate(R.layout.row_item, parent, false);

            holder = new RecordHolder();
            holder.txtName = (TextView) row.findViewById(R.id.txt_name);
//            holder.imageView = (ImageView) row.findViewById(R.id.item_image);

            row.setTag(holder);
        } else {
            holder = (RecordHolder) row.getTag();
        }
//
//        Item item = data.get(position);
//        holder.txtTitle.setText(item.getTitle());
//        holder.imageItem.setImageBitmap(item.getImage());

//        ImageView imageView = (ImageView) row.findViewById(R.id.item_image);

        CategoryModel item = data.get(position);
        holder.txtName.setText(item.getName());



        //holder.imageUrl.setImageBitmap(item.getImage());

//        Picasso.with(context).load(Uri.parse(item.getUrl())).into(holder.imageView);



//        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        //imageView.setAlpha(127);
        return row;
    }

    static class RecordHolder {
        TextView txtName;
        ImageView imageView;


    }
}