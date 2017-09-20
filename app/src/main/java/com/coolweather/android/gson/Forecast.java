package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by D22395 on 2017/9/20.
 *
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    private class Temperature {
        public String max;
        public String min;
    }

    private class More {
        @SerializedName("txt_d")
        public String info;
    }



}
