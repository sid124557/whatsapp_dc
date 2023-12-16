package X;

import java.util.List;

/* renamed from: X.2Vr  reason: invalid class name and case insensitive filesystem */
public class C44342Vr {
    public List A00;

    public boolean A00() {
        for (C84414Cg isValid : this.A00) {
            if (!isValid.isValid()) {
                return false;
            }
        }
        return true;
    }

    public C44342Vr(C84414Cg... r5) {
        this.A00 = AnonymousClass002.A0I(r3);
        for (C84414Cg r1 : r5) {
            if (r1 != null) {
                this.A00.add(r1);
            }
        }
    }
}
