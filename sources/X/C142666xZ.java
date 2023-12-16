package X;

import java.util.Map;

/* renamed from: X.6xZ  reason: invalid class name and case insensitive filesystem */
public enum C142666xZ {
    A08("OBJECT", 0),
    A02("BOOLEAN", 1),
    A04("CHAR", 2),
    A06("FLOAT", 4),
    A05("DOUBLE", 8),
    A03("BYTE", 1),
    A09("SHORT", 2),
    A07("INT", 4);
    
    public static final Map A00 = null;
    public final int size;
    public final int typeId;

    /* access modifiers changed from: public */
    static {
        int i;
        A00 = AnonymousClass001.A0t();
        for (C142666xZ r2 : values()) {
            AnonymousClass6C9.A12(r2, A00, r2.typeId);
        }
    }

    /* access modifiers changed from: public */
    C142666xZ(String str, int i) {
        this.typeId = r2;
        this.size = i;
    }
}
