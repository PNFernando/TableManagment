package chatty.myself.res_waiterv001;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import chatty.myself.res_waiterv001.adapter.EditOrderListViewAdapter;
import chatty.myself.res_waiterv001.adapter.ItemListViewAdapter;


@EFragment(R.layout.fragment_order_edit_dialog)
public class OrderEditDialog extends android.app.DialogFragment{


    @Bean
    EditOrderListViewAdapter editOrderListViewAdapter;


    @ViewById
    ListView editOrderListView;

    @AfterViews
    void afterView() {
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        LayoutInflater inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        editOrderListView.setAdapter(editOrderListViewAdapter);
        //ImageButton selectButton = (ImageButton) header.findViewById(R.id.btnSelect);
    }

    @Click
    void btn_edit() {

        this.dismiss();
    }

    @Click
    void btn_delete() {

        this.dismiss();
    }
}
