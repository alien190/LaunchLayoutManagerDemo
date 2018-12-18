package com.alien.launchlayoutmanagerdemo;

public class Launch {
    private String mission_name;
    private String details;
    private String launch_date_utc;
    private byte[] image;

    public Launch() {
    }

    public String getMission_name() {
        return mission_name;
    }

    public void setMission_name(String mission_name) {
        this.mission_name = mission_name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getLaunch_date_utc() {
        return launch_date_utc;
    }

    public void setLaunch_date_utc(String launch_date_utc) {
        this.launch_date_utc = launch_date_utc;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
