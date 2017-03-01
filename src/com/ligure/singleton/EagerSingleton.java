package com.ligure.singleton;

/**
 * Created by Administrator on 2017/2/24.
 */
public class EagerSingleton  {
    private static EagerSingleton  instance = new EagerSingleton ();
    private EagerSingleton () {}
    public static EagerSingleton  getInstance() {
        return instance;
    }
}
