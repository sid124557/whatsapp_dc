package com.facebook.cameracore.ardelivery.effectasyncassetfetcher.listener;

import X.AnonymousClass9Kj;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public final class OnAsyncAssetFetchCompletedListenerImpl extends OnAsyncAssetFetchCompletedListener {
    public static final AnonymousClass9Kj Companion = new AnonymousClass9Kj();

    public native void onAsyncAssetFetchCompleted(String str, String str2);

    static {
        SoLoader.A06("ard-android-async-asset-fetcher-listener");
    }

    public OnAsyncAssetFetchCompletedListenerImpl(HybridData hybridData) {
        super(hybridData);
    }
}
