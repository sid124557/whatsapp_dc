package X;

import java.util.Map;
import java.util.TreeSet;

/* renamed from: X.0Vy  reason: invalid class name and case insensitive filesystem */
public class C06030Vy {
    public final Map A00 = AnonymousClass001.A0t();
    public final TreeSet A01 = new TreeSet();

    public final synchronized AnonymousClass0LY A02(C172488Li r3) {
        return (AnonymousClass0LY) this.A00.get((C172488Li) this.A01.floor(r3));
    }

    public final synchronized void A03(C172488Li r3, C160777oI r4, String str) {
        this.A01.add(r3);
        this.A00.put(r3, new AnonymousClass0LY(r4, str));
    }
}
