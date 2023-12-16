package com.facebook.cameracore.ardelivery.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C162477s9;
import X.C192319Jc;
import X.C86664Kz;
import android.util.SparseArray;
import java.util.Map;

public enum VersionedCapability {
    ;
    
    public static final String TAG = "VersionedCapability";
    public static final Map UPPER_STRING_TO_CAPABILITY_MAP = null;
    public static final SparseArray XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP = null;
    public final XplatAssetType mAssetType;
    public final C192319Jc mMLFrameworkType;
    public final int mXplatValue;

    /* access modifiers changed from: public */
    static {
        int i;
        XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP = new SparseArray(values().length + 1);
        UPPER_STRING_TO_CAPABILITY_MAP = AnonymousClass001.A0t();
        for (VersionedCapability versionedCapability : values()) {
            UPPER_STRING_TO_CAPABILITY_MAP.put(C86664Kz.A1L(versionedCapability.name()), versionedCapability);
            XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP.put(versionedCapability.getXplatValue(), versionedCapability);
        }
    }

    public static VersionedCapability fromServerValue(String str) {
        VersionedCapability versionedCapability = (VersionedCapability) UPPER_STRING_TO_CAPABILITY_MAP.get(C86664Kz.A1L(str));
        if (versionedCapability != null) {
            return versionedCapability;
        }
        C162477s9.A0G(TAG, "Unsupported capability: %s", AnonymousClass000.A1b(str));
        return null;
    }

    public static VersionedCapability fromXplatValue(int i) {
        return (VersionedCapability) XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP.get(i);
    }

    /* access modifiers changed from: public */
    VersionedCapability(C192319Jc r3, int i, XplatAssetType xplatAssetType) {
        this.mMLFrameworkType = r3;
        this.mXplatValue = i;
        this.mAssetType = xplatAssetType;
    }

    public String toServerValue() {
        return name();
    }

    public C192319Jc getMLFrameworkType() {
        return this.mMLFrameworkType;
    }

    public XplatAssetType getXplatAssetType() {
        return this.mAssetType;
    }

    public int getXplatValue() {
        return this.mXplatValue;
    }
}
