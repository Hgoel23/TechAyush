package com.example.kalya.harsh;

/**
 * Created by kalya on 6/5/2018.
 */

public class UploadforEvents {
    private String Name;
    private String Url,Url1;


    public UploadforEvents() {

    }
    public UploadforEvents(String name, String url, String url1) {
        if (name.trim().equals("")) {
            name = "no name";
        }

        Name = name;
        Url = url;
        Url1 = url1;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;

    }

    public String getUrl(){
        return Url;
    }
    public void setUrl(String url){
        Url = url;
    }


    public String getUrl1(){
        return Url1;
    }
    public void setUrl1(String url1){
        Url1 = url1;
    }





}