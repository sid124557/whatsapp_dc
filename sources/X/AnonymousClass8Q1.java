package X;

import java.io.IOException;

/* renamed from: X.8Q1  reason: invalid class name */
public class AnonymousClass8Q1 implements C183618qL, C183638qN {
    public AnonymousClass7Z0 A00;

    public C177088e3 B99() {
        try {
            return new C176078cQ(this.A00.A01());
        } catch (IllegalArgumentException e) {
            throw new AnonymousClass6u6(e.getMessage(), e);
        }
    }

    public C177088e3 Bqk() {
        try {
            return B99();
        } catch (IOException e) {
            throw new C144066zx("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new C144066zx("unable to get DER object", e2);
        }
    }

    public AnonymousClass8Q1(AnonymousClass7Z0 r1) {
        this.A00 = r1;
    }
}
