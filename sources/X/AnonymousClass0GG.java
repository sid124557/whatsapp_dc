package X;

import java.util.Map;

/* renamed from: X.0GG  reason: invalid class name */
public enum AnonymousClass0GG {
    ;
    
    public static final Map A00 = null;

    /* access modifiers changed from: public */
    static {
        int i;
        A00 = AnonymousClass001.A0t();
        for (AnonymousClass0GG r2 : values()) {
            if (r2 == A02) {
                A00.put("class", r2);
            } else if (r2 != A03) {
                A00.put(r2.name().replace('_', '-'), r2);
            }
        }
    }

    public static AnonymousClass0GG A00(String str, int i) {
        return new AnonymousClass0GG(str, i);
    }
}
