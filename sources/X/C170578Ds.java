package X;

import java.util.Map;

/* renamed from: X.8Ds  reason: invalid class name and case insensitive filesystem */
public final class C170578Ds implements C181508ms {
    public C131596dq A00;
    public final C158627kI A01;

    public boolean BKr(Object obj) {
        AnonymousClass7TV r1 = this.A01.A01;
        C187038wL r4 = r1.A00;
        if (!(obj instanceof Map)) {
            return false;
        }
        C131596dq r3 = this.A00;
        if (!r3.A07() || (r3.A01 == null && r1.A03.contains(C141926wM.DEFAULT_PATH_LEAF_TO_NULL))) {
            return true;
        }
        return r4.BBl(obj).containsAll(r3.A01);
    }

    public C170578Ds(C158627kI r1, C153617bf r2) {
        this.A01 = r1;
        this.A00 = (C131596dq) r2;
    }
}
