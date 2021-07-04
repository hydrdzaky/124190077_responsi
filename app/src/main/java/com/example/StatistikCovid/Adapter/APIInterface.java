package com.example.StatistikCovid.Adapter;

import com.example.StatistikCovid.Data.*;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("/api/v1/rekapitulasi_v2/jabar/harian")
    Call<GetCovid> getResources();

    @GET("/api/v1/sebaran_v2/jabar/faskes")
    Call<GetRumahSakit> getRumahSakit();
    //Call<getRepository> getRepositoryResources();

   // @FormUrlEncoded
    //@POST("repository")
    //Call<editRepository> post(@Field("nama") String nama,
                                        //@Field("nomor") String nomor);
    //@FormUrlEncoded
    //@PUT("kontak")
    //Call<editRepository> putKontak(@Field("id") String id,
                                     //@Field("nama") String nama,
                                     //@Field("nomor") String nomor);
    //@FormUrlEncoded
    //@HTTP(method = "DELETE", path = "kontak", hasBody = true)
    //Call<editRepository> deleteKontak(@Field("id") String id);
}
