package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.8Q3  reason: invalid class name */
public class AnonymousClass8Q3 implements C188598zB {
    public AnonymousClass7Z0 A00;

    public C177088e3 B99() {
        return new C176658dM(C1454475x.A00(new C140666uH(this.A00)));
    }

    public InputStream BA6() {
        return new C140666uH(this.A00);
    }

    public AnonymousClass8Q3(AnonymousClass7Z0 r1) {
        this.A00 = r1;
    }

    public C177088e3 Bqk() {
        try {
            return B99();
        } catch (IOException e) {
            throw new C144066zx(AnonymousClass000.A0a("IOException converting stream to byte array: ", AnonymousClass001.A0o(), e), e);
        }
    }
}
