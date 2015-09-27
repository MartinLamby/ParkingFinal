package com.example.martinlamby.parking;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by martinlamby on 16.09.15.
 */

//TODO: COMMENTS ARE MISSING

public class ParkedCarLocation implements Parcelable{

    private double latitude;
    private double longitude;
    private String username;


    public ParkedCarLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    protected ParkedCarLocation(Parcel in) {
        latitude = in.readDouble();
        longitude = in.readDouble();
        username = in.readString();
    }

    public static final Creator<ParkedCarLocation> CREATOR = new Creator<ParkedCarLocation>() {
        @Override
        public ParkedCarLocation createFromParcel(Parcel in) {
            return new ParkedCarLocation(in);
        }

        @Override
        public ParkedCarLocation[] newArray(int size) {
            return new ParkedCarLocation[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(latitude);
        dest.writeDouble(longitude);
        dest.writeString(username);
    }
}
