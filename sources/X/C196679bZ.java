package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9bZ  reason: invalid class name and case insensitive filesystem */
public class C196679bZ implements C203319nV {
    public final AnonymousClass8EA A00;
    public final C194929Vc A01;
    public final AnonymousClass9O7 A02;
    public final C194029Rh A03;

    public AnonymousClass39V B3k(String str) {
        C133796hx r2;
        C133736hr r0 = (C133736hr) this.A00.A08(str);
        if (!(r0 == null || (r2 = r0.A08) == null)) {
            AnonymousClass99I r22 = (AnonymousClass99I) r2;
            String A002 = this.A03.A00(r0.A01);
            if ("VISA".equals(r22.A03)) {
                C194929Vc r6 = this.A01;
                String str2 = r22.A06;
                try {
                    JSONObject A1G = AnonymousClass0x9.A1G();
                    A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_ALG, "PS256");
                    A1G.put("typ", "JOSE");
                    A1G.put("kid", A002);
                    A1G.put("iat", C56612sH.A00(r6.A00));
                    String A07 = r6.A07(A1G.toString(), C194929Vc.A00(A002, (String) null, str2));
                    if (A07 != null) {
                        return new AnonymousClass39V("trusted-device-info", A07);
                    }
                } catch (JSONException e) {
                    Log.w("PAY: generateTrustedDeviceInfoJwsToken threw creating json string: ", e);
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r2 != 20923) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String BDv(android.content.res.Resources r5, X.C624034w r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.String r1 = r6.A0J
            r3 = 0
            if (r1 == 0) goto L_0x007c
            r0 = -1
            int r2 = X.C615531h.A01(r1, r0)
            int r1 = r6.A02
            r0 = 406(0x196, float:5.69E-43)
            if (r1 == r0) goto L_0x001c
            r0 = 407(0x197, float:5.7E-43)
            if (r1 == r0) goto L_0x001c
            r0 = 13
            if (r1 == r0) goto L_0x001c
            r0 = 14
            if (r1 != r0) goto L_0x007c
        L_0x001c:
            X.9O7 r1 = r4.A02
            X.9RW r0 = r1.A01
            java.lang.String r0 = r0.A00(r2)
            if (r0 != 0) goto L_0x0048
            r0 = 2001(0x7d1, float:2.804E-42)
            if (r2 == r0) goto L_0x0055
            r0 = 4002(0xfa2, float:5.608E-42)
            if (r2 == r0) goto L_0x004f
            r0 = 10242(0x2802, float:1.4352E-41)
            if (r2 == r0) goto L_0x005b
            r0 = 20884(0x5194, float:2.9265E-41)
            if (r2 == r0) goto L_0x0049
            r1 = 20923(0x51bb, float:2.932E-41)
            r0 = 2131891722(0x7f12160a, float:1.9418172E38)
            if (r2 == r1) goto L_0x0044
        L_0x003d:
            r0 = 2001(0x7d1, float:2.804E-42)
            if (r2 != r0) goto L_0x006b
            r0 = 2131891721(0x7f121609, float:1.941817E38)
        L_0x0044:
            java.lang.String r0 = r5.getString(r0)
        L_0x0048:
            return r0
        L_0x0049:
            X.2oU r0 = r1.A00
            r1 = 2131887471(0x7f12056f, float:1.940955E38)
            goto L_0x0060
        L_0x004f:
            X.2oU r0 = r1.A00
            r1 = 2131886238(0x7f12009e, float:1.940705E38)
            goto L_0x0060
        L_0x0055:
            X.2oU r0 = r1.A00
            r1 = 2131890232(0x7f121038, float:1.941515E38)
            goto L_0x0060
        L_0x005b:
            X.2oU r0 = r1.A00
            r1 = 2131891258(0x7f12143a, float:1.941723E38)
        L_0x0060:
            android.content.res.Resources r0 = X.C54292oU.A00(r0)
            java.lang.String r0 = r0.getString(r1)
            if (r0 == 0) goto L_0x003d
            return r0
        L_0x006b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BrazilTransactionHelper/getTransactionStatusDetail : unhandled error code ("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ")"
            X.C18260x0.A1L(r1, r0)
        L_0x007c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196679bZ.BDv(android.content.res.Resources, X.34w, java.lang.String):java.lang.String");
    }

    public C196679bZ(AnonymousClass8EA r1, C194929Vc r2, AnonymousClass9O7 r3, C194029Rh r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public boolean BJ6() {
        return true;
    }
}
