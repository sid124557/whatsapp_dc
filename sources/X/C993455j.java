package X;

import com.whatsapp.Mp4Ops;
import java.io.File;

/* renamed from: X.55j  reason: invalid class name and case insensitive filesystem */
public abstract class C993455j extends AnonymousClass5ZM {
    public final C55682qk A00;
    public final Mp4Ops A01;
    public final C56492s4 A02;
    public final C153407bG A03;
    public final C56512s6 A04;
    public final C56612sH A05;
    public final C184388ri A06;
    public final C184398rj A07;
    public final String A08;
    public final boolean A09;

    /* renamed from: A0H */
    public final void A0C(C151017Tc r5) {
        File file;
        C184388ri r3 = this.A06;
        String str = this.A08;
        byte[] bArr = null;
        if (r5 == null) {
            file = null;
        } else {
            file = r5.A02;
            bArr = r5.A03;
        }
        r3.BTT(file, str, bArr);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("gif/cache/");
        A0o.append(r5);
        C18260x0.A0q(" for ", str, A0o);
    }

    public C993455j(C55682qk r1, Mp4Ops mp4Ops, C56492s4 r3, C153407bG r4, C56512s6 r5, C56612sH r6, C184388ri r7, C184398rj r8, String str, boolean z) {
        this.A05 = r6;
        this.A01 = mp4Ops;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A08 = str;
        this.A06 = r7;
        this.A09 = z;
        this.A07 = r8;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return A0G();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01da, code lost:
        if (r3 == null) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01df, code lost:
        if (r4 == null) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011e, code lost:
        r2 = X.C107085af.A04(r8);
        r20 = r20.A0H() - r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x012a, code lost:
        if (r10.A09 == false) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012c, code lost:
        r7 = r10.A00;
        r1 = r10.A03;
        r0 = r10.A04;
        com.whatsapp.Mp4Ops.A01(r7, r1, r0, r8);
        com.whatsapp.GifHelper.A00(r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x013c, code lost:
        if (r22.isCancelled() != false) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013e, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r7 = r6.B3u(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0143, code lost:
        if (r7 == null) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0145, code lost:
        r10 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014f, code lost:
        if (X.AnonymousClass002.A0B(r10).exists() == false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0161, code lost:
        if (X.AnonymousClass002.A0B(r10).getAbsolutePath().equals(r8.getAbsolutePath()) != false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0163, code lost:
        r3.close();
        X.C627536m.A0O(r8);
        r13 = new X.C151017Tc(X.AnonymousClass002.A0B(r10), r7.A02, -1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0178, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x017a, code lost:
        r6.Bhn(new X.AnonymousClass2OC(r8.getAbsolutePath(), r2, r9), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0186, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r15 = new X.C151017Tc(r8, r2, r18, r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r3.close();
        r4.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01c7 A[SYNTHETIC, Splitter:B:91:0x01c7] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01cc A[Catch:{ IOException -> 0x01cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C151017Tc A0G() {
        /*
            r23 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "gif/cache/loading "
            r1.append(r0)
            r10 = r23
            java.lang.String r9 = r10.A08
            X.C18260x0.A1J(r1, r9)
            X.4MC r0 = r10.A02
            r22 = r0
            boolean r0 = r22.isCancelled()
            r13 = 0
            if (r0 == 0) goto L_0x0025
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "gif/cache/loading canceled "
            X.C18260x0.A0q(r0, r9, r1)
            return r13
        L_0x0025:
            X.8rj r6 = r10.A07
            X.2OC r1 = r6.B3u(r9)
            if (r1 == 0) goto L_0x003f
            java.lang.String r0 = r1.A00
            java.io.File r14 = X.AnonymousClass002.A0B(r0)
            byte[] r15 = r1.A02
            r16 = -1
            X.7Tc r13 = new X.7Tc
            r18 = r16
            r13.<init>(r14, r15, r16, r18)
            return r13
        L_0x003f:
            X.2sH r0 = r10.A05
            r20 = r0
            long r16 = r20.A0H()
            r0 = 10
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ Exception -> 0x01be, all -> 0x01ec }
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x01be, all -> 0x01ec }
            r0.<init>(r9)     // Catch:{ Exception -> 0x01be, all -> 0x01ec }
            java.net.URLConnection r5 = r0.openConnection()     // Catch:{ Exception -> 0x01be, all -> 0x01ec }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ Exception -> 0x01be, all -> 0x01ec }
            r5.connect()     // Catch:{ Exception -> 0x01bc, all -> 0x01e5 }
            int r1 = r5.getResponseCode()     // Catch:{ Exception -> 0x01bc, all -> 0x01e5 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0069
            r5.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r13
        L_0x0069:
            int r12 = r5.getContentLength()     // Catch:{ Exception -> 0x01bc, all -> 0x01e5 }
            X.2s4 r2 = r10.A02     // Catch:{ Exception -> 0x01bc, all -> 0x01e5 }
            r11 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x01bc, all -> 0x01e5 }
            java.io.InputStream r0 = r5.getInputStream()     // Catch:{ Exception -> 0x01bc, all -> 0x01e5 }
            X.1zz r4 = new X.1zz     // Catch:{ Exception -> 0x01bc, all -> 0x01e5 }
            r4.<init>(r2, r0, r13, r1)     // Catch:{ Exception -> 0x01bc, all -> 0x01e5 }
            boolean r0 = r10 instanceof X.C95394ta     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            if (r0 == 0) goto L_0x00d2
            r3 = r10
            X.4ta r3 = (X.C95394ta) r3     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            X.8rj r1 = r3.A07     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            boolean r0 = r1 instanceof X.C171308Go     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            if (r0 == 0) goto L_0x00b2
            X.8Go r1 = (X.C171308Go) r1     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            java.lang.String r0 = r3.A08     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            X.C626936e.A00()     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            r1.A00()     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            com.facebook.stash.core.FileStash r2 = r1.A00     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            java.lang.StringBuilder r1 = X.C18290x4.A0u(r2)     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            java.lang.String r0 = X.C627236i.A04(r0)     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            r1.append(r0)     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            java.lang.String r0 = ".gif"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            java.io.File r8 = r2.insertFile(r0)     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
        L_0x00ab:
            java.io.FileOutputStream r3 = X.AnonymousClass0x9.A0h(r8)     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x00ed
        L_0x00b2:
            X.2oU r0 = r3.A00     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            android.content.Context r1 = r0.A00     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            java.lang.String r0 = "gif/gif_preview_cache"
            java.io.File r2 = X.C627536m.A03(r1, r0)     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            if (r2 == 0) goto L_0x01b1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            java.lang.String r0 = r3.A08     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            java.lang.String r0 = X.C627236i.A04(r0)     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            r1.append(r0)     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            java.lang.String r0 = ".gif"
            java.io.File r8 = X.C18270x1.A0A(r2, r0, r1)     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            goto L_0x00ab
        L_0x00d2:
            r0 = r10
            X.4tZ r0 = (X.C95384tZ) r0     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            X.3Dh r2 = r0.A00     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            java.lang.String r0 = X.C107655bf.A0U()     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            r1.append(r0)     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            java.lang.String r0 = ".mp4"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            java.io.File r8 = X.C64393Dh.A00(r2, r0)     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            goto L_0x00ab
        L_0x00ed:
            byte[] r7 = new byte[r0]     // Catch:{ Exception -> 0x01af }
            r18 = 0
        L_0x00f1:
            int r2 = r4.read(r7)     // Catch:{ Exception -> 0x01af }
            r0 = -1
            if (r2 == r0) goto L_0x011e
            boolean r0 = r22.isCancelled()     // Catch:{ Exception -> 0x01af }
            if (r0 == 0) goto L_0x0103
            r4.close()     // Catch:{ Exception -> 0x01af }
            goto L_0x01a2
        L_0x0103:
            long r0 = (long) r2     // Catch:{ Exception -> 0x01af }
            long r18 = r18 + r0
            if (r12 <= 0) goto L_0x0119
            java.lang.Object[] r13 = X.AnonymousClass002.A0L()     // Catch:{ Exception -> 0x01af }
            r0 = 100
            long r0 = r0 * r18
            long r14 = (long) r12     // Catch:{ Exception -> 0x01af }
            long r0 = r0 / r14
            int r14 = (int) r0     // Catch:{ Exception -> 0x01af }
            X.AnonymousClass000.A1P(r13, r14, r11)     // Catch:{ Exception -> 0x01af }
            r10.A0F(r13)     // Catch:{ Exception -> 0x01af }
        L_0x0119:
            r3.write(r7, r11, r2)     // Catch:{ Exception -> 0x01af }
            r13 = 0
            goto L_0x00f1
        L_0x011e:
            byte[] r2 = X.C107085af.A04(r8)     // Catch:{ Exception -> 0x01af }
            long r20 = r20.A0H()     // Catch:{ Exception -> 0x01af }
            long r20 = r20 - r16
            boolean r0 = r10.A09     // Catch:{ Exception -> 0x01af }
            if (r0 == 0) goto L_0x0138
            X.2qk r7 = r10.A00     // Catch:{ Exception -> 0x01af }
            X.7bG r1 = r10.A03     // Catch:{ Exception -> 0x01af }
            X.2s6 r0 = r10.A04     // Catch:{ Exception -> 0x01af }
            com.whatsapp.Mp4Ops.A01(r7, r1, r0, r8)     // Catch:{ Exception -> 0x01af }
            com.whatsapp.GifHelper.A00(r0, r8)     // Catch:{ Exception -> 0x01af }
        L_0x0138:
            boolean r0 = r22.isCancelled()     // Catch:{ Exception -> 0x01af }
            if (r0 != 0) goto L_0x01a2
            monitor-enter(r6)     // Catch:{ Exception -> 0x01af }
            X.2OC r7 = r6.B3u(r9)     // Catch:{ all -> 0x019d }
            if (r7 == 0) goto L_0x017a
            java.lang.String r10 = r7.A00     // Catch:{ all -> 0x019d }
            java.io.File r0 = X.AnonymousClass002.A0B(r10)     // Catch:{ all -> 0x019d }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x019d }
            if (r0 == 0) goto L_0x017a
            java.io.File r0 = X.AnonymousClass002.A0B(r10)     // Catch:{ all -> 0x019d }
            java.lang.String r1 = r0.getAbsolutePath()     // Catch:{ all -> 0x019d }
            java.lang.String r0 = r8.getAbsolutePath()     // Catch:{ all -> 0x019d }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x019d }
            if (r0 != 0) goto L_0x017a
            r3.close()     // Catch:{ all -> 0x019d }
            X.C627536m.A0O(r8)     // Catch:{ all -> 0x019d }
            java.io.File r14 = X.AnonymousClass002.A0B(r10)     // Catch:{ all -> 0x019d }
            byte[] r15 = r7.A02     // Catch:{ all -> 0x019d }
            r16 = -1
            X.7Tc r13 = new X.7Tc     // Catch:{ all -> 0x019d }
            r18 = r16
            r13.<init>(r14, r15, r16, r18)     // Catch:{ all -> 0x019d }
            monitor-exit(r6)     // Catch:{ all -> 0x019d }
            goto L_0x01a2
        L_0x017a:
            java.lang.String r1 = r8.getAbsolutePath()     // Catch:{ all -> 0x019d }
            X.2OC r0 = new X.2OC     // Catch:{ all -> 0x019d }
            r0.<init>(r1, r2, r9)     // Catch:{ all -> 0x019d }
            r6.Bhn(r0, r9)     // Catch:{ all -> 0x019d }
            monitor-exit(r6)     // Catch:{ all -> 0x019d }
            X.7Tc r15 = new X.7Tc     // Catch:{ Exception -> 0x01af, all -> 0x01a0 }
            r16 = r8
            r17 = r2
            r15.<init>(r16, r17, r18, r20)     // Catch:{ Exception -> 0x01af, all -> 0x01a0 }
            r3.close()     // Catch:{ IOException -> 0x0196 }
            r4.close()     // Catch:{ IOException -> 0x0196 }
        L_0x0196:
            r5.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r15
        L_0x019d:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x019d }
            throw r0     // Catch:{ Exception -> 0x01af, all -> 0x01a0 }
        L_0x01a0:
            r0 = move-exception
            goto L_0x01dc
        L_0x01a2:
            r3.close()     // Catch:{ IOException -> 0x01a8 }
            r4.close()     // Catch:{ IOException -> 0x01a8 }
        L_0x01a8:
            r5.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r13
        L_0x01af:
            r0 = move-exception
            goto L_0x01c2
        L_0x01b1:
            java.lang.String r0 = "gifcache/gifpreviewdownloadaction/createtempfile/error creating directory"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
            throw r0     // Catch:{ Exception -> 0x01ba, all -> 0x01b8 }
        L_0x01b8:
            r0 = move-exception
            goto L_0x01e1
        L_0x01ba:
            r0 = move-exception
            goto L_0x01c1
        L_0x01bc:
            r0 = move-exception
            goto L_0x01c0
        L_0x01be:
            r0 = move-exception
            r5 = 0
        L_0x01c0:
            r4 = 0
        L_0x01c1:
            r3 = 0
        L_0x01c2:
            com.whatsapp.util.Log.w((java.lang.Throwable) r0)     // Catch:{ all -> 0x01d9 }
            if (r3 == 0) goto L_0x01ca
            r3.close()     // Catch:{ IOException -> 0x01cf }
        L_0x01ca:
            if (r4 == 0) goto L_0x01cf
            r4.close()     // Catch:{ IOException -> 0x01cf }
        L_0x01cf:
            if (r5 == 0) goto L_0x01d4
            r5.disconnect()
        L_0x01d4:
            android.net.TrafficStats.clearThreadStatsTag()
            r13 = 0
            return r13
        L_0x01d9:
            r0 = move-exception
            if (r3 == 0) goto L_0x01df
        L_0x01dc:
            r3.close()     // Catch:{ IOException -> 0x01e6 }
        L_0x01df:
            if (r4 == 0) goto L_0x01e6
        L_0x01e1:
            r4.close()     // Catch:{ IOException -> 0x01e6 }
            goto L_0x01e6
        L_0x01e5:
            r0 = move-exception
        L_0x01e6:
            if (r5 == 0) goto L_0x01ed
            r5.disconnect()
            goto L_0x01ed
        L_0x01ec:
            r0 = move-exception
        L_0x01ed:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C993455j.A0G():X.7Tc");
    }
}
