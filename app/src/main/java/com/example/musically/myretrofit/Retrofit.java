package com.example.musically.myretrofit;

import java.util.List;
import java.util.concurrent.Executor;

import okhttp3.HttpUrl;

/**
 * <pre>
 *     author : 王磊
 *     time   : 2019/10/15
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class Retrofit {

    private final okhttp3.Call.Factory callFactory;


    Retrofit(okhttp3.Call.Factory callFactory, HttpUrl baseUrl,
             List<Converter.Factory> converterFactories, List<CallAdapter.Factory> adapterFactories,
             Executor callbackExecutor, boolean validateEagerly) {
        this.callFactory = callFactory;

    }

    public static final class Builder {

    }
}
