package X;

import java.util.Map;

/* renamed from: X.2Vs  reason: invalid class name and case insensitive filesystem */
public final class C44352Vs {
    public final C183538qC A00;

    public C44352Vs(C183538qC r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final C56692sP A00(String str, String str2) {
        Object obj;
        if (!C73723fy.A0U(AnonymousClass8UF.A0o("galaxy_message", "messageless_flow"), str)) {
            obj = ((Map) C18300x5.A0b(this.A00)).get(str);
        } else {
            String A01 = C57142tA.A01(AnonymousClass31O.A01(str2));
            if (A01 == null || A01.equals("1")) {
                obj = ((Map) this.A00.get()).get("galaxy_message");
            } else {
                obj = ((Map) this.A00.get()).get("extensions_message_v2");
            }
        }
        return (C56692sP) obj;
    }
}
