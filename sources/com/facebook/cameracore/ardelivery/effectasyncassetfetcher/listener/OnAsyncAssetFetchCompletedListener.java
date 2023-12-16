package com.facebook.cameracore.ardelivery.effectasyncassetfetcher.listener;

import X.C162457s7;
import X.C192509Ki;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public abstract class OnAsyncAssetFetchCompletedListener {
    public static final C192509Ki Companion = new C192509Ki();
    public final HybridData mHybridData;

    public OnAsyncAssetFetchCompletedListener(HybridData hybridData) {
        C162457s7.A0J(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public abstract void onAsyncAssetFetchCompleted(String str, String str2);

    static {
        SoLoader.A06("ard-android-async-asset-fetcher-listener");
    }
}
