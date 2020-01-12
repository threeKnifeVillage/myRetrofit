package com.example.musically.myretrofit;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/**
 * <pre>
 *     author : 王磊
 *     time   : 2020-01-12
 *     desc   :
 *     version: 1.0
 * </pre>
 */
final class DefaultCallAdapterFactory extends CallAdapter.Factory {
    static final CallAdapter.Factory INSTANCE = new DefaultCallAdapterFactory();

    @Override public CallAdapter<?> get(Type returnType, Annotation[] annotations, Retrofit retrofit) {
        return null;
    }
}
