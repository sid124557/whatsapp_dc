package com.facebook.common.jniexecutors;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C159587m8;
import X.C161617q6;
import X.C162457s7;
import X.C162477s9;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.jni.HybridData;
import com.facebook.systrace.Systrace;
import java.util.IllegalFormatException;

public class NativeRunnable implements Runnable {
    public HybridData mHybridData;
    public volatile String mNativeExecutor;

    private native void nativeRun();

    static {
        C159587m8.A01("jniexecutors");
    }

    public void run() {
        String str = "%s";
        if ((32 & C161617q6.A02) != 0) {
            try {
                str = StringFormatUtil.formatStrLocaleSafe(str, (Object) this);
            } catch (IllegalFormatException e) {
                C162477s9.A0B("Tracer", "Bad format string", e);
            }
            C162457s7.A0H(str);
            Systrace.A01(str);
        }
        try {
            nativeRun();
        } finally {
            Systrace.A00();
        }
    }

    public String toString() {
        String str = this.mNativeExecutor;
        if (str == null) {
            return "NativeRunnable";
        }
        return AnonymousClass000.A0V("NativeRunnable - ", str, AnonymousClass001.A0o());
    }

    public NativeRunnable(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
