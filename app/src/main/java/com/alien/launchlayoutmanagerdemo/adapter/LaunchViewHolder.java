package com.alien.launchlayoutmanagerdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.alien.launchlayoutmanagerdemo.custom.LaunchItemView;
import com.alien.launchlayoutmanagerdemo.model.Launch;
import com.alien.launchlayoutmanagerdemo.utils.DbBitmapUtility;


public class LaunchViewHolder extends RecyclerView.ViewHolder {
    private View mView;


    public LaunchViewHolder(View view) {
        super(view);
        mView = view;
    }

    public void bind(Launch launch) {
        if (mView instanceof LaunchItemView) {
            LaunchItemView launchItemView = (LaunchItemView) mView;
            launchItemView.setMissionIconBitmap(DbBitmapUtility.getImage(launch.getImage()));
            launchItemView.setMissionName(launch.getMission_name());
            launchItemView.setDetails(launch.getDetails());
            launchItemView.setLaunchDate(launch.getLaunch_date_utc());
        }
    }
}
