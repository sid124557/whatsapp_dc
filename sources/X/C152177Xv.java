package X;

/* renamed from: X.7Xv  reason: invalid class name and case insensitive filesystem */
public final class C152177Xv {
    public final C158437jy A00;
    public final C158437jy A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C152177Xv.class != obj.getClass()) {
                return false;
            }
            C152177Xv r5 = (C152177Xv) obj;
            if (!this.A00.equals(r5.A00) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public static C152177Xv A00(C158437jy r2, long j, long j2) {
        return new C152177Xv(r2, new C158437jy(j, j2));
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, C18300x5.A04(this.A00));
    }

    public C152177Xv(C158437jy r1, C158437jy r2) {
        r1.getClass();
        this.A00 = r1;
        r2.getClass();
        this.A01 = r2;
    }

    public String toString() {
        String A0P;
        StringBuilder A0p = AnonymousClass001.A0p();
        C158437jy r0 = this.A00;
        A0p.append(r0);
        C158437jy r2 = this.A01;
        if (r0.equals(r2)) {
            A0P = "";
        } else {
            A0P = AnonymousClass000.A0P(r2, ", ", AnonymousClass001.A0o());
        }
        return AnonymousClass000.A0W(A0P, A0p);
    }
}
