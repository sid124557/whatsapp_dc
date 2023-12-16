package com.facebook.profilo.mmapbuf.core;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C157137hn;
import X.C18280x3;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import java.io.File;

public class MmapBufferManager {
    public final C157137hn mFileHelper;
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    private native Buffer nativeAllocateBuffer(int i);

    private native Buffer nativeAllocateBuffer(int i, String str);

    private native boolean nativeDeallocateBuffer(Buffer buffer);

    public synchronized boolean deallocateBuffer(Buffer buffer) {
        return nativeDeallocateBuffer(buffer);
    }

    static {
        SoLoader.A06("profilo_mmapbuf");
    }

    public Buffer allocateBuffer(int i, boolean z) {
        if (!z) {
            return nativeAllocateBuffer(i);
        }
        String A0Y = C18280x3.A0Y();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(C157137hn.A00(A0Y));
        String A01 = this.mFileHelper.A01(AnonymousClass000.A0X(".buff", A0o));
        if (A01 == null) {
            return null;
        }
        return nativeAllocateBuffer(i, A01);
    }

    public MmapBufferManager(File file) {
        this.mFileHelper = new C157137hn(file);
    }
}
