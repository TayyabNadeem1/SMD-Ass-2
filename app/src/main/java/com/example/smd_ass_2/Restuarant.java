package com.example.smd_ass_2;

import android.os.Parcel;
import android.os.Parcelable;

public class Restuarant implements Parcelable {
    private String name;
    private String location;
    private String phone;
    private String description;
    private String rating;

    public Restuarant() {
    }
    public Restuarant(String name, String location, String phone, String description, String rating) {
        this.name = name;
        this.location = location;
        this.phone = phone;
        this.description = description;
        this.rating = rating;
    }

    protected Restuarant(Parcel in) {
        name = in.readString();
        location = in.readString();
        phone = in.readString();
        description = in.readString();
        rating = in.readString();
    }

    public static final Creator<Restuarant> CREATOR = new Creator<Restuarant>() {
        @Override
        public Restuarant createFromParcel(Parcel in) {
            return new Restuarant(in);
        }

        @Override
        public Restuarant[] newArray(int size) {
            return new Restuarant[size];
        }
    };

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(location);
        dest.writeString(phone);
        dest.writeString(description);
        dest.writeString(rating);
    }

    @Override
    public int describeContents() {
        return 0;
    }
}
