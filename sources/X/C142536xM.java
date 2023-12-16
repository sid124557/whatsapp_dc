package X;

import android.util.SparseArray;

/* renamed from: X.6xM  reason: invalid class name and case insensitive filesystem */
public enum C142536xM {
    PREFETCH_CACHE_EVICT(4),
    CACHE_ERROR(8),
    PREFETCH_START(10),
    DATABASE_FULL(12),
    MANIFEST_PARSE_ERROR(13);
    
    public static final SparseArray A00 = null;
    public final int mValue;

    /* access modifiers changed from: public */
    static {
        int i;
        A00 = AnonymousClass6CA.A0I();
        for (C142536xM r2 : values()) {
            A00.put(r2.mValue, r2);
        }
    }

    /* access modifiers changed from: public */
    C142536xM(int i) {
        this.mValue = i;
    }
}
