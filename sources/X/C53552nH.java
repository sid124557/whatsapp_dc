package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.2nH  reason: invalid class name and case insensitive filesystem */
public final class C53552nH {
    public final C69263Wi A00;
    public final C620633i A01;
    public final C56612sH A02;
    public final AnonymousClass1VX A03;
    public final AnonymousClass4FV A04;
    public final C56572sD A05;

    public final boolean A02(C58932w3 r5) {
        return r5 != null && this.A03.A0Y(C58422vE.A02, 3630) && r5.A06 == 2 && A00(r5.A01) != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r5.length() == 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A00(java.lang.String r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0009
            int r1 = r5.length()
            r0 = 0
            if (r1 != 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            r3 = 0
            if (r0 != 0) goto L_0x003e
            boolean r0 = X.C175738Zn.A0V(r5)
            if (r0 != 0) goto L_0x003e
            X.1VX r2 = r4.A03
            r1 = 3631(0xe2f, float:5.088E-42)
            X.2vE r0 = X.C58422vE.A02
            java.lang.String r0 = r2.A0R(r0, r1)
            if (r0 == 0) goto L_0x003e
            boolean r0 = X.AnonymousClass2AB.A05(r5, r0)
            if (r0 == 0) goto L_0x003e
            android.net.Uri r1 = com.whatsapp.wamsys.SecureUriParser.parseEncodedRFC2396(r5)
            java.lang.String r0 = "code"
            java.lang.String r1 = r1.getQueryParameter(r0)
            if (r1 == 0) goto L_0x003e
            int r0 = r1.length()
            if (r0 == 0) goto L_0x003e
            boolean r0 = X.C175738Zn.A0V(r1)
            if (r0 != 0) goto L_0x003e
            return r1
        L_0x003e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53552nH.A00(java.lang.String):java.lang.String");
    }

    public final void A01(String str) {
        try {
            ClipData newPlainText = ClipData.newPlainText(str, str);
            ClipboardManager A0C = this.A01.A0C();
            if (A0C != null) {
                A0C.setPrimaryClip(newPlainText);
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Coupon: code: ");
            A0o.append(str);
            C18260x0.A1J(A0o, " copied to clipboard");
            this.A00.A0I(R.string.f11nameremoved, 1);
        } catch (NullPointerException | SecurityException e) {
            Log.e("CouponMessageService/copycode", e);
        }
    }

    public C53552nH(C69263Wi r2, C620633i r3, C56612sH r4, AnonymousClass1VX r5, AnonymousClass4FV r6, C56572sD r7) {
        C18260x0.A0f(r5, r2, r7, r6, r3);
        C162457s7.A0J(r4, 6);
        this.A03 = r5;
        this.A00 = r2;
        this.A05 = r7;
        this.A04 = r6;
        this.A01 = r3;
        this.A02 = r4;
    }
}
