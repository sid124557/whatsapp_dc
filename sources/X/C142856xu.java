package X;

import java.util.Map;

/* renamed from: X.6xu  reason: invalid class name and case insensitive filesystem */
public enum C142856xu {
    ;
    
    public static final Map A00 = null;
    public static final Map A01 = null;
    public final String[] otherEncodingNames;
    public final int[] values;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = AnonymousClass001.A0t();
        A00 = AnonymousClass001.A0t();
        for (C142856xu r5 : values()) {
            for (int A12 : r5.values) {
                AnonymousClass6C9.A12(r5, A01, A12);
            }
            A00.put(r5.name(), r5);
            for (String put : r5.otherEncodingNames) {
                A00.put(put, r5);
            }
        }
    }

    /* access modifiers changed from: public */
    C142856xu(String str, String... strArr) {
        int[] A0E = C18330xA.A0E();
        A0E[0] = r4;
        this.values = A0E;
        this.otherEncodingNames = strArr;
    }

    /* access modifiers changed from: public */
    C142856xu(String[] strArr, int i) {
        this.values = r2;
        this.otherEncodingNames = strArr;
    }
}
