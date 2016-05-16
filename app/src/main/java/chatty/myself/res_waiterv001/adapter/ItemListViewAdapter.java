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
        String name = "Pilau Rice With Saffron";
        String url = "https://whatjessicabakednext.files.wordpress.com/2015/05/dsc00287.jpg";
        String age= "22";

        data.add(new ShowChatty("Plain Basmathi Rice", "http://maharajawestseattle.com/images/plain_Basmati%20rice.jpg", "This is sample food,This is sample food This is sample food", true));
        data.add(new ShowChatty("Onion Rice", "http://cdn1.tmbi.com/TOH/Images/Photos/37/300x300/exps35817_CFT961319D45B.jpg", "This is sample food,This is sample food This is sample food", false));
        data.add(new ShowChatty("Sea Food Rice", "http://www.bbcgoodfood.com/sites/default/files/recipe_images/recipe-image-legacy-id--218528_10.jpg","This is sample food,This is sample food This is sample food", true));
        data.add(new ShowChatty("Vegitable Rice", "http://www.dinner-mom.com/wp-content/uploads/2014/03/Vegetable-Rice-Bowls-with-Parmesan-Cheese-IMG_1163.jpg", "This is sample food,This is sample food This is sample food", true));
        data.add(new ShowChatty("Special Fried Rice", "http://mandarinbeijingcuisine.com/wp-content/uploads/2013/07/fried_rice-906x859.jpg", "This is sample food,This is sample food This is sample food", false));
        data.add(new ShowChatty("Mushroom Fried Rice", "http://www.khiewchanta.com/images/bacon-mushroom-fried-rice.jpg", "This is sample food,This is sample food This is sample food", true));
        data.add(new ShowChatty("Mixed Rice", "http://www.mezbaan.ae/image/data/Website%20Photos/Chinese/Mixed%20Fried%20Rice%20%20.jpg", "This is sample food,This is sample food This is sample food", true));
        data.add(new ShowChatty("Nasigoraing", "http://tarasmulticulturaltable.com/wp-content/uploads/2013/07/nasi-goreng-1-of-3.jpg", "This is sample food,This is sample food This is sample food", false));
        data.add(new ShowChatty(name, url, "This is sample food,This is sample food This is sample food", false));
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