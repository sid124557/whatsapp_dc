package com.facebook.cameracore.ardelivery.modelcache.versionedmodelcache;

import X.AnonymousClass001;
import X.C18270x1;
import X.C203379nb;
import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VersionedModelCache implements C203379nb {
    public final HybridData mHybridData;

    private native boolean addModelForVersionIfInCache(int i, int i2, String str, String str2);

    private native ModelPathsHolder getModelPathsHolder(int i, int i2);

    public static native HybridData initHybrid(ARDFileCache aRDFileCache, List list);

    public native ModelPathsHolder getModelPathsHolderForLastSavedVersion(int i);

    public native void trimExceptLatestSavedVersion(int i);

    static {
        SoLoader.A06("versioned-model-cache-native-android");
    }

    public VersionedModelCache(ARDFileCache aRDFileCache, List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18270x1.A1K(A0s, ((VersionedCapability) it.next()).getXplatValue());
        }
        this.mHybridData = initHybrid(aRDFileCache, A0s);
    }

    public boolean addModelForVersionIfInCache(int i, String str, String str2, VersionedCapability versionedCapability) {
        return addModelForVersionIfInCache(versionedCapability.getXplatValue(), i, str, str2);
    }

    public ModelPathsHolder getModelPathsHolder(VersionedCapability versionedCapability, int i) {
        return getModelPathsHolder(versionedCapability.getXplatValue(), i);
    }

    public ModelPathsHolder getModelPathsHolderForLastSavedVersion(VersionedCapability versionedCapability) {
        return getModelPathsHolderForLastSavedVersion(versionedCapability.getXplatValue());
    }

    public void trimExceptLatestSavedVersion(VersionedCapability versionedCapability) {
        versionedCapability.getClass();
        trimExceptLatestSavedVersion(versionedCapability.getXplatValue());
    }
}
