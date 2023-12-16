package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.73J  reason: invalid class name */
public final class AnonymousClass73J {
    public static final C152047Xi A00(Map map) {
        C162457s7.A0J(map, 0);
        LinkedHashMap A0r = C18320x8.A0r();
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            A0r.put(A0w.getKey(), new C156077fz(AnonymousClass0x9.A12(A0w)));
        }
        return new C152047Xi(A0r);
    }
}
