package com.example.musically.myretrofit;

import android.os.Build;

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
}
