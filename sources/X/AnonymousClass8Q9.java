package X;

import java.io.IOException;

/* renamed from: X.8Q9  reason: invalid class name */
public class AnonymousClass8Q9 implements C188588zA {
    public int A00;
    public AnonymousClass7Z0 A01;
    public boolean A02;

    public C177088e3 B99() {
        return this.A01.A02(this.A00, this.A02);
    }

    public AnonymousClass8Q9(AnonymousClass7Z0 r1, int i, boolean z) {
        this.A02 = z;
        this.A00 = i;
        this.A01 = r1;
    }

    public C177088e3 Bqk() {
        try {
            return B99();
        } catch (IOException e) {
            throw new C144066zx(e.getMessage());
        }
    }
}
