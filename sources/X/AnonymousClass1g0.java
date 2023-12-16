package X;

import java.io.File;

/* renamed from: X.1g0  reason: invalid class name */
public final class AnonymousClass1g0 extends AnonymousClass1g3 implements AnonymousClass4EV {
    public C26051bV A00;
    public File A01;
    public boolean A02;
    public final long A03;
    public final C54292oU A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass668 A06;
    public final C103265Mf A07;
    public final String A08;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1g0(X.C56492s4 r11, X.C56612sH r12, X.C54292oU r13, X.C61072zf r14, X.AnonymousClass1VX r15, X.C55002pd r16, X.AnonymousClass668 r17, X.C103265Mf r18, X.C29011i8 r19, java.lang.String r20, long r21) {
        /*
            r10 = this;
            r3 = r11
            r4 = r12
            r5 = r14
            r8 = r19
            X.C18260x0.A0c(r12, r11, r14, r8)
            r6 = r15
            X.C18260x0.A0U(r15, r13)
            r9 = 0
            r2 = r10
            r7 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10.A05 = r15
            r10.A04 = r13
            r0 = r18
            r10.A07 = r0
            r0 = r21
            r10.A03 = r0
            r0 = r20
            r10.A08 = r0
            r0 = r17
            r10.A06 = r0
            r10.AwR(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1g0.<init>(X.2s4, X.2sH, X.2oU, X.2zf, X.1VX, X.2pd, X.668, X.5Mf, X.1i8, java.lang.String, long):void");
    }

    public AnonymousClass7E5 A02() {
        this.A02 = true;
        AnonymousClass7E5 A022 = super.A02();
        C26051bV r2 = A022.A00.A00;
        if (r2 != null) {
            r2.A0H = 1;
            r2.A0I = AnonymousClass0x9.A0j();
            r2.A0G = C18310x6.A0e();
            r2.A0F = C18290x4.A0c();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("AnonymousProfilePicDownload/download Download result: ");
            C18260x0.A0m(this.A00, A0o);
        } else {
            r2 = null;
        }
        this.A00 = r2;
        return A022;
    }

    public void BRW(boolean z) {
        this.A02 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BRX(X.C625435m r11, X.C56902sk r12) {
        /*
            r10 = this;
            r3 = 0
            java.lang.StringBuilder r2 = X.C18280x3.A0g(r11, r3)
            java.lang.String r0 = "AnonymousProfilePicDownload/onDownloadCompleted/isSuccess = "
            r2.append(r0)
            int r1 = r11.A01
            boolean r0 = X.AnonymousClass000.A1T(r1)
            X.C18260x0.A1U(r2, r0)
            r7 = 1
            if (r0 == 0) goto L_0x008a
            java.io.File r0 = r10.A01     // Catch:{ FileNotFoundException -> 0x0068, IOException -> 0x005a }
            if (r0 == 0) goto L_0x0028
            long r0 = r0.length()     // Catch:{ FileNotFoundException -> 0x0068, IOException -> 0x005a }
            int r5 = (int) r0     // Catch:{ FileNotFoundException -> 0x0068, IOException -> 0x005a }
        L_0x001f:
            byte[] r1 = new byte[r5]     // Catch:{ FileNotFoundException -> 0x0068, IOException -> 0x005a }
            java.io.File r0 = r10.A01     // Catch:{ FileNotFoundException -> 0x0068, IOException -> 0x005a }
            java.io.FileInputStream r4 = X.AnonymousClass0x9.A0g(r0)     // Catch:{ FileNotFoundException -> 0x0068, IOException -> 0x005a }
            goto L_0x002a
        L_0x0028:
            r5 = 0
            goto L_0x001f
        L_0x002a:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0053 }
            r2.<init>(r4)     // Catch:{ all -> 0x0053 }
            r2.read(r1, r3, r5)     // Catch:{ all -> 0x004c }
            r2.close()     // Catch:{ all -> 0x0053 }
            r4.close()     // Catch:{ FileNotFoundException -> 0x0068, IOException -> 0x005a }
            X.668 r0 = r10.A06     // Catch:{ FileNotFoundException -> 0x0068, IOException -> 0x005a }
            r0.BdK(r1)     // Catch:{ FileNotFoundException -> 0x0068, IOException -> 0x005a }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ FileNotFoundException -> 0x0068, IOException -> 0x005a }
            java.lang.String r0 = "AnonymousProfilePicDownload: Downloaded successfully: "
            r1.append(r0)     // Catch:{ FileNotFoundException -> 0x0068, IOException -> 0x005a }
            java.lang.String r0 = r10.A08     // Catch:{ FileNotFoundException -> 0x0068, IOException -> 0x005a }
            X.C18260x0.A1M(r1, r0)     // Catch:{ FileNotFoundException -> 0x0068, IOException -> 0x005a }
            goto L_0x0099
        L_0x004c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ FileNotFoundException -> 0x0068, IOException -> 0x005a }
            throw r0     // Catch:{ FileNotFoundException -> 0x0068, IOException -> 0x005a }
        L_0x005a:
            r1 = move-exception
            java.lang.String r0 = "AnonymousProfilePicDownload: IO Exception while reading the picture download file"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0076 }
            X.668 r1 = r10.A06     // Catch:{ all -> 0x0076 }
            X.583 r0 = X.AnonymousClass583.IO_ERROR     // Catch:{ all -> 0x0076 }
            r1.BS4(r0)     // Catch:{ all -> 0x0076 }
            goto L_0x0099
        L_0x0068:
            r1 = move-exception
            java.lang.String r0 = "AnonymousProfilePicDownload: Could not find picture download file"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0076 }
            X.668 r1 = r10.A06     // Catch:{ all -> 0x0076 }
            X.583 r0 = X.AnonymousClass583.FILE_NOT_FOUND     // Catch:{ all -> 0x0076 }
            r1.BS4(r0)     // Catch:{ all -> 0x0076 }
            goto L_0x0099
        L_0x0076:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AnonymousProfilePicDownload/cleanupDownload/isCancelled = "
            X.C18260x0.A1D(r0, r1, r3)
            java.io.File r0 = r10.A01
            if (r0 == 0) goto L_0x0087
            r0.delete()
        L_0x0087:
            r10.A02 = r3
            throw r2
        L_0x008a:
            boolean r0 = X.C625435m.A02(r1)
            r7 = 6
            if (r0 == 0) goto L_0x0092
            r7 = 4
        L_0x0092:
            X.668 r1 = r10.A06
            X.583 r0 = X.AnonymousClass583.DOWNLOAD_ERROR
            r1.BS4(r0)
        L_0x0099:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AnonymousProfilePicDownload/cleanupDownload/isCancelled = "
            X.C18260x0.A1D(r0, r1, r3)
            java.io.File r0 = r10.A01
            if (r0 == 0) goto L_0x00a9
            r0.delete()
        L_0x00a9:
            r10.A02 = r3
            X.1bV r0 = r11.A00
            if (r0 == 0) goto L_0x00d7
            java.lang.Long r0 = r0.A0M
            if (r0 == 0) goto L_0x00d7
            long r0 = r0.longValue()
            int r9 = (int) r0
        L_0x00b8:
            X.5Mf r4 = r10.A07
            r8 = 1
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r10.A03
            java.lang.Long r6 = X.C18310x6.A0f(r2, r0)
            java.io.File r0 = r10.A01
            if (r0 == 0) goto L_0x00d5
            long r0 = r0.length()
            java.lang.Double r5 = X.C18330xA.A07(r0)
        L_0x00d1:
            r4.A00(r5, r6, r7, r8, r9)
            return
        L_0x00d5:
            r5 = 0
            goto L_0x00d1
        L_0x00d7:
            r9 = -1
            goto L_0x00b8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1g0.BRX(X.35m, X.2sk):void");
    }

    public /* synthetic */ void BRU(long j) {
    }
}
