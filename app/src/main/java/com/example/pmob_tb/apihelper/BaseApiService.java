package com.example.pmob_tb.apihelper;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface BaseApiService {
    // Fungsi ini untuk memanggil API api/login/dosen
    @FormUrlEncoded
    @POST("api/login/dosen")
    Call<ResponseBody> loginRequest(@Field("username") String username,
                                    @Field("password") String password);

//    // Fungsi ini untuk memanggil API http://10.0.2.2/mahasiswa/register.php
//    @FormUrlEncoded
//    @POST("register.php")
//    Call<ResponseBody> registerRequest(@Field("nama") String nama,
//                                       @Field("email") String email,
//                                       @Field("password") String password);
}
