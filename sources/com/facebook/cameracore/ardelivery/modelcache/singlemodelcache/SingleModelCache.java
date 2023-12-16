package com.facebook.cameracore.ardelivery.modelcache.singlemodelcache;

import X.C18260x0;
import X.C192539Km;
import X.C203379nb;
import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public final class SingleModelCache implements C203379nb {
    public static final C192539Km Companion = new C192539Km();
    public final HybridData mHybridData;
    public final ModelPathsHolder modelPathsHolderForLastSavedVersion;

    public static final native HybridData initHybrid(int i, ARDFileCache aRDFileCache);

    public final native boolean addModelForVersionIfInCache(int i, String str, String str2);

    public final native ModelPathsHolder getModelPathsHolder(int i);

    public final native ModelPathsHolder getModelPathsHolderForLastSavedVersion();

    public final native void trimExceptLatestSavedVersion();

    static {
        SoLoader.A06("single-model-cache-native-android");
    }

    public SingleModelCache(VersionedCapability versionedCapability, ARDFileCache aRDFileCache) {
        C18260x0.A0Q(versionedCapability, aRDFileCache);
        this.mHybridData = initHybrid(versionedCapability.getXplatValue(), aRDFileCache);
    }

    public boolean addModelForVersionIfInCache(int i, String str, String str2, VersionedCapability versionedCapability) {
        C18260x0.A0Q(str, str2);
        return addModelForVersionIfInCache(i, str, str2);
    }

    public ModelPathsHolder getModelPathsHolder(VersionedCapability versionedCapability, int i) {
        return getModelPathsHolder(i);
    }

    public ModelPathsHolder getModelPathsHolderForLastSavedVersion(VersionedCapability versionedCapability) {
        return getModelPathsHolderForLastSavedVersion();
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public void trimExceptLatestSavedVersion(VersionedCapability versionedCapability) {
        trimExceptLatestSavedVersion();
    }
}
