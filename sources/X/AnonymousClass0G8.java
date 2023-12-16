package X;

import java.util.Map;

/* renamed from: X.0G8  reason: invalid class name */
public enum AnonymousClass0G8 {
    ;
    
    public static final Map A00 = null;

    /* access modifiers changed from: public */
    static {
        int i;
        A00 = AnonymousClass001.A0t();
        for (AnonymousClass0G8 r2 : values()) {
            if (r2 == A02) {
                A00.put("switch", r2);
            } else if (r2 != A03) {
                A00.put(r2.name(), r2);
            }
        }
    }

    public static AnonymousClass0G8 A00(String str, int i) {
        return new AnonymousClass0G8(str, i);
    }
}
