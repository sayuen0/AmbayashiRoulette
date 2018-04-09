package jp.techacademy.akira.kosuda.ambayashiroulette;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.cardlist);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<AmbayashiData> ambayashi = new ArrayList<AmbayashiData>();
        for(int i = 0; i<MyData.commentArray.length;i++){
            ambayashi.add(new AmbayashiData(
                    MyData.numberArray[i],
                    MyData.additionArray[i],
                    MyData.commentArray[i]
            ));
        }

        RecyclerView.Adapter adapter = new AmbayashiAdapter(ambayashi);
        recyclerView.setAdapter(adapter);
        recyclerView.smoothScrollToPosition(ambayashi.size()-1);
    }
}
