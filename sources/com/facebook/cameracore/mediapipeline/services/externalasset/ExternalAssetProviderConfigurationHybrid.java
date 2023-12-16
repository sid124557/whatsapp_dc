package com.facebook.cameracore.mediapipeline.services.externalasset;

import X.AnonymousClass001;
import X.AnonymousClass96A;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class ExternalAssetProviderConfigurationHybrid extends ServiceConfiguration {
    public final AnonymousClass96A mConfiguration;

    public static native HybridData initHybrid(ExternalAssetLocalDataSource externalAssetLocalDataSource);

    public ExternalAssetProviderConfigurationHybrid(AnonymousClass96A r2) {
        this.mConfiguration = r2;
        throw AnonymousClass001.A0g("getAssetDataSource");
    }

    public void destroy() {
        super.destroy();
    }
}
