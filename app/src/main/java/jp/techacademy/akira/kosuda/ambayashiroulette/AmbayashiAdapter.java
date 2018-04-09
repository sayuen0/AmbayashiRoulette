package jp.techacademy.akira.kosuda.ambayashiroulette;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by aki on 2018/04/08.
 */

public class AmbayashiAdapter extends RecyclerView.Adapter<AmbayashiViewHolder> {
    private ArrayList<AmbayashiData> rouletteDataSet;

    public AmbayashiAdapter(ArrayList<AmbayashiData> rourette){
        this.rouletteDataSet=rourette;
    }


    @Override
    public AmbayashiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout,parent,false);

        return new AmbayashiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AmbayashiViewHolder holder,  final int listPosition) {

        holder.textViewNumber.setText(rouletteDataSet.get(listPosition).getNumber()+"本");
        holder.textViewComment.setText(rouletteDataSet.get(listPosition).getComment());
        holder.base.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(),"おまけ"+rouletteDataSet.get(listPosition).getAddition()+"本",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return rouletteDataSet.size();
    }
}
