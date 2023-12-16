package com.facebook.cameracore.mediapipeline.services.messagechannel.implementation;

import X.AnonymousClass9KS;
import X.C162457s7;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

public final class ServiceMessageDataSourceHybrid {
    public final AnonymousClass9KS dataSource;
    public final HybridData mHybridData = initHybrid();

    public ServiceMessageDataSourceHybrid(AnonymousClass9KS r2) {
        C162457s7.A0J(r2, 1);
        this.dataSource = r2;
    }

    private final native HybridData initHybrid();

    public native void didReceiveMessageFromPlatform(int i, ByteBuffer byteBuffer, int i2);

    public native void setConfiguration(int i, ByteBuffer byteBuffer, int i2);

    public final void didReceiveFromXplat(int i, byte[] bArr) {
        ByteBuffer.wrap(bArr);
    }
}
