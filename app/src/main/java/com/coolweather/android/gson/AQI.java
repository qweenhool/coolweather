package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by qweenhool on 2017/1/28.
 */

public class AQI {

    @SerializedName("city")
    public AQICity city;

    public class AQICity {

        public String aqi;

        public String pm25;
    }
}
