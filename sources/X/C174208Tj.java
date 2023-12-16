package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8Tj  reason: invalid class name and case insensitive filesystem */
public class C174208Tj extends LinkedHashMap<K, V> {
    public final /* synthetic */ AnonymousClass7GX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174208Tj(AnonymousClass7GX r3, int i) {
        super(i, 0.75f, true);
        this.this$0 = r3;
    }

    public boolean removeEldestEntry(Map.Entry entry) {
        return C86624Kv.A1W(size(), this.this$0.A00);
    }
}
