package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.8Q4  reason: invalid class name */
public class AnonymousClass8Q4 implements C188598zB {
    public C177108e5 A00;

    public C177088e3 B99() {
        return new C176648dL(this.A00.A02());
    }

    public InputStream BA6() {
        return this.A00;
    }

    public AnonymousClass8Q4(C177108e5 r1) {
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
