package com.facebook.cameracore.mediapipeline.services.persistence.interfaces;

import X.AnonymousClass001;
import com.facebook.jni.HybridData;

public class PersistenceServiceDelegateJavaHybrid extends PersistenceServiceDelegateHybrid {
    private native HybridData initHybrid();

    public String get(String str) {
        throw AnonymousClass001.A0g("get");
    }

    public boolean remove(String str) {
        throw AnonymousClass001.A0g("remove");
    }

    public boolean set(String str, String str2) {
        throw AnonymousClass001.A0g("set");
    }
}
