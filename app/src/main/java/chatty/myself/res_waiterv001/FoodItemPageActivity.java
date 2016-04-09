package chatty.myself.res_waiterv001;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.HashMap;

import chatty.myself.res_waiterv001.adapter.CategoryGridViewAdapter;
import chatty.myself.res_waiterv001.adapter.ItemListViewAdapter;
import chatty.myself.res_waiterv001.adapter.OrderListViewAdapter;
import chatty.myself.res_waiterv001.utill.HorizontalListView;
import chatty.myself.res_waiterv001.utill.Constant;


@EActivity(R.layout.activity_food_item)
public class FoodItemPageActivity extends Activity {



    @Bean
    CategoryGridViewAdapter categoryGridViewAdapter;

    @Bean
    ItemListViewAdapter itemListViewAdapter;

    @ViewById
    HorizontalListView categoryHorizontalListView;


    @ViewById
    ListView foodItemListView;

    private ArrayList<HashMap> data;






    @AfterViews
    void initViews(){

        categoryHorizontalListView.setAdapter(categoryGridViewAdapter);


        foodItemListView.setAdapter(itemListViewAdapter);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_item);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_category_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }





    @Click
    void btn_checkOrder(View view) {
        Intent intent = new Intent(this, OrderListActivity_.class);
        startActivity(intent);
    }

}
