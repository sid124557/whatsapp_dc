package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2wb  reason: invalid class name and case insensitive filesystem */
public class C59242wb {
    public final String A00;
    public final List A01;

    public static List A00(C59242wb r2, String str, String str2) {
        C58832vt r1 = new C58832vt(str, str2);
        List list = r2.A01;
        list.add(r1);
        return list;
    }

    public static void A01(C59242wb r2, String str, String str2) {
        r2.A01.add(new C58832vt(str, str2));
    }

    public static void A02(String str, String str2, List list) {
        list.add(new C58832vt(str, str2));
    }

    public C59242wb(String str) {
        this.A01 = AnonymousClass001.A0s();
        this.A00 = str;
    }

    public C59242wb(String str, List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        this.A01 = A0s;
        this.A00 = str;
        A0s.addAll(list);
    }
}
