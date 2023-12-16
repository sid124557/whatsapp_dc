package X;

import java.io.File;

/* renamed from: X.2W1  reason: invalid class name */
public class AnonymousClass2W1 {
    public C72303dV A00;

    public Long A00() {
        C72303dV r2 = this.A00;
        r2.A05();
        File file = r2.A05;
        if (!file.exists()) {
            return null;
        }
        r2.A05();
        return Long.valueOf(file.length());
    }

    public AnonymousClass2W1(C72303dV r1) {
        this.A00 = r1;
    }
}
