package com.tsa.ecommerce.Retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public final class ApiClient {

    private static final String BASE_URL="https://firebasestorage.googleapis.com/v0/b/dthservice-dc6b2.appspot.com/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {

        if (retrofit==null) {
              Gson gson = new GsonBuilder()
                    .setLenient()
                      .create();

           final OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                    .connectTimeout(5, TimeUnit.SECONDS)
                    .readTimeout(60, TimeUnit.SECONDS)
                    .writeTimeout(60, TimeUnit.SECONDS)
                    .build();


           return retrofit = new Retrofit.Builder()

                    .baseUrl(BASE_URL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }

        return retrofit;

    }

/*
    public static RequestBody plain(String content) {
        return getRequestBody(content);
    }
*/
/*@NonNull
    private static RequestBody plain(@NonNull String content) {
    return getRequestBody(content);
}*/



/*
    @NonNull
    private static RequestBody getRequestBody(@NonNull String content) {
        return RequestBody.create(MediaType.parse("text/plain"), content);
    }
*/

}

