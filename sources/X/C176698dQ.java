package X;

import java.io.IOException;

/* renamed from: X.8dQ  reason: invalid class name and case insensitive filesystem */
public abstract class C176698dQ extends C177088e3 {
    public final int A00;
    public final boolean A01;
    public final byte[] A02;

    public static C176698dQ A0A(Object obj) {
        if (obj == null || (obj instanceof C176698dQ)) {
            return (C176698dQ) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return A0A(C177088e3.A0I((byte[]) obj));
            } catch (IOException e) {
                throw AnonymousClass001.A0c(AnonymousClass000.A0a("Failed to construct object from byte[]: ", AnonymousClass001.A0o(), e));
            }
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A1T(A0o, "unknown object in getInstance: ", obj);
            throw C18310x6.A0d(A0o);
        }
    }

    public int hashCode() {
        return (this.A01 ^ this.A00) ^ C161007oo.A00(this.A02) ? 1 : 0;
    }

    public C176698dQ(byte[] bArr, int i, boolean z) {
        this.A01 = z;
        this.A00 = i;
        this.A02 = C161007oo.A02(bArr);
    }

    public String toString() {
        String str;
        StringBuffer A0X = AnonymousClass6CA.A0X();
        A0X.append("[");
        if (this.A01) {
            A0X.append("CONSTRUCTED ");
        }
        A0X.append("APPLICATION ");
        A0X.append(Integer.toString(this.A00));
        A0X.append("]");
        byte[] bArr = this.A02;
        if (bArr != null) {
            A0X.append(" #");
            str = AnonymousClass6C9.A0g(bArr, bArr.length);
        } else {
            str = " #null";
        }
        A0X.append(str);
        return AnonymousClass6C9.A0f(" ", A0X);
    }
}
