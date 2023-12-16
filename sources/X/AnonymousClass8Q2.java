package X;

import java.io.IOException;

/* renamed from: X.8Q2  reason: invalid class name */
public class AnonymousClass8Q2 implements C183618qL, C183638qN {
    public final int A00;
    public final AnonymousClass7Z0 A01;

    public C177088e3 B99() {
        return new C176038cM(this.A01.A01(), this.A00);
    }

    public AnonymousClass8Q2(AnonymousClass7Z0 r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public C177088e3 Bqk() {
        try {
            return B99();
        } catch (IOException e) {
            throw new C144066zx(e.getMessage(), e);
        }
    }
}
