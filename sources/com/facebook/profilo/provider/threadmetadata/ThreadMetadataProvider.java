package com.facebook.profilo.provider.threadmetadata;

import X.AnonymousClass843;
import X.C159137lB;
import X.C166567yu;
import com.facebook.profilo.mmapbuf.core.Buffer;

public final class ThreadMetadataProvider extends C159137lB {
    public static native void nativeLogThreadMetadata(Buffer buffer);

    public ThreadMetadataProvider() {
        super("profilo_threadmetadata");
    }

    public void disable() {
    }

    public void enable() {
    }

    public int getSupportedProviders() {
        return -1;
    }

    public int getTracingProviders() {
        return 0;
    }

    public void logOnTraceEnd(C166567yu r2, AnonymousClass843 r3) {
        nativeLogThreadMetadata(r2.A09);
    }

    public void onTraceEnded(C166567yu r3, AnonymousClass843 r4) {
        if (r3.A00 != 2) {
            nativeLogThreadMetadata(r3.A09);
        }
    }
}
