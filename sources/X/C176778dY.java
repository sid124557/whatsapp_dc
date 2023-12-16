package X;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;

/* renamed from: X.8dY  reason: invalid class name and case insensitive filesystem */
public abstract class C176778dY extends C177088e3 implements C188598zB {
    public byte[] A00;

    public static C176778dY A0A(Object obj) {
        if (obj == null || (obj instanceof C176778dY)) {
            return (C176778dY) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return A0A(C177088e3.A0I((byte[]) obj));
            } catch (IOException e) {
                throw AnonymousClass001.A0c(AnonymousClass000.A0a("failed to construct OCTET STRING from byte[]: ", AnonymousClass001.A0o(), e));
            }
        } else {
            if (obj instanceof C183618qL) {
                C177088e3 Bqk = ((C183618qL) obj).Bqk();
                if (Bqk instanceof C176778dY) {
                    return (C176778dY) Bqk;
                }
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A1T(A0o, "illegal object in getInstance: ", obj);
            throw C18310x6.A0d(A0o);
        }
    }

    public static C176778dY A0B(C176908dl r6, boolean z) {
        C177088e3 r0;
        C176658dM r02;
        if (!z) {
            C177088e3 A03 = AnonymousClass8Q0.A03(r6);
            if (r6.A02) {
                boolean z2 = r6 instanceof C177008dv;
                C176778dY[] r1 = {A0A(A03)};
                if (z2) {
                    return r02;
                }
                r02 = new C176658dM(r1);
            } else if (A03 instanceof C176778dY) {
                C176778dY r5 = (C176778dY) A03;
                if (r6 instanceof C177008dv) {
                    return r5;
                }
                r0 = r5.A0P();
                return (C176778dY) r0;
            } else if (A03 instanceof C176958dq) {
                C176958dq r52 = (C176958dq) A03;
                boolean z3 = r6 instanceof C177008dv;
                int A0U = r52.A0U();
                C176778dY[] r2 = new C176778dY[A0U];
                for (int i = 0; i < A0U; i++) {
                    r2[i] = A0A(r52.A0W(i));
                }
                r02 = new C176658dM(r2);
                if (z3) {
                    return r02;
                }
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A1T(A0o, "unknown object in getInstance: ", r6);
                throw C18310x6.A0d(A0o);
            }
            r0 = r02.A0P();
            return (C176778dY) r0;
        } else if (r6.A02) {
            return A0A(AnonymousClass8Q0.A03(r6));
        } else {
            throw AnonymousClass001.A0c("object implicit - explicit expected.");
        }
    }

    public C177088e3 A0O() {
        return new C176648dL(this.A00);
    }

    public void A0Q(C159057l2 r5, boolean z) {
        if (this instanceof C176648dL) {
            r5.A03(this.A00, 4, z);
            return;
        }
        Enumeration A0U = ((C176658dM) this).A0U();
        if (z) {
            r5.A00.write(36);
        }
        OutputStream outputStream = r5.A00;
        outputStream.write(128);
        while (A0U.hasMoreElements()) {
            r5.A02(((C183618qL) A0U.nextElement()).Bqk(), true);
        }
        outputStream.write(0);
        outputStream.write(0);
    }

    public C177088e3 B99() {
        return this;
    }

    public InputStream BA6() {
        return AnonymousClass0x9.A0d(this.A00);
    }

    public int hashCode() {
        return C161007oo.A00(this.A00);
    }

    public C176778dY(byte[] bArr) {
        if (bArr != null) {
            this.A00 = bArr;
            return;
        }
        throw AnonymousClass001.A0g("'string' cannot be null");
    }

    public static byte[] A0C(Object obj) {
        return A0A(obj).A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("#");
        byte[] bArr = this.A00;
        return AnonymousClass000.A0X(AnonymousClass6C9.A0g(bArr, bArr.length), A0o);
    }
}
