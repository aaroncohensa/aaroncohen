package com.aaron1.testschedule.model;

public class TournamentModel {

    public int weekNo;
    String name;
    public int tMoney;
    public int tPoints;
    //    int tO1Dist;
//    int tO2Dist;
//    int tO3Dist;
    public int tournid;
    public double longitude;
    public double latitude;

    public int getWeekNo() {
        return weekNo;
    }

    public void setWeekNo(int weekNo) {
        this.weekNo = weekNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int gettMoney() {
        return tMoney;
    }

    public void settMoney(int tMoney) {
        this.tMoney = tMoney;
    }

    public int gettPoints() {
        return tPoints;
    }

    public void settPoints(int tPoints) {
        this.tPoints = tPoints;
    }

    public int getTournid() {
        return tournid;
    }

    public void setTournid(int tournid) {
        this.tournid = tournid;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public TournamentModel(int tournID , int week , String tournName, int prizeMoney , int points , double longi , double latit){
        this.weekNo =week;
        this.name = tournName;
        this.tMoney= prizeMoney;
        this.tPoints= points;
//        this.tO1Dist= tOption1Dist;
////        this.tO2Dist= tOption2Dist;
////        this.tO3Dist= tOption3Dist;
        this.longitude = longi;
        this.latitude = latit;
        this.tournid = tournID;

    }

}
