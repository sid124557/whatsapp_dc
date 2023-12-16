package X;

import android.os.PowerManager;

/* renamed from: X.8Mn  reason: invalid class name and case insensitive filesystem */
public abstract class C172738Mn implements Runnable, AnonymousClass495 {
    public final AnonymousClass7UI A00;

    public synchronized void cancel() {
        C184448rq r0;
        AnonymousClass7UI r1 = this.A00;
        synchronized (r1) {
            r0 = r1.A00;
        }
        if (r0 != null) {
            r0.cancel();
        }
    }

    public static void A02(PowerManager.WakeLock wakeLock) {
        if (wakeLock != null && wakeLock.isHeld()) {
            wakeLock.release();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cb, code lost:
        if (r1.getMessage() != null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cd, code lost:
        r0 = X.C86624Kv.A1Z(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/filenotfound", r1);
        r1 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dc, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/badaudio", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/illegalstate", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ed, code lost:
        r1 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f0, code lost:
        if (r0 == false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f2, code lost:
        r1 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c6 A[ExcHandler: IOException (r1v9 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:1:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d2 A[ExcHandler: FileNotFoundException (r1v7 'e' java.io.FileNotFoundException A[CUSTOM_DECLARE]), Splitter:B:1:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00dc A[ExcHandler: 6ph (r1v6 'e' X.6ph A[CUSTOM_DECLARE]), Splitter:B:1:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e6 A[ExcHandler: IllegalStateException (r1v4 'e' java.lang.IllegalStateException A[CUSTOM_DECLARE]), Splitter:B:1:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass7N0 A03() {
        /*
            r16 = this;
            r3 = r16
            X.6kr r3 = (X.C135556kr) r3
            X.6kf r4 = r3.A05
            java.io.File r13 = r4.A06
            java.io.File r6 = r4.A00
            long r11 = X.C107655bf.A0G(r6)
            r2 = 0
            android.os.PowerManager$WakeLock r5 = r3.A00     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            if (r5 == 0) goto L_0x0016
            r5.acquire()     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
        L_0x0016:
            boolean r0 = r4.A01     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            java.lang.String r10 = "audio was not transcoded correctly"
            if (r0 == 0) goto L_0x0077
            boolean r0 = X.AnonymousClass8HS.A00(r6)     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            if (r0 == 0) goto L_0x00b3
            java.lang.String r0 = "mediatranscodequeue/audio/transcode"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            r7 = 0
            r9 = 96000(0x17700, float:1.34525E-40)
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0034
            r7 = 96000(0x17700, float:1.34525E-40)
            goto L_0x003d
        L_0x0034:
            long r0 = r6.length()     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            r7 = 8000(0x1f40, double:3.9525E-320)
            long r0 = r0 * r7
            long r0 = r0 / r11
            int r7 = (int) r0     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
        L_0x003d:
            int r1 = java.lang.Math.min(r7, r9)     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            r0 = 12200(0x2fa8, float:1.7096E-41)
            int r1 = java.lang.Math.max(r0, r1)     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            X.7Nu r0 = new X.7Nu     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            r0.<init>(r6, r13)     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            r0.A00 = r1     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            X.8HS r1 = new X.8HS     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            java.util.Objects.requireNonNull(r4)     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            X.92O r0 = new X.92O     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            r0.<init>(r4, r2)     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            r1.A01 = r0     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            r4.A00(r1)     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            r1.A01()     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            boolean r0 = r1.A08     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            if (r0 != 0) goto L_0x0074
            X.7rz r0 = r3.A06     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            boolean r0 = r0.A0F(r13)     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            if (r0 != 0) goto L_0x0101
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r10)     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            goto L_0x00be
        L_0x0074:
            r0 = 0
            goto L_0x0102
        L_0x0077:
            X.7rz r1 = r3.A06     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            boolean r0 = r1.A0F(r6)     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = "mediatranscodequeue/audio/copy-and-repair"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            X.3Dh r0 = r3.A02     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            r0.A0a(r6, r13)     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            X.2qk r0 = r1.A00     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            X.7nN r0 = X.C162397rz.A06(r0, r13)     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            int r1 = r0.A01     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            r0 = 2
            if (r1 != r0) goto L_0x0101
            X.7bG r0 = r3.A03     // Catch:{ 6z0 -> 0x009a, IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6 }
            com.whatsapp.Mp4Ops.A04(r0, r13, r2)     // Catch:{ 6z0 -> 0x009a, IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6 }
            goto L_0x0101
        L_0x009a:
            r14 = move-exception
            X.2oU r0 = r3.A04     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            android.content.Context r10 = r0.A00     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            X.2qk r11 = r3.A01     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            X.7bG r12 = r3.A03     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            java.lang.String r15 = "check audio on upload"
            com.whatsapp.Mp4Ops.A00(r10, r11, r12, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            throw r14     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
        L_0x00a9:
            java.lang.String r0 = "mediatranscodequeue/audio/ineligible-file"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r10)     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            goto L_0x00be
        L_0x00b3:
            java.lang.String r0 = "mediatranscodequeue/audio/cannot-transcode"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
            java.lang.String r0 = "cannot transcode audio"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
        L_0x00be:
            throw r0     // Catch:{ IllegalStateException -> 0x00e6, 6ph -> 0x00dc, FileNotFoundException -> 0x00d2, IOException -> 0x00c6, 6z0 -> 0x00bf }
        L_0x00bf:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/libmp4muxexception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x011f }
            goto L_0x00e2
        L_0x00c6:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x00f2
            boolean r0 = X.C86624Kv.A1Z(r1)     // Catch:{ all -> 0x011f }
            goto L_0x00ed
        L_0x00d2:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/filenotfound"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x011f }
            r1 = 2131889088(0x7f120bc0, float:1.941283E38)
            goto L_0x00f5
        L_0x00dc:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/badaudio"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x011f }
        L_0x00e2:
            r1 = 2131889069(0x7f120bad, float:1.9412791E38)
            goto L_0x00f5
        L_0x00e6:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/illegalstate"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x011f }
            goto L_0x00f2
        L_0x00ed:
            r1 = 2131889102(0x7f120bce, float:1.9412858E38)
            if (r0 != 0) goto L_0x00f5
        L_0x00f2:
            r1 = 2131889114(0x7f120bda, float:1.9412882E38)
        L_0x00f5:
            X.8oe r0 = r4.A05     // Catch:{ all -> 0x011f }
            r0.B1x(r1)     // Catch:{ all -> 0x011f }
            android.os.PowerManager$WakeLock r0 = r3.A00
            A02(r0)
            r0 = 0
            goto L_0x0105
        L_0x0101:
            r0 = 1
        L_0x0102:
            A02(r5)
        L_0x0105:
            X.6kk r1 = new X.6kk
            r1.<init>()
            if (r0 == 0) goto L_0x011c
            int r0 = X.C107655bf.A0F(r13)
            r1.A00 = r0
            r1.A00 = r13
            r0 = 1
            r1.A02 = r0
        L_0x0117:
            X.6ko r0 = r1.A00()
            return r0
        L_0x011c:
            r1.A02 = r2
            goto L_0x0117
        L_0x011f:
            r1 = move-exception
            android.os.PowerManager$WakeLock r0 = r3.A00
            A02(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172738Mn.A03():X.7N0");
    }

    public C172738Mn(AnonymousClass7UI r1) {
        this.A00 = r1;
    }

    public void run() {
        this.A00.A04.BTX(A03());
    }
}
