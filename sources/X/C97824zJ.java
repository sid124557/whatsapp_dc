package X;

/* renamed from: X.4zJ  reason: invalid class name and case insensitive filesystem */
public final class C97824zJ extends C156137g5 {
    public final AnonymousClass4GP A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C97824zJ) {
                C97824zJ r5 = (C97824zJ) obj;
                if (this.A01 != r5.A01 || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, AnonymousClass0x9.A04(this.A01));
    }

    public C97824zJ(AnonymousClass4GP r3, boolean z) {
        super(Boolean.valueOf(z), 35);
        this.A01 = z;
        this.A00 = r3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GlobalSearchBusinessProfileHeader(showSeeMoreButton=");
        A0o.append(this.A01);
        A0o.append(", onSeeMoreClickListener=");
        return C18260x0.A04(this.A00, A0o);
    }
}
