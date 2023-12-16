package X;

import android.util.SparseArray;

/* renamed from: X.6xT  reason: invalid class name and case insensitive filesystem */
public enum C142606xT {
    ;
    
    public static final SparseArray A00 = null;
    public final int mValue;

    /* access modifiers changed from: public */
    static {
        A00 = AnonymousClass6CA.A0I();
        for (C142606xT r2 : values()) {
            A00.put(r2.mValue, r2);
        }
    }

    public static C142606xT A00(String str, int i, int i2) {
        return new C142606xT(str, i, i2);
    }

    /* access modifiers changed from: public */
    C142606xT(int i) {
        this.mValue = i;
    }
}
