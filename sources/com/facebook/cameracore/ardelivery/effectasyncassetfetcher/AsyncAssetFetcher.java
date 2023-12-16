package com.facebook.cameracore.ardelivery.effectasyncassetfetcher;

import X.C162477s9;
import X.C192449Ju;
import X.C201899l2;
import X.C202249ld;
import android.os.Build;
import com.facebook.cameracore.ardelivery.effectasyncassetfetcher.listener.OnAsyncAssetFetchCompletedListener;
import com.facebook.cameracore.ardelivery.listener.CancelableToken;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import java.util.Collections;
import java.util.List;

public class AsyncAssetFetcher {
    public static final String TAG = "AsyncAssetFetcher";
    public final List mAsyncAssets;
    public final String mEffectId;
    public final String mEffectInstanceId;
    public final C201899l2 mFetchCallback;
    public HybridData mHybridData;
    public final boolean mIsLoggingDisabled;

    private native HybridData initHybrid();

    public CancelableToken fetchAsyncAsset(String str, String str2, String str3, int i, int i2, int i3, OnAsyncAssetFetchCompletedListener onAsyncAssetFetchCompletedListener) {
        C162477s9.A09(TAG, "fetch asset async but AsyncAssetFetchCallback is null.");
        onAsyncAssetFetchCompletedListener.onAsyncAssetFetchCompleted((String) null, "No AsyncAssetFetchCallback. Abort.");
        return new CancelableLoadToken((C202249ld) null);
    }

    public static ARAssetType fromAsyncAssetType(C192449Ju r1) {
        if (r1 == C192449Ju.Remote) {
            return ARAssetType.REMOTE;
        }
        if (r1 == C192449Ju.Block || r1 == C192449Ju.ShareableBlock || r1 == C192449Ju.ExternalBlock) {
            return ARAssetType.ASYNC;
        }
        return null;
    }

    public List getAsyncAssets() {
        List list = this.mAsyncAssets;
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }

    public AsyncAssetFetcher(String str, String str2, List list, C201899l2 r6, boolean z) {
        HybridData hybridData;
        this.mEffectId = str;
        this.mEffectInstanceId = str2;
        this.mAsyncAssets = list;
        this.mFetchCallback = r6;
        this.mIsLoggingDisabled = z;
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            SoLoader.A06("ard-android-async-asset-fetcher");
            hybridData = initHybrid();
        } else {
            hybridData = null;
        }
        this.mHybridData = hybridData;
    }
}
