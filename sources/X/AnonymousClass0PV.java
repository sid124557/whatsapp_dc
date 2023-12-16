package X;

/* renamed from: X.0PV  reason: invalid class name */
public final class AnonymousClass0PV {
    public final float A00;
    public final AnonymousClass0QB A01;
    public final AnonymousClass0QB A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0PV) {
                AnonymousClass0PV r5 = (AnonymousClass0PV) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A02, this.A01.hashCode() * 31) + Float.floatToIntBits(this.A00);
    }

    public AnonymousClass0PV(AnonymousClass0QB r1, AnonymousClass0QB r2, float f) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SplitInfo:{");
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("primaryActivityStack=");
        A0o2.append(this.A01);
        A0o2.append(',');
        AnonymousClass000.A1B(A0o2, A0o);
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("secondaryActivityStack=");
        A0o3.append(this.A02);
        A0o3.append(',');
        AnonymousClass000.A1B(A0o3, A0o);
        StringBuilder A0o4 = AnonymousClass001.A0o();
        A0o4.append("splitRatio=");
        A0o4.append(this.A00);
        String A0X = AnonymousClass000.A0X(AnonymousClass000.A0d(A0o4), A0o);
        C162457s7.A0D(A0X);
        return A0X;
    }
}
