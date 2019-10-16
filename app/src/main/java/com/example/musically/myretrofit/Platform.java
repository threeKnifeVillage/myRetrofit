package com.example.musically.myretrofit;

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

    }

    public static Platform get() {
        return PLATFORM;
    }
}
