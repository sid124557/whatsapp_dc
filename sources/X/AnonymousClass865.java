package X;

import android.content.Context;

/* renamed from: X.865  reason: invalid class name */
public class AnonymousClass865 implements C180628lN {
    public int A00 = 0;
    public C186968wE A01 = C186968wE.A00;
    public final Context A02;

    public AnonymousClass865(Context context) {
        this.A02 = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0077, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0112, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0119, code lost:
        throw X.AnonymousClass6CA.A0Q("Error instantiating Opus extension", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x011a, code lost:
        r3 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0147, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x014e, code lost:
        throw X.AnonymousClass6CA.A0Q("Error instantiating FLAC extension", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x014f, code lost:
        r9 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x006f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0076, code lost:
        throw X.AnonymousClass6CA.A0Q("Error instantiating VP9 extension", r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0112 A[ExcHandler: Exception (r1v11 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:24:0x00ed] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0147 A[ExcHandler: Exception (r1v8 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:36:0x011e] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x006f A[ExcHandler: Exception (r1v19 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:3:0x003a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C187588xU[] B0y(android.os.Handler r27, X.C186238uy r28, X.C180698lU r29, X.C180748lZ r30, X.C186248uz r31) {
        /*
            r26 = this;
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()
            r11 = r26
            android.content.Context r15 = r11.A02
            int r1 = r11.A00
            X.8wE r10 = r11.A01
            r9 = 0
            r2 = 5000(0x1388, double:2.4703E-320)
            java.lang.String r8 = "DefaultRenderersFactory"
            java.lang.Class<X.8uz> r19 = X.C186248uz.class
            r7 = 50
            X.8vh r23 = X.C186638vh.A00
            r6 = 0
            X.6Ov r0 = new X.6Ov
            r13 = r27
            r25 = r31
            r20 = r0
            r21 = r15
            r22 = r13
            r24 = r10
            r20.<init>(r21, r22, r23, r24, r25)
            r12.add(r0)
            if (r1 == 0) goto L_0x00b6
            int r1 = r12.size()
            r18 = 2
            r14 = 3
            r5 = 4
            r17 = 1
            java.lang.String r0 = "com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer"
            java.lang.Class r4 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0078, Exception -> 0x006f }
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x0078, Exception -> 0x006f }
            java.lang.Class r16 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x0078, Exception -> 0x006f }
            r0[r9] = r16     // Catch:{ ClassNotFoundException -> 0x0078, Exception -> 0x006f }
            java.lang.Class<android.os.Handler> r16 = android.os.Handler.class
            r0[r17] = r16     // Catch:{ ClassNotFoundException -> 0x0078, Exception -> 0x006f }
            r0[r18] = r19     // Catch:{ ClassNotFoundException -> 0x0078, Exception -> 0x006f }
            java.lang.Class r16 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x0078, Exception -> 0x006f }
            r0[r14] = r16     // Catch:{ ClassNotFoundException -> 0x0078, Exception -> 0x006f }
            java.lang.reflect.Constructor r4 = r4.getConstructor(r0)     // Catch:{ ClassNotFoundException -> 0x0078, Exception -> 0x006f }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x0078, Exception -> 0x006f }
            X.AnonymousClass000.A1Q(r0, r9, r2)     // Catch:{ ClassNotFoundException -> 0x0078, Exception -> 0x006f }
            r0[r17] = r27     // Catch:{ ClassNotFoundException -> 0x0078, Exception -> 0x006f }
            r0[r18] = r31     // Catch:{ ClassNotFoundException -> 0x0078, Exception -> 0x006f }
            X.AnonymousClass000.A1P(r0, r7, r14)     // Catch:{ ClassNotFoundException -> 0x0078, Exception -> 0x006f }
            java.lang.Object r0 = r4.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x0078, Exception -> 0x006f }
            X.8xU r0 = (X.C187588xU) r0     // Catch:{ ClassNotFoundException -> 0x0078, Exception -> 0x006f }
            int r4 = r1 + 1
            r12.add(r1, r0)     // Catch:{ ClassNotFoundException -> 0x0077, Exception -> 0x006f }
            java.lang.String r0 = "Loaded LibvpxVideoRenderer."
            android.util.Log.i(r8, r0)     // Catch:{ ClassNotFoundException -> 0x0077, Exception -> 0x006f }
            goto L_0x0079
        L_0x006f:
            r1 = move-exception
            java.lang.String r0 = "Error instantiating VP9 extension"
            java.lang.RuntimeException r0 = X.AnonymousClass6CA.A0Q(r0, r1)
            throw r0
        L_0x0077:
            r1 = r4
        L_0x0078:
            r4 = r1
        L_0x0079:
            java.lang.String r0 = "com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ae }
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ae }
            java.lang.Class r16 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ae }
            r0[r9] = r16     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ae }
            java.lang.Class<android.os.Handler> r16 = android.os.Handler.class
            r0[r17] = r16     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ae }
            r0[r18] = r19     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ae }
            java.lang.Class r16 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ae }
            r0[r14] = r16     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ae }
            java.lang.reflect.Constructor r0 = r1.getConstructor(r0)     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ae }
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ae }
            X.AnonymousClass000.A1Q(r1, r9, r2)     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ae }
            r1[r17] = r27     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ae }
            r1[r18] = r31     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ae }
            X.AnonymousClass000.A1P(r1, r7, r14)     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ae }
            java.lang.Object r0 = r0.newInstance(r1)     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ae }
            X.8xU r0 = (X.C187588xU) r0     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ae }
            r12.add(r4, r0)     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ae }
            java.lang.String r0 = "Loaded Libgav1VideoRenderer."
            android.util.Log.i(r8, r0)     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ae }
            goto L_0x00b6
        L_0x00ae:
            r1 = move-exception
            java.lang.String r0 = "Error instantiating AV1 extension"
            java.lang.RuntimeException r0 = X.AnonymousClass6CA.A0Q(r0, r1)
            throw r0
        L_0x00b6:
            X.7no r2 = X.C160527no.A00(r15)
            X.8wN[] r1 = new X.C187058wN[r9]
            X.86C r0 = new X.86C
            r0.<init>(r1)
            X.86A r4 = new X.86A
            r4.<init>(r2, r0)
            int r1 = r11.A00
            java.lang.Class<X.8vH> r16 = X.C186418vH.class
            java.lang.Class<X.8uy> r14 = X.C186238uy.class
            X.6Ow r0 = new X.6Ow
            r5 = r28
            r17 = r0
            r18 = r15
            r19 = r13
            r20 = r5
            r21 = r4
            r22 = r10
            r17.<init>(r18, r19, r20, r21, r22)
            r12.add(r0)
            if (r1 == 0) goto L_0x0182
            int r3 = r12.size()
            r11 = 2
            r7 = 3
            r10 = 1
            java.lang.Class<X.6OI> r2 = X.AnonymousClass6OI.class
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException -> 0x011b, Exception -> 0x0112 }
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            r1[r9] = r0     // Catch:{ ClassNotFoundException -> 0x011b, Exception -> 0x0112 }
            r1[r10] = r14     // Catch:{ ClassNotFoundException -> 0x011b, Exception -> 0x0112 }
            r1[r11] = r16     // Catch:{ ClassNotFoundException -> 0x011b, Exception -> 0x0112 }
            java.lang.reflect.Constructor r1 = r2.getConstructor(r1)     // Catch:{ ClassNotFoundException -> 0x011b, Exception -> 0x0112 }
            java.lang.Object[] r0 = X.AnonymousClass4L0.A0V(r13, r5, r7)     // Catch:{ ClassNotFoundException -> 0x011b, Exception -> 0x0112 }
            r0[r11] = r4     // Catch:{ ClassNotFoundException -> 0x011b, Exception -> 0x0112 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x011b, Exception -> 0x0112 }
            X.8xU r0 = (X.C187588xU) r0     // Catch:{ ClassNotFoundException -> 0x011b, Exception -> 0x0112 }
            int r9 = r3 + 1
            r12.add(r3, r0)     // Catch:{ ClassNotFoundException -> 0x011a, Exception -> 0x0112 }
            java.lang.String r0 = "Loaded LibopusAudioRenderer."
            android.util.Log.i(r8, r0)     // Catch:{ ClassNotFoundException -> 0x011a, Exception -> 0x0112 }
            goto L_0x011c
        L_0x0112:
            r1 = move-exception
            java.lang.String r0 = "Error instantiating Opus extension"
            java.lang.RuntimeException r0 = X.AnonymousClass6CA.A0Q(r0, r1)
            throw r0
        L_0x011a:
            r3 = r9
        L_0x011b:
            r9 = r3
        L_0x011c:
            java.lang.String r0 = "com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer"
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0150, Exception -> 0x0147 }
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException -> 0x0150, Exception -> 0x0147 }
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            r1[r6] = r0     // Catch:{ ClassNotFoundException -> 0x0150, Exception -> 0x0147 }
            r1[r10] = r14     // Catch:{ ClassNotFoundException -> 0x0150, Exception -> 0x0147 }
            r1[r11] = r16     // Catch:{ ClassNotFoundException -> 0x0150, Exception -> 0x0147 }
            java.lang.reflect.Constructor r1 = r2.getConstructor(r1)     // Catch:{ ClassNotFoundException -> 0x0150, Exception -> 0x0147 }
            java.lang.Object[] r0 = X.AnonymousClass4L0.A0V(r13, r5, r7)     // Catch:{ ClassNotFoundException -> 0x0150, Exception -> 0x0147 }
            r0[r11] = r4     // Catch:{ ClassNotFoundException -> 0x0150, Exception -> 0x0147 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x0150, Exception -> 0x0147 }
            X.8xU r0 = (X.C187588xU) r0     // Catch:{ ClassNotFoundException -> 0x0150, Exception -> 0x0147 }
            int r3 = r9 + 1
            r12.add(r9, r0)     // Catch:{ ClassNotFoundException -> 0x014f, Exception -> 0x0147 }
            java.lang.String r0 = "Loaded LibflacAudioRenderer."
            android.util.Log.i(r8, r0)     // Catch:{ ClassNotFoundException -> 0x014f, Exception -> 0x0147 }
            goto L_0x0151
        L_0x0147:
            r1 = move-exception
            java.lang.String r0 = "Error instantiating FLAC extension"
            java.lang.RuntimeException r0 = X.AnonymousClass6CA.A0Q(r0, r1)
            throw r0
        L_0x014f:
            r9 = r3
        L_0x0150:
            r3 = r9
        L_0x0151:
            java.lang.String r0 = "com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer"
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0182, Exception -> 0x017a }
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException -> 0x0182, Exception -> 0x017a }
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            r1[r6] = r0     // Catch:{ ClassNotFoundException -> 0x0182, Exception -> 0x017a }
            r1[r10] = r14     // Catch:{ ClassNotFoundException -> 0x0182, Exception -> 0x017a }
            r1[r11] = r16     // Catch:{ ClassNotFoundException -> 0x0182, Exception -> 0x017a }
            java.lang.reflect.Constructor r1 = r2.getConstructor(r1)     // Catch:{ ClassNotFoundException -> 0x0182, Exception -> 0x017a }
            java.lang.Object[] r0 = X.AnonymousClass4L0.A0V(r13, r5, r7)     // Catch:{ ClassNotFoundException -> 0x0182, Exception -> 0x017a }
            r0[r11] = r4     // Catch:{ ClassNotFoundException -> 0x0182, Exception -> 0x017a }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x0182, Exception -> 0x017a }
            X.8xU r0 = (X.C187588xU) r0     // Catch:{ ClassNotFoundException -> 0x0182, Exception -> 0x017a }
            r12.add(r3, r0)     // Catch:{ ClassNotFoundException -> 0x0182, Exception -> 0x017a }
            java.lang.String r0 = "Loaded FfmpegAudioRenderer."
            android.util.Log.i(r8, r0)     // Catch:{ ClassNotFoundException -> 0x0182, Exception -> 0x017a }
            goto L_0x0182
        L_0x017a:
            r1 = move-exception
            java.lang.String r0 = "Error instantiating FFmpeg extension"
            java.lang.RuntimeException r0 = X.AnonymousClass6CA.A0Q(r0, r1)
            throw r0
        L_0x0182:
            android.os.Looper r1 = r13.getLooper()
            X.6OH r0 = new X.6OH
            r2 = r30
            r0.<init>(r1, r2)
            r12.add(r0)
            android.os.Looper r1 = r13.getLooper()
            X.6OG r0 = new X.6OG
            r2 = r29
            r0.<init>(r1, r2)
            r12.add(r0)
            X.6OE r0 = new X.6OE
            r0.<init>()
            r12.add(r0)
            X.8xU[] r0 = new X.C187588xU[r6]
            java.lang.Object[] r0 = r12.toArray(r0)
            X.8xU[] r0 = (X.C187588xU[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass865.B0y(android.os.Handler, X.8uy, X.8lU, X.8lZ, X.8uz):X.8xU[]");
    }
}
