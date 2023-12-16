package X;

import java.util.HashMap;

/* renamed from: X.2Z4  reason: invalid class name */
public final class AnonymousClass2Z4 {
    public final AnonymousClass39C A00;
    public final HashMap A01 = AnonymousClass001.A0t();

    public AnonymousClass2Z4(AnonymousClass1VX r6) {
        C162457s7.A0J(r6, 1);
        this.A00 = new AnonymousClass39C(C56952sp.A04(r6, 1269), "PHOENIX", true);
    }

    public final synchronized AnonymousClass39C A00(String str) {
        AnonymousClass39C r0;
        HashMap hashMap = this.A01;
        if (hashMap.containsKey(str)) {
            r0 = (AnonymousClass39C) hashMap.get(str);
        } else {
            r0 = this.A00;
        }
        return r0;
    }
}
