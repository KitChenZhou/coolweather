package com.coolweather.android.gson;

/**
 * Created by D22395 on 2017/9/20.
 *
 */

public class AQI {

    public AQICity city;

    private class AQICity {
        public String aqi;
        public String pm25;
    }

}
