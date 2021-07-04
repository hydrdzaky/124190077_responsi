package com.example.StatistikCovid.Data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetRumahSakit {


    @SerializedName("status_code")
    public String status;

    @SerializedName("data")
    public List<DataRS> datars;

    public class DataRS {
        @SerializedName("nama")
        public String nama;
        @SerializedName("alamat")
        public String alamat;
        @SerializedName("longtitude")
        public String longtitude;
        @SerializedName("latitude")
        public String latitude;
    }
}
