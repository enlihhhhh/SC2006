package com.example.chasexplorer.Entity;

import android.os.Parcel;
import android.os.Parcelable;

public class Clinic implements Parcelable {

  private String clinicCode;
  private String clinicName;
  private String licenseType;
  private String clinicContact;
  private int postalCode;
  private String addType;
  private String houseNum;
  private String floorNum;
  private String unitNum;
  private String streetName;
  private String buildingName;
  private String programmeCode;
  private double XCoordinate;
  private double YCoordinate;
  private String incCrc;
  private String fmelUpdD;

  public Clinic() {}

  public Clinic(
    String clinicCode,
    String clinicName,
    String licenseType,
    String clinicContact,
    int postalCode,
    String addType,
    String houseNum,
    String floorNum,
    String unitNum,
    String streetName,
    String buildingName,
    String programmeCode,
    double XCoordinate,
    double YCoordinate,
    String incCrc,
    String fmelUpdD
  ) {
    this.clinicCode = clinicCode;
    this.clinicName = clinicName;
    this.licenseType = licenseType;
    this.clinicContact = clinicContact;
    this.postalCode = postalCode;
    this.addType = addType;
    this.houseNum = houseNum;
    this.floorNum = floorNum;
    this.unitNum = unitNum;
    this.streetName = streetName;
    this.buildingName = buildingName;
    this.programmeCode = programmeCode;
    this.XCoordinate = XCoordinate;
    this.YCoordinate = YCoordinate;
    this.incCrc = incCrc;
    this.fmelUpdD = fmelUpdD;
  }

  public String getClinicCode() {
    return clinicCode;
  }

  public void setClinicCode(String clinicCode) {
    this.clinicCode = clinicCode;
  }

  public String getClinicName() {
    return clinicName;
  }

  public void setClinicName(String clinicName) {
    this.clinicName = clinicName;
  }

  public String getLicenceType() {
    return licenseType;
  }

  public void setLicenceType(String licenseType) {
    this.licenseType = licenseType;
  }

  public String getClinicTelNo() {
    return clinicContact;
  }

  public void setClinicTelNo(String clinicContact) {
    this.clinicContact = clinicContact;
  }

  public int getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(int postalCode) {
    this.postalCode = postalCode;
  }

  public String getAddType() {
    return addType;
  }

  public void setAddType(String addType) {
    this.addType = addType;
  }

  public String getBlkHseNo() {
    return houseNum;
  }

  public void setBlkHseNo(String houseNum) {
    this.houseNum = houseNum;
  }

  public String getFloorNo() {
    return floorNum;
  }

  public void setFloorNo(String floorNum) {
    this.floorNum = floorNum;
  }

  public String getUnitNo() {
    return unitNum;
  }

  public void setUnitNo(String unitNum) {
    this.unitNum = unitNum;
  }

  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public String getBuildingName() {
    return buildingName;
  }

  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }

  public String getProgrammeCode() {
    return programmeCode;
  }

  public void setProgrammeCode(String programmeCode) {
    this.programmeCode = programmeCode;
  }

  public double getXCoordinate() {
    return XCoordinate;
  }

  public void setXCoordinate(double XCoordinate) {
    this.XCoordinate = XCoordinate;
  }

  public double getYCoordinate() {
    return YCoordinate;
  }

  public void setYCoordinate(double YCoordinate) {
    this.YCoordinate = YCoordinate;
  }

  public String getIncCrc() {
    return incCrc;
  }

  public void setIncCrc(String incCrc) {
    this.incCrc = incCrc;
  }

  public String getFmelUpdD() {
    return fmelUpdD;
  }

  public void setFmelUpdD(String fmelUpdD) {
    this.fmelUpdD = fmelUpdD;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeString(clinicCode);
    dest.writeString(clinicName);
    dest.writeString(licenseType);
    dest.writeString(clinicContact);
    dest.writeInt(postalCode);
    dest.writeString(addType);
    dest.writeString(houseNum);
    dest.writeString(floorNum);
    dest.writeString(unitNum);
    dest.writeString(streetName);
    dest.writeString(buildingName);
    dest.writeString(programmeCode);
    dest.writeDouble(XCoordinate);
    dest.writeDouble(YCoordinate);
    dest.writeString(incCrc);
  }

  public Clinic(Parcel in) {
    clinicCode = in.readString();
    clinicName = in.readString();
    licenseType = in.readString();
    clinicContact = in.readString();
    postalCode = in.readInt();
    addType = in.readString();
    houseNum = in.readString();
    floorNum = in.readString();
    unitNum = in.readString();
    streetName = in.readString();
    buildingName = in.readString();
    programmeCode = in.readString();
    XCoordinate = in.readDouble();
    YCoordinate = in.readDouble();
    incCrc = in.readString();
    fmelUpdD = in.readString();
  }

  public static final Parcelable.Creator<Clinic> CREATOR = new Parcelable.Creator<Clinic>() {
    public Clinic createFromParcel(Parcel in) {
      return new Clinic(in);
    }

    public Clinic[] newArray(int size) {
      return new Clinic[size];
    }
  };

  @Override
  public String toString() {
    String clinicDetails = new String();
    clinicDetails = getClinicName() + "\nClinic Code: " + getClinicCode();
    if (!(getClinicTelNo().equalsIgnoreCase(" "))) clinicDetails +=
      "\n(+65)" + getClinicTelNo();
    clinicDetails +=
      "\n" + getStreetName() + "\nBlk " + getBlkHseNo() + getAddType();
    if (
      !(getFloorNo().equalsIgnoreCase(" ") && getUnitNo().equalsIgnoreCase(" "))
    ) clinicDetails += " #" + getFloorNo() + "-" + getUnitNo(); else if (
      (getUnitNo().equalsIgnoreCase(" ")) &&
      !(getFloorNo().equalsIgnoreCase(" "))
    ) clinicDetails += " #" + getFloorNo();
    clinicDetails += "\nSingapore " + getPostalCode();
    return clinicDetails;
  }

  public String toString2() {
    String clinicDetails = new String();
    clinicDetails = getClinicName();
    if (!(getClinicTelNo().equalsIgnoreCase(" "))) clinicDetails +=
      "\n(+65)" + getClinicTelNo();
    clinicDetails += "\n" + getStreetName();
    return clinicDetails;
  }
}
