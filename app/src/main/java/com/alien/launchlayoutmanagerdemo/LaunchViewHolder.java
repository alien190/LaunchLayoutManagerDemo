package com.alien.launchlayoutmanagerdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.alien.launchlayoutmanagerdemo.custom.LaunchItemView;
import com.alien.launchlayoutmanagerdemo.model.Launch;


public class LaunchViewHolder extends RecyclerView.ViewHolder {
    private View mView;


    public LaunchViewHolder(View view) {
        super(view);
        mView = view;
    }

    public void bind(Launch launch) {
        if (mView instanceof LaunchItemView) {
            LaunchItemView launchItemView = (LaunchItemView) mView;
            mFlightNumber = launch.getFlight_number();
            launchItemView.getAnimationHelper().setTransitionName("TransitionName" + String.valueOf(mFlightNumber));
            launchItemView.setMissionIconBitmap(DbBitmapUtility.getImage(launch.getImage()));
            launchItemView.setMissionName(launch.getMission_name());
            launchItemView.setDetails(launch.getDetails());
            launchItemView.setLaunchDate(mConverter.getTimeText(launch.getLaunch_date_utc()));
            launchItemView.setTransitionName(String.valueOf(launch.getFlight_number()));
            mClickCallback = clickListener;
            launchItemView.setOnClickListener(mOnClickListener);
        }
    }

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (mClickCallback != null) {
                View sharedView = null;
                if (mView instanceof LaunchItemView) {
                    sharedView = ((LaunchItemView) mView).getAnimationHelper();
                }
                mClickCallback.onItemClick(mFlightNumber, sharedView);
            }
        }
    };
}
