package X;

import java.io.IOException;

/* renamed from: X.8Q8  reason: invalid class name */
public class AnonymousClass8Q8 implements C188578z9 {
    public AnonymousClass7Z0 A00;

    public C177088e3 B99() {
        return new C176978ds(this.A00.A01());
    }

    public AnonymousClass8Q8(AnonymousClass7Z0 r1) {
        this.A00 = r1;
    }

    public C177088e3 Bqk() {
        try {
            return B99();
        } catch (IOException e) {
            throw new C144066zx(e.getMessage(), e);
        }
    }
}
