package chatty.myself.res_waiterv001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;


import chatty.myself.res_waiterv001.adapter.TableGridViewAdapter;
import chatty.myself.res_waiterv001.model.showmodel.ShowChatty;

/**
 * Created by Pramoda Fernando on 4/15/2015.
 */

@EActivity(R.layout.activity_tableview)
public class TableViewActivity extends Activity {

    @ViewById
    GridView gridView1;

    @Bean
    TableGridViewAdapter tableGridViewAdapter;

    public TableViewActivity() {

    }

    @AfterViews
    void initView() {

        gridView1.setAdapter(tableGridViewAdapter);

        tableGridViewAdapter.setOnTableViewClickListner(new TableGridViewAdapter.TableViewClickListner() {
            @Override
            public void onClick(ShowChatty showChatty, View view) {
                Intent intent = new Intent(TableViewActivity.this, HomePageActivity_.class);

//                Log.v("VALUE", showChatty.getName()+ "");
//                intent.putExtra("suggestid",showAlert.getSuggestId());
//                intent.putExtra("name",showAlert.getName());
//                intent.putExtra("age",showAlert.getAge());
//                intent.putExtra("url",showAlert.getUrl());`

                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View rootView = inflater.inflate(R.layout.activity_tableview, container, false);
//
//        activity=this;
//        gridView1 = (GridView) rootView.findViewById(R.id.gridView1);
//        tableGridViewAdapter = new TableGridViewAdapter(this, R.layout.row_table);
//        gridView1.setAdapter(tableGridViewAdapter);
//
//        // Inflate the layout for this fragment
//
//        gridView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent = new Intent(activity, SelectUnitPageActivity_.class);
//                startActivity(intent);
//            }
//        });
//
//
//
//        return rootView;
//    }

//    @Override
//    public void onAttach(Activity activity) {
//        super.onAttach(activity);
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//    }
//
//    @Override
//    public void onActivityCreated(Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//    }
}
