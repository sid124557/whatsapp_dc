package X;

import android.os.Handler;

/* renamed from: X.5sF  reason: invalid class name and case insensitive filesystem */
public class C117635sF implements Runnable {
    public Object A00;
    public final int A01;

    public C117635sF(AnonymousClass7XO r2) {
        this.A01 = 25;
        this.A00 = AnonymousClass0x9.A14(r2);
    }

    public static void A00(Handler handler, Object obj, int i) {
        handler.post(new C117635sF(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        r3.postDelayed(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0471, code lost:
        ((com.whatsapp.storage.StorageUsageActivity) r1).A77(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0477, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0529, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x052d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0587, code lost:
        r1.fullScroll(130);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x058c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007f, code lost:
        if (r0 != null) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:281:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x02cc;
                case 1: goto L_0x0007;
                case 2: goto L_0x0035;
                case 3: goto L_0x0007;
                case 4: goto L_0x00b1;
                case 5: goto L_0x00d0;
                case 6: goto L_0x00ed;
                case 7: goto L_0x02da;
                case 8: goto L_0x02f6;
                case 9: goto L_0x00ff;
                case 10: goto L_0x030f;
                case 11: goto L_0x032b;
                case 12: goto L_0x011e;
                case 13: goto L_0x0333;
                case 14: goto L_0x033d;
                case 15: goto L_0x012f;
                case 16: goto L_0x0354;
                case 17: goto L_0x035c;
                case 18: goto L_0x0366;
                case 19: goto L_0x0154;
                case 20: goto L_0x036e;
                case 21: goto L_0x016c;
                case 22: goto L_0x0387;
                case 23: goto L_0x038f;
                case 24: goto L_0x0184;
                case 25: goto L_0x019c;
                case 26: goto L_0x0397;
                case 27: goto L_0x01ac;
                case 28: goto L_0x03a2;
                case 29: goto L_0x03aa;
                case 30: goto L_0x01c6;
                case 31: goto L_0x03b2;
                case 32: goto L_0x0459;
                case 33: goto L_0x0464;
                case 34: goto L_0x046b;
                case 35: goto L_0x0478;
                case 36: goto L_0x0482;
                case 37: goto L_0x048e;
                case 38: goto L_0x0499;
                case 39: goto L_0x04c3;
                case 40: goto L_0x01e9;
                case 41: goto L_0x04d1;
                case 42: goto L_0x0535;
                case 43: goto L_0x026e;
                case 44: goto L_0x0551;
                case 45: goto L_0x0574;
                case 46: goto L_0x057f;
                case 47: goto L_0x058d;
                case 48: goto L_0x028e;
                case 49: goto L_0x02a2;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r5 = r1.A00
            X.4Mf r5 = (X.C86884Mf) r5
            X.5ZQ r0 = r5.A03
            if (r0 == 0) goto L_0x0034
            int r4 = r0.A03()
            int r3 = r5.A00()
            if (r4 <= 0) goto L_0x0024
            android.os.Handler r2 = r5.A07
            r1 = 5
            X.3aE r0 = new X.3aE
            r0.<init>(r5, r4, r3, r1)
            r2.post(r0)
        L_0x0024:
            android.os.Handler r3 = r5.A02
            if (r3 == 0) goto L_0x0034
            r0 = 1
            X.5sF r2 = new X.5sF
            r2.<init>(r5, r0)
            int r0 = r5.A06
            long r0 = (long) r0
        L_0x0031:
            r3.postDelayed(r2, r0)
        L_0x0034:
            return
        L_0x0035:
            java.lang.Object r4 = r1.A00
            X.4Mf r4 = (X.C86884Mf) r4
            r0 = -16
            android.os.Process.setThreadPriority(r0)     // Catch:{ Exception -> 0x003f }
            goto L_0x0043
        L_0x003f:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0043:
            java.lang.String r6 = "StatusPlaybackVoice/failed to prepare audio player"
            X.5ZQ r0 = r4.A03
            if (r0 != 0) goto L_0x0081
            X.2oU r5 = r4.A0A     // Catch:{ IOException -> 0x0079 }
            java.io.File r3 = r4.A0D     // Catch:{ IOException -> 0x0079 }
            X.1VX r2 = r4.A0B     // Catch:{ IOException -> 0x0079 }
            X.8qC r0 = r4.A0C     // Catch:{ IOException -> 0x0079 }
            java.lang.Object r1 = r0.get()     // Catch:{ IOException -> 0x0079 }
            X.5NV r1 = (X.AnonymousClass5NV) r1     // Catch:{ IOException -> 0x0079 }
            r0 = 3
            X.5ZQ r0 = X.AnonymousClass5ZQ.A00(r5, r2, r1, r3, r0)     // Catch:{ IOException -> 0x0079 }
            r4.A03 = r0     // Catch:{ IOException -> 0x0079 }
            r3 = 1
            r0.A05()     // Catch:{ IllegalStateException -> 0x006e, IOException -> 0x0063 }
            goto L_0x007d
        L_0x0063:
            r2 = move-exception
            X.2qk r1 = r4.A08     // Catch:{ IOException -> 0x0079 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x0079 }
            r1.A0A(r6, r3, r0)     // Catch:{ IOException -> 0x0079 }
            goto L_0x0078
        L_0x006e:
            r2 = move-exception
            X.2qk r1 = r4.A08     // Catch:{ IOException -> 0x0079 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x0079 }
            r1.A0A(r6, r3, r0)     // Catch:{ IOException -> 0x0079 }
        L_0x0078:
            throw r2     // Catch:{ IOException -> 0x0079 }
        L_0x0079:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x007d:
            X.5ZQ r0 = r4.A03
            if (r0 == 0) goto L_0x008a
        L_0x0081:
            r0.A08()     // Catch:{ IOException -> 0x0086 }
            r3 = 1
            goto L_0x008b
        L_0x0086:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x008a:
            r3 = 0
        L_0x008b:
            android.os.Handler r2 = r4.A07
            r1 = 12
            X.3bz r0 = new X.3bz
            r0.<init>(r1, r4, r3)
            r2.post(r0)
            if (r3 != 0) goto L_0x0034
            X.5ZQ r0 = r4.A03
            if (r0 == 0) goto L_0x00a0
            r0.A09()
        L_0x00a0:
            X.5ZQ r0 = r4.A03
            if (r0 == 0) goto L_0x00a7
            r0.A06()
        L_0x00a7:
            r0 = 0
            r4.A03 = r0
            r4.quit()
            r4.interrupt()
            return
        L_0x00b1:
            java.lang.Object r5 = r1.A00
            X.4Mf r5 = (X.C86884Mf) r5
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x00bc
            r5.A01()
        L_0x00bc:
            r0 = 0
            r5.A00 = r0
            X.5ZQ r1 = r5.A03
            if (r1 == 0) goto L_0x00da
            int r0 = r5.A00()     // Catch:{ IOException -> 0x00cb }
            r1.A0A(r0)     // Catch:{ IOException -> 0x00cb }
            goto L_0x00da
        L_0x00cb:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            goto L_0x00da
        L_0x00d0:
            java.lang.Object r5 = r1.A00
            X.4Mf r5 = (X.C86884Mf) r5
            r0 = 0
            r5.A05 = r0
            r5.A02()
        L_0x00da:
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0034
            long r3 = r5.A01
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0034
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5.A01 = r0
            return
        L_0x00ed:
            java.lang.Object r1 = r1.A00
            X.4Mf r1 = (X.C86884Mf) r1
            r0 = 1
            r1.A05 = r0
            r1.A02()
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0034
            r1.A01()
            return
        L_0x00ff:
            java.lang.Object r0 = r1.A00
            X.4Mf r0 = (X.C86884Mf) r0
            java.lang.ref.WeakReference r0 = r0.A0E
            java.lang.Object r1 = r0.get()
            X.51g r1 = (X.C985351g) r1
            if (r1 == 0) goto L_0x0034
            X.5U7 r0 = r1.A0B
            r0.A02(r1)
            r2 = 0
            r1.A02 = r2
            X.3Wi r1 = r1.A01
            r0 = 2131889501(0x7f120d5d, float:1.9413667E38)
            r1.A0H(r0, r2)
            return
        L_0x011e:
            java.lang.Object r1 = r1.A00
            X.5TV r1 = (X.AnonymousClass5TV) r1
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x0034
            X.4Wh r0 = r1.A0L
            r0.A05()
            r1.A00()
            return
        L_0x012f:
            java.lang.Object r0 = r1.A00
            X.5Pj r0 = (X.C104035Pj) r0
            X.51x r1 = r0.A00
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0034
            r0 = 0
            r1.A06 = r0
            X.5SJ r3 = r1.A0T
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "playbackFragment/onPlaybackFinished "
            r1.append(r0)
            com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment r0 = r3.A01
            X.C18260x0.A0o(r0, r1)
            r2 = 4
            r1 = 6
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r0 = r3.A02
            r0.A1a(r2, r1)
            return
        L_0x0154:
            java.lang.Object r0 = r1.A00
            X.2zi r0 = (X.C61102zi) r0
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x015c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r1.next()
            X.2sh r0 = (X.C56872sh) r0
            r0.A05()
            goto L_0x015c
        L_0x016c:
            java.lang.Object r0 = r1.A00
            X.2zi r0 = (X.C61102zi) r0
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x0174:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r1.next()
            X.2sh r0 = (X.C56872sh) r0
            r0.A07()
            goto L_0x0174
        L_0x0184:
            java.lang.Object r0 = r1.A00
            X.2zi r0 = (X.C61102zi) r0
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x018c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r1.next()
            X.2sh r0 = (X.C56872sh) r0
            r0.A06()
            goto L_0x018c
        L_0x019c:
            java.lang.Object r0 = r1.A00
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r0 = r0.get()
            X.7XO r0 = (X.AnonymousClass7XO) r0
            if (r0 == 0) goto L_0x0034
            r0.A00()
            return
        L_0x01ac:
            java.lang.Object r3 = r1.A00
            com.whatsapp.stickers.store.StickerStoreActivity r3 = (com.whatsapp.stickers.store.StickerStoreActivity) r3
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r1 = r3.A07
            X.4TX r0 = r3.A05
            if (r0 == 0) goto L_0x0034
            java.util.List r0 = r0.A00
            int r2 = r0.indexOf(r1)
            r0 = -1
            if (r2 == r0) goto L_0x0034
            androidx.viewpager.widget.ViewPager r1 = r3.A01
            r0 = 1
            r1.A0F(r2, r0)
            return
        L_0x01c6:
            java.lang.Object r0 = r1.A00
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r3 = r0.iterator()
        L_0x01ce:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.String r2 = X.AnonymousClass001.A0m(r3)
            java.io.File r0 = X.AnonymousClass002.A0B(r2)
            X.C627536m.A0O(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "StickerStorePackPreviewActivity/deleteFiles/deleted: "
            X.C18260x0.A0q(r0, r2, r1)
            goto L_0x01ce
        L_0x01e9:
            java.lang.Object r3 = r1.A00
            X.5Of r3 = (X.C103735Of) r3
            X.4FS r2 = r3.A06
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            X.0QU r2 = X.AnonymousClass5CH.A00(r2, r0)
            X.5Rx r8 = r3.A04     // Catch:{ 0nr -> 0x05b9 }
            X.1vA r5 = r8.A01     // Catch:{ 0nr -> 0x05b9 }
            java.lang.String r4 = "STORAGE_USAGE_MEDIA_SIZE_CACHE_TIME"
            java.lang.Long r0 = r5.A01(r4)     // Catch:{ 0nr -> 0x05b9 }
            boolean r0 = r3.A00(r0)     // Catch:{ 0nr -> 0x05b9 }
            if (r0 == 0) goto L_0x0226
            java.lang.String r0 = "storage-usage-prefetcher/prefetch media size"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 0nr -> 0x05b9 }
            X.3Dh r0 = r3.A00     // Catch:{ 0nr -> 0x05b9 }
            java.io.File r0 = r0.A0G()     // Catch:{ 0nr -> 0x05b9 }
            long r6 = X.C627536m.A00(r2, r0)     // Catch:{ 0nr -> 0x05b9 }
            java.lang.String r1 = "STORAGE_USAGE_MEDIA_SIZE"
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ 0nr -> 0x05b9 }
            r5.A05(r1, r0)     // Catch:{ 0nr -> 0x05b9 }
            r8.A01(r4)     // Catch:{ 0nr -> 0x05b9 }
            java.lang.String r0 = "storage-usage-prefetcher/prefetch media size/completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 0nr -> 0x05b9 }
        L_0x0226:
            java.lang.String r0 = "STORAGE_USAGE_LARGE_FILES_CACHE_TIME"
            java.lang.Long r0 = r5.A01(r0)     // Catch:{ 0nr -> 0x05b9 }
            boolean r0 = r3.A00(r0)     // Catch:{ 0nr -> 0x05b9 }
            r4 = 10
            if (r0 == 0) goto L_0x0244
            java.lang.String r0 = "storage-usage-prefetcher/prefetch large files"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 0nr -> 0x05b9 }
            X.5Oe r1 = r3.A05     // Catch:{ 0nr -> 0x05b9 }
            r0 = 2
            r1.A00(r2, r4, r0)     // Catch:{ 0nr -> 0x05b9 }
            java.lang.String r0 = "storage-usage-prefetcher/prefetch large files/completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 0nr -> 0x05b9 }
        L_0x0244:
            java.lang.String r0 = "STORAGE_USAGE_FORWARDED_FILES_CACHE_TIME"
            java.lang.Long r0 = r5.A01(r0)     // Catch:{ 0nr -> 0x05b9 }
            boolean r0 = r3.A00(r0)     // Catch:{ 0nr -> 0x05b9 }
            if (r0 == 0) goto L_0x0260
            java.lang.String r0 = "storage-usage-prefetcher/prefetch forwarded files"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 0nr -> 0x05b9 }
            X.5Oe r1 = r3.A05     // Catch:{ 0nr -> 0x05b9 }
            r0 = 1
            r1.A00(r2, r4, r0)     // Catch:{ 0nr -> 0x05b9 }
            java.lang.String r0 = "storage-usage-prefetcher/prefetch forwarded files/completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 0nr -> 0x05b9 }
        L_0x0260:
            java.lang.String r0 = "STORAGE_USAGE_CHAT_LIST_CACHE_TIME"
            java.lang.Long r0 = r5.A01(r0)     // Catch:{ 0nr -> 0x05b9 }
            boolean r0 = r3.A00(r0)     // Catch:{ 0nr -> 0x05b9 }
            if (r0 == 0) goto L_0x0034
            goto L_0x059e
        L_0x026e:
            java.lang.Object r0 = r1.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r0 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r0
            X.4UA r3 = r0.A0O
            X.3Ls r1 = r3.A01
            boolean r0 = r1 instanceof X.C131936eQ
            if (r0 == 0) goto L_0x0034
            X.6eQ r1 = (X.C131936eQ) r1
            com.whatsapp.jid.UserJid r2 = r1.A00
            X.33g r0 = r3.A0M
            java.lang.String r1 = r0.A03(r2)
            if (r1 == 0) goto L_0x028a
            X.3Ls r0 = r3.A01
            r0.A0G = r1
        L_0x028a:
            r3.A0L(r2)
            return
        L_0x028e:
            java.lang.Object r2 = r1.A00
            X.4Me r2 = (X.C86874Me) r2
            X.5TQ r0 = r2.A04
            if (r0 != 0) goto L_0x0034
            X.3Dh r1 = r2.A07
            java.lang.String r0 = X.C107655bf.A0U()
            java.io.File r0 = X.C64393Dh.A00(r1, r0)
            goto L_0x05bf
        L_0x02a2:
            java.lang.Object r4 = r1.A00
            X.4Me r4 = (X.C86874Me) r4
            X.5TQ r0 = r4.A04
            if (r0 == 0) goto L_0x02bf
            float r1 = r0.A00()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x02bf
            float r0 = r4.A00
            float r0 = r0 + r1
            r4.A00 = r0
            int r0 = r4.A01
            int r0 = r0 + 1
            r4.A01 = r0
        L_0x02bf:
            android.os.Handler r3 = r4.A03
            r0 = 49
            X.5sF r2 = new X.5sF
            r2.<init>(r4, r0)
            r0 = 16
            goto L_0x0031
        L_0x02cc:
            java.lang.Object r1 = r1.A00
            X.4Mf r1 = (X.C86884Mf) r1
            r1.A01()
            r0 = 0
            r1.A04 = r0
            r1.A02()
            return
        L_0x02da:
            java.lang.Object r1 = r1.A00
            X.4Mf r1 = (X.C86884Mf) r1
            X.5ZQ r0 = r1.A03
            if (r0 == 0) goto L_0x02e5
            r0.A09()
        L_0x02e5:
            X.5ZQ r0 = r1.A03
            if (r0 == 0) goto L_0x02ec
            r0.A06()
        L_0x02ec:
            r0 = 0
            r1.A03 = r0
            r1.quit()
            r1.interrupt()
            return
        L_0x02f6:
            java.lang.Object r5 = r1.A00
            X.4Mf r5 = (X.C86884Mf) r5
            long r3 = r5.A01
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0308
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5.A01 = r0
        L_0x0308:
            r0 = 1
            r5.A04 = r0
            r5.A02()
            return
        L_0x030f:
            java.lang.Object r0 = r1.A00
            com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment r0 = (com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment) r0
            X.5LT r3 = X.C86654Ky.A0c(r0)
            android.view.animation.AlphaAnimation r2 = X.C86604Kt.A0G()
            r0 = 125(0x7d, double:6.2E-322)
            r2.setDuration(r0)
            com.whatsapp.status.playback.widget.AudioVolumeView r1 = r3.A0E
            r1.startAnimation(r2)
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x032b:
            java.lang.Object r1 = r1.A00
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r1 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r1
            r0 = 0
            r1.A0X = r0
            return
        L_0x0333:
            java.lang.Object r2 = r1.A00
            X.51x r2 = (X.AnonymousClass51x) r2
            r1 = 0
            r0 = 1
            r2.A0M(r1, r0)
            return
        L_0x033d:
            java.lang.Object r1 = r1.A00
            X.51x r1 = (X.AnonymousClass51x) r1
            r0 = 0
            r1.A05 = r0
            X.5Ut r0 = r1.A08()
            r0.A06()
            X.33M r0 = r1.A0Y
            r0.A07()
            r1.A0F()
            return
        L_0x0354:
            java.lang.Object r0 = r1.A00
            X.5U7 r0 = (X.AnonymousClass5U7) r0
            r0.A01()
            return
        L_0x035c:
            java.lang.Object r0 = r1.A00
            com.whatsapp.status.posting.FirstStatusConfirmationDialogFragment r0 = (com.whatsapp.status.posting.FirstStatusConfirmationDialogFragment) r0
            X.3FH r0 = r0.A02
            r0.A00()
            return
        L_0x0366:
            java.lang.Object r0 = r1.A00
            X.1ih r0 = (X.C29361ih) r0
            r0.A08()
            return
        L_0x036e:
            java.lang.Object r2 = r1.A00
            X.2sB r2 = (X.C56552sB) r2
            r2.A06()
            monitor-enter(r2)
            java.util.List r0 = r2.A03     // Catch:{ all -> 0x0384 }
            r0.clear()     // Catch:{ all -> 0x0384 }
            X.4ET r1 = r2.A00     // Catch:{ all -> 0x0384 }
            java.util.List r0 = r2.A03     // Catch:{ all -> 0x0384 }
            r1.Bgs(r0)     // Catch:{ all -> 0x0384 }
            monitor-exit(r2)     // Catch:{ all -> 0x0384 }
            return
        L_0x0384:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0384 }
            throw r0
        L_0x0387:
            java.lang.Object r0 = r1.A00
            X.2sB r0 = (X.C56552sB) r0
            r0.A06()
            return
        L_0x038f:
            java.lang.Object r0 = r1.A00
            X.4Dd r0 = (X.C84644Dd) r0
            r0.Bcf()
            return
        L_0x0397:
            java.lang.Object r0 = r1.A00
            com.whatsapp.stickers.store.StickerStoreActivity r0 = (com.whatsapp.stickers.store.StickerStoreActivity) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r0.A02
            r0 = 3
            r1.A0S(r0)
            return
        L_0x03a2:
            java.lang.Object r0 = r1.A00
            X.2cy r0 = (X.C47262cy) r0
            r0.A00()
            return
        L_0x03aa:
            java.lang.Object r0 = r1.A00
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r0 = (com.whatsapp.stickers.store.StickerStoreMyTabFragment) r0
            r0.A1U()
            return
        L_0x03b2:
            java.lang.Object r5 = r1.A00
            com.whatsapp.storage.StorageUsageActivity r5 = (com.whatsapp.storage.StorageUsageActivity) r5
            r5.A74()
            r5.A75()
            java.lang.String r0 = "storage-usage-activity/fetch cache"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5Rx r4 = r5.A0I
            java.lang.String r3 = "STORAGE_USAGE_MEDIA_SIZE_CACHE_TIME"
            boolean r0 = r4.A02(r3)
            if (r0 != 0) goto L_0x03d6
            X.1vA r2 = r4.A01
            r1 = 0
            r2.A05(r3, r1)
            java.lang.String r0 = "STORAGE_USAGE_MEDIA_SIZE"
            r2.A05(r0, r1)
        L_0x03d6:
            java.lang.String r3 = "STORAGE_USAGE_LARGE_FILES_CACHE_TIME"
            boolean r0 = r4.A02(r3)
            if (r0 != 0) goto L_0x03f3
            X.1vA r2 = r4.A01
            r1 = 0
            r2.A05(r3, r1)
            java.lang.String r0 = "STORAGE_USAGE_LARGE_FILES_MEDIA_SIZE"
            r2.A05(r0, r1)
            java.lang.String r0 = "STORAGE_USAGE_LARGE_FILES_COUNT"
            r2.A05(r0, r1)
            java.lang.String r0 = "STORAGE_USAGE_LARGE_FILES_ROW_IDS"
            r2.A05(r0, r1)
        L_0x03f3:
            java.lang.String r3 = "STORAGE_USAGE_FORWARDED_FILES_CACHE_TIME"
            boolean r0 = r4.A02(r3)
            if (r0 != 0) goto L_0x0410
            X.1vA r2 = r4.A01
            r1 = 0
            r2.A05(r3, r1)
            java.lang.String r0 = "STORAGE_USAGE_FORWARDED_FILES_MEDIA_SIZE"
            r2.A05(r0, r1)
            java.lang.String r0 = "STORAGE_USAGE_FORWARDED_FILES_COUNT"
            r2.A05(r0, r1)
            java.lang.String r0 = "STORAGE_USAGE_FORWARDED_FILES_ROW_IDS"
            r2.A05(r0, r1)
        L_0x0410:
            X.5Rx r0 = r5.A0I
            X.5Kd r9 = r0.A00()
            java.lang.Long r0 = r9.A04
            if (r0 != 0) goto L_0x0442
            r6 = 0
        L_0x041b:
            java.util.List r4 = r9.A06
            java.lang.Integer r3 = r9.A01
            java.lang.Long r2 = r9.A03
            X.1sV r1 = r5.A0L
            X.2qz r0 = r5.A0K
            X.5In r7 = X.AnonymousClass35X.A03(r0, r1, r3, r2, r4)
            java.util.List r4 = r9.A05
            java.lang.Integer r3 = r9.A00
            java.lang.Long r2 = r9.A02
            X.1sV r1 = r5.A0L
            X.2qz r0 = r5.A0K
            X.5In r8 = X.AnonymousClass35X.A03(r0, r1, r3, r2, r4)
            r10 = 15
            X.3c8 r4 = new X.3c8
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r5.A78(r4)
            return
        L_0x0442:
            long r11 = r0.longValue()
            X.2zf r0 = r5.A07
            long r13 = r0.A02()
            X.2zf r0 = r5.A07
            long r15 = r0.A04()
            X.5Io r6 = new X.5Io
            r10 = r6
            r10.<init>(r11, r13, r15)
            goto L_0x041b
        L_0x0459:
            java.lang.Object r0 = r1.A00
            com.whatsapp.storage.StorageUsageActivity r0 = (com.whatsapp.storage.StorageUsageActivity) r0
            r0.A74()
            r0.A75()
            return
        L_0x0464:
            java.lang.Object r0 = r1.A00
            X.29a r0 = (X.AnonymousClass29a) r0
            java.lang.Object r1 = r0.A00
            goto L_0x0471
        L_0x046b:
            java.lang.Object r0 = r1.A00
            X.3cK r0 = (X.C71573cK) r0
            java.lang.Object r1 = r0.A01
        L_0x0471:
            com.whatsapp.storage.StorageUsageActivity r1 = (com.whatsapp.storage.StorageUsageActivity) r1
            r0 = 3
            r1.A77(r0)
            return
        L_0x0478:
            java.lang.Object r2 = r1.A00
            X.4X8 r2 = (X.AnonymousClass4X8) r2
            r1 = 2
            r0 = 1
            r2.A0O(r1, r0)
            return
        L_0x0482:
            java.lang.Object r0 = r1.A00
            X.67m r0 = (X.C1231967m) r0
            java.lang.Object r0 = r0.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1L()
            return
        L_0x048e:
            java.lang.Object r1 = r1.A00
            X.4ea r1 = (X.C89654ea) r1
            r0 = 2131888543(0x7f12099f, float:1.9411724E38)
            r1.Bp9(r0)
            return
        L_0x0499:
            java.lang.Object r3 = r1.A00
            com.whatsapp.storage.StorageUsageGalleryActivity r3 = (com.whatsapp.storage.StorageUsageGalleryActivity) r3
            r1 = 0
            r0 = 2131890537(0x7f121169, float:1.9415769E38)
            com.whatsapp.dialogs.ProgressDialogFragment r1 = com.whatsapp.dialogs.ProgressDialogFragment.A00(r1, r0)
            r3.A0L = r1
            r0 = 1
            r1.A1P(r0)
            com.whatsapp.dialogs.ProgressDialogFragment r2 = r3.A0L
            r1 = 3
            X.6BC r0 = new X.6BC
            r0.<init>(r3, r1)
            r2.A00 = r0
            X.0df r1 = r3.getSupportFragmentManager()
            java.lang.Class<com.whatsapp.dialogs.ProgressDialogFragment> r0 = com.whatsapp.dialogs.ProgressDialogFragment.class
            java.lang.String r0 = r0.getName()
            r2.A1O(r1, r0)
            return
        L_0x04c3:
            java.lang.Object r3 = r1.A00
            com.whatsapp.storage.StorageUsageMediaPreviewView r3 = (com.whatsapp.storage.StorageUsageMediaPreviewView) r3
            java.util.List r2 = r3.A05
            int r1 = r3.A00
            java.lang.String r0 = r3.A04
            r3.setPreviewMediaItems(r2, r1, r0)
            return
        L_0x04d1:
            java.lang.Object r7 = r1.A00
            com.whatsapp.textstatus.AddTextStatusActivity r7 = (com.whatsapp.textstatus.AddTextStatusActivity) r7
            java.util.List r0 = r7.A0L
            java.lang.String r6 = "\n"
            r5 = 0
            r4 = 1
            X.C162457s7.A0J(r0, r4)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x052e }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ IOException -> 0x052e }
        L_0x04e6:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x052e }
            if (r0 == 0) goto L_0x0503
            java.lang.Object r1 = r2.next()     // Catch:{ IOException -> 0x052e }
            X.2mD r1 = (X.C52892mD) r1     // Catch:{ IOException -> 0x052e }
            java.lang.String r0 = r1.A02     // Catch:{ IOException -> 0x052e }
            r3.append(r0)     // Catch:{ IOException -> 0x052e }
            r3.append(r6)     // Catch:{ IOException -> 0x052e }
            java.lang.String r0 = r1.A03     // Catch:{ IOException -> 0x052e }
            r3.append(r0)     // Catch:{ IOException -> 0x052e }
            r3.append(r6)     // Catch:{ IOException -> 0x052e }
            goto L_0x04e6
        L_0x0503:
            int r0 = r3.length()     // Catch:{ IOException -> 0x052e }
            if (r0 <= r4) goto L_0x0511
            int r0 = r3.length()     // Catch:{ IOException -> 0x052e }
            int r0 = r0 - r4
            r3.deleteCharAt(r0)     // Catch:{ IOException -> 0x052e }
        L_0x0511:
            java.lang.String r0 = "customTSValues"
            java.io.FileOutputStream r0 = r7.openFileOutput(r0, r5)     // Catch:{ IOException -> 0x052e }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x052e }
            r2.<init>(r0)     // Catch:{ IOException -> 0x052e }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0527 }
            r2.writeObject(r0)     // Catch:{ all -> 0x0527 }
            r2.close()     // Catch:{ IOException -> 0x052e }
            return
        L_0x0527:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0529 }
        L_0x0529:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ IOException -> 0x052e }
            throw r0     // Catch:{ IOException -> 0x052e }
        L_0x052e:
            r1 = move-exception
            java.lang.String r0 = "SaveCustomStatus"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0535:
            java.lang.Object r3 = r1.A00
            com.whatsapp.textstatus.AddTextStatusActivity r3 = (com.whatsapp.textstatus.AddTextStatusActivity) r3
            android.content.res.Resources r2 = r3.getResources()
            X.C162457s7.A0D(r2)
            X.5Y0 r0 = r3.A0C
            X.C162457s7.A0D(r0)
            java.lang.String r1 = "💬"
            android.graphics.drawable.Drawable r0 = X.AnonymousClass31U.A00(r2, r0, r1)
            r3.A05.A0S(new X.C71573cK(r3, 39, r0))
            r3.A0D = r1
            return
        L_0x0551:
            java.lang.Object r3 = r1.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r3 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r3
            android.view.View r1 = r3.A07
            if (r1 == 0) goto L_0x056c
            r0 = 8
            r1.setVisibility(r0)
            android.view.animation.AlphaAnimation r2 = X.C86604Kt.A0G()
            r0 = 320(0x140, double:1.58E-321)
            r2.setDuration(r0)
            android.view.View r0 = r3.A07
            r0.startAnimation(r2)
        L_0x056c:
            X.3Wi r1 = r3.A05
            java.lang.Runnable r0 = r3.A18
            r1.A0R(r0)
            return
        L_0x0574:
            java.lang.Object r0 = r1.A00
            X.67F r0 = (X.AnonymousClass67F) r0
            java.lang.Object r0 = r0.A01
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r0 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r0
            android.widget.ScrollView r1 = r0.A0B
            goto L_0x0587
        L_0x057f:
            java.lang.Object r0 = r1.A00
            X.52Q r0 = (X.AnonymousClass52Q) r0
            X.5WL r0 = r0.A00
            android.widget.ScrollView r1 = r0.A07
        L_0x0587:
            r0 = 130(0x82, float:1.82E-43)
            r1.fullScroll(r0)
            return
        L_0x058d:
            java.lang.Object r1 = r1.A00
            java.io.File r1 = (java.io.File) r1
            boolean r0 = X.C615631i.A02()
            r0 = r0 ^ 1
            X.C626936e.A0B(r0)
            X.C627536m.A0O(r1)
            return
        L_0x059e:
            java.lang.String r0 = "storage-usage-prefetcher/prefetch chat list"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x05b2 }
            X.2yK r1 = r3.A03     // Catch:{ RuntimeException -> 0x05b2 }
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C18280x3.A0l()     // Catch:{ RuntimeException -> 0x05b2 }
            r1.A02(r2, r0)     // Catch:{ RuntimeException -> 0x05b2 }
            java.lang.String r0 = "storage-usage-prefetcher/prefetch chat list/completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x05b2 }
            return
        L_0x05b2:
            r1 = move-exception
            java.lang.String r0 = "StorageUsagePrefetcher/maybePrefetchStorageUsageData/loading-chat-list"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 0nr -> 0x05b9 }
            return
        L_0x05b9:
            java.lang.String r0 = "storage-usage-prefetcherprefetch prefetch cancelled"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x05bf:
            X.2sH r7 = r2.A0B     // Catch:{ Exception -> 0x05f8 }
            X.1VX r8 = r2.A0C     // Catch:{ Exception -> 0x05f8 }
            X.3Wi r4 = r2.A08     // Catch:{ Exception -> 0x05f8 }
            com.whatsapp.audioRecording.AudioRecordFactory r5 = r2.A09     // Catch:{ Exception -> 0x05f8 }
            com.whatsapp.audioRecording.OpusRecorderFactory r6 = r2.A0A     // Catch:{ Exception -> 0x05f8 }
            java.lang.String r10 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x05f8 }
            X.5qa r9 = new X.5qa     // Catch:{ Exception -> 0x05f8 }
            r9.<init>(r2)     // Catch:{ Exception -> 0x05f8 }
            X.5TQ r3 = new X.5TQ     // Catch:{ Exception -> 0x05f8 }
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x05f8 }
            r2.A04 = r3     // Catch:{ Exception -> 0x05f8 }
            com.whatsapp.util.OpusRecorder r0 = r3.A06     // Catch:{ Exception -> 0x05f8 }
            r0.prepare()     // Catch:{ Exception -> 0x05f8 }
            X.5TQ r1 = r2.A04     // Catch:{ Exception -> 0x05f8 }
            com.whatsapp.util.OpusRecorder r0 = r1.A06     // Catch:{ Exception -> 0x05f8 }
            r0.start()     // Catch:{ Exception -> 0x05f8 }
            android.media.AudioRecord r3 = r1.A03     // Catch:{ Exception -> 0x05f8 }
            int r1 = r3.getState()     // Catch:{ Exception -> 0x05f8 }
            r0 = 1
            if (r1 != r0) goto L_0x05f1
            r3.startRecording()     // Catch:{ Exception -> 0x05f8 }
        L_0x05f1:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x05f8 }
            r2.A02 = r0     // Catch:{ Exception -> 0x05f8 }
            return
        L_0x05f8:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 1
            r2.A01(r0)
            android.os.Handler r1 = r2.A06
            r0 = 2
            X.C117095rN.A00(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117635sF.run():void");
    }

    public C117635sF(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
