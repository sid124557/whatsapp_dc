package X;

import android.text.TextUtils;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: X.2y0  reason: invalid class name and case insensitive filesystem */
public final class C60102y0 {
    public static final Charset A03 = Charset.forName(DefaultCrypto.UTF_8);
    public final C56972sr A00;
    public final C47992eA A01;
    public final AnonymousClass4FS A02;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C51782kN A00(X.C624134x r6) {
        /*
            r5 = this;
            X.2sr r2 = r5.A00
            com.whatsapp.jid.PhoneUserJid r4 = X.C56972sr.A04(r2)
            X.2z0 r1 = r6.A1J
            X.4uZ r3 = r1.A00
            boolean r0 = r3 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0041
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0050
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
        L_0x0014:
            if (r3 == 0) goto L_0x0055
            if (r4 == 0) goto L_0x0055
            java.lang.String r2 = r1.A01
            byte[] r1 = r6.A1a
            if (r1 == 0) goto L_0x0055
            java.lang.String r0 = "Rcat"
            byte[] r1 = X.C57632tx.A01(r3, r4, r0, r2, r1)
            if (r1 == 0) goto L_0x0055
            r0 = 10
            java.lang.String r2 = android.util.Base64.encodeToString(r1, r0)
        L_0x002c:
            boolean r0 = r6 instanceof X.C30481mW
            r1 = 0
            if (r0 == 0) goto L_0x003f
            X.1mW r6 = (X.C30481mW) r6
            java.lang.String r0 = r6.A03
        L_0x0035:
            if (r2 == 0) goto L_0x003e
            if (r0 == 0) goto L_0x003e
            X.2kN r1 = new X.2kN
            r1.<init>(r2, r0)
        L_0x003e:
            return r1
        L_0x003f:
            r0 = r1
            goto L_0x0035
        L_0x0041:
            boolean r0 = X.C627336j.A0K(r3)
            if (r0 == 0) goto L_0x0055
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0050
            com.whatsapp.jid.UserJid r3 = r6.A0o()
            goto L_0x0014
        L_0x0050:
            com.whatsapp.jid.PhoneUserJid r3 = X.C56972sr.A04(r2)
            goto L_0x0014
        L_0x0055:
            r2 = 0
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60102y0.A00(X.34x):X.2kN");
    }

    public byte[] A01(UserJid userJid, C30481mW r8, String str) {
        byte[] A012;
        if (str == null) {
            str = r8.A13();
        }
        PhoneUserJid A04 = C56972sr.A04(this.A00);
        if (!TextUtils.isEmpty(str) && C627636p.A0p(r8) && A04 != null) {
            byte[] bytes = str.getBytes(A03);
            String str2 = r8.A1J.A01;
            byte[] bArr = r8.A1a;
            if (bArr == null) {
                A012 = null;
            } else {
                A012 = C57632tx.A01(A04, userJid, "Rcat", str2, bArr);
            }
            if (A012 != null) {
                try {
                    return Arrays.copyOf(C380825n.A00(bytes, A012), 8);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to calculate hmac-sha256", e);
                }
            }
        }
        return null;
    }

    public C60102y0(C56972sr r1, C47992eA r2, AnonymousClass4FS r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
