package com.example.ahmedel_feky.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ahmed El_feky on 02/24/2018.
 */

public class wordsAdabter extends ArrayAdapter<words> {
    public wordsAdabter(Activity context, ArrayList<words>words){
        super(context,0,words);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listview=convertView;
        if(listview==null){
            listview= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        words currentword=getItem(position);
        TextView miwoktextveiw=(TextView)listview.findViewById(R.id.miwok_text_veiw);
        miwoktextveiw.setText(currentword.getMmiwoktranslation());
        ///
        TextView defaulttextview=(TextView)listview.findViewById(R.id.default_text_veiw);
        defaulttextview.setText(currentword.getMdefaultetranslation());
        return listview;
    }
}
