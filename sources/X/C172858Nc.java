package X;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: X.8Nc  reason: invalid class name and case insensitive filesystem */
public class C172858Nc implements Enumeration {
    public Object A00;
    public C140356tb A01;

    public boolean hasMoreElements() {
        return AnonymousClass000.A1W(this.A00);
    }

    public Object nextElement() {
        Object obj = this.A00;
        if (obj != null) {
            try {
                this.A00 = this.A01.A06();
                return obj;
            } catch (IOException e) {
                throw new C144066zx(AnonymousClass000.A0P(e, "malformed DER construction: ", AnonymousClass001.A0o()), e);
            }
        } else {
            throw AnonymousClass6CA.A0c();
        }
    }

    public C172858Nc(byte[] bArr) {
        C140356tb r0 = new C140356tb(bArr, true);
        this.A01 = r0;
        try {
            this.A00 = r0.A06();
        } catch (IOException e) {
            throw new C144066zx(AnonymousClass000.A0P(e, "malformed DER construction: ", AnonymousClass001.A0o()), e);
        }
    }
}
