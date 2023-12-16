package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2vd  reason: invalid class name and case insensitive filesystem */
public final class C58672vd {
    public static final C43962Ud A03 = new C43962Ud();
    public final String A00;
    public final Map A01;
    public final C58672vd[] A02;

    public C58672vd(String str, C58672vd[] r7) {
        LinkedHashMap linkedHashMap;
        this.A00 = str;
        this.A02 = r7;
        if (r7 != null) {
            int A0I = AnonymousClass8UG.A0I(r4);
            linkedHashMap = C18330xA.A0C(A0I < 16 ? 16 : A0I);
            for (C58672vd r1 : r7) {
                linkedHashMap.put(r1.A00, r1);
            }
        } else {
            linkedHashMap = null;
        }
        this.A01 = linkedHashMap;
    }
}
