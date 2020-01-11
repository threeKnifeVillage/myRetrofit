package com.example.musically.myretrofit;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

/**
 * <pre>
 *     author : 王磊
 *     time   : 2019/10/15
 *     version: 1.0
 * </pre>
 */
public class Retrofit {

    private final okhttp3.Call.Factory callFactory;
    private final HttpUrl baseUrl;
    private final List<Converter.Factory> convertFactories;
    private final List<CallAdapter.Factory> adapterFactories;
    private final Executor callbackExecutor;
    private final boolean validateEagerly;


    Retrofit(okhttp3.Call.Factory callFactory, HttpUrl baseUrl,
             List<Converter.Factory> converterFactories, List<CallAdapter.Factory> adapterFactories,
             Executor callbackExecutor, boolean validateEagerly) {
        this.callFactory = callFactory;
        this.baseUrl = baseUrl;
        this.convertFactories = converterFactories;
        this.adapterFactories = adapterFactories;
        this.callbackExecutor = callbackExecutor;
        this.validateEagerly = validateEagerly;
    }

    public static final class Builder {
        private Platform platform;
        private okhttp3.Call.Factory callFactory;
        private HttpUrl baseUrl;
        private List<Converter.Factory> convertFactories = new ArrayList<>();
        private List<CallAdapter.Factory> adapterFactories = new ArrayList<>();
        private Executor callbackExecutor;
        private boolean validateEagerly;

        public Builder() {
            this(Platform.get());
        }

        public Builder(Platform platform) {
            this.platform = platform;
        }

        public Retrofit build() {
            if (baseUrl == null) {
                throw new IllegalArgumentException(("Base URL required"));
            }

            okhttp3.Call.Factory callFactory = this.callFactory;
            if (callFactory == null) {
                callFactory = new OkHttpClient();
            }

            Executor callbackExecutor = this.callbackExecutor;
            if (callbackExecutor == null) {
                callbackExecutor = platform.defaultCallbackExecutor();
            }
            List<CallAdapter.Factory> adapterFactories = new ArrayList<>(this.adapterFactories);
            adapterFactories.add()

            List<Converter.Factory> convertFactories = new ArrayList<>(this.convertFactories);
            return new Retrofit(callFactory, baseUrl)
        }
    }
}
