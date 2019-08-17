package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

/**
 * Created by Suye on ${Date}
 */
public class Province extends LitePalSupport {
    private int id;
    private String provinceName;
    private int proviceCode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id =id;
    }
    public void getProvinceName(String provinceName){
        this.provinceName = provinceName;
    }
    public void setProviceCode(int proviceCode){
        this.proviceCode = proviceCode;
    }
}
