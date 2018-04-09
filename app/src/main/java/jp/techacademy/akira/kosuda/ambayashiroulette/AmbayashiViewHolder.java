package jp.techacademy.akira.kosuda.ambayashiroulette;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by aki on 2018/04/08.
 */

public class AmbayashiViewHolder extends RecyclerView.ViewHolder {
    View base;
    TextView textViewNumber;
    TextView textViewComment;

    public  AmbayashiViewHolder(View v){
        super(v);
        this.base=v;
        this.textViewNumber = (TextView) v.findViewById(R.id.number);
        this.textViewComment = (TextView) v.findViewById(R.id.comment);
    }
}
