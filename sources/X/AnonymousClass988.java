package X;

import com.whatsapp.authentication.FingerprintBottomSheet;

/* renamed from: X.988  reason: invalid class name */
public class AnonymousClass988 extends C90034fi {
    public byte[] A00;
    public final C89654ea A01;
    public final FingerprintBottomSheet A02;
    public final C56612sH A03;
    public final C194109Rp A04;
    public final C203129nA A05;
    public final AnonymousClass9TR A06;

    public void A00() {
        FingerprintBottomSheet fingerprintBottomSheet = this.A02;
        fingerprintBottomSheet.A1P(true);
        this.A05.BdK(this.A00);
        fingerprintBottomSheet.A1L();
    }

    public void A01() {
        this.A05.Bbb();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass0QU r9, X.C1229066h r10) {
        /*
            r8 = this;
            X.9TR r0 = r8.A06
            long r1 = r0.A00()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            X.2sH r0 = r8.A03
            long r3 = r0.A0H()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0019
            com.whatsapp.authentication.FingerprintBottomSheet r0 = r8.A02
            r0.A1U(r1)
            return
        L_0x0019:
            X.9Rp r6 = r8.A04
            X.9aB r3 = new X.9aB
            r3.<init>(r10, r8)
            X.2sH r0 = r6.A01
            long r1 = X.C56612sH.A00(r0)
            boolean r0 = r6 instanceof X.C191059Aw
            if (r0 == 0) goto L_0x0056
            r0 = r6
            X.9Aw r0 = (X.C191059Aw) r0
            java.lang.Object[] r7 = X.AnonymousClass002.A0M()
            r4 = 0
            java.lang.String r0 = r0.A01
            r7[r4] = r0
            r0 = 1
            X.AnonymousClass000.A1Q(r7, r0, r1)
        L_0x003a:
            byte[] r7 = X.AnonymousClass9VB.A00(r7)
        L_0x003e:
            X.9W3 r5 = r6.A04
            X.9a9 r4 = new X.9a9
            r4.<init>(r6, r3, r1)
            X.0Vg r2 = X.AnonymousClass9W3.A00()
            if (r2 == 0) goto L_0x007c
            X.0XP r1 = r5.A00
            X.94X r0 = new X.94X
            r0.<init>(r4, r5, r7)
            r1.A04(r0, r2, r9)
            return
        L_0x0056:
            boolean r0 = r6 instanceof X.C191049Av
            if (r0 == 0) goto L_0x006f
            r5 = r6
            X.9Av r5 = (X.C191049Av) r5
            r0 = 3
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r4 = 0
            java.lang.String r0 = r5.A00
            r7[r4] = r0
            r0 = 1
            X.AnonymousClass000.A1Q(r7, r0, r1)
            r4 = 2
            java.lang.String r0 = r5.A01
            r7[r4] = r0
            goto L_0x003a
        L_0x006f:
            java.lang.Object[] r4 = X.AnonymousClass002.A0L()
            r0 = 0
            X.AnonymousClass000.A1Q(r4, r0, r1)
            byte[] r7 = X.AnonymousClass9VB.A00(r4)
            goto L_0x003e
        L_0x007c:
            X.7oG r1 = r5.A02
            java.lang.String r0 = "sign: cryptoObject is null"
            r1.A06(r0)
            r5.A03()
            X.988 r1 = r3.A01
            com.whatsapp.authentication.FingerprintBottomSheet r0 = r1.A02
            r0.A1K()
            X.4ea r0 = r1.A01
            X.0zH r2 = X.AnonymousClass5V0.A00(r0)
            r0 = 2131891892(0x7f1216b4, float:1.9418517E38)
            r2.A0U(r0)
            r0 = 2131891891(0x7f1216b3, float:1.9418515E38)
            r2.A0T(r0)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 2
            X.C204219p0.A01(r2, r3, r0, r1)
            r0 = 0
            r2.A0i(r0)
            r2.A0S()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass988.A02(X.0QU, X.66h):void");
    }

    public AnonymousClass988(C89654ea r1, FingerprintBottomSheet fingerprintBottomSheet, C56612sH r3, C194109Rp r4, C203129nA r5, AnonymousClass9TR r6) {
        this.A03 = r3;
        this.A06 = r6;
        this.A01 = r1;
        this.A02 = fingerprintBottomSheet;
        this.A04 = r4;
        this.A05 = r5;
    }

    public void A03(byte[] bArr) {
        this.A00 = bArr;
    }
}
