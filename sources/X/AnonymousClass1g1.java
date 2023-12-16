package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1g1  reason: invalid class name */
public class AnonymousClass1g1 extends AnonymousClass1g3 implements AnonymousClass4EV {
    public C26051bV A00;
    public final long A01;
    public final C55052pi A02;
    public final C54292oU A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass2T0 A05;
    public final C103265Mf A06;
    public final C84134Bd A07;
    public final String A08;
    public volatile File A09;
    public volatile boolean A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1g1(X.C56492s4 r12, X.C55052pi r13, X.C56612sH r14, X.C54292oU r15, X.C61072zf r16, X.AnonymousClass1VX r17, X.C55002pd r18, X.AnonymousClass2T0 r19, X.C103265Mf r20, X.C29011i8 r21, X.C84134Bd r22, java.lang.String r23, long r24) {
        /*
            r11 = this;
            r10 = 0
            r3 = r11
            r4 = r12
            r5 = r14
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2 = r19
            X.C626936e.A06(r2)
            r11.A04 = r7
            r0 = r24
            r11.A01 = r0
            r0 = r23
            r11.A08 = r0
            r0 = r22
            r11.A07 = r0
            r11.A03 = r15
            r11.A05 = r2
            r0 = r20
            r11.A06 = r0
            r11.A02 = r13
            r11.AwR(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1g1.<init>(X.2s4, X.2pi, X.2sH, X.2oU, X.2zf, X.1VX, X.2pd, X.2T0, X.5Mf, X.1i8, X.4Bd, java.lang.String, long):void");
    }

    public /* synthetic */ void BRU(long j) {
    }

    public void BRW(boolean z) {
        Log.d("ProfilePicturePlainFileDownload/onDownloadCanceled");
        A05(true);
    }

    public AnonymousClass7E5 A02() {
        AnonymousClass7E5 A022 = super.A02();
        C26051bV r3 = A022.A00.A00;
        this.A00 = r3;
        if (r3 != null) {
            r3.A0H = C18300x5.A0Z();
            r3.A0I = AnonymousClass0x9.A0j();
            r3.A0G = C18310x6.A0e();
            int i = 5;
            if (this.A05.A02 == 1) {
                i = 2;
            }
            r3.A0F = Integer.valueOf(i);
            C18260x0.A1P(AnonymousClass001.A0o(), "ProfilePicturePlainFileDownload/download Download result: ", r3);
            return A022;
        }
        Log.e("ProfilePicturePlainFileDownload/download media_download2 event in DownloadResponse is null");
        return A022;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (r1.exists() != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(boolean r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ProfilePicturePlainFileDownload/cleanupDownload/isCancelled = "
            X.C18260x0.A1D(r0, r1, r5)
            if (r5 == 0) goto L_0x003a
            X.2oU r0 = r4.A03
            android.content.Context r3 = r0.A00
            X.2T0 r0 = r4.A05
            java.net.URL r2 = r0.A06
            java.lang.String r1 = r0.A04
            int r0 = r0.A02
            java.io.File r1 = X.C59792xU.A00(r3, r1, r2, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0024
        L_0x0021:
            r1.delete()
        L_0x0024:
            X.4Bd r1 = r4.A07
            java.lang.String r0 = r4.A08
            r1.AwB(r0)
            r0 = 0
            r4.A0A = r0
            X.1bV r1 = r4.A00
            if (r1 == 0) goto L_0x0039
            X.5Mf r0 = r4.A06
            X.4FV r0 = r0.A00
            r0.BhD(r1)
        L_0x0039:
            return
        L_0x003a:
            java.io.File r1 = r4.A09
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1g1.A05(boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BRX(X.C625435m r12, X.C56902sk r13) {
        /*
            r11 = this;
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ProfilePicturePlainFileDownload/onDownloadCompleted/isSuccess = "
            r2.append(r0)
            int r1 = r12.A01
            boolean r0 = X.AnonymousClass000.A1T(r1)
            X.C18260x0.A1U(r2, r0)
            r4 = 0
            if (r0 == 0) goto L_0x004b
            java.io.File r0 = r11.A09
            long r2 = r0.length()
            int r1 = (int) r2
            byte[] r3 = new byte[r1]
            java.io.File r0 = r11.A09     // Catch:{ FileNotFoundException -> 0x0054, IOException -> 0x0047 }
            java.io.FileInputStream r2 = X.AnonymousClass0x9.A0g(r0)     // Catch:{ FileNotFoundException -> 0x0054, IOException -> 0x0047 }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ all -> 0x003d }
            r0.<init>(r2)     // Catch:{ all -> 0x003d }
            r0.read(r3, r4, r1)     // Catch:{ all -> 0x0033 }
            r0.close()     // Catch:{ all -> 0x003d }
            r2.close()     // Catch:{ FileNotFoundException -> 0x0054, IOException -> 0x0047 }
            goto L_0x005a
        L_0x0033:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0038 }
            goto L_0x003c
        L_0x0038:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x003d }
        L_0x003c:
            throw r1     // Catch:{ all -> 0x003d }
        L_0x003d:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0042 }
            goto L_0x0046
        L_0x0042:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x0054, IOException -> 0x0047 }
        L_0x0046:
            throw r1     // Catch:{ FileNotFoundException -> 0x0054, IOException -> 0x0047 }
        L_0x0047:
            r1 = move-exception
            java.lang.String r0 = "ProfilePictureDownload: IO Exception while reading the picture download file"
            goto L_0x0057
        L_0x004b:
            boolean r0 = X.C625435m.A02(r1)
            r8 = 6
            if (r0 == 0) goto L_0x0064
            r8 = 4
            goto L_0x0064
        L_0x0054:
            r1 = move-exception
            java.lang.String r0 = "ProfilePictureDownload: Could not find picture download file"
        L_0x0057:
            com.whatsapp.util.Log.w(r0, r1)
        L_0x005a:
            X.2T0 r1 = r11.A05
            r1.A00 = r3
            X.2pi r0 = r11.A02
            r0.A03(r1)
            r8 = 1
        L_0x0064:
            X.1bV r0 = r12.A00
            if (r0 == 0) goto L_0x009d
            java.lang.Long r0 = r0.A0M
            if (r0 == 0) goto L_0x009d
            long r0 = r0.longValue()
            int r10 = (int) r0
        L_0x0071:
            X.5Mf r5 = r11.A06
            X.2T0 r0 = r11.A05
            int r1 = r0.A02
            r0 = 1
            r9 = 1
            if (r1 != r0) goto L_0x007c
            r9 = 2
        L_0x007c:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r11.A01
            java.lang.Long r7 = X.C18310x6.A0f(r2, r0)
            java.io.File r0 = r11.A09
            if (r0 == 0) goto L_0x009b
            java.io.File r0 = r11.A09
            long r0 = r0.length()
            java.lang.Double r6 = X.C18330xA.A07(r0)
        L_0x0094:
            r5.A00(r6, r7, r8, r9, r10)
            r11.A05(r4)
            return
        L_0x009b:
            r6 = 0
            goto L_0x0094
        L_0x009d:
            r10 = -1
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1g1.BRX(X.35m, X.2sk):void");
    }
}
