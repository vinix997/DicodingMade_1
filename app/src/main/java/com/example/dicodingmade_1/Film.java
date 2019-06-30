package com.example.dicodingmade_1;

import android.os.Parcel;
import android.os.Parcelable;

public class Film implements Parcelable {
    private int image;
    private String title;
    private String date;
    private String description;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.image);
        dest.writeString(this.title);
        dest.writeString(this.date);
        dest.writeString(this.description);
    }

    public Film() {
    }

    protected Film(Parcel in) {
        this.image = in.readInt();
        this.title = in.readString();
        this.date = in.readString();
        this.description = in.readString();
    }

    public static final Parcelable.Creator<Film> CREATOR = new Parcelable.Creator<Film>() {
        @Override
        public Film createFromParcel(Parcel source) {
            return new Film(source);
        }

        @Override
        public Film[] newArray(int size) {
            return new Film[size];
        }
    };
}
