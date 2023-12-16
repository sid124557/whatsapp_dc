package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2A4  reason: invalid class name */
public class AnonymousClass2A4 {
    public static final Map A00(AnonymousClass4C2 r4) {
        LinkedHashMap A0r = C18320x8.A0r();
        for (C47712dh A02 : (Iterable) ((AnonymousClass4JB) r4).A00) {
            String A022 = A02.A02();
            Object obj = A0r.get(A022);
            if (obj == null && !A0r.containsKey(A022)) {
                obj = new C69883Yw();
            }
            C69883Yw r1 = (C69883Yw) obj;
            r1.element++;
            A0r.put(A022, r1);
        }
        Iterator A16 = AnonymousClass0x9.A16(A0r);
        while (A16.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A16);
            C162457s7.A0K(A0w, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            if (!(A0w instanceof C834348j) || (A0w instanceof AnonymousClass8OP)) {
                A0w.setValue(Integer.valueOf(((C69883Yw) A0w.getValue()).element));
            } else {
                AnonymousClass360.A04(A0w, "kotlin.collections.MutableMap.MutableEntry");
                throw AnonymousClass000.A0L();
            }
        }
        return AnonymousClass360.A02(A0r);
    }
}
