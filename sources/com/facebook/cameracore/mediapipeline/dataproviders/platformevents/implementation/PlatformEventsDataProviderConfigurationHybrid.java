package com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation;

import X.AnonymousClass001;
import X.AnonymousClass969;
import X.AnonymousClass9L4;
import X.C162457s7;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public final class PlatformEventsDataProviderConfigurationHybrid extends ServiceConfiguration {
    public static final AnonymousClass9L4 Companion = new AnonymousClass9L4();
    public final AnonymousClass969 configuration = null;
    public final PlatformEventsServiceObjectsWrapper objectsWrapper;

    public PlatformEventsDataProviderConfigurationHybrid(AnonymousClass969 r3) {
        C162457s7.A0J((Object) null, 1);
        throw AnonymousClass001.A0g("getDelegate");
    }

    public static final native HybridData initHybrid(PlatformEventsServiceObjectsWrapper platformEventsServiceObjectsWrapper);
}
