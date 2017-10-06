package geskep.com.abc.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import geskep.com.abc.R;

/**
 * Created by User on 10/5/2017.
 */

public class MyAdapter  extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    String [] mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTitle;

        public ViewHolder(View view) {
            super(view);
            mTitle = (TextView) view.findViewById(R.id.title);
        }
    }

    public MyAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View rootView =  LayoutInflater.from(parent.getContext()).inflate(R.layout.card_paragraph, parent, false);

        ViewHolder vh = new ViewHolder(rootView);

        return vh;
    }


    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.mTitle.setText(mDataset[position]);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
