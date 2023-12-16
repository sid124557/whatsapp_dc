package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2bP  reason: invalid class name and case insensitive filesystem */
public final class C46302bP {
    public final C55682qk A00;
    public final C380024x A01;
    public final C56612sH A02;
    public final C50672ia A03;
    public final AnonymousClass31V A04;

    public C46302bP(C55682qk r1, C380024x r2, C56612sH r3, C50672ia r4, AnonymousClass31V r5) {
        C18260x0.A0c(r3, r1, r4, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
    }

    public final String A00(C166557yt r5, String str, String str2, String str3) {
        try {
            JSONObject A11 = AnonymousClass0x7.A11();
            A11.put("operation", str3);
            A11.put("timestamp", C56612sH.A00(this.A02));
            C18310x6.A1K(str, A11);
            A11.put("password", str2);
            if (r5 != null) {
                A11.put("fbid", C18280x3.A0a(r5));
            }
            return C18290x4.A0o(A11);
        } catch (JSONException e) {
            this.A00.A09("CommonUserProtocolUtils/getBasePayload/JSONException failed to generate base payload", e.getMessage(), e);
            return "";
        }
    }
}
