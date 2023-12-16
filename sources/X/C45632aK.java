package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2aK  reason: invalid class name and case insensitive filesystem */
public class C45632aK {
    public final Map A00 = AnonymousClass001.A0t();
    public final Map A01 = AnonymousClass001.A0t();
    public final Map A02 = AnonymousClass001.A0t();

    public final Map A00(String str) {
        HashMap hashMap;
        HashMap A0t = AnonymousClass001.A0t();
        Map A1B = AnonymousClass0x9.A1B(str, this.A01);
        if (A1B == null) {
            hashMap = AnonymousClass001.A0t();
        } else {
            hashMap = new HashMap(A1B);
        }
        A0t.put("data", hashMap);
        A0t.put("context", new HashMap(this.A00));
        return A0t;
    }
}
