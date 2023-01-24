package haqnawaz.org.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Friend> friendsList = new ArrayList<>();
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Friend f0 = new Friend(1,"Asad", 1980, "Giglgit",R.drawable.d);
        Friend f1 = new Friend(2,"Zubair", 1981, "Lahore",R.drawable.c);
        Friend f2 = new Friend(3,"Musa", 1980, "Quetta",R.drawable.b);
        Friend f3 = new Friend(4,"Nadeem",1987,"Peshawar",R.drawable.a);
        Friend f4 = new Friend(5,"Shahid", 1980, "Karachi",R.drawable.c);
        Friend f5 = new Friend(6,"Zia",1987,"Faisalabad ",R.drawable.a);
        Friend f6 = new Friend(7,"Badar", 1980, "Rawalpindi",R.drawable.d);
        Friend f7 = new Friend(8,"Hashim",1997,"Karachi",R.drawable.b);
        Friend f8 = new Friend(9,"Salman",1980,"Quetta",R.drawable.c);
        Friend f9 = new Friend(10,"Rizwan",1982,"Kasur",R.drawable.d);
        Friend f10 = new Friend(11,"Junaid",1977,"Islamabad",R.drawable.a);
        Friend f11 = new Friend(12,"Waseem",1967,"Rawalpindi",R.drawable.b);

        friendsList.addAll(Arrays.asList(new Friend[]{f0,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11}));
        recyclerView = findViewById(R.id.recylerViewStudent);


        recyclerView.setHasFixedSize(true);

        //LinearLayoutManager GridLayoutManager
        layoutManager = new LinearLayoutManager(MainActivity.this);
//        layoutManager = new LinearLayoutManager(MainActivity.this,
//                LinearLayoutManager.HORIZONTAL,
//                true);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new myRecyclerViewAdapter(friendsList) ;
        recyclerView.setAdapter(adapter);
        //adapter.notifyDataSetChanged();


    }
}
