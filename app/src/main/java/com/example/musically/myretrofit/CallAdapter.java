package com.example.musically.myretrofit;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/**
 * <pre>
 *     author : 王磊
 *     time   : 2019/10/15
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public interface CallAdapter<T> {
    Type responseType();

    T adapter(Call<R> call);

    abstract class Factory {
        public Factory() {
        }

        public abstract CallAdapter<?> get(Type var1, Annotation[] var2, Retrofit var3);
    }
}
