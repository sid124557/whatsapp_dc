package X;

import org.json.JSONObject;

/* renamed from: X.2YI  reason: invalid class name */
public final class AnonymousClass2YI {
    public final C56612sH A00;
    public final AnonymousClass1Uy A01;

    public AnonymousClass2YI(C56612sH r2, AnonymousClass1Uy r3) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final String A00(C166557yt r5, String str, String str2, String str3) {
        JSONObject A11 = AnonymousClass0x7.A11();
        A11.put("operation", str3);
        A11.put("timestamp", C56612sH.A00(this.A00));
        C18310x6.A1K(str, A11);
        A11.put("password", str2);
        if (r5 != null) {
            A11.put("fbid", C18280x3.A0a(r5));
        }
        return C18290x4.A0o(A11);
    }
}
