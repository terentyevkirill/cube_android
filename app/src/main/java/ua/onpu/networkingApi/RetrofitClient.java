package ua.onpu.networkingApi;

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class RetrofitClient {

    private static final String BASE_URL = "http:/test";

    private static Retrofit retrofit;

    public static synchronized Retrofit getInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(MoshiConverterFactory.create())
                    .addCallAdapterFactory(CoroutineCallAdapterFactory.create())
                    .build();
        }
        return retrofit;
    }
}