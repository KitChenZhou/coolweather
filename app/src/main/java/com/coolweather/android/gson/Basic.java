package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by D22395 on 2017/9/20.
 *
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    private class Update {

        @SerializedName("loc")
        public String updateTime;
    }

}
