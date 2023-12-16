package X;

import java.util.Map;

/* renamed from: X.63r  reason: invalid class name and case insensitive filesystem */
public final class C1222563r extends C829045j implements AnonymousClass4GR {
    public static final C1222563r A00 = new C1222563r();

    public C1222563r() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        C18260x0.A0O(entry, entry2);
        return Integer.valueOf(Float.compare(AnonymousClass001.A05(entry2.getValue()), AnonymousClass001.A05(entry.getValue())));
    }
}
