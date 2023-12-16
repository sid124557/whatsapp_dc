package X;

import java.io.IOException;

/* renamed from: X.8dU  reason: invalid class name and case insensitive filesystem */
public class C176738dU extends C177088e3 {
    public static final C176738dU A01 = new C176738dU((byte) 0);
    public static final C176738dU A02 = new C176738dU((byte) -1);
    public final byte A00;

    public static C176738dU A0A(Object obj) {
        if (obj == null || (obj instanceof C176738dU)) {
            return (C176738dU) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C176738dU) C177088e3.A0I((byte[]) obj);
            } catch (IOException e) {
                throw AnonymousClass001.A0c(AnonymousClass000.A0a("failed to construct boolean from byte[]: ", AnonymousClass001.A0o(), e));
            }
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A1T(A0o, "illegal object in getInstance: ", obj);
            throw C18310x6.A0d(A0o);
        }
    }

    public C177088e3 A0O() {
        if (this.A00 != 0) {
            return A02;
        }
        return A01;
    }

    public int hashCode() {
        return AnonymousClass000.A1S(this.A00) ? 1 : 0;
    }

    public String toString() {
        if (this.A00 != 0) {
            return "TRUE";
        }
        return "FALSE";
    }

    public C176738dU(byte b) {
        this.A00 = b;
    }

    public static C176738dU A0B(C176908dl r2) {
        C177088e3 A03 = AnonymousClass8Q0.A03(r2);
        if (A03 instanceof C176738dU) {
            return A0A(A03);
        }
        byte[] A0C = C176778dY.A0C(A03);
        if (A0C.length == 1) {
            byte b = A0C[0];
            if (b == -1) {
                return A02;
            }
            if (b != 0) {
                return new C176738dU(b);
            }
            return A01;
        }
        throw AnonymousClass001.A0c("BOOLEAN value should have 1 byte in it");
    }
}
