package X;

/* renamed from: X.7Xr  reason: invalid class name and case insensitive filesystem */
public final class C152137Xr {
    public final C158407jv A00;
    public final C158407jv A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C152137Xr.class != obj.getClass()) {
                return false;
            }
            C152137Xr r5 = (C152137Xr) obj;
            if (!this.A00.equals(r5.A00) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, C18300x5.A04(this.A00));
    }

    public C152137Xr(C158407jv r1, C158407jv r2) {
        r1.getClass();
        this.A00 = r1;
        r2.getClass();
        this.A01 = r2;
    }

    public String toString() {
        String A0P;
        StringBuilder A0p = AnonymousClass001.A0p();
        C158407jv r0 = this.A00;
        A0p.append(r0);
        C158407jv r2 = this.A01;
        if (r0.equals(r2)) {
            A0P = "";
        } else {
            A0P = AnonymousClass000.A0P(r2, ", ", AnonymousClass001.A0o());
        }
        return AnonymousClass000.A0W(A0P, A0p);
    }
}
