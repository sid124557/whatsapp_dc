package X;

import java.util.Map;

/* renamed from: X.2eZ  reason: invalid class name and case insensitive filesystem */
public class C48232eZ {
    public final Map A00 = AnonymousClass001.A0t();

    public void A00(String str, int i) {
        this.A00.put(str, Integer.toString(i).getBytes());
    }

    public void A01(String str, String str2) {
        if (str2 != null) {
            this.A00.put(str, str2.getBytes());
        }
    }
}
