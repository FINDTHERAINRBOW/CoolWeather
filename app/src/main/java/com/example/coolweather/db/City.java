package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

/**
 * Created by Suye on ${Date}
 */
public class City extends LitePalSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int proviceId;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(){
        this.cityName = cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }
    public int getProvinceId(){
        return proviceId;
    }

    public void setProviceId(int proviceId) {
        this.proviceId = proviceId;
    }
}
