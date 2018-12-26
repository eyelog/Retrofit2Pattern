package ru.eyelog.retrofit2pattern;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @Headers({
            "Content-type: application/json"
    })
    @POST("createuser/{userId}")
    Call<String> createUser(@Path("userId") Long id, @Body User user);

    @GET("observeridentity")
    Call<User> getUser(@Query("userId") Long userId);
}