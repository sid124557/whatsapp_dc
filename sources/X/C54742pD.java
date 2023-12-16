package X;

/* renamed from: X.2pD  reason: invalid class name and case insensitive filesystem */
public class C54742pD {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C54742pD r5 = (C54742pD) obj;
            if (this.A03 != r5.A03 || this.A00 != r5.A00 || !this.A01.equals(r5.A01) || !this.A02.equals(r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = Boolean.valueOf(this.A03);
        AnonymousClass000.A1M(objArr, this.A00);
        objArr[2] = this.A01;
        return C18310x6.A08(this.A02, objArr, 3);
    }

    public void A00() {
        if (!this.A03) {
            throw new SecurityException(toString());
        }
    }

    public String toString() {
        String str;
        boolean z = this.A03;
        StringBuilder A0o = AnonymousClass001.A0o();
        if (z) {
            str = "Trusted callers: uid=";
        } else {
            str = "Untrusted caller: uid=";
        }
        A0o.append(str);
        A0o.append(this.A00);
        A0o.append(", package=");
        A0o.append(this.A01);
        A0o.append(", signature=");
        return AnonymousClass000.A0X(this.A02, A0o);
    }

    public C54742pD(String str, String str2, int i, boolean z) {
        this.A03 = z;
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }
}
