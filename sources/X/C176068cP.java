package X;

/* renamed from: X.8cP  reason: invalid class name and case insensitive filesystem */
public class C176068cP extends C176888dj {
    public static C176068cP A0A(Object obj) {
        if (obj == null || (obj instanceof C176068cP)) {
            return (C176068cP) obj;
        }
        if (obj instanceof C176058cO) {
            C176888dj r3 = (C176888dj) obj;
            return new C176068cP(r3.A01, r3.A00);
        } else if (obj instanceof byte[]) {
            try {
                return (C176068cP) C177088e3.A0I((byte[]) obj);
            } catch (Exception e) {
                StringBuilder A0o = AnonymousClass001.A0o();
                C18270x1.A1H(A0o, "encoding error in getInstance: ", e);
                throw C18310x6.A0d(A0o);
            }
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            C18260x0.A1T(A0o2, "illegal object in getInstance: ", obj);
            throw C18310x6.A0d(A0o2);
        }
    }

    public C177088e3 A0O() {
        return this;
    }

    public C176068cP(byte[] bArr, int i) {
        super(bArr, i);
    }

    public static C176068cP A0B(C176908dl r5) {
        C177088e3 A03 = AnonymousClass8Q0.A03(r5);
        if (A03 instanceof C176068cP) {
            return A0A(A03);
        }
        byte[] A0C = C176778dY.A0C(A03);
        int length = A0C.length;
        if (length >= 1) {
            byte b = A0C[0];
            int i = length - 1;
            byte[] bArr = new byte[i];
            if (i != 0) {
                System.arraycopy(A0C, 1, bArr, 0, i);
            }
            return new C176068cP(bArr, b);
        }
        throw AnonymousClass001.A0c("truncated BIT STRING detected");
    }

    public C176068cP(byte[] bArr) {
        super(bArr, 0);
    }
}
