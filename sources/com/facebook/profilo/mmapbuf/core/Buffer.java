package com.facebook.profilo.mmapbuf.core;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C157137hn;
import android.util.Log;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import java.io.File;

public class Buffer {
    public static final String LOG_TAG = "Prflo/Buffer";
    public final HybridData mHybridData;

    private native void nativeUpdateId(String str);

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String generateMemoryMappingFilePath() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r3.getFilePath()     // Catch:{ all -> 0x003d }
            boolean r0 = X.AnonymousClass000.A1W(r0)     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            r0 = 0
            return r0
        L_0x000e:
            java.lang.String r0 = r3.getMemoryMappingFilePath()     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x003b
            java.io.File r0 = r3.getBufferContainingFolder()     // Catch:{ all -> 0x003d }
            X.7hn r2 = new X.7hn     // Catch:{ all -> 0x003d }
            r2.<init>(r0)     // Catch:{ all -> 0x003d }
            java.lang.String r0 = X.C18280x3.A0Y()     // Catch:{ all -> 0x003d }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x003d }
            java.lang.String r0 = X.C157137hn.A00(r0)     // Catch:{ all -> 0x003d }
            r1.append(r0)     // Catch:{ all -> 0x003d }
            java.lang.String r0 = ".maps"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x003d }
            java.lang.String r0 = r2.A01(r0)     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x003b
            r3.updateMemoryMappingFilePath(r0)     // Catch:{ all -> 0x003d }
        L_0x003b:
            monitor-exit(r3)
            return r0
        L_0x003d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.mmapbuf.core.Buffer.generateMemoryMappingFilePath():java.lang.String");
    }

    public native synchronized String getFilePath();

    public native synchronized String getMemoryMappingFilePath();

    public native synchronized void updateFilePath(String str);

    public native synchronized void updateHeader(int i, long j, long j2, long j3);

    public synchronized void updateId(String str) {
        if (AnonymousClass000.A1W(getFilePath())) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(C157137hn.A00(str));
            String A01 = new C157137hn(getBufferContainingFolder()).A01(AnonymousClass000.A0X(".buff", A0o));
            if (A01 != null) {
                try {
                    nativeUpdateId(str);
                    updateFilePath(A01);
                } catch (Exception e) {
                    Log.e(LOG_TAG, "Id update failed", e);
                }
            }
        }
        return;
    }

    public native synchronized void updateMemoryMappingFilePath(String str);

    static {
        SoLoader.A06("profilo_mmapbuf");
    }

    public Buffer(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private File getBufferContainingFolder() {
        return AnonymousClass002.A0B(getFilePath()).getParentFile();
    }

    public boolean isFileBacked() {
        return AnonymousClass000.A1W(getFilePath());
    }
}
