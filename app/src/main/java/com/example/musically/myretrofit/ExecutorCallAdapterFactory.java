package com.example.musically.myretrofit;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/**
 * <pre>
 *     author : 王磊
 *     time   : 2020-01-11
 *     desc   :
 *     version: 1.0
 * </pre>
 */
class ExecutorCallAdapterFactory extends CallAdapter.Factory {
    final Executor callbackExecutor;

    public ExecutorCallAdapterFactory(Executor callbackExecutor) {
        this.callbackExecutor = callbackExecutor;
    }

    @Override public CallAdapter<?> get(Type var1, Annotation[] var2, Retrofit var3) {
        return null;
    }
}
