package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8Tm  reason: invalid class name and case insensitive filesystem */
public class C174238Tm extends LinkedHashMap<String, String> {
    public final /* synthetic */ AnonymousClass8SA this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174238Tm(AnonymousClass8SA r4) {
        super(64, 0.75f, true);
        this.this$1 = r4;
    }

    public boolean removeEldestEntry(Map.Entry entry) {
        return C86624Kv.A1W(size(), 64);
    }
}
