package X;

import java.security.PublicKey;
import org.json.JSONObject;

/* renamed from: X.2ll  reason: invalid class name and case insensitive filesystem */
public final class C52612ll {
    public final C56612sH A00;
    public final C50672ia A01;
    public final AnonymousClass31C A02;

    public final String A00(String str, PublicKey publicKey, int i) {
        C162457s7.A0J(str, 0);
        String A04 = this.A01.A04(Integer.valueOf(i), str, (String) null, publicKey);
        C162457s7.A0D(A04);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("#PWD_WA:11:");
        A0o.append(C56612sH.A00(this.A00));
        return AnonymousClass0x2.A0e(A04, A0o, ':');
    }

    public final void A02(AnonymousClass4EJ r9, AnonymousClass36K r10, String str, AnonymousClass4GQ r12, AnonymousClass4GQ r13) {
        this.A02.A0K(new AnonymousClass4KX(r13, r9, r12, 13), r10, str, 264, 32000);
    }

    public C52612ll(C56612sH r1, C50672ia r2, AnonymousClass31C r3) {
        C18260x0.A0V(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final JSONObject A01(String str, String str2) {
        C162457s7.A0J(str2, 1);
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("version", 1);
        A1G.put("timestamp", C56612sH.A00(this.A00));
        A1G.put("password", str2);
        C18310x6.A1K(str, A1G);
        return A1G;
    }
}
