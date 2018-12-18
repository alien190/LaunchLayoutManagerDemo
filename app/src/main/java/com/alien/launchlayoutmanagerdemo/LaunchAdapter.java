package com.mobdev.ivanovnv.spaceanalytix.ui.launch;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.alien.launchlayoutmanagerdemo.LaunchViewHolder;
import com.alien.launchlayoutmanagerdemo.R;
import com.alien.launchlayoutmanagerdemo.model.Launch;

import java.util.ArrayList;
import java.util.List;

public class LaunchAdapter extends RecyclerView.Adapter<LaunchViewHolder> {

    private List<Launch> mLaunches = new ArrayList<>();

    public LaunchAdapter() {
    }

    @NonNull
    @Override
    public LaunchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.li_launch, parent, false);
        return new LaunchViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LaunchViewHolder holder, int position) {
        holder.bind(mLaunches.get(position));
    }

    @Override
    public int getItemCount() {
        if (mLaunches != null) {
            return mLaunches.size();
        }
        return 0;
    }

    public void updateLaunches(List<Launch> launches) {
        mLaunches.clear();
        mLaunches.addAll(launches);
        notifyDataSetChanged();
    }

}
