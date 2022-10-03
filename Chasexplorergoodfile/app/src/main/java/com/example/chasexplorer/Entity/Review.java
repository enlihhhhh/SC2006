package com.example.chasexplorer.Entity;

import android.os.Parcel;
import android.os.Parcelable;

public class Review implements Parcelable {

  private float rating;
  private String feedback;
  private String uid;
  private String displayName;
  private String email;
  private String picUrl;
  private String clinicCode;

  public Review() {}

  public Review(
    float rating,
    String feedback,
    String uid,
    String displayName,
    String email,
    String picUrl,
    String clinicCode
  ) {
    this.rating = rating;
    this.feedback = feedback;
    this.uid = uid;
    this.displayName = displayName;
    this.email = email;
    this.picUrl = picUrl;
    this.clinicCode = clinicCode;
  }

  public float getRating() {
    return rating;
  }

  public void setRating(float rating) {
    this.rating = rating;
  }

  public String getFeedbackText() {
    return feedback;
  }

  public void setFeedbackText(String feedback) {
    this.feedback = feedback;
  }

  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhotoUrl() {
    return picUrl;
  }

  public void setPhotoUrl(String picUrl) {
    this.picUrl = picUrl;
  }

  public String getClinicCode() {
    return clinicCode;
  }

  public void setClinicCode(String clinicCode) {
    this.clinicCode = clinicCode;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeFloat(rating);
    dest.writeString(feedback);
    dest.writeString(uid);
    dest.writeString(displayName);
    dest.writeString(email);
    dest.writeString(picUrl);
    dest.writeString(clinicCode);
  }

  public Review(Parcel in) {
    rating = in.readFloat();
    feedback = in.readString();
    uid = in.readString();
    displayName = in.readString();
    email = in.readString();
    picUrl = in.readString();
    clinicCode = in.readString();
  }

  public static final Parcelable.Creator<Review> CREATOR = new Parcelable.Creator<Review>() {
    public Review createFromParcel(Parcel in) {
      return new Review(in);
    }

    public Review[] newArray(int size) {
      return new Review[size];
    }
  };
}
