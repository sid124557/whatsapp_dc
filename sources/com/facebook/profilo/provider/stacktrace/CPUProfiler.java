package com.facebook.profilo.provider.stacktrace;

import com.facebook.profilo.logger.MultiBufferLogger;
import com.facebook.soloader.SoLoader;

public class CPUProfiler {
    public static volatile int sAvailableTracers;
    public static volatile boolean sInitialized;

    public static native boolean nativeInitialize(MultiBufferLogger multiBufferLogger, int i, boolean z, int i2, int i3, boolean z2);

    public static native void nativeLoggerLoop();

    public static native void nativeResetFrameworkNamesSet();

    public static native boolean nativeStartProfiling(int i, int i2, int i3, boolean z, boolean z2);

    public static native void nativeStopProfiling();

    static {
        SoLoader.A06("profilo_stacktrace");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0068, code lost:
        if (r3.equals(r0) == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006a, code lost:
        r1 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007c, code lost:
        if (r3.equals(r0) == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007e, code lost:
        r1 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0087, code lost:
        if (r3.equals(r0) == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0089, code lost:
        r1 = androidx.core.view.inputmethod.EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0092, code lost:
        if (r3.equals(r0) == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0094, code lost:
        r1 = androidx.core.view.inputmethod.EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009d, code lost:
        if (r3.equals(r0) == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x009f, code lost:
        r1 = 16384;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean init(android.content.Context r6, com.facebook.profilo.logger.MultiBufferLogger r7, boolean r8, int r9, int r10, boolean r11) {
        /*
            java.lang.Class<com.facebook.profilo.provider.stacktrace.CPUProfiler> r4 = com.facebook.profilo.provider.stacktrace.CPUProfiler.class
            monitor-enter(r4)
            boolean r0 = sInitialized     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x000a
            monitor-exit(r4)
            r0 = 1
            return r0
        L_0x000a:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00bf }
            boolean r0 = com.facebook.profilo.provider.stacktrace.ArtCompatibility.isCompatible(r6)     // Catch:{ all -> 0x00bf }
            r1 = 0
            if (r0 == 0) goto L_0x00a4
            java.lang.String r3 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x00bf }
            int r0 = r3.hashCode()     // Catch:{ all -> 0x00bf }
            switch(r0) {
                case 57: goto L_0x0097;
                case 52407: goto L_0x008c;
                case 52408: goto L_0x0081;
                case 53368: goto L_0x0076;
                case 54329: goto L_0x006d;
                case 54330: goto L_0x0062;
                case 56251: goto L_0x005f;
                case 50364602: goto L_0x005c;
                case 50364603: goto L_0x0059;
                case 50365562: goto L_0x0056;
                case 50365563: goto L_0x0053;
                case 51288123: goto L_0x0050;
                case 52212604: goto L_0x004d;
                case 52212605: goto L_0x0042;
                case 52212606: goto L_0x0037;
                case 53135164: goto L_0x002c;
                case 53136125: goto L_0x0021;
                case 54058685: goto L_0x001e;
                default: goto L_0x001c;
            }     // Catch:{ all -> 0x00bf }
        L_0x001c:
            goto L_0x00a4
        L_0x001e:
            java.lang.String r0 = "9.0.0"
            goto L_0x0099
        L_0x0021:
            java.lang.String r0 = "8.1.0"
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x00a4
            r1 = 8192(0x2000, float:1.14794E-41)
            goto L_0x00a4
        L_0x002c:
            java.lang.String r0 = "8.0.0"
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x00a4
            r1 = 4096(0x1000, float:5.74E-42)
            goto L_0x00a4
        L_0x0037:
            java.lang.String r0 = "7.1.2"
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x00a4
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x00a4
        L_0x0042:
            java.lang.String r0 = "7.1.1"
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x00a4
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x00a4
        L_0x004d:
            java.lang.String r0 = "7.1.0"
            goto L_0x0064
        L_0x0050:
            java.lang.String r0 = "6.0.1"
            goto L_0x0078
        L_0x0053:
            java.lang.String r0 = "5.1.1"
            goto L_0x0083
        L_0x0056:
            java.lang.String r0 = "5.1.0"
            goto L_0x0083
        L_0x0059:
            java.lang.String r0 = "5.0.2"
            goto L_0x008e
        L_0x005c:
            java.lang.String r0 = "5.0.1"
            goto L_0x008e
        L_0x005f:
            java.lang.String r0 = "9.0"
            goto L_0x0099
        L_0x0062:
            java.lang.String r0 = "7.1"
        L_0x0064:
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x00a4
            r1 = 64
            goto L_0x00a4
        L_0x006d:
            java.lang.String r0 = "7.0"
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x00a4
            goto L_0x00a2
        L_0x0076:
            java.lang.String r0 = "6.0"
        L_0x0078:
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x00a4
            r1 = 16
            goto L_0x00a4
        L_0x0081:
            java.lang.String r0 = "5.1"
        L_0x0083:
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x00a4
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x00a4
        L_0x008c:
            java.lang.String r0 = "5.0"
        L_0x008e:
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x00a4
            r1 = 1024(0x400, float:1.435E-42)
            goto L_0x00a4
        L_0x0097:
            java.lang.String r0 = "9"
        L_0x0099:
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x00a4
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a4
        L_0x00a2:
            r1 = 32
        L_0x00a4:
            r1 = r1 | 512(0x200, float:7.175E-43)
            r0 = 26
            if (r2 < r0) goto L_0x00ac
            r1 = r1 | 4
        L_0x00ac:
            sAvailableTracers = r1     // Catch:{ all -> 0x00bf }
            int r6 = sAvailableTracers     // Catch:{ all -> 0x00bf }
            r5 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            boolean r0 = nativeInitialize(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00bf }
            sInitialized = r0     // Catch:{ all -> 0x00bf }
            boolean r0 = sInitialized     // Catch:{ all -> 0x00bf }
            monitor-exit(r4)
            return r0
        L_0x00bf:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.CPUProfiler.init(android.content.Context, com.facebook.profilo.logger.MultiBufferLogger, boolean, int, int, boolean):boolean");
    }
}
