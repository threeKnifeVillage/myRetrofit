package com.example.musically.myretrofit;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.concurrent.Executor;

/**
 * <pre>
 *     author : 王磊
 *     time   : 2019/10/16
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class Platform {
    private static final Platform PLATFORM = findPlatform();

    private static Platform findPlatform() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new Android();
            }
        } catch (ClassNotFoundException ignored) {

        }
        return new Platform();
    }

    public static Platform get() {
        return PLATFORM;
    }

    Executor defaultCallbackExecutor() {
        return null;
    }

    CallAdapter.Factory defaultCallAdapterFactory(@Nullable Executor callbackExecutor) {
        return callbackExecutor != null ? new ExecutorCallAdapterFactory(callbackExecutor) : DefaultCallAdapterFactory.INSTANCE;
    }


    static class Android extends Platform {

        Executor defaultCallbackExecutor() {
            return new Platform.Android.MainThreadExecutor();
        }

        CallAdapter.Factory defaultCallAdapterFactory(Executor callbackExecutor) {
            return new ExecutorCallAdapterFactory(callbackExecutor);
        }

        static class MainThreadExecutor implements Executor {
            private Handler mHandler = new Handler(Looper.getMainLooper());

            @Override
            public void execute(@NonNull Runnable command) {
                mHandler.post(command);
            }
        }
    }
}
