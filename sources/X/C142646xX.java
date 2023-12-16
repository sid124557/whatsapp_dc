package X;

import android.util.SparseArray;

/* renamed from: X.6xX  reason: invalid class name and case insensitive filesystem */
public enum C142646xX {
    A03("NOT_CACHED", "NOT_CACHED"),
    A02("CACHED", "CACHED"),
    A04("SEMI_CACHED", "SEMI_CACHED");
    
    public static final SparseArray A00 = null;
    public final String mName;
    public final int mValue;

    /* access modifiers changed from: public */
    static {
        int i;
        A00 = AnonymousClass6CA.A0I();
        for (C142646xX r2 : values()) {
            A00.put(r2.mValue, r2);
        }
    }

    /* access modifiers changed from: public */
    C142646xX(String str, String str2) {
        this.mValue = r2;
        this.mName = str2;
    }
}
