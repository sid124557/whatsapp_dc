package X;

import java.util.Map;

/* renamed from: X.2oo  reason: invalid class name and case insensitive filesystem */
public class C54492oo {
    public final Map A00 = AnonymousClass001.A0t();
    public final Map A01 = AnonymousClass001.A0t();

    public synchronized String A00(String str) {
        return C18310x6.A0o(str, this.A00);
    }

    public synchronized void A01(String str, String str2) {
        if (str2 != null) {
            this.A01.put(str2, str);
        }
        this.A00.put(str, str2);
    }

    public synchronized void A02(String str, String str2) {
        if (str2 != null) {
            this.A01.remove(str2);
        }
        this.A00.remove(str);
    }
}
