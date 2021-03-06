package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by D22395 on 2017/9/20.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    @SerializedName("uv")
    public UV uv;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }

    public class UV {
        public String strength;
        @SerializedName("txt")
        public String info;
    }

}
