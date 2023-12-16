package X;

import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.2xU  reason: invalid class name and case insensitive filesystem */
public class C59792xU {
    public final C56492s4 A00;
    public final C55052pi A01;
    public final C56612sH A02;
    public final C54292oU A03;
    public final C61072zf A04;
    public final AnonymousClass1VX A05;
    public final C55002pd A06;
    public final C103265Mf A07;
    public final C29011i8 A08;
    public final C72173dI A09;
    public final HashMap A0A = AnonymousClass001.A0t();

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        if (r4 != null) goto L_0x0005;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A00(android.content.Context r3, java.lang.String r4, java.net.URL r5, int r6) {
        /*
            if (r5 != 0) goto L_0x0005
            r0 = 0
            if (r4 == 0) goto L_0x0006
        L_0x0005:
            r0 = 1
        L_0x0006:
            X.C626936e.A0C(r0)
            java.lang.StringBuilder r2 = X.C18320x8.A0j(r6)
            java.lang.String r0 = "_"
            r2.append(r0)
            if (r5 == 0) goto L_0x0030
            java.lang.String r1 = r5.toString()
        L_0x0018:
            r0 = 0
            java.lang.String r0 = android.webkit.URLUtil.guessFileName(r1, r0, r0)
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r2)
            java.io.File r1 = r3.getCacheDir()
            java.lang.String r0 = "ProfilePictureTemp"
            java.io.File r0 = X.AnonymousClass0x7.A0e(r1, r0)
            java.io.File r0 = X.AnonymousClass002.A0A(r0, r2)
            return r0
        L_0x0030:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "https://pps.whatsapp.net"
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r4, r1)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59792xU.A00(android.content.Context, java.lang.String, java.net.URL, int):java.io.File");
    }

    public C59792xU(C56492s4 r3, C55052pi r4, C56612sH r5, C54292oU r6, C61072zf r7, AnonymousClass1VX r8, C55002pd r9, C103265Mf r10, C29011i8 r11, AnonymousClass4FS r12) {
        C72173dI A002 = C72173dI.A00(r12);
        this.A02 = r5;
        this.A05 = r8;
        this.A03 = r6;
        this.A00 = r3;
        this.A04 = r7;
        this.A08 = r11;
        this.A01 = r4;
        this.A07 = r10;
        this.A06 = r9;
        this.A09 = A002;
    }

    public void A01(AnonymousClass2T0 r20, long j) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ProfilePicturePlainFileDownloadManager/create/jid = ");
        AnonymousClass2T0 r12 = r20;
        C95814uZ r6 = r12.A03;
        A0o.append(r6);
        A0o.append(", type = ");
        int i = r12.A02;
        C18260x0.A1F(A0o, i);
        Locale locale = Locale.US;
        Object[] A0M = AnonymousClass002.A0M();
        C18280x3.A0w(r6, A0M, 0);
        Integer valueOf = Integer.valueOf(i);
        A0M[1] = valueOf;
        String format = String.format(locale, "%s.%d", A0M);
        HashMap hashMap = this.A0A;
        synchronized (hashMap) {
            AnonymousClass1g1 r9 = (AnonymousClass1g1) hashMap.get(format);
            if (r9 != null) {
                if (r9.A05.A04.equals(r12.A04)) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("ProfilePicturePlainFileDownloadManager/downloader is running/jid = ");
                    A0o2.append(r6);
                    C18260x0.A0w(", type = ", A0o2, i);
                } else {
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0o3.append("ProfilePicturePlainFileDownloadManager/direct path changes/jid = ");
                    A0o3.append(r6);
                    C18260x0.A0w(", type = ", A0o3, i);
                    r9.A04(false);
                    hashMap.remove(format);
                }
            }
            StringBuilder A0o4 = AnonymousClass001.A0o();
            AnonymousClass000.A17(r6, "ProfilePicturePlainFileDownloadManager/startProfilePictureDownload/jid = ", ", type = ", A0o4);
            A0o4.append(i);
            A0o4.append(", hash= ");
            C18260x0.A1J(A0o4, r12.A05);
            Locale locale2 = Locale.US;
            Object[] A0M2 = AnonymousClass002.A0M();
            C18280x3.A19(r6.getRawString(), valueOf, A0M2);
            String format2 = String.format(locale2, "%s.%d", A0M2);
            C86264Jl r15 = new C86264Jl(this, 15, r12);
            C56612sH r7 = this.A02;
            AnonymousClass1VX r10 = this.A05;
            C54292oU r8 = this.A03;
            C56492s4 r5 = this.A00;
            C61072zf r92 = this.A04;
            C29011i8 r14 = this.A08;
            AnonymousClass1g1 r4 = new AnonymousClass1g1(r5, this.A01, r7, r8, r92, r10, this.A06, r12, this.A07, r14, r15, format2, j);
            hashMap.put(format2, r4);
            this.A09.execute(r4);
        }
    }
}
