package com.example.kalya.harsh;

/**
 * Created by kalya on 6/5/2018.
 */

public class Upload {
    private String Name;
    private String Url;
    private String Exp;
    private String Spl;
    private String Phno;
    public Upload(){

    }
    public Upload(String name, String url , String exp, String spl,String phno){
        if (name.trim().equals("")){
            name = "no name";
        }

        Name = name;
        Url = url;
        Exp = exp;
        Spl = spl;
        Phno = phno;
    }
    public String getName()
    {
        return Name;
    }
    public void setmName(String name){
        Name = name;

    }







    public String getExp()
    {
        return Exp;
    }
    public void setExp(String exp){
        Exp = exp;
    }





    public String getPhno()
    {
        return Phno;
    }
    public void setPhno(String phno){
        Phno = phno;
    }







    public String getSpl()
    {
        return Spl;
    }
    public void setSpl(String spl){
        Spl = spl;
    }







    public String getUrl(){
        return Url;
    }
    public void setUrl(String url){
        Url = url;
    }
}
