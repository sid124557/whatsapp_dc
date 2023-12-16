package X;

/* renamed from: X.5Ro  reason: invalid class name and case insensitive filesystem */
public final class C104585Ro {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104585Ro) {
                C104585Ro r5 = (C104585Ro) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C104585Ro(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public int hashCode() {
        return ((1648684319 + this.A00) * 31) + this.A01.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MLModelHash(name=");
        A0o.append("wa_bwe_pl_classifier_mobile");
        A0o.append(", version=");
        A0o.append(this.A00);
        A0o.append(", sha256Hash=");
        return C18260x0.A07(this.A01, A0o);
    }
}
