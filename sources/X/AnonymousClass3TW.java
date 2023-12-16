package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;

/* renamed from: X.3TW  reason: invalid class name */
public class AnonymousClass3TW implements AnonymousClass4EZ {
    public HashMap A00 = AnonymousClass001.A0t();
    public final C56612sH A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass4FV A03;
    public final AnonymousClass2GW A04;
    public final AnonymousClass31C A05;

    public void A01(C27991fJ r16, boolean z) {
        String str;
        AnonymousClass31C r5 = this.A05;
        String A032 = r5.A03();
        AnonymousClass39V[] r2 = new AnonymousClass39V[1];
        boolean z2 = z;
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        boolean A0F = AnonymousClass39V.A0F("state", str, r2);
        AnonymousClass36K A0F2 = AnonymousClass36K.A0F(AnonymousClass36K.A0I("group_join", r2), "membership_approval_mode", (AnonymousClass39V[]) null);
        AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
        AnonymousClass39V.A0B("xmlns", "w:g2", A1W, A0F ? 1 : 0);
        AnonymousClass39V.A0A(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A1W);
        C27991fJ r11 = r16;
        AnonymousClass36K A0C = AnonymousClass36K.A0C(r11, A0F2, A1W);
        this.A00.put(A032, new AnonymousClass2Q8(this, r11, this.A01.A0H(), z2));
        r5.A0K(this, A0C, A032, 337, 20000);
    }

    public void BQs(String str) {
        C18290x4.A1C(C66493Lq.A1H, (Object) null, 1008);
        C18290x4.A1C(C66493Lq.A1H, (Object) null, 3012);
        AnonymousClass2Q8 r1 = (AnonymousClass2Q8) this.A00.get(str);
        if (r1 != null) {
            A00(r1, false);
        }
    }

    public final void A00(AnonymousClass2Q8 r6, boolean z) {
        C24881Zc r4 = new C24881Zc();
        int i = 4;
        if (r6.A02) {
            i = 3;
        }
        r4.A01 = Integer.valueOf(i);
        r4.A00 = Boolean.valueOf(z);
        r4.A03 = C18310x6.A0f(this.A01.A0H(), r6.A00);
        C27991fJ r1 = r6.A01;
        if (AnonymousClass34R.A06(r1.user)) {
            r4.A04 = r1.getRawString();
        }
        this.A03.BhD(r4);
    }

    public void BdM(AnonymousClass36K r3, String str) {
        AnonymousClass2Q8 r1 = (AnonymousClass2Q8) this.A00.get(str);
        if (r1 != null) {
            A00(r1, true);
        }
    }

    public AnonymousClass3TW(C56612sH r2, AnonymousClass1VX r3, AnonymousClass4FV r4, AnonymousClass2GW r5, AnonymousClass31C r6) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r1 != 500) goto L_0x001f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BSN(X.AnonymousClass36K r4, java.lang.String r5) {
        /*
            r3 = this;
            int r1 = X.AnonymousClass36K.A00(r4)
            r0 = -2
            r2 = 0
            if (r1 == r0) goto L_0x0045
            r0 = -1
            if (r1 == r0) goto L_0x003e
            r0 = 400(0x190, float:5.6E-43)
            if (r1 == r0) goto L_0x0045
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x0036
            r0 = 403(0x193, float:5.65E-43)
            if (r1 == r0) goto L_0x002e
            r0 = 404(0x194, float:5.66E-43)
            if (r1 == r0) goto L_0x0045
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 == r0) goto L_0x0045
        L_0x001f:
            java.util.HashMap r0 = r3.A00
            java.lang.Object r1 = r0.get(r5)
            X.2Q8 r1 = (X.AnonymousClass2Q8) r1
            if (r1 == 0) goto L_0x002d
            r0 = 0
            r3.A00(r1, r0)
        L_0x002d:
            return
        L_0x002e:
            r1 = 3011(0xbc3, float:4.22E-42)
            android.os.Handler r0 = X.C66493Lq.A1H
            X.C18290x4.A1C(r0, r2, r1)
            goto L_0x001f
        L_0x0036:
            r1 = 3010(0xbc2, float:4.218E-42)
            android.os.Handler r0 = X.C66493Lq.A1H
            X.C18290x4.A1C(r0, r2, r1)
            goto L_0x001f
        L_0x003e:
            r1 = 1008(0x3f0, float:1.413E-42)
            android.os.Handler r0 = X.C66493Lq.A1H
            X.C18290x4.A1C(r0, r2, r1)
        L_0x0045:
            r1 = 3012(0xbc4, float:4.221E-42)
            android.os.Handler r0 = X.C66493Lq.A1H
            X.C18290x4.A1C(r0, r2, r1)
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TW.BSN(X.36K, java.lang.String):void");
    }
}
