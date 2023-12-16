package X;

/* renamed from: X.6lt  reason: invalid class name and case insensitive filesystem */
public final class C136126lt extends C136186lz {
    public final int A00;
    public final AnonymousClass5ZO A01;
    public final AnonymousClass4GP A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136126lt) {
                C136126lt r5 = (C136126lt) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, AnonymousClass000.A08(this.A01, this.A00 * 31));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136126lt(AnonymousClass5ZO r2, AnonymousClass4GP r3, int i) {
        super(43);
        C18260x0.A0S(r2, r3);
        this.A00 = i;
        this.A01 = r2;
        this.A02 = r3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("HeaderWithLocationListItemData(title=");
        A0o.append(this.A00);
        A0o.append(", searchLocation=");
        A0o.append(this.A01);
        A0o.append(", onLocationClickListener=");
        return C18260x0.A04(this.A02, A0o);
    }
}
