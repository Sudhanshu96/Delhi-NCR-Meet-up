package developersudhanshu.com.delhimeetup;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by HP on 24-03-2018.
 */

public class ListFragment extends Fragment {

    RecyclerView listRecyclerView;
    List<String> list;
    RecyclerViewAdapter adapter;

    public ListFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list, null,false);

        listRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view_list);

        // Getting the data items to be displayed
        String[] listData = getResources().getStringArray(R.array.mock_data);
        list =  Arrays.asList(listData);

        // Creating an adapter
        adapter = new RecyclerViewAdapter(getContext(), list);

        adapter.setOnItemClickListener(new RecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClicked(String data) {
                if (getContext().getResources().getBoolean(R.bool.is_landscape)) {
                    ((FragmentActivity)getActivity()).onClicked(data);
                } else {
                    Intent intent = new Intent(getContext(), DataDisplayActivity.class);
                    intent.putExtra(Constants.INTENT_EXTRA_KEY, data);
                    startActivity(intent);
                }
            }
        });

        // Setting up the adapter to the recycler view
        listRecyclerView.setAdapter(adapter);

        // Setting up the orientation of the Recycler View
        listRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return rootView;
    }
}
