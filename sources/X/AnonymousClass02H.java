package X;

import android.util.LruCache;

/* renamed from: X.02H  reason: invalid class name */
public class AnonymousClass02H extends LruCache {
    public final /* synthetic */ C10040hA A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass02H(C10040hA r1, int i) {
        super(i);
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        return ((byte[]) obj2).length;
    }
}
