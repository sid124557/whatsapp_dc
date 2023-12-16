package com.facebook.cameracore.ardelivery.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C162477s9;
import X.C18310x6;
import X.C192479Jx;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.HashMap;
import java.util.Map;

public class ModelPathsHolder {
    public static final String TAG = "ModelPathsHolder";
    public static final int UNKNOWN_VERSION = -1;
    public final VersionedCapability mCapability;
    public final Map mModelPaths;
    public final int mVersion;

    public String getModelPath(C192479Jx r5) {
        String A0o = C18310x6.A0o(r5, this.mModelPaths);
        if (A0o == null) {
            C162477s9.A09(TAG, StringFormatUtil.formatStrLocaleSafe("Failed to get model path for model asset type: %s, for capability: %s", r5.name(), this.mCapability.name()));
        }
        return A0o;
    }

    public boolean modelPathsExists(C192479Jx r2) {
        return this.mModelPaths.containsKey(r2);
    }

    public ModelPathsHolder(VersionedCapability versionedCapability, int i, Map map) {
        this.mCapability = versionedCapability;
        this.mVersion = i;
        this.mModelPaths = map;
    }

    public static ModelPathsHolder create(int i, int i2, int[] iArr, String[] strArr) {
        HashMap A0t = AnonymousClass001.A0t();
        for (int i3 = 0; i3 < iArr.length; i3++) {
            A0t.put(C192479Jx.values()[iArr[i3]], strArr[i3]);
        }
        return new ModelPathsHolder(VersionedCapability.fromXplatValue(i), i2, A0t);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ModelPathsHolder{mCapability=");
        A0o.append(this.mCapability);
        A0o.append(", mVersion=");
        A0o.append(this.mVersion);
        A0o.append(", mModelPaths=");
        return AnonymousClass000.A0Q(this.mModelPaths, A0o);
    }

    public VersionedCapability getCapability() {
        return this.mCapability;
    }

    public int getVersion() {
        return this.mVersion;
    }
}
