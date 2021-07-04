package com.example.StatistikCovid.Data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetCovid {


    @SerializedName("data")
    public RawCovid dataraw;

    public class RawCovid {
        @SerializedName("content")
        public List<DataCovid> datacovid;
    }

    public class DataCovid {
        @SerializedName("tanggal")
        public String tanggal;
        @SerializedName("CONFIRMATION")
        public String confirmation;
        @SerializedName("confirmation_selesai")
        public String sembuh;

        @SerializedName("confirmation_meninggal")
        public String meninggal;
    }
}
