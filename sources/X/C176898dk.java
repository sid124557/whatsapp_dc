package X;

/* renamed from: X.8dk  reason: invalid class name and case insensitive filesystem */
public class C176898dk extends C177088e3 implements C183628qM {
    public final byte[] A00;

    public static C176898dk A0A(Object obj) {
        if (obj == null || (obj instanceof C176898dk)) {
            return (C176898dk) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C176898dk) C177088e3.A0I((byte[]) obj);
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

    public String BDM() {
        return C162077rB.A02(this.A00);
    }

    public int hashCode() {
        return C161007oo.A00(this.A00);
    }

    public String toString() {
        return C162077rB.A02(this.A00);
    }

    public C176898dk(String str) {
        if (str != null) {
            this.A00 = C162077rB.A03(str);
            return;
        }
        throw AnonymousClass001.A0g("'string' cannot be null");
    }

    public C176898dk(byte[] bArr) {
        this.A00 = bArr;
    }
}
