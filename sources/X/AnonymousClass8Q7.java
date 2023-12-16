package X;

import java.io.IOException;

/* renamed from: X.8Q7  reason: invalid class name */
public class AnonymousClass8Q7 implements C188578z9 {
    public AnonymousClass7Z0 A00;

    public C177088e3 B99() {
        return new C176968dr(this.A00.A01());
    }

    public AnonymousClass8Q7(AnonymousClass7Z0 r1) {
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
