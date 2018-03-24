package developersudhanshu.com.delhimeetup;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 24-03-2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    Context mContext;
    List<String> mObjects;
    OnItemClickListener mListener;

    public RecyclerViewAdapter(@NonNull Context context, @NonNull List<String> objects) {
        mContext = context;
        mObjects = objects;
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(mContext, R.layout.list_item_recycler_view, null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.data.setText(mObjects.get(position));

        holder.data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onItemClicked(mObjects.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return mObjects.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        Button data;

        public ViewHolder(View itemView) {
            super(itemView);

            data = itemView.findViewById(R.id.btn_list_item);
        }
    }

    public interface OnItemClickListener{
        void onItemClicked(String data);
    }
}
