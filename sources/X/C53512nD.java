package X;

import java.util.Arrays;

/* renamed from: X.2nD  reason: invalid class name and case insensitive filesystem */
public class C53512nD {
    public int A00;
    public int A01;
    public AnonymousClass580 A02;
    public String A03;
    public String A04;
    public String A05;

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A02;
        AnonymousClass000.A1M(objArr, this.A01);
        AnonymousClass000.A1N(objArr, this.A00);
        AnonymousClass000.A1O(objArr, 0);
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C53512nD)) {
            return false;
        }
        C53512nD r4 = (C53512nD) obj;
        if (this.A02 == r4.A02 && r4.A01 == this.A01 && r4.A00 == this.A00) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ResumeCheck.Result type=");
        A0o.append(this.A02);
        A0o.append(", resume=");
        A0o.append(this.A01);
        A0o.append(", error=");
        A0o.append(this.A00);
        A0o.append(", message=");
        A0o.append(this.A04);
        A0o.append(", backoff=");
        A0o.append(0);
        return AnonymousClass000.A0f(A0o);
    }
}
