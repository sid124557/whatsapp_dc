package X;

import java.util.Map;

/* renamed from: X.3CE  reason: invalid class name */
public class AnonymousClass3CE implements AnonymousClass8r1 {
    public final C48342ek A00;

    public C147927Gg Bnh(C153427bI r8, C160817oM r9, C155007e8 r10, C156387gX r11, C151147Tp r12) {
        C147927Gg r1;
        Map map = r11.A02;
        String A0o = C18310x6.A0o("key", map);
        if (A0o != null) {
            Object A002 = AnonymousClass73H.A00(r12, map);
            Object obj = map.get("mode");
            String str = r11.A00;
            boolean equals = "p".equals(obj);
            C48342ek r2 = this.A00;
            synchronized (r2) {
                if (equals) {
                    r2.A01(A0o, A002);
                    r1 = r2.A00(r9, A002, A0o, str);
                } else {
                    Map map2 = r2.A01;
                    Object obj2 = map2.get(A0o);
                    if (obj2 == null) {
                        map2.put(A0o, A002);
                    } else {
                        A002 = obj2;
                    }
                    r1 = r2.A00(r9, A002, A0o, str);
                }
            }
            map.get("debug_metadata");
            return r1;
        }
        throw AnonymousClass001.A0e("Key not defined in data manifest");
    }

    public void Bsd(C153427bI r3, C156387gX r4, C151147Tp r5, Object obj) {
        String A0o = C18310x6.A0o("key", r4.A02);
        if (A0o != null) {
            this.A00.A01(A0o, obj);
            return;
        }
        throw AnonymousClass001.A0e("Key not defined in data manifest");
    }

    public AnonymousClass3CE(C48342ek r1) {
        this.A00 = r1;
    }
}
