package Essentials;

import java.util.HashMap;

public class IDandPasswords {
    //Creating a hashmap
    HashMap<String,String> logininfo=new HashMap<String,String>();
    IDandPasswords(){
        logininfo.put("Bro","pizza");
        logininfo.put("Prometheus","PASSWORD");
        logininfo.put("Benir","Astra1");
    }
    protected HashMap getLoginInfo(){
        return logininfo;
    }


}
