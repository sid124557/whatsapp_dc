package X;

import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;

/* renamed from: X.6uR  reason: invalid class name and case insensitive filesystem */
public class C140756uR extends OutputStream {
    public Signature A00;

    public void write(byte[] bArr, int i, int i2) {
        try {
            this.A00.update(bArr, i, i2);
        } catch (SignatureException e) {
            throw AnonymousClass002.A0C(e.getMessage());
        }
    }

    public C140756uR(Signature signature) {
        this.A00 = signature;
    }

    public void write(int i) {
        try {
            this.A00.update((byte) i);
        } catch (SignatureException e) {
            throw AnonymousClass002.A0C(e.getMessage());
        }
    }

    public void write(byte[] bArr) {
        try {
            this.A00.update(bArr);
        } catch (SignatureException e) {
            throw AnonymousClass002.A0C(e.getMessage());
        }
    }
}
