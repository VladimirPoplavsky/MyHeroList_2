package com.firstapp.myherolist_2;

public class MyModel {
    Integer imageRes;
    String Name, Details;

    public MyModel(Integer imageRes, String name, String details) {
        this.imageRes = imageRes;
        Name = name;
        Details = details;
    }

    public Integer getImageRes() {
        return imageRes;
    }

    public void setImageRes(Integer imageRes) {
        this.imageRes = imageRes;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }
}
