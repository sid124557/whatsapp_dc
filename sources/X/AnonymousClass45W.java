package X;

import java.util.Map;

/* renamed from: X.45W  reason: invalid class name */
public final class AnonymousClass45W extends C829045j implements AnonymousClass4GR {
    public static final AnonymousClass45W A00 = new AnonymousClass45W();

    public AnonymousClass45W() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        C18260x0.A0O(entry, entry2);
        return Integer.valueOf(Float.compare(((Number) entry2.getValue()).floatValue(), ((Number) entry.getValue()).floatValue()));
    }
}
