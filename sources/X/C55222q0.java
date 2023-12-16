package X;

import java.util.Map;

/* renamed from: X.2q0  reason: invalid class name and case insensitive filesystem */
public class C55222q0 {
    public final Map A00 = AnonymousClass001.A0t();
    public final Map A01 = AnonymousClass001.A0t();

    public synchronized String A00(String str) {
        return C18310x6.A0o(str, this.A01);
    }

    public synchronized String A01(String str) {
        return C18310x6.A0o(str, this.A00);
    }

    public synchronized void A02(String str, String str2) {
        this.A01.put(str, str2);
        this.A00.put(str2, str);
    }

    public synchronized void A03(String str, String str2) {
        this.A01.remove(str);
        this.A00.remove(str2);
    }

    public synchronized boolean A04(String str) {
        return this.A01.containsKey(str);
    }
}
