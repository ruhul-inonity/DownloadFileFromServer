package com.inonitylab.downloadfilefromserver.network;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Streaming;

/**
 * Created by ruhul on 4/8/18.
 */

public interface RetrofitApiInterface {
    //http://dropbox.sandbox2000.com/
    @GET("intrvw/SampleVideo_1280x720_30mb.mp4")
    @Streaming
    Call<ResponseBody> downloadFile();
}
