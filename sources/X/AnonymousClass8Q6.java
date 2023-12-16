package X;

import java.io.IOException;

/* renamed from: X.8Q6  reason: invalid class name */
public class AnonymousClass8Q6 implements C188568z8 {
    public AnonymousClass7Z0 A00;

    public C177088e3 B99() {
        return new C176938do(this.A00.A01());
    }

    public AnonymousClass8Q6(AnonymousClass7Z0 r1) {
        this.A00 = r1;
    }

    public C177088e3 Bqk() {
        try {
            return B99();
        } catch (IOException e) {
            throw AnonymousClass001.A0e(e.getMessage());
        }
    }
}
